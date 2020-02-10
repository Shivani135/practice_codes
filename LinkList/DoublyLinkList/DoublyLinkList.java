import java.io.*;
class DoublyLinkList{
    static class node{
        int data;
        node prev;
        node next;
    }
    public node add(node start, int d){
        node newnode = new node();
        newnode.data = d;
        newnode.prev = null;
        newnode.next = null;

        if (start == null){
            start = newnode;

        } else{
            node tempnode = start;
            while(tempnode.next != null ){
                tempnode =tempnode.next;
            }
            tempnode.next = newnode;
            newnode.prev = tempnode;

        }
        return (start);
    }
    public node delete(node start, int d){
        node tempnode = start;
        if(tempnode.data == d){
            tempnode = tempnode.next;
        }
        else {
            while (tempnode.next.data != d){
                tempnode = tempnode.next;            
            }
            node newnode = new node();
            newnode = tempnode.next;
            tempnode.next = newnode.next;
            newnode = newnode.next;
            newnode.prev = tempnode;
        }
        tempnode = start;
        while(tempnode != null){
            System.out.println(tempnode.data);
            tempnode = tempnode.next;
        }
        return (start);
    }

    public void search(node start, int d){
        node tempnode = start;
        int c = 0;
        do{
            if(tempnode.data == d){
                System.out.println("ELement found");
                c=1;
                break;
            }
            else{
                tempnode = tempnode.next;
            }
        }while(tempnode != null);
        if(c != 1){
            System.out.println("Element not Found");
        }
    }

    public static void main(String[] args) throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        DoublyLinkList dll = new DoublyLinkList();
        node start = new node();
        start = null;
        System.out.println("Enter \n 1.TO ADD \n 2.TO DELETE \n 3.TO SEARCH \n 4.TO EXIT");
        int ch = Integer.parseInt(in.readLine());
        int d;
        while(ch !=4 ){
            switch(ch){
                case 1:
                    System.out.println("Enter data , enter -1 if no data to be entered");
                    d = Integer.parseInt(in.readLine());
                    while(d != -1){
                        start = dll.add(start, d);
                        d = Integer.parseInt(in.readLine());
                    }
                    node tempnode = start;
                    while(tempnode != null){
                        System.out.println(tempnode.data);
                        tempnode = tempnode.next;

                    }
                    break;
                case 2:
                    System.out.println("Enter no to delete");
                    int e = Integer.parseInt(in.readLine());
                    start = dll.delete(start, e);
                    break;
                case 3:
                    System.out.println("Enter no.to search");
                    int f = Integer.parseInt(in.readLine());
                    dll.search(start,f);
                    break;
                default:
                    System.out.println("No choice Entered");

            }
            System.out.println("Enter \n 1.TO ADD \n 2.TO DELETE \n 3.TO SEARCH \n 4.TO EXIT");
            ch = Integer.parseInt(in.readLine());
        }
    }

}
/*TEST CASE
Enter
 1.TO ADD
 2.TO DELETE
 3.TO SEARCH
 4.TO EXIT
1
Enter data , enter -1 if no data to be entered
5
6
4
2
3
7
8
9
-1
5
6
4
2
3
7
8
9
Enter
 1.TO ADD
 2.TO DELETE
 3.TO SEARCH
 4.TO EXIT
2
Enter no to delete
2
5
6
4
3
7
8
9
Enter
 1.TO ADD
 2.TO DELETE
 3.TO SEARCH
 4.TO EXIT
3
Enter no.to search
2
Element not Found
Enter
 1.TO ADD
 2.TO DELETE
 3.TO SEARCH
 4.TO EXIT
3
Enter no.to search
5
ELement found
Enter
 1.TO ADD
 2.TO DELETE
 3.TO SEARCH
 4.TO EXIT
4
*/
//Time Complexity - O(n)
