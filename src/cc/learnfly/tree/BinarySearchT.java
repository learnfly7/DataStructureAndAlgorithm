package cc.learnfly.tree;

public class BinarySearchT {
	public Node root = null;
	
	public void insert(int data){
		Node node = new Node(data);
		if(root == null){
			root = node;
		}else{
			Node temp = root;
			while(true){
				//����������
				if(data < temp.data){
					if(temp.left == null){
						temp.left = node;
						break;
					}else{
						temp = temp.left;
					}
				}else{
					//����������
					if(temp.right == null){
						temp.right = node;
						break;
					}else{
						temp = temp.right;
					}
				}
			}
		}
	}
	
	public void inOrder(Node root){
		if(root != null){
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	public void inOrder(){
		inOrder(this.root);
	}
	public static void main(String[] args) {
		int[] arr = {1,5,2,8,9,3,2,7,6,0};
		BinarySearchT tree = new BinarySearchT();
		for(int i=0;i<arr.length;i++){
			tree.insert(arr[i]);
		}
		
		tree.inOrder();

	}

}


