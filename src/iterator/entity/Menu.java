package iterator.entity;

public interface Menu extends Iterable<MenuItem> {
	void addItem(MenuItem item);
	
}
