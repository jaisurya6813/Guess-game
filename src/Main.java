import java.util.Scanner;
import java.util.Random;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello User \nPlease enter your name");
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + sc.nextLine() + "\nShall we start the game ?");
        System.out.println("\tY/N");
        String chose = sc.nextLine();

        //System.out.println(chose);
        if(chose.equals("Y"))
        {
            Random rand = new Random();
            int num = rand.nextInt(5)+1;
            System.out.println("Guess the number ");
            for(int i=0;i<5;i++)
            {
                int guess=sc.nextInt();
                if(guess==num)
                {
                    System.out.println("Congratulations !!! YOU WIN");
                    break;
                }
                else if(guess<num)
                {
                    System.out.println("Guess higher");
                }
                else
                {
                    System.out.println("Guess Lower");
                }
                if(i==4)
                {
                    System.out.println("No turns left... \nGAME OVER");
                }
            }


        }
        else
        {
            System.out.println("Bye");
        }

    }
}