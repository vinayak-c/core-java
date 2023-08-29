package Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class OrderAmountComparator implements Comparator<Customer>
{
	@Override
	public int compare(Customer o1, Customer o2) {
		
		if(o1.getOrderAmount()>o2.getOrderAmount())
		return -1;
		else if(o1.getOrderAmount()<o2.getOrderAmount())
		return 1;
		else
		return 0;
	}	
}

class IdComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) 
	{
		if(o1.getOrderAmount()>o2.getOrderAmount())
		return 1;
		else if(o1.getOrderAmount()<o2.getOrderAmount())
		return -1;
		else
		return 0;
	}

	
}
class Customer {
	int id;
	String name;
	int orderAmount;

	public Customer(int id, String name, int orderAmount) {
		this.id = id;
		this.name = name;
		this.orderAmount = orderAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orderAmount=" + orderAmount + "]";
	}

}

public class PriorityQueueC {

	public static void main(String[] args) {

		/*Queue<String> pq = new PriorityQueue<>();
		Queue<String> lq = new LinkedList<>();
		Queue<String> pq2 = new PriorityQueue<>();*/
		Queue<Customer> cq=new PriorityQueue<>(new OrderAmountComparator());
		Queue<Customer> cq2=new PriorityQueue<>(new IdComparator());
		
		Customer c1=new Customer(1,"Vinayak",1000);
		Customer c2=new Customer(2,"Vinny",2500);
		Customer c3=new Customer(3,"VC",100);
		
		Customer c4=new Customer(1,"Vinayak",1000);
		Customer c5=new Customer(2,"Vinny",2500);
		Customer c6=new Customer(3,"VC",100);
		
		cq.offer(c1);
		cq.offer(c2);
		cq.offer(c3);
		
		cq2.add(c4);
		cq2.add(c5);
		cq2.add(c6);
		
		System.out.println(cq);
		System.out.println(cq2);
		// adding values to pq
		/*pq.add("z");
		pq.add("a");
		pq.add("b");
		pq.add("c");
		pq.add("d");
		pq.add("e");
		pq.add("f");
		System.out.println("Priority Queue: " + pq);

		// adding values to lq
		lq.offer("f");
		lq.offer("s");
		lq.offer("c");
		lq.offer("l");
		lq.add("a");
		lq.add("z");
		lq.add("g");
		System.out.println("Linked Queue: " + lq);
		System.out.println("Poll: " + pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq);*/
	}

}
