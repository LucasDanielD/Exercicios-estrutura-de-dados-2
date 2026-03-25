package exercicoetreinojunior;

public interface ArrayList {

	 public void insertAt(int index, int element);
	 
	 public void addFirst(int element);
	 public void addLast(int element);
	 
	 public int removeAt(int index);
	 
	 public int removeFirst();
	 public int removeLast();
	 public boolean remove(int element);
	 public int find(int element);
	 public int get(int index);
	 public void set(int index, int element);
	 public void display();
}
