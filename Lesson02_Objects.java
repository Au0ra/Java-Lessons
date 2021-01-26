
import java.util.*;

public class Lesson02_Objects {

	public static void main(String[] args) {
		int x = 5;
		String name = "Andrew";
		
		int[] a = new int[] {3,4,5};
		
		int[] aRef = a;
		
		a[0] *= 30;
		System.out.println(Arrays.toString(aRef));
		
		Object o = new Object();
		
		Object o2 = a;
		
		Object o3 = name;
		
		Object o4 = x;
		
		Integer y = 9;
		
		
		printAll(name, o, o2, o3, o4, y);

	}
	
	static void printAll(Object... inputs) {
		for(Object o : inputs) {
			if (o instanceof int[]) {
				System.out.println(Arrays.toString((int[])o));
			}
			System.out.println(o);
		}
	}

}
