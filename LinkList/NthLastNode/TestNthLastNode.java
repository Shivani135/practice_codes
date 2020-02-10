import java.util.ArrayList;
/*
 * import static org.junit.Assert.assertEquals;
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class TestNthLastNode {
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
		public void testForZerothNode() {
				var al = GetArrayList();
				var ll = createLinkedListFromArrayList(al);

				boolean pass = false;

				try {
						ll.nthLastNode(0);
				} catch (RuntimeException e) {
						String exceptionMessage = "number is zero";
						String x =  e.getMessage();
						System.out.println("Exception is " + x);
						assertEquals(exceptionMessage, x);
						pass = true;
				}

				if (pass == false) {
						fail("Expected the function to throw a RuntimeException");
				}
				/*
				 * Assert.fail("Expected the function to throw a RuntimeException");
				 */
		}

		@Test
		public void testIfNthNodeIsReturned() {
				var al = GetArrayList();
				var ll = createLinkedListFromArrayList(al);
				for (int i = 1; i < al.size(); i++) {
						int expectedValue = al.get(al.size() - i);
						System.out.println("Expected value is " + expectedValue);
						assertEquals(expectedValue, ll.nthLastNode(i));
				}
		}
}
