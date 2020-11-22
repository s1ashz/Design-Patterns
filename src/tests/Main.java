package tests;

public class Main {

	
	public static void main(String args[]) {
		
		Pessoa dude = new Pessoa();
		dude.setName("puta");
		dude.setAge("54");

		System.out.println(dude);
		System.out.println(dude.hashCode());
		
		Integer lel =  128;
		Integer lel2 = 128;
		
		
		
		System.out.println(lel == lel2);
	}
}
