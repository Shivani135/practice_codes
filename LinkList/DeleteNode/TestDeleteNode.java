import java.util.ArrayList;*
import java.util.LinkedList;*
import static org.junit.Assert.*;
import org.junit.Test;

public class TestDeleteNode {
		ArrayList<Integer> GetArrayList() {
				var al = new ArrayList<Integer>();
				al.add(1);
				al.add(2);
				al.add(3);
				al.add(4);
				al.add(5);
				al.add(6);
				al.add(7);
				return al;
		}

		NthLastNode createLinkedListFromArrayList(ArrayList<Integer> al) {
				NthLastNode ll = new NthLastNode();
				for (var e : al) {
						ll.creatingLL(e);
				}
				ll.printLL();
				return ll;
		}

		@Test
		public void testNegativeValues() {}

		@Test
		public void testMoreNodesThanLinkedList() {}

		@Test
		public void testIfDataIsNotThere() {
				var al = GetArrayList();
				var ll = createLinkedListFromArrayList(al);

				boolean pass = false;

				try {
						ll.nthLastNode(100);
				} catch (RuntimeException e) {
						String exceptionMessage = "number is not present";
						String x =  e.getMessage();
						System.out.println("Exception is " + x);
						assertEquals(exceptionMessage, x);
						pass = true;
				}

				if (pass == false) {
						fail("Expected the function to print no. is not present");
				}
								
		}

		@Test
		public void testIfnode is deletedIsReturned() {
				var al = GetArrayList();
				var ll = createLinkedListFromArrayList(al);
				for (int i = 1; i < al.size(); i++) {
                        ArrayList<Integer> list = new ArrayList<Integer>(ll.deleteNode(i));
						assertEquals(al, list);
				}
		}
}
