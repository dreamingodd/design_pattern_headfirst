package factory.product;


/**
 * 
 * �����Ҳŷ����˳�����ĺô� interface+class
 * 
 * @author ywd
 *
 */
public abstract class Beverage {
	
	String name;
	
	public abstract String desc();
	public abstract double cost();
	
	public void make(String name) {
		System.out.println(name + " is making...");
	}
	
	public void box(String name) {
		System.out.println(name + " is boxing...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
