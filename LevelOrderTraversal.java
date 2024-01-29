public class LevelorderTraversal{
    public static void main(String[] args) {
        
    }public static void main leveloderTraversal(Node root){
        Queue<Node> q = new LinkedList<> ();


        q.add(root);
        while(q.size()>0){
            int n= q.size();


            while(n>0){
                Node temp =q.remove();
                System.out.println(temp.val);

            }if(temp.left!=null){
                q.add(temp.left);

            }if(temp.right!=null){
                q.add(temp.right);
            }
            n--;
        }
     


        

      
    }
}