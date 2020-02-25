import java.io.*;

class MainDeleteNode {
  public static void main(String[] args) throws IOException {
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    LLNode start = new LLNode();
    DeleteNode ll = new DeleteNode();
    // start = null;
    //start.data = 10;
    //start = ll.creatingLL(start, 4);
    //start = ll.creatingLL(start, 45);
    //start = ll.creatingLL(start, 5);
    //start = ll.creatingLL(start, 14);
    //start = ll.creatingLL(start, 8);
    //start = ll.creatingLL(start, 17);
    //start = ll.creatingLL(start, 81);
    //start = ll.creatingLL(start, 77);
    //LLNode tempnode = new LLNode();
    //tempnode = start;
    /*while(tempnode !=null){
    System.out.println(tempnode.data);
    tempnode= tempnode.next;
    }*/
    System.out.println("Enter no. which you have to delete");
    String str = in.readLine();
    try {
      int n = Integer.parseInt(str);
      ll.deleteNode( n);
    } catch (NumberFormatException e) {
      System.out.println("Wrong Input");
    }
  }
}
