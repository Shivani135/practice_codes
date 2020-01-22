import java.io.*;
class BST{
    static final int COUNT = 10; 
    public static class tree{
        int data;
        tree right;
        tree left;
    }
    public tree createBST(tree root, int data){
        tree tempnode = new tree();
        tree newnode = new tree();
        newnode.data = data;
        tempnode = root;
        if(tempnode == null){
            tempnode = newnode;				
        }	else {
            while((tempnode.left != null) || (tempnode.right != null)){
                if(newnode.data < tempnode.data){
                    if(tempnode.left != null)
                        tempnode = tempnode.left;						
                }	else {
                    if(tempnode.right != null)
                        tempnode = tempnode.right;						
                }					
            }
            if(tempnode.data < newnode.data)
                tempnode.right = newnode;
            else
                tempnode.left = newnode;				

        }
        return root;
    }
    public int height(tree root){
        if (root == null){
            return (0);
        }else{
            int leftheight = height(root.left);
            int rightheight = height(root.right);
            if(leftheight>rightheight){
                return(leftheight+1);
            }else{
                return (rightheight+1);
            }
        }

    }


    public void inorderPrint(tree root, int height){
        int i;
        for (i=1; i<=height; i++)
            printLevelWise(root, i);
    }
    public void printLevelWise(tree root, int level){
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printLevelWise(root.left, level-1);
            printLevelWise(root.right, level-1);
        }	

    }

    public static void main(String[] args)throws IOException{
        tree root = new tree();
        BST bst = new BST();
        root = bst.createBST(root, 4);
        root = bst.createBST(root, 2);
        root = bst.createBST(root, 10);
        root = bst.createBST(root, 11);
        root = bst.createBST(root, 1);
        root = bst.createBST(root, 3);
        root = bst.createBST(root, 12);	
        root = bst.createBST(root, 0);
        root = bst.createBST(root, 9);
        int height = bst.height(root);
        bst.inorderPrint(root, height);
    }
}
