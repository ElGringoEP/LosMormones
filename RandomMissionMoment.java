package finalproject;
import java.util.Scanner;
public class RandomMissionMoment 
{
    static Scanner keyboard = new Scanner(System.in);
    static char decision;
    
    public static void teach(int randomNum) 
    {
        int eventNum = randomNum;
	switch (eventNum) 
        {
            case 1:
		contact();
		break;
            case 2:
		firstVisit();
		break;
            case 3:
		getInvestForChurch();
		break;
            case 4:
		study();
		break;
            case 5:
		sleep();
		break;
            case 6:
		keepHouseClean();
		break;
            case 7:
		swim();
		break;
            case 8:
		groceryShop();
		break;
            case 9:
		plan();
            case 10:
		findGoldenFamily();
            default:
            return;
	}
    }

    private static void groceryShop() 
    {
	System.out.println("You went food shopping, go eat!");
        System.out.println("You earned 2 Flecha points.");
        Player.addFlechaPoints(2);
    }
    
    private static void getInvestForChurch() 
    {
        System.out.println("You went and got you're investigadors for church");
        System.out.println("You earned 3 Flecha points.");
	Player.addFlechaPoints(3);
    }

    private static void findGoldenFamily() 
    {
	System.out.print("You found a family with 3 kids who is interested in learning more about he church. Do you:\n1 Don't teach anything.\n2 Take the time and effor to help them learn more abou the church. \n3 Try but let them figure it all out their own.\n");
        System.out.print("Enter number: ");
        String str = keyboard.nextLine();
        int choice;
        choice = Integer.parseInt(str);

	switch (choice) 
        {
            case 1:
		System.out.println("Horrible choice, they were a Golden Family");
                System.out.println("You earned 5 Tigre points.");
		Player.addTigrePoints(5);
		break;
            case 2:
		System.out.println("Congrats!!! You baptised a Family, no matter what else you do, you're mission was a success... Go have fun");
		System.out.println("You Win");
		System.exit(0);
		break;
            case 3:
		System.out.println("Good try, they fell away, more effort next time.");
                System.out.println("You earned 2 Flecha points.");
		Player.addFlechaPoints(2);
		break;
            default:
		break;
	}
    }

    private static void plan() 
    {
        System.out.println("You planned with you missionary companion! Good work");
        System.out.println("You earned two Flecha points");
	Player.addFlechaPoints(2);
    }

    private static void swim() 
    {
	System.out.println("You decide to go for a swim in the ocean.");
	System.out.println("Do you try to go to Puerto Rico?");

        do 
        {
            System.out.print("Enter y or n: ");
            String temp = keyboard.nextLine();
            decision = temp.charAt(0);
            if (decision != 'y' && decision != 'n') 
            {
		System.out.println("Error. Please enter y or n");
            }
	} while (decision != 'y' && decision != 'n');

	if (decision == 'y') 
        {
            System.out.println("You are on your way to the island, do you use a row boat?");

            do 
            {
		System.out.print("Enter y or n: ");
                String temp = keyboard.nextLine();
                decision = temp.charAt(0);
		if (decision != 'y' && decision != 'n') 
                {
                    System.out.println("Error. Please enter y or n");
		}

            } while (decision != 'y' && decision != 'n');

            if (decision == 'y') 
            {
		System.out.println("You had a fun day in Puerto Rico, sneaky sneaky.");
		Player.addTigrePoints(10);
            }
            else 
            {
                System.out.println("Uh Oh! The sharks got you first... now you're dead.");
		System.out.println("GAME OVER");
		System.exit(0);
            }
	}
    }

    private static void sleep() 
    {
	System.out.println("You slept all day. Jesus is frowning upon you.");
        System.out.println("You earned 2 Tigre points.");
	Player.addTigrePoints(2);
    }

    private static void keepHouseClean() 
    {
        System.out.println("You keep your house clean! Good Job");
        System.out.println("You earned 2 Flecha points.");
	Player.addFlechaPoints(2);
    }

