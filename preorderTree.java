//Import java.io.*;
import java.util.Stack;
class preorderTree{
    	public static class tree{
        int data;
        tree left;
        tree right;
	}
public tree createL(tree root,int data){
	tree newnode =new tree();
	tree tempnode =new tree();
	newnode.data=data;
	tempnode = root;
	while(tempnode.left != null){
		tempnode=tempnode.left;	
	}
	tempnode.left = newnode;
	return root;
}

public tree createR(tree root, int data){
	tree newnode =new tree();
	tree tempnode =new tree();
	newnode.data=data;
	tempnode = root;
	while(tempnode.right != null){
		tempnode=tempnode.right;	
	}
	tempnode.right = newnode;
	return root;
	
}
	

public void preorder (tree root){
    	Stack<tree> s = new Stack<tree>();
    	s.push(root);
    	//tree tempnode = root;
    	while (s.size() > 0){
    		tree tempnode =s.pop();
		System.out.println(tempnode.data);
		if(tempnode.right != null){
    			s.push(tempnode.right);
		}
		if(tempnode.left != null){
    			s.push(tempnode.left);
		}    
    	}
}

public static void main(String args[]){
	tree root = new tree();
    	preorderTree preordertree = new preorderTree();
    	root.data=10;
    	root = preordertree.createL(root,12);
    	root = preordertree.createR(root,13);
	root = preordertree.createL(root,20);
	root = preordertree.createL(root,12);
	root = preordertree.createL(root,8);
	root = preordertree.createR(root,3);
	root = preordertree.createR(root,18);
	root = preordertree.createL(root,5);

  /*  
    root.left.right.data = 8;
    root.right.left.data = 3;
    root.right.right.data = 18;
    root.left.left.left.data = 5;*/
    preordertree.preorder(root);
    
}
}

