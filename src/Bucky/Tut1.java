package Bucky;

public class Tut1 {

	public static void main(String[] args) {
		String [] str = {"Furry", "Futro", "Plutno","Smutno"};
		
		for (String slowo : str) {
			if(slowo.startsWith("Fu"))
				System.out.println("Slowo zaczynajace sie na Fu to: "+slowo);
		}
		
		for (String slowo : str) {
			if(slowo.endsWith("no"))
				System.out.println("Slowo konczce sie na no to: "+slowo);
		}
	}
	
	
}
