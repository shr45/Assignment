import java.util.Scanner;

public class TreasureHunt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Left or Right");
		String input = sc.nextLine();
		
		if (input.equals("Right")) {
			System.out.println("Fall into a hole game over");
		}
		else{
			System.out.println("Swim or Wait");
			
			String secondinput = sc.nextLine();
			if(secondinput.equals("Swim"))
			{
			System.out.println("Attacked by trout.Game Over.");
			}
			else{
				System.out.println("Enter Blue Yellow or Red");
				String thirdinput = sc.nextLine();
			switch(thirdinput){
				default:
				
				case "red":
					System.out.println("Game Over");
				break;
				
				case "yellow":
					System.out.println("You Win");
				
				break;
				case "blue":
					System.out.println("Eaten by beasts.Game Over");
				break;
				
				
			}
				
				
			}
			
		}
	}

}
