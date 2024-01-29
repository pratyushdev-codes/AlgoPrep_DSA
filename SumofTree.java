public class SumofTree{
    public static void main(String[] args) {

        
    }public static int  sumoftree(Node root){
        if (root == null){
            return;  //null check
        }
      int x= sumoftree(root.left);
      int y=sumoftree(root.right);
      return  x+y+root.data;   //recursively call the function for left and right
        
    }
}