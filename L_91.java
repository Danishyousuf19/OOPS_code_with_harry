import java.util.*;
public class L_91 {

	public static void main(String[] args) {
		// ARRAYLIST and linked list
		ArrayList<Integer> l1 =new ArrayList<>();
		l1.add(0);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i)+ " , ");
		}System.out.println();
		
		//l1.clear();
		//l1.remove(3);
		//l1.clone();
		//l1.add(5, 5);
		//System.out.println(l1.contains(6));
		//l1.set(2, 6);
		
		for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i)+ " , ");
		}System.out.println();
		ArrayList <Integer> l2=new ArrayList<>(9);
		l2.add(01);
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		for(int i=0;i<l2.size();i++) {
			System.out.print(l2.get(i)+ " , ");
		}
		System.out.println(l1.containsAll(l2));
		l2.addAll(l1);
		for(int i=0;i<l2.size();i++) {
			System.out.print(l2.get(i)+ " , ");
		}
		ArrayList<Double> l3 =new ArrayList<>();
		System.out.println("LINKED LIST");
		/////////////////////////////////////////////////////////////////////////////
		LinkedList<Integer> ll =new LinkedList<>();
		ll.add(0);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+ " , ");
		}System.out.println();
	//	ll.peekLast();
		//l1.clear();
		//l1.remove(3);
		//l1.clone();
		//l1.add(5, 5);
		//System.out.println(l1.contains(6));
		//l1.set(2, 6);
		//ll.addFirst(333);
		//ll.addLast(999);
		//ll.pollLast();
		//ll.offer(3);
		//ll.pop();
		ll.push(3);
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+ " , ");
		}System.out.println("adadadadd");
		/////////////////////////////////////////////////////////////////////////
		ArrayDeque<Integer> ad =new ArrayDeque<>();
		ad.add(0);
		ad.add(1);
		ad.add(2);
		ad.add(3);
		ad.add(4);
		
		
		System.out.println();
		//ad.clear();
		ad.remove(3);
		//ad.clear();
		
		System.out.println(ad.clone());
		System.out.println(ad.getLast());
		System.out.println(ad.getFirst());
		////////////////////////////////////////////////////////////////////////////////
		System.out.println("hashset");
		HashSet <Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(2);
		System.out.println(hs);
	
	}

}
