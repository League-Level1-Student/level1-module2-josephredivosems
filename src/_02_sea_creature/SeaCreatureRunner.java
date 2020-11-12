package _02_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	
	SeaCreature spongebob = new SeaCreature("Spongebob");
	spongebob.eat();
	spongebob.laugh();
	
	SeaCreature squidward = new SeaCreature("Squidward");
	System.out.println(squidward);
	squidward.eat();
	squidward.laugh();
	
	SeaCreature patrick = new SeaCreature("Patrick");
	System.out.println(patrick);
	patrick.eat();
	patrick.laugh();
	
}
}
