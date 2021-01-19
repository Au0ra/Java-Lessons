
import java.util.*;

public class Lesson01_Intro {

	public static void main(String[] args) {
		System.out.println(2+7);
		int x = 5;
		x*=15;
		System.out.println(x);
		
		int[] nums = new int[7];
		
		int counter = 0;
		int fill = 7;
		
		while (counter < 7) {
			nums[counter] = fill;
			fill--;
			counter++;
		}
		
		for(int element : nums) {
			System.out.print(element);
			System.out.print(",");
		}
		
		System.out.println("");
		
		System.out.println( Arrays.toString(nums));
		

	}

}
