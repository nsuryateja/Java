package sols;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Task5 implements Comparable<Task5> {
	
	private int rank;
	private String name;

	public Task5(String name, int rank) {
		super();
		this.rank = rank;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Task5 [rank=" + rank + ", name=" + name + "]";
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(Task5 o) {
		// TODO Auto-generated method stub
		if (rank < o.rank)
			return -1;
		else if (rank > o.rank)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		PriorityQueue<Task5> pq = new PriorityQueue<Task5>();

		pq.add(new Task5("Surya", 5));
		pq.add(new Task5("Suffrya", 4));
		pq.add(new Task5("Sukkrya", 3));
		pq.add(new Task5("Surjsya", 2));
		pq.add(new Task5("Sussrya", 1));

		Iterator<Task5> it = pq.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}