import java.io.*;
class DeleteNode{
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

	public void deleteNode(node start, int n){
    node tempnode = new node();
    tempnode = start;
		node newnode = new node();
		System.out.println();
		//System.out.println(tempnode.next.data);
    while (tempnode.next.data != n){
    	tempnode = tempnode.next;
		}
		newnode = tempnode;
		newnode = newnode.next;
		tempnode.next = newnode.next;
		System.out.println();
		tempnode = start;
		while(tempnode != null){
    	System.out.println(tempnode.data);
    	tempnode = tempnode.next;
		}
	}



public static void main(String[] args) throws IOException{
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
    System.out.println("Enter no. which youhave to deletet");
int n = Integer.parseInt(in.readLine());
ll.deleteNode(start, n);

}
}


