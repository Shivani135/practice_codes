import java.io.*;

class MainNthLastNode {
  public static void main(String[] args) throws IOException {
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    LLNode start = new LLNode();
    NthLastNode ll = new NthLastNode();
    // start = null;
   // start.data = 10;
    start = ll.creatingLL(start, 4);
    start = ll.creatingLL(start, 45);
    start = ll.creatingLL(start, 5);
    start = ll.creatingLL(start, 14);
    start = ll.creatingLL(start, 8);
    start = ll.creatingLL(start, 17);
    start = ll.creatingLL(start, 81);
    start = ll.creatingLL(start, 77);
    LLNode tempnode = new LLNode();
    tempnode = start;
    /*while(tempnode !=null){
    System.out.println(tempnode.data);
    tempnode= tempnode.next;
    }*/
    System.out.println("Enter no. which we have to extract from last");
    String str = in.readLine();
    try {
      int n = Integer.parseInt(str);
			//ll.nthLastNode(start, n);
      //ll.nthLastNode2(start, n);
    } catch (NumberFormatException e) {
      // ll.nthLastNode(start, n);
      // ll.nthLastNode2(start, n);
      System.out.println("Wrong Input");
    }
  }
}
