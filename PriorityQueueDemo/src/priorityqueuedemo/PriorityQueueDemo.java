/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueuedemo;

import java.util.PriorityQueue;

/**
 *
 * @author sudhi
 */
public class PriorityQueueDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue q =new PriorityQueue();
        System.out.println(q.peek());
        // System.out.println(q.element());
         for (int i=0;i<=10;i++){
        q.offer(i);
     
    }
         System.out.println(q);
          System.out.println(q.poll());
     System.out.println(q);
}
}
//some platforms do not provide proper support thread priority and priority queue
