import java.io.*;
class linkedList{

    public static class node{
        int data;
        node next;
    }


    public node insertElement(node start, int x){
        node tempnode= new node();
        tempnode = start;
        node newnode = new node();    
        newnode.data=x;
        while(tempnode.next != null){
            tempnode= tempnode.next;
        }
        tempnode.next = newnode;
        return start;

    }

    public node deleteElement(node start, int x){
        node tempnode = new node();
        tempnode = start;
        while(tempnode.next.data != x){
            tempnode.next= tempnode.next.next;
        }
        return start;    

    }

    public void searchingELement(node start, int x){
        node tempnode = new node();
        tempnode = start;
        do{
            if(tempnode.data == x)
                System.out.println("ELement found");
            tempnode=tempnode.next;
        }while(tempnode != null);
    }

    public static void main(String args[]) throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        node start = new node();
        //start.data=1;
        //start.next=null;
        linkedList ll =  new linkedList();
        node tnode = new node();
        start = ll.insertElement(start,5);
        start = ll.insertElement(start,6);
        start = ll.insertElement(start,7);
        start = ll.deleteElement(start,6);
        ll.searchingELement(start,7);
    }
}


