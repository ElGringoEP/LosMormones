package finalproject;
import java.util.Scanner;

public class RandomEvent 
{
    static Scanner keyboard = new Scanner(System.in);
    static char decision;

    public static void suprise(int randomNum) 
    {
        int eventNum = randomNum;
	switch (eventNum) 
        {
            case 1:
		hosueVist();
		break;
            case 2:
		getGF();
		break;
            case 3:
		contrabandFound();
		break;
            case 4:
		burgler();
		break;
            case 5:
		witnessed();
		break;
            case 6:
		golden();
		break;
            case 7:
		dinnerWithMember();
		break;
            case 8:
		banca();
                break;
            case 9:
                calleDelSol();
		break;
            case 10: //Deleted because it was not appropriate for class
                break;
            default:
		return;
	}
    }

    private static void calleDelSol() 
    {
        int purchase;
        System.out.println("You're at Calle Del Sol. There are many"
                + "places to shop. Here is a list of items you can purchase.\n");
        System.out.println("1: Clothes - 50 pesos\n"
                + "2: DVD's - 250 pesos\n"
                + "3: Cell Phone - 250 pesos\n"
                + "4: Souviener - 10 pesos\n"
                + "5 IPod - 250 pesos");
        System.out.println("Enter number for your choice: ");
        String item = keyboard.nextLine();
        purchase = Integer.parseInt(item);
        if(purchase == 2 || purchase == 3 || purchase == 5)
        {
            int temp = Player.getContrabandPosition();
            Player.contraband[temp] = item;
            Player.setContrabandPosition(temp+1);
            Player.subtractDinero(250);
            System.out.println("You purchased an item that goes against "
                    + "missionary rules.\n"
                    + "The item has been placed into your inventory");
        }
        else
        {
            int flechaPoints = 1;
            System.out.println("You have purchased an item that doesn't "
                    + "go agains missionary rules.\n "
                    + "You have earned " + flechaPoints + " Flecha point.");
            Player.addFlechaPoints(flechaPoints);
        }
    }

    private static void banca() 
    {
        System.out.println("You have entered the banca (gambling house).\n"
                + "Do you want to gamble?");
        System.out.println("Enter y or n: ");
	String temp = keyboard.nextLine();
	decision = temp.charAt(0);
	do 
        {
            if (decision != 'y' && decision != 'n') 
            {
		System.out.println("Error. Please enter y or n");
            }

	} while (decision != 'y' && decision != 'n');

	if (decision == 'n') 
        {
            int flechaPoints = 2;
            System.out.println("You have chosen not to gamble.");
            System.out.println("you have earned " + flechaPoints + " Flecha points");
            Player.addFlechaPoints(flechaPoints);
	} 
        else 
        {
            Player.addTigrePoints(3);
            System.out.print("How much do you want to gamble?\n"
                    + "Enter number: ");
            temp = keyboard.nextLine();
            int bet = Integer.parseInt(temp);
			
            boolean win = randomNum50();
			
            if(win == true)
            {
                System.out.println("Amazing! You won! You doubled your money!");
                Player.addDinero((bet*2));
            }
            else
            {
                System.out.println("Sorry, you lost all the money you bet");
                System.out.println(bet + "will be subracted from your account.");
                Player.subtractDinero(bet);
            }
        }

    }

    private static void dinnerWithMember() 
    {
        int flechaPoints = 1;
        int tigrePoints = 1;
        System.out.println("A church member as invited you over for dinner.");
        System.out.println("Enter y to accept or n or reject their offer");
        do
	{
            System.out.print("Enter your response: ");
	    String temp = keyboard.nextLine();
	    decision = temp.charAt(0);
	    if (decision != 'y' && decision != 'n')
	    {
	        System.out.println("Error. Please enter y or n");
	    }
	                    
	}while(decision != 'y' && decision != 'n');	 
        if(decision == 'y')
        {
            System.out.println("You have accepted thier offer.\n"
                    + "You have also earned " + flechaPoints + "flecha points");
            Player.addFlechaPoints(flechaPoints);	 
        }
        else
        {
            System.out.println("You have rejected thier offer.");
            System.out.println("you have earned " + tigrePoints + " Tigre points");
            Player.addTigrePoints(tigrePoints);
        }
    }
    
    private static void golden() 
    {	
        int flechaPoints = 4;
        System.out.println("Congrats!!! A \"golden\" investigador found you.");
        System.out.println("their ditication to the church makes you look good.");
        System.out.println("You get " + flechaPoints + " Flecha points");
        Player.addFlechaPoints(4);
    }

    private static void witnessed() 
    {
        int tigrePoints = 4;
        System.out.println("Uh Oh!!! Someone spotted you breaking missionary rules.");
        System.out.println("You have been reported to the mission president!");
        System.out.println("You have earned " + tigrePoints + " Tigre points");
        Player.addTigrePoints(4);
    }

    private static void burgler() 
    {	
        System.out.println("A Ladron robbed you of you're money and contraband!");
        System.out.println("You've lost everything!");
        Player.setDinero(0);
        for (int i = 0; i < Player.contraband.length; i++) 
        {
            Player.contraband[i] = null;
        }
    }

    private static void contrabandFound() 
    {
        int tigrePoints = 5;
        int flechaPoints = 3;
        System.out.println("Senior missionaries show up to your house for a suprize inspection!");
        System.out.println("Let's hope they don't find any of your contraband.");
        if (Player.hasContraband == true) 
        {
            System.out.println("Your contraband was found, say goodbye to it.\n"
                    + "You've also earned " + tigrePoints + " Tigre points");
            
            for (int i = 0; i < Player.contraband.length; i++) 
            {
                Player.contraband[i] = null;
            }
            Player.addTigrePoints(tigrePoints);
        }
        else
        {
            System.out.println("You had no contraband, good job");
            System.out.println("Everyone is impressed you had nothing to hide. \n"
                    + "You have earned " + flechaPoints + " Flecha points");
            Player.addFlechaPoints(flechaPoints);
        }
    }

    private static void getGF() 
    {
        int tigrePoints = 10;
        System.out.println("Along your travels, you've met a pretty chick.");
        System.out.println("********** BOOM! **********");
        System.out.println("You have a Girlfriend!!");
        System.out.println("Such a serious crime against mssionary rules has "
                + "earned you " + tigrePoints + " Tigre points");
        Player.addTigrePoints(10);
    }

    private static void hosueVist() 
    {
        if (Player.hasContraband == true) 
        {	
            Player.addTigrePoints(4);
        }
        else
        {
            Player.addFlechaPoints(2);
        }
    }

    public static boolean randomNum50() 
    {
	boolean result;
	double d;
	d = Math.random() * 100;

	if (d > 50) 
        {
            result = true;
	} 
        else 
        {
            result = false;
	}
        System.out.println(result);
        return result;
    }

}
