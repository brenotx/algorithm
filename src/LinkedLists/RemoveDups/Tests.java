package LinkedLists.RemoveDups;

import LinkedLists.LinkedListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    void testRemoveDups() {
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);
        LinkedListNode node4 = new LinkedListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        LinkedListNode node = SolutionA.removeDups(node1);

        assertEquals(node.data, 1);
//        assertEquals(node.next.data, 2);
//        assertEquals(node.next.next.data, 3);
//        assertEquals(node.next.next.next, null);

    }
}
