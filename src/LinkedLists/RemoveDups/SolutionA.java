package LinkedLists.RemoveDups;

import LinkedLists.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Write code to remove duplicates from an unsorted linked list.
 */
public class SolutionA {

    static LinkedListNode removeDups(LinkedListNode n) {

        // Set original node head.
        LinkedListNode head = n;

        // Sets can not have duplicated values.
        Set<Integer> set = new HashSet<>();

        // Used to retrieve the previous node.
        LinkedListNode previous = null;

        // Test if we are in the end of the list of if we have a empty list.
        while (n != null) {
            if (set.contains(n.data)) {
                // The current data already exist in the list, go to the next.
                previous.next = n.next;
            } else {
                // Add the node as a already found node.
                set.add(n.data);
                // Add a reference for the current node, to be used as previous node.
                previous = n;
            }
            // Go to the next node.
            n = n.next;
        }
        // Return the final list without any duplicated value.
        return head;
    }
}
