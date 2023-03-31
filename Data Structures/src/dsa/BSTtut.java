package dsa;

class nodee{
	nodee left;
	nodee right;
	int data;
	
	public nodee(int data) {
		this.data=data;
		right=left=null;
	}
	
}

class BST{
	nodee root;
	
	public void insert(int data) {
		nodee newnodee = new nodee(data);
		root = inserthelper(newnodee,root);
	}
	public nodee inserthelper(nodee nodee,nodee root) {
		int data = nodee.data;
		
		if(root==null) {
			root=nodee;
			return root;
		}
		else if(data>root.data) {
			root.right=inserthelper(nodee,root.right);
		}
		else if(data<root.data) {
			root.left=inserthelper(nodee,root.left);
		}
		
		return root;
	}
	
	public void display() {
		displayhelper(root);
	}
	public void displayhelper(nodee root) {
		
		if(root!=null) {
			System.out.println(root.data);
			displayhelper(root.left);
			
			displayhelper(root.right);
		}
	}
	
	
	public void remove(int data) {
		root = removehelper(data,root);
	}
	
	public nodee removehelper(int data,nodee root) {
		
		if(root==null) {
			return root;
		}
		
		else if(data>root.data) {
			root.right = removehelper(data,root.right);
		}
		else if(data<root.data) {
			root.left=removehelper(data,root.left);
		}
		else {
			if(root.left==null && root.right==null) {
				root=null;
			}
			else if(root.right==null) {
				return root.left;
			}
			else if (root.left==null) {
			return root.right;
			}
			else {
	            int predecessorValue = findMax(root.left);
	            root.data = predecessorValue;
	            root.left = removehelper(predecessorValue, root.left);
	        }
			}
			
		
		return root;
	}
	
	public void find(int data) {
			findhelper(data,root);
	}
	
	private nodee findhelper(int data,nodee root) {
		
		if(root==null) {
			System.out.println("not found");
			return root;
		}
	
		if(data==root.data) {
			System.out.println("Found");
			return null;
		}
		else if(data>root.data) {

			findhelper(data,root.right);
		}
		else if(data<root.data) {

			findhelper(data,root.left);
		}
	
		
		return root;
	}

	private int findMax(nodee node) {
	    while (node.right != null) {
	        node = node.right;
	    }
	    return node.data;
	}
	
	public int height() {
		return heighthelper(root)-1;
	}
	public int heighthelper(nodee root) {
		if(root==null) {
			return 0;
		}
		else {
			int ldepth;
			int rdepth;
			ldepth=heighthelper(root.left);
			rdepth=heighthelper(root.right);
			
			if(ldepth>rdepth) {
				return ldepth+1;
			}
			else if(ldepth<rdepth) {
				return rdepth+1;
			}
			else {
				return ldepth+1;	
			}
			
		}
		
	}
	
}

public class BSTtut {

	public static void main(String[] args) {
		BST bt = new BST();
		bt.insert(5);
		bt.insert(6);
		bt.insert(9);
		bt.insert(8);
		bt.insert(1);
		bt.find(7);
System.out.println(bt.height());
//		System.out.println(bt.find(1));
		bt.display();
		System.out.println("dsa");
		bt.remove(9);
		bt.display();
		
	}

}
