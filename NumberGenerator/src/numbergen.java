import java.util.Random;

public class numbergen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(); //creates an object of Random class
		
		int x = random.nextInt(1000); // generates random number integers from 0 to 999
		System.out.println("Randomly generated integer: " +x);
		
		double a = random.nextDouble();
		System.out.println("Randomly generated double: "+a);
		
		float f = random.nextFloat();
		System.out.println("Randomly generated float: "+f);
		
		long p = random.nextLong();
		System.out.println("Randomly generated long: "+p);
		
		boolean m = random.nextBoolean();
		System.out.println("Randomly generated boolean: "+m);
		

	}

}
