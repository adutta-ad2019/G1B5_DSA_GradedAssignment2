package Model;

import java.util.Stack;

public class BST {
	public Node createNewTree() {
		//hardcoding the tree as per question
		Node tree = new Node(50);
		tree.setLeft(new Node(30));
		tree.setRight(new Node(60));
		tree.getLeft().setLeft(new Node(10));
		tree.getRight().setLeft(new Node(55));
		return tree;
		
	}
	//Creating a stack of the nodes with reversed in-order traversal, so that when we pop it, we get ascending order
	public Stack<Node> reverseInorderlist(Node tree,Stack<Node> stk) {
		if(tree.getRight()!=null)
			reverseInorderlist(tree.getRight(),stk);
		if(tree!=null)
			stk.push(tree);
		if(tree.getLeft()!=null)
			reverseInorderlist(tree.getLeft(),stk);
		return stk;	
	}
	public Node skewedify(Node tree){
		Stack<Node> stk=new Stack<Node>();
		stk=reverseInorderlist(tree,stk);
		tree=stk.pop();
		tree.setLeft(null);
		Node temp =tree;
		while(!stk.isEmpty()) {
				temp.setRight(stk.pop());
				temp=temp.getRight();
				if(temp!=null)//Condition for end of nodes
					temp.setLeft(null);//setting all the left values for all the nodes to null as per question
		}
		return tree;
	}
	public void display(Node tree) {
		if(tree!=null) {
			System.out.print(tree.getVal()+"->");
			display(tree.getRight());
		}
	}
	
}
