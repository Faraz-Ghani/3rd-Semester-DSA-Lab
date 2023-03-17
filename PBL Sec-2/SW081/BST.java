package SW081;

public class BST {
	  Node root;

	  private static class Node {
	    int key;
	    String month;
	    Node left, right;
	  
	    public Node( String month , int key) {
	        this.key = key;
	        this.month = month;
	        left = null;
	        right = null;
	    }
	  }
	  

	  public BST() {
	      root = null;
	  }

	  public void insert(String month , int key) {
	      root = insertNode(root, key, month);
	  }

	  private Node insertNode(Node root, int key, String month) {
	      if (root == null) {
	          root = new Node(month , key);
	          return root;
	      }

	      if (key < root.key) {
	          root.left = insertNode(root.left, key, month);
	      } else if (key > root.key) {
	          root.right = insertNode(root.right, key, month);
	      }

	      return root;
	  }

	  public void inorderTraversal() {
	      inorder(root);
	  }

	  private void inorder(Node root) {
	      if (root != null) {
	          inorder(root.left);
	          System.out.println(root.key + " " + root.month);
	          inorder(root.right);
	      }
	  }

	  private Node right(Node r){
	    if(r.right == null) return r;
	    return right(r.right);
	  }
	  private Node left(Node r){
	    if(r.left == null) return r;
	    return left(r.left);
	  }

	  public void max(){
	    Node x = right(root);
	    System.out.println(x.key + " in the month  " + x.month);
	  }
	  public void min(){
	    Node x = left(root);
	    System.out.println(x.key + " in the month " + x.month);
	    
	  }

	    

}
