package App;

import Model.BST;
import Model.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst=new BST();
		Node tree=bst.createNewTree();
		tree=bst.skewedify(tree);
		bst.display(tree);
	}

}
