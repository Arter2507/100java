// Unary operation
public class ViDu {
public static void main(String[] args) {
	int a = 5;
	boolean b = false;
	
	System.out.println("Unary minus - => value: " + (-a));
	System.out.println("Unary plus + => value: " + (+a));
	System.out.println("Logic compensation ! => value: " + (!b));
	
	System.out.println("---------------");
	System.out.println("A => value: " + a);
	System.out.println("++A => value: " + ++a);
	System.out.println("A++ => value: " + a++);
	System.out.println("A => value: " + a);

	System.out.println("---------------");
	System.out.println("A => value: " + a);
	System.out.println("--A => value: " + --a);
	System.out.println("A-- => value: " + a--);
	System.out.println("A => value: " + a);

}
}
