import java.util.ArrayList;
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
		public void testIfMiddleNodeIsReturned() {
				var al = GetArrayList();
				var ll = createLinkedListFromArrayList(al);
			    int expectedValue = al.get(al.size() / 2);
				System.out.println("Expected value is " + expectedValue);
                assertEquals(expectedValue, ll.MiddleNodeLL());
				
		}
}
