import java.io.*;
class MiddleNodeLL{
    private LLNode head;
    public void insertElement(int data){
        LLNode tempnode = new LLNode();
        tempnode = head;
        LLNode newnode = new LLNode();
        newnode.data = data;
        if(head == null){
            head = newnode;
        }
        else{
            while(tempnode.next != null){
                tempnode= tempnode.next;
            }
            tempnode.next = newnode;
        }
    }
    public int middleNode(){
        LLNode tempnode = new LLNode();
        tempnode = head;
        LLNode newnode = new LLNode();
        newnode = head;
        if(tempnode == null){
            System.out.println("List is empty");
            return(-1);
        }else{
            int length = 0;
            while(tempnode != null){
                length++;
                tempnode = tempnode.next;
            }

            int mid;
            mid = length/2;
            for(int i = 0; i<mid; i++){
                newnode = newnode.next;

            }
            return(newnode.data);
        }

    }

}

/*TEST CASE
  13
 */
//Time Complexity - O(n)

