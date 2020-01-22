//Import java.io.*;
import java.util.Stack;
class inorderTree{
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


    public void inorder (tree root){
        Stack<tree> s = new Stack<tree>();
        tree tempnode = root;
        while (tempnode != null || s.size() > 0){
            while(tempnode != null){
                s.push(tempnode);
                tempnode = tempnode.left;
            }
            tempnode = s.pop();
            System.out.println(tempnode.data);
            tempnode = tempnode.right;
        }
    }
    public static void main(String args[]){
        tree root = new tree();
        inorderTree inordertree = new inorderTree();
        root.data=10;
        root = inordertree.createL(root,12);
        root = inordertree.createR(root,13);
        root = inordertree.createL(root,20);
        root = inordertree.createL(root,12);
        root = inordertree.createL(root,8);
        root = inordertree.createR(root,3);
        root = inordertree.createR(root,18);
        root = inordertree.createL(root,5);
        inordertree.inorder(root);

    }
}

