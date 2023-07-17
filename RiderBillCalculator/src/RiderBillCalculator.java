import java.util.Scanner;

public class RiderBillCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Let's Start !!");
        System.out.println("Enter your hight in centimeter");
        int higth = sc.nextInt();
        if(higth<120)
        {
            System.out.println("You can't ride !!");
        }
        else{
            System.out.println("You can ride !!");
            System.out.println("Enter your age");
            int age = sc.nextInt();
            int price=0;
            if(age<12)
            {
                price+=5;
                System.out.println("Your bill is " + price );
            }
             else if(age>=12 && age<18){
                price+=7;
                System.out.println("Your bill is " +price);
             }
             else if(age>18){
                price+=12;
                System.out.println("Your bill is " + price);
             }
             else if(age>=45 && age<55){
                price+=0;
                System.out.println("Your bill is " + price);
             }
             else{
                System.out.println("You can't ride !!");
             }

             System.out.println("Do you want photos yes or no ");
             Scanner scc=new Scanner(System.in);
             String Answer = scc.nextLine();
             if(Answer.equals("yes")){
                price+=3;
                    System.out.println("Your bill is " + price);
             }
             System.out.println("Your total bill is" + price);
            }
            

		
	}

}
