package Bucky;

public class Tut3 {

	public static void main(String[] args) {
		System.out.println(silnia(5));
	}
	
	public static long silnia (long s){
		if(s<=1){
			return 1;
		}
		else{
			return s * silnia(s-1);
		}
	}
}
