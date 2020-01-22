import java.util.Stack;
class levelOrderTraversal{

    public static class tree{
        int data;
        tree left;
        tree right;
    }
    public tree setLeft(tree root, int data){
        tree newNode = new tree();
        tree tempNode = new tree();
        newNode.data = data;
        tempNode = root;
        while ((tempNode.left != null ) && (tempNode != null)){
            tempNode = tempNode.left;
        }
        if(tempNode.left == null){
            tempNode.left = newNode;
        }else if(tempNode.right == null){
            tempNode.right = newNode;
        }
        return root;

    }
    public tree setRight(tree root, int data){
        tree newNode = new tree();
        tree tempNode = new tree();
        newNode.data = data;
        tempNode = root;
        while ((tempNode.left != null ) && (tempNode.right != null)){
            tempNode = tempNode.right;
        }
        if(tempNode.left == null){
            tempNode.left = newNode;
        }else if(tempNode.right == null){
            tempNode.right = newNode;
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
    public static void main(String args[]){
        levelOrderTraversal level = new levelOrderTraversal();
        tree root = new tree();
        root.data = 99;
        root = level.setLeft(root,5);
        root = level.setRight(root,8);
        root = level.setLeft(root,7);
        root = level.setRight(root,6);
        root = level.setRight(root,21);
        root = level.setLeft(root,10);
        root = level.setLeft(root,12);
        root = level.setLeft(root,17);
        root = level.setRight(root,11);
        root = level.setRight(root,31);
        int height = level.height(root);
        level.inorderPrint(root, height);
    }
}

