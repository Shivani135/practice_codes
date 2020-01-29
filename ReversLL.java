import java.io.*;

class ReversLL{
    public static class node{
        int data;
        node next;
    }

    public node creatingLL(node start, int data){
        node tempnode = start;
        node newnode = new node();
        newnode.data = data;
        while(tempnode.next != null){
            tempnode = tempnode.next;
        }
        tempnode.next = newnode;
        return start;
    }
    public node reverseLL(node start){
        node tempnode = start;
        node rev = new node();
        //rev = null;
        int len = 0;
        while( tempnode != null){
            len++;
            tempnode = tempnode.next;
        }
        tempnode = start;
        while( tempnode.next != null){
            tempnode = tempnode.next;
        }
        rev.data = tempnode.data;
        node rev1 = rev;
        for(int i = 1; i<=len-1; i++){
            tempnode = start;
            for(int j = len-1; j>i; j--){ 
                tempnode = tempnode.next;
            }
            rev1.next = tempnode;
            rev1 = rev1.next;
        }
        rev1.next = null;
        return rev;
    }

    public static void main(String[] args){
        ReversLL ll = new ReversLL();
        node start = new node();
        start.data = 11;
        start = ll.creatingLL(start, 12);
        start = ll.creatingLL(start, 13);
        start = ll.creatingLL(start, 14);
        start = ll.creatingLL(start, 15);
        start = ll.creatingLL(start, 16);
        start = ll.creatingLL(start, 17);
        start = ll.creatingLL(start, 18);
        start = ll.creatingLL(start, 19);
        start = ll.creatingLL(start, 20);
        node rev = new node();
        rev = ll.reverseLL(start);
        while(rev != null){
            System.out.println(rev.data);
            rev = rev.next;
        }
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
