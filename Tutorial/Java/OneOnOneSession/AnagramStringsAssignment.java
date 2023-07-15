import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        HashMap<String, Integer> counter = new HashMap<String, Integer>();
        HashMap<String, ArrayList<String>> strIdentifier = new HashMap<String, ArrayList<String>>();
        for(int i = 0; i < n ; i++){    
            arr[i] = sc.next();
            if(counter.containsKey(arr[i])){
                counter.put(arr[i], counter.get(arr[i])+1);
            }
            else{
                counter.put(arr[i], 1);
            }
            String identifier = getIdentifier(arr[i]);
            if(strIdentifier.containsKey(identifier)){
                ArrayList<String> list = strIdentifier.get(identifier);
                list.add(arr[i]);
                strIdentifier.put(identifier, list);
            }
            else{
                ArrayList<String> list = new ArrayList<String>();
                list.add(arr[i]);
                strIdentifier.put(identifier, list);
            }
        }

         
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            String inp = sc.next();

            String identifier = getIdentifier(inp);
            if(strIdentifier.containsKey(identifier)){
                ArrayList<String> anagrams = strIdentifier.get(identifier);
                List<String> ans = new ArrayList<String>();

                for(int j = 0; j < anagrams.size(); j++){
                    int numOfTimes = counter.get(anagrams.get(j));
                    while(numOfTimes-- > 0){
                        ans.add(anagrams.get(j));
                    }
                }
                Collections.sort(ans);

                for(int k = 0; k < ans.size(); k++){
                    System.out.print(ans.get(k) + " ");
                }
                System.out.println();
            }
            else{
                System.out.println("-1");
            }
        }
        
    }

    public static String getIdentifier(String str){
        String res = "";
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        for(int i = 0; i < str.length(); i++){
            pQueue.add((int)str.charAt(i));
        }
        while(!pQueue.isEmpty()){
            res += pQueue.poll();
            res += "+";
        }
        return res;
    }
}
