import java.util.*;


public class Lesson03_Exceptions {

	public static void main(String[] args) {
		File f = new File("points.txt");
		
		ArrayList<Integer> xs = new ArrayList<>();
		ArrayList<Integer> ys = new ArrayList<>();
		try {
			//checkValid(1);
			
			Scanner sc = new Scanner(f);
			while ( sc.hasNext() ) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				checkValid(x);
				checkValid(y);
				
				xs.add(x);
				ys.add(y);
				
			}
		}
		catch(InvalidDataException ide) {
			ide.printStackTrace();
		}
		catch(FileNotFoundException fnfe) {
			System.out.println( fnfe.getMessage() );
		}
		
		System.out.println(xs);
		System.out.println(ys);
	}
	static void checkValid(int i) throws InvalidDataException {
		if(i<0) throw new InvalidDataException();
	}
	
	static class InvalidDataException extends Exception{
		
	}

}
