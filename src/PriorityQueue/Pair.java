package PriorityQueue;

public class Pair<T extends Comparable> {

	public T value;
	int i;
	boolean previnsert;
	public Pair(T value) {
		this.value=value;
		i=1;
		previnsert=true;
	}
	public int compareTo(Pair<T> ob) {
		if(this.value.compareTo(ob.value)==0)
		{
			if(this.i>ob.i)
				return -1;
			else return 1;
		}
		else
			return this.value.compareTo(ob.value);
	}
}
