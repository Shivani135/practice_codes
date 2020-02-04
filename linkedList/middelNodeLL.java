import java.io.*;
class middelNodeLL{
    	public static class node{
    		int data;
    		node next;
	}
	public node insertElement(node start, int data){
    		node tempnode = new node();
    		tempnode = start;
    		node newnode = new node();
    		newnode.data = data;
    			while(tempnode.next != null){
    				tempnode= tempnode.next;
			}
			tempnode.next = newnode;
		
		return start;
	}
	public void middelNode(node start){
		node tempnode = new node();
    		tempnode = start;
		node newnode = new node();
		newnode = start;
    		if(tempnode == null){
        		System.out.println("List is empty");
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
			System.out.println(newnode.data);
		}

	}

    	public static void main(String[] args){
		middelNodeLL ll = new middelNodeLL();
		node start = new node();
		start.data = 10;
		start = ll.insertElement(start,11);
		start = ll.insertElement(start,12);
		start = ll.insertElement(start,13);
		start = ll.insertElement(start,14);
		start = ll.insertElement(start,15);
		ll.middelNode(start);
	}

}

/*TEST CASE
13
*/
//Time Complexity - O(n)

