
public class Main {
    public  static  void main(String[] args){
     
        Trie trie = new Trie();
        TreeNode root = new TreeNode();

        trie.insert(root, "apple");
        trie.insert(root, "apply");
        trie.insert(root, "comp");
        trie.insert(root, "box");

        System.out.println(trie.search(root,"apple"));
        System.out.println(trie.search(root,"apps"));
        System.out.println(trie.search(root,"apply"));


    }



class TreeNode{
    TreeNode[] children;
    boolean isEndOfWord;

    TreeNode(){
        isEndOfWord = false;
        children = new TreeNode[26];
    }
}
  
class Trie {
    public void insert(TreeNode root, String key){
        TreeNode currNode = root;

        for(int i = 0; i < key.length(); i++){
            char ch = key.charAt(i);
            if(currNode.children[ch - 'a'] == null) {
                currNode.children[ch-'a'] = new TreeNode();
            }

            currNode = currNode.children[ch-'a'];
        }
        currNode.isEndOfWord = true;
    }

    public boolean search(TreeNode root, String key){

        TreeNode curr = root;
        for(int i = 0; i < key.length(); i++){
            if(curr == null || curr.children[key.charAt(i)-'a'] == null){
                return false;
            }
            curr = curr.children[key.charAt(i)-'a'];
        }

        return curr.isEndOfWord;
    }
}
