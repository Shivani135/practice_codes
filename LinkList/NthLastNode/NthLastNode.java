class NthLastNode {

  private LLNode head;

  public void creatingLL(int data) {
    LLNode newnode = new LLNode();
    newnode.data = data;

    if (head == null) {
      head = newnode;
    } else {
      LLNode tempnode = head;
      while (tempnode.next != null) {
        tempnode = tempnode.next;
      }
      tempnode.next = newnode;
    }
  }

  public void printLL() {
    LLNode temp = head;
    while (temp != null) {
      System.out.println(" " + temp.data + " ");
      temp = temp.next;
    }
  }

  public int nthLastNode(int n) {
    LLNode tempnode = head;
    int len = 1;
    if ((n > 0)) {
      while (tempnode.next != null) {
        tempnode = tempnode.next;
        len++;
      }
      tempnode = head;
      System.out.println("Length is " + len);
      if (len > n) {
        for (int i = 0; i < len - n; i++) {
          tempnode = tempnode.next;
        }
        System.out.println("new" + tempnode.data);
        return tempnode.data;
      } else {
        System.out.println("Number is graeter than length");
      }
    } else {
      System.out.println("Number is zero");
      throw new RuntimeException("number is zero");
    }
    return -1;
  }

  // public LLNode creatingLL1(LLNode start, int data) {
  // LLNode newnode = new LLNode();
  // newnode.data = data;
  // LLNode tempnode = new LLNode();
  // tempnode = start;
  // while (tempnode.next != null) {
  // tempnode = tempnode.next;
  // }
  // tempnode.next = newnode;
  // return start;
  // }

  // // Logic needs to be improved
  // public void nthLastNode2(LLNode start, int n) {
  // LLNode tempnode = new LLNode();
  // tempnode = start;
  // int len = 0;
  // while (tempnode != null) {
  // len++;
  // tempnode = tempnode.next;
  // }
  // tempnode = start;
  // if ((len > n) && (n > 0)) {
  // for (int i = 0; i < len - n; i++) {
  // tempnode = tempnode.next;
  // }
  // System.out.println(tempnode.data);
  // } else {
  // System.out.println("N is greater than the length of the link list or n is negative ");
  // }
  // }
}
/*TEST CASE
Enter no. which we have to extract from last
3
17
*/
// Time Complexity - O(n)
