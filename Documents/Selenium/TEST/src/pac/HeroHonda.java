package pac;

public class HeroHonda extends Bike{

@Override
public void engine(int a, int b) {
	// TODO Auto-generated method stub
	int c=a+b;
	System.out.println(c);
	}

@Override
public void body(int a, int b) {
	// TODO Auto-generated method stub
	int c=a+b;
	System.out.println(c);
	}
public static void main(String[] args) {
	HeroHonda objhh=new HeroHonda();
	objhh.breakes();
	objhh.handle();
	objhh.body(20,25);
	objhh.engine(245, 239);
	}
}
