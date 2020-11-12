package _04_tea_maker;

public class TeaMakerRunner {
public static void main(String[] args) {
	TeaBag flavor = new TeaBag(TeaBag.GREEN);
	String teaFlavor = flavor.getFlavor();
	
	Kettle kettle = new Kettle();
	kettle.boil();
	
	Cup cup = new Cup();
	cup.makeTea(flavor, kettle.getWater());
	
}
}
