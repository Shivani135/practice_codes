import java.io.*;

class ReverseLL{
    private LLNode head;

    public void creatingLL(int data){
        LLNode tempnode = head;
        LLNode newnode = new LLNode();
        newnode.data = data;
        while(tempnode.next != null){
            tempnode = tempnode.next;
        }
        tempnode.next = newnode;
    }
    
    public LLNode reverseLL(){
        LLNode tempnode = head;
        LLNode rev = new LLNode();
        //rev = null;
        int len = 0;
        while( tempnode != null){
            len++;
            tempnode = tempnode.next;
        }
        tempnode = head;
        while( tempnode.next != null){
            tempnode = tempnode.next;
        }
        rev.data = tempnode.data;
        LLNode rev1 = rev;
        for(int i = 1; i<=len-1; i++){
            tempnode = head;
            for(int j = len-1; j>i; j--){ 
                tempnode = tempnode.next;
            }
            rev1.next = tempnode;
            rev1 = rev1.next;
        }
        rev1.next = null;
        return rev;
    }

}
/*TEST CASE
20
19
18
17
16
15
14
13
12
11
*/
//Time Complexity - O(n^2)
