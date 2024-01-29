import PrintLinkedList.Node;

public class PreorderTrees {
    
}public static void PreOder(Node root){
    if(root==null){
        return 0;

    }

System.out.println(root.val);
PreOder(root.left);
PreOder(root.right);
}
