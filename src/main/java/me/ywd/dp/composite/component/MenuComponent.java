package composite.component;

@SuppressWarnings("rawtypes")
public abstract class MenuComponent implements Iterable {

	public void add(MenuComponent mc) {
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent mc) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param i
	 * @return
	 */
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDesc() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	public void print() {
		throw new UnsupportedOperationException();
	}
}
