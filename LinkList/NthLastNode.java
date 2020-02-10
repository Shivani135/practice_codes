import java.io.*;
class NthLastNode{
    public static class node{
        int data;
        node next;
    }
    public node creatingLL(node start, int data){
        node newnode = new node();
        newnode.data = data;
        node tempnode = new node();
        tempnode = start;
        while(tempnode.next != null){
            tempnode = tempnode.next;
        }
        tempnode.next = newnode;
        return start;
    }

    public void nthLastNode2(node start, int n){
        node tempnode = new node();
        tempnode = start;
        int len = 1;
        if( (n > 0)){
            while(tempnode.next != null ){
                tempnode= tempnode.next;
                len++;
            }
            tempnode = start;
            if(len>n){
                for(int i = 0; i < len - n ; i++){
                    tempnode = tempnode.next;
                }
                System.out.println("new" + tempnode.data);
            }else{
                System.out.println("Number is graeter than length");
            }
        }else{
            System.out.println("Number is zero");
        }
    }
    //Logic needs to be improved
    public void nthLastNode(node start, int n){
        node tempnode = new node();
        tempnode = start;
        int len = 0;
        while(tempnode != null ){
            len++;
            tempnode= tempnode.next;
        }
        tempnode = start;
        if((len > n) &&(n > 0)){
            for(int i = 0; i<len-n; i++){
                tempnode = tempnode.next;
            }
            System.out.println(tempnode.data);
        }
        else{
            System.out.println("N is greater than the length of the link list or n is negative ");
        }
    }

    public static void main(String[] args) throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        node start = new node();
        NthLastNode ll = new NthLastNode();
        //start = null;
        start.data = 10;
        start = ll.creatingLL(start, 4);
        start = ll.creatingLL(start, 45);
        start = ll.creatingLL(start, 5);
        start = ll.creatingLL(start, 14);
        start = ll.creatingLL(start, 8);
        start = ll.creatingLL(start, 17);
        start = ll.creatingLL(start, 81);
        start = ll.creatingLL(start, 77);
        node tempnode = new node();
        tempnode = start;
        /*while(tempnode !=null){
          System.out.println(tempnode.data);
          tempnode= tempnode.next;		
          }*/
        System.out.println("Enter no. which we have to extract from last");
        String str = in.readLine();
        try{
            int n = Integer.parseInt(str);
            ll.nthLastNode(start, n);
            ll.nthLastNode2(start, n);
        }
        catch(NumberFormatException e){
           // ll.nthLastNode(start, n);
           // ll.nthLastNode2(start, n);
             System.out.println("Wrong Input");
        }
    }
}
/*TEST CASE
  Enter no. which we have to extract from last
  3
  17
 */
//Time Complexity - O(n)
