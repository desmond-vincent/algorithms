package org.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void bfsTree(ListNode root){
        if (root == null) return;

        Queue<ListNode> queue = new LinkedList<ListNode>();
        queue.offer(root);

        IO.println("BFS Tree Traversal");

        while (!queue.isEmpty()){
            ListNode node = queue.poll();

            IO.println(node.val + "");

            //Add left child to queue
            if (node.left != null){
                queue.offer(node.left);
            }

            //Add right child to queue
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        IO.println();
    }
}
