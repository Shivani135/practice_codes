import java.io.*;
class DeleteNode{
    private LLNode head;

    public void creatingLL(int data){
        LLNode newnode = new LLNode();
        newnode.data = data;
        if (head == null) {
            head = newnode;
        } else {
            LLNode tempnode = head;
            while (tempnode.next != null) {
                tempnode = tempnode.next;
            }
            tempnode.next = newnode;
        }   
    }
    public void printLL() {
        LLNode temp = head;
        while (temp != null) {
            System.out.println(" " + temp.data + " ");
            temp = temp.next;
        }
    }

    public LLNode deleteNode(int n){
        LLNode tempnode = new LLNode();
        tempnode = head;
        if(tempnode.data == n){
            tempnode = tempnode.next;
            return(tempnode);
        }
        else{
            LLNode newnode = new LLNode();
            while (tempnode.next.data != n){
                tempnode = tempnode.next;
            }
            if(tempnode.next == null){
                System.out.println("number is not present");
                return (null);
            }
            else{
                return (head);
            }
        }
    }


   /* public static void main(String[] args) throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        node start = new node();
        DeleteNode ll = new DeleteNode();
        start.data = 10;
        start = ll.creatingLL(start, 4);
        start = ll.creatingLL(start, 45);
        start = ll.creatingLL(start, 5);
        start = ll.creatingLL(start, 14);
        start = ll.creatingLL(start, 8);
        start = ll.creatingLL(start, 17);
        start = ll.creatingLL(start, 81);
        start = ll.creatingLL(start, 77);
        System.out.println("Enter no. which you have to delete");
        int n = Integer.parseInt(in.readLine());
        ll.deleteNode(start, n);

    }*/
}
/*
   TEST CASE-
   Enter no. which you have to delete
   10
   Stack after deletions are -:
   4
   45
   5
   14
   8
   17
   81
   77
 */
//Time Complexity -O(n) 
