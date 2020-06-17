/**
 * 
 */
package com.in28mins.collections.queueInterface;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author dstar - Queue is a collection that acts like a real life queue we can
 *         add elements in them follows FIFO order. the elements added in the
 *         list will be implicitly sorted and stored. If you want to process the
 *         elements in the list in someother order then we can use the
 *         Comparator interface to do that.
 *
 */

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());// comparing to sort the processing of queue in increasing
															// order of length of string in queue, can do decreasing
															// order by swapping the o1,o2 params
	}

}

public class QueueBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());// pass the obj of desired comparator to
																				// determing the order of queue elements
		queue.addAll(List.of("Professor", "Nairobi", "Denver", "Stockholm", "Paris"));
		System.out.println(queue);// automatically sorts the items in the list
		System.out.println(queue.poll());// removes the top most element in the queue based on the sorting way specified
											// and return it here
		System.out.println(queue.poll());// removes Nairobi
		System.out.println(queue.poll());// removes Professor
		System.out.println(queue.poll());// removes Stockholm
		System.out.println(queue.poll());// removes null, cuz there is nothing in the list to poll
		
		System.out.println();

		queue.addAll(List.of("Professor", "Nairobi", "Denver", "Stockholm"));//populating the queue again
		System.out.println(queue.peek());// peek is same as poll but it just retreives the elements not remove them from
											// queue
		System.out.println(queue.peek());// denver
		System.out.println(queue.peek());// denver
		System.out.println(queue.peek());// denver
		System.out.println(queue.peek());// denver - all are denver cuz element was not removed and head stays in denver

		System.out.println(queue.remove());// similar to poll() - retreives head element and remove them from queue but
											// its diff from poll() cuz once there are no elements in the queue, it
											// returns noSuchElementException whereas poll() returs null

		System.out.println(queue.element());// similar to peek() - retreives head element but
											// its diff from poll() cuz once there are no elements in the queue, it
											// returns noSuchElementException whereas poll() returs null
	}

}
