package pac;

public abstract class Bike {

	public void handle() {
		System.out.println("Bike should have handle");
	}
	public void breakes() {
		System.out.println("Bike Should have breakes");
	}
	public abstract void engine(int a, int b);
	public abstract void body(int a, int b);
	public static void main(String[] args) {
		HeroHonda objhh=new HeroHonda();
		objhh.body(120, 30);
		objhh.engine(20, 55);
		objhh.breakes();
		objhh.handle();
	}
}
