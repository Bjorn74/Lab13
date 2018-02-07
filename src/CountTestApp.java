
public class CountTestApp {

	public static void main(String[] args) {

		System.out.println("Counting Alligators...");
		System.out.println();
		System.out.println();
		Alligator bob = new Alligator();
		CountUtil.count(bob, 3);
		bob.resetCount();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Counting Sheep...");
		System.out.println();
		System.out.println();
		Sheep ewe = new Sheep("Eunice");
		CountUtil.count(ewe, 2);
		ewe.resetCount();
		
		System.out.println();
		System.out.println();
		
		Sheep molly = new Sheep();
		try {
			molly.cloneSheep(ewe, "Molly");
			molly.setName("Molly");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		CountUtil.count(molly, 3);
		
		System.out.println();
		System.out.println();
		
		CountUtil.count(ewe, 1);
		

	}

}
