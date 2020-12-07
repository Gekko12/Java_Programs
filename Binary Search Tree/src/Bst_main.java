import java.util.Scanner;

class Node{
	
	Node root=null ,right ,left;
	int data;
	
	
	Scanner sc = new Scanner(System.in);
	
	void preorder(Node node) {
		if(node!=null) {
			System.out.print(node.data+" ");
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	void postorder(Node node) {
		if(node!=null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data+" ");
		}
	}
	
	void inorder(Node node) {
		if(node!=null) {
			inorder(node.left);
			System.out.print(node.data+" ");
			inorder(node.right);
		}
	}
	
	void traversal() {
		System.out.println("Input your choice :\n1.Preorder Traversal \n2.Postorder Traversal \n3.Inorder Traversal");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:preorder(root);
		       break;
		case 2:postorder(root);
		       break;
		case 3:inorder(root);
		       break;
		default:System.out.println("Wrong choice.....");
		}
		System.out.println();
	}
	
	int getHeight(Node node) {
		int l , r;
		
		if(node == null)
			return 0;
		else {
			l = getHeight(node.left);
			r = getHeight(node.right);
			
			if(r>l)
				return r+1;
			else
				return l+1;
		}
	}

	Node insert(Node node,int value) {
		if(node==null) {
			node = new Node();
			node.data = value;
		}
		
		if(value < node.data) 
			node.left = insert(node.left,value);
		if(value > node.data) 
			node.right = insert(node.right,value);
		
		return node;
	}
	
	Node search(Node node,int value) {
		if(node==null)
			return null;
		if(value==node.data)
			return node;
		if(value < node.data)
			return search(node.left,value);
		if(value > node.data)
			return search(node.right,value);
		return null;
	}
	
	void find() {
		Node node ;
		System.out.println("Enter the value to be found :");
		int val = sc.nextInt();
		
		node = search(root,val);
		
		if(node==null) System.out.println("Not Found");
		else System.out.println("Found "+node.data+" .");
	}
	
	void create() {
		System.out.println("Enter the number of nodes :");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the value of node "+i+" :");
			int val = sc.nextInt();
			root = insert(root,val);
			}
		System.out.println("Binary Search Tree Created .......");
	}
	
	
}
public class Bst_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node obj = new Node();
		
		
		int choice ;
			
		do {
			System.out.println("\n------------------------Menu-----------------------");
			System.out.println("1.Create \n2.Search \n3.Traversal \n4.Height and Depth \n5.Exit ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:obj.create();
			       break;
			case 2:obj.find();
			       break;
			case 3:obj.traversal();
			       break;
			case 4:int temp = obj.getHeight(obj.root);
				   System.out.println("Height = "+temp+"\nDepth = "+(temp-1));
			       break;
			default :System.out.println("Aborting !!!!!!!!!!!!!!!");  
			}
			}while(choice!=5 && choice<5 );
		
		sc.close();
	}

}
