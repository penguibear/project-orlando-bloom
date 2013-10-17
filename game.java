import java.util.Scanner;
public class game{

	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	System.out.println("hi");
	boolean play = true;
	int gameState = 1;
	int choice = -1;
	int in;

	String name = scan.nextLine();
	player player1 = new player(name);

	while(player1.isAlive){

	switch(gameState){

	case 1:
		monster bear = new monster("Bear", 1, 3, 10);
		System.out.println("You are being attacked by a " + bear.NAME + ".");
		giveChoices("attack", "run");
		choice = scan.nextInt();
		if(choice == 1){
			System.out.println(bear.HP);
			attack(player1, bear);
			System.out.println(bear.HP);
		}


	case 9:
		System.out.println("You have beaten the game.");
		break;

	}//This is the end of the case statements


	}//this is the end of the while(play) infinite loop


	}//This is the ending of the main void

	/*************************************************************
	 *
	 * 		Methods go below this line
	 *
	 *************************************************************/

	public static void giveChoices(String in1){System.out.println("Choose one of the following.\n1. " +in1);}
	public static void giveChoices(String in1, String in2){System.out.println("Choose one of the following.\n1. " +in1 +"\n2. " +in2);}
	public static void giveChoices(String in1, String in2, String in3){System.out.println("Choose one of the following.\n1. " +in1 +"\n2. " +in2 +"\n3. " +in3);}
	public static void giveChoices(String in1, String in2, String in3, String in4){System.out.println("Choose one of the following.\n1. " +in1 +"\n2. " +in2 +"\n3. " +in3 + "\n4. " +in4);}

	public static void attack(player inplayer, monster inmonster){inmonster.HP = inmonster.HP - (inplayer.STAT_ATK - inmonster.DEF);}

}
