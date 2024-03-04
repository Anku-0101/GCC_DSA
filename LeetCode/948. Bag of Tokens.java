class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int i = 0; int j = n-1;
        int score = 0;
        while(i<=j){
            if(tokens[i] > power && score <1){
                return score;
            }
            if(i == j){
                if(power >= tokens[i]){
                    return score+1;
                }
                else{
                    return score;
                }
            }
            if(power >= tokens[i]){
                power -= tokens[i];
                score++;
                i++;
                //System.out.println("if block i = "+i+" tokens[i] = "+ tokens[i] +" j = " + j+" score = "+score+" power =" + power);
            }else if(score > 0 && j>i){
                power += tokens[j--];
                score--;
                //System.out.println("else block i = "+i+" tokens[i] = "+ tokens[i] +" j = " + j+" score = "+score+" power =" + power);
            }
        }
        return score;
        
    }
}
