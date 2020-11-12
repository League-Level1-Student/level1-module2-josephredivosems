package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	
	Smurf handy = new Smurf("Handy");
	handy.eat();
	System.out.println("handy");
	
	Smurf papa = new Smurf("Papa");
	System.out.println(papa);
	String hatColor = papa.getHatColor();
	System.out.println(hatColor);
	String gender = papa.isGirlOrBoy();
	System.out.println(gender);
	
	Smurf smurfette = new Smurf("Smurfette");
	System.out.println(smurfette);
	String hatColorette = smurfette.getHatColor();
	System.out.println(hatColorette);
	String genderette = smurfette.isGirlOrBoy();
	System.out.println(genderette);
	
}
}
