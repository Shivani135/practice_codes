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
		public void testLLIsReversed() {
				var al = GetArrayList();
				var ll = createLinkedListFromArrayList(al);
                var list = new ArrayList<Integer>
				for (int i = al.size-1; i >= 0; i--) {
                        list.add(all.get(i));
                        ArrayList<Integer> list1 = new ArrayList<Integer>(ll.deleteNode(i));
						assertEquals(list, list1);
				}
		}
}
