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

	public void nthLastNode(node start, int n){
    node tempnode = new node();
    tempnode = start;
    int len = 0;
    while(tempnode != null ){
			len++;
			tempnode= tempnode.next;
		}
		//System.out.println(len);
		tempnode = start;
		for(int i = 0; i<len-n; i++){
    	tempnode = tempnode.next;
		}
		System.out.println(tempnode.data);
	}

	public static void main(String[] args) throws IOException{
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
		node start = new node();
    NthLastNode ll = new NthLastNode();
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
			*System.out.println(tempnode.data);
			*tempnode= tempnode.next;		
		}*/
    System.out.println("Enter no. which we have to extract from last");
		int n = Integer.parseInt(in.readLine());
		ll.nthLastNode(start, n);
	}
}
/*TEST CASE
Enter no. which we have to extract from last
3
17
*/
//Time Complexity - O(n)
