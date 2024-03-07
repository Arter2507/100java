// Data type conversion
public class ViDu {
	public static void main(String[] args) {
		int a = 100;
		int b = 2;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// 2 type of implicit type - ep kieu ngam dinh co 2 cach
		float c = a;
		float d = (float) b;

		System.out.println("c = " + c);
		System.out.println("d = " + d);

		// explicit type - ep kieu tuong minh
		float e = 3.5f;
		float f = 9.5f;

		System.out.println("e = " + f);
		System.out.println("f = " + e);

		int g = (int) e;
		int h = (int) f;

		System.out.println("g = " + g);
		System.out.println("h = " + h);

		// Ep kieu giua bien nguyen thuy va doi tuong - squeeze the type between the
		// primitive variable and the object
		int x = new Integer(32);
		System.out.println("x = " + x);

	}
}