    private static void study() 
    {
        System.out.println("You took the time to study your missionary materials.\n"
                + "Good work!");
        System.out.println("You earned 2 Flecha points.");
        Player.addFlechaPoints(2);

    }

    private static void firstVisit() 
    {
        System.out.println("You go to teach someone on a first visit to their house, what lesson do you teach?\n"
                + "1, 2, or 3\n");
        System.out.println("Or enter 0 to just hang out and eat at thier house.");
        System.out.print("Enter number: ");
        String str = keyboard.nextLine();
        int choice;
	choice = Integer.parseInt(str);

	switch (choice) 
        {
            case 1:
		System.out.println("Good Choice, That's the right lesson.");
                System.out.println("You earned 2 Flecha points.");
		Player.addFlechaPoints(2);
		break;
            case 2: // drops right down to 3;
            case 3:
		System.out.println("Bad Choice, you teach 1st lesson on first visit.");
                System.out.println("You earned 2 Tigre points.");
		Player.addTigrePoints(2);
		break;
            default:
		System.out.println("Way to enjoy yourself!");
                System.out.println("you earned 3 tigre points.");
		Player.addTigrePoints(3);
            break;
	}

    }

    private static void contact() 
    {
	System.out.println("You knock on a door..");
	int contactEvent = randomNum3();
        switch (contactEvent) 
        {
            case 1:
		System.out.println("They offer you inside for juice and crakers, do you go in?");
		do 
                {
                    System.out.print("Enter y or n: ");
                    String temp = keyboard.nextLine();
                    decision = temp.charAt(0);
                    if (decision != 'y' && decision != 'n') 
                    {
			System.out.println("Error. Please enter y or n");
                    }
		} while (decision != 'y' && decision != 'n');

		if (decision == 'y') 
                {
                    System.out.println("Good choice, they want to learn more about being Mormon");
                    System.out.println("You earned i Flecha points.");
                    Player.addFlechaPoints(1);
		} 
                else 
                {
                    System.out.println("Bad choice, they wanted to learn more about Mormons");
                    System.out.println("You earned 1 Tigre points.");
                    Player.addTigrePoints(1);
		}
                break;
            case 2:
		System.out.println("No one answers, do you continue to knock?");
                do 
                {
                    System.out.print("Enter y or n: ");
                    String temp = keyboard.nextLine();
                    decision = temp.charAt(0);
                    if (decision != 'y' && decision != 'n') 
                    {
			System.out.println("Error. Please enter y or n");
                    }
		} while (decision != 'y' && decision != 'n');
		if (decision == 'y') 
                {
                    System.out.println("Good Choice, they were nervous but answered and want to learn more about Mormons.");
                    System.out.println("You earned 1 Flecha points.");
                    Player.addFlechaPoints(1);
		}
                else 
                {
                    System.out.println("Bad choice, they were nervouse and you walked away. Jesus is frowning.");
                    System.out.println("You earned 2 Tigre points.");
                    Player.addTigrePoints(2);
		}
		break;
            case 3:
		System.out.println("A crazy looking person answers but seems very excited to see you... Do you:\n1. Walk away and come back with a church member"
							+ "\n2. Go in and teach\n3. Listen to your gut and dont come back.");
                String str = keyboard.nextLine();
                int choice;
		choice = Integer.parseInt(str);
		if (choice == 1) 
                {
                    System.out.println("Good choice, bad result, person wasnt there.");
                    System.out.println("You earned 2 Flecha points.");
                    Player.addFlechaPoints(2);
		} 
                else if (choice == 2) 
                {
                    System.out.println("Very bad choice... that man was crazy! He kidnapped you, took you to Haiti, and you were never seen again.");
                    System.out.println("Good Try Better Luck Next Time!");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
                else 
                {
                    System.out.println("Good Choice, who wants to teach a crazy person? Not you, that's who.");
                    System.out.println("However, you look like a bad missionary for not going back.");
                    System.out.println("You earned 4 Tigre points.");
                    Player.addTigrePoints(4);
		}

	}

    }

    public static int randomNum3() 
    {
        int d;
	d = (int) ((Math.random() * 3) + 1);
        return d;
    }
}
