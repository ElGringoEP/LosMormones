/***********************************************************
 * AUTHOR:          EVAN POWELL
 * COURSE:          CS 111 INTRO TO CS I
 * SECTION:         TuTh 11:30 - 1:20
 * HOMEWORK #:      FINAL PROJECT!
 * LAST MODIFIED:   DECEMBER 4, 2014
 ***********************************************************/
/***********************************************************
 * Los Mormones
 ***********************************************************/
/***********************************************************
 *PROGRAM DESCRIPTION:
 * This is a text based RPG that follows the mission of a 
 * Mormon missionary. The user will need to make wise choices
 * in order to complete the two year mission. 
 ***********************************************************/
/***********************************************************
 * ALGORITHM:
 * PROMPT Get users name
 * PROMPT ask if user wants to go on mission
 * IF yes
 *      OUTPUT some form of congratulations 
 * ELSE 
 *      OUTPUT a negative statement for the user
 * PROMPT ask user how much money they took on their mission
 * LOOP go through the various call methods for the RandomEvents
 *       and the RandomMissionMoment
 * CHECK IF Tigre or Flecha points >= 30
 *              end the game with the appropriate message
 * CHECK every "6 months" through the mission for the tigre
 *        and flecha points
 * END when misisonary has reached two years in mission.
 *     
 * 
 ***********************************************************/
/***********************************************************
 * ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
 * Scanner = user input
 ***********************************************************/
package finalproject;

import java.util.Scanner;
public class LosMormones 
{	
    public static void main(String[] args) 
    {
        /***** DECLARATION SECTION *****/
        Player missionary;
        Scanner keyboard;
        String temp;
        boolean isNotValid;
        int status;
        char decision;
        
         /***** INITIALIZATION SECTION *****/
        missionary = new Player();
        keyboard = new Scanner(System.in);
        isNotValid = true;
        
        /***** INTRO/WELCOME *****/
        printHeader(15, "DECEMBER 4, 2014");
        
        /***** INPUT/PROCESSING/OUTPUT *****/
        System.out.print("Enter your first name: ");
        missionary.setFirstName(keyboard.nextLine());
        System.out.print("Enter your last name: ");
        missionary.setLastName(keyboard.nextLine());
        
        System.out.println("Welcome " + missionary.getFirstName() + " " + missionary.getLastName() + "!\n");
        
        do
        {
            System.out.println("Do you want to go on a mission?");
            System.out.print("Enter y or n: ");
            temp = keyboard.nextLine();
            decision = temp.charAt(0);
            if (decision != 'y' && decision != 'n')
            {
                System.out.println("Error. Please enter y or n");
            }
                    
        }while(decision != 'y' && decision != 'n'); 
        
        if(decision == 'n')
        {
            System.out.println("Wow. Jusus hates you. You're going to hell.");
            System.out.println("GAME OVER");
            System.exit(0);
        }
        else
        {
            OtherMethods.ManyPrintln(5);
            System.out.println("Congrats!"); 
            System.out.println("You have been promoted to Elder.");
            System.out.println("You'll now be called Elder " + missionary.getLastName());
        }
        System.out.println("********** SEVERAL WEEKS LATER **********");
        
        OtherMethods.ManyPrintln(5);
        System.out.println("Well, Elder " + missionary.getLastName() + ", you've finally been assigned to a mission.\n"
                + "Your new home for the next two years will be in the Dominican Republic!");
        System.out.println("********** SEVERAL MORE WEEKS LATER **********");
        OtherMethods.ManyPrintln(5);
        
        System.out.println("Congratulations! You made it to the first day in the misison field.");
        OtherMethods.ManyPrintln(5);
        System.out.println(OtherMethods.MissionaryRules());
        OtherMethods.ManyPrintln(5);
        
        System.out.print("Enter the amount of money you brought with you: ");
        temp = keyboard.nextLine();
        Player.setDinero(Integer.parseInt(temp));
             
        OtherMethods.ManyPrintln(3);
        System.out.print("Next, you'll encounter many random events. \n"
                + "Some will require some tough decisions.");
        OtherMethods.ManyPrintln(3);
        System.out.println("....................................................");
        RandomMissionMoment.teach(getRandNum());
        System.out.println("....................................................");
        RandomEvent.suprise(getRandNum());
        System.out.println("....................................................");
        RandomMissionMoment.teach(getRandNum());
        System.out.println("....................................................");
        RandomEvent.suprise(getRandNum());
        System.out.println("....................................................");
        
        System.out.println("Congrats you Made it 6 Months.");
        System.out.println("....................................................");
        System.out.println("******* STATUS UPDATE *******");
        System.out.println(missionary.toString());
        if ( tigreCheck() == true )
        {
            System.out.println("You've been a terrible missionary. The mission president has sent you home early.");
            System.out.println("GAME OVER");
            System.exit(0);
        }
        else if ( flechaCheck() == true)
        {
            System.out.println("You were too good of a missionary. The other missionaries have shanked you. you died.");
            System.out.println("GAME OVER");
            System.exit(0);
        }
        System.out.println("....................................................");
        
        RandomMissionMoment.teach(getRandNum());
        System.out.println("....................................................");
        RandomEvent.suprise(getRandNum());
        System.out.println("....................................................");
        RandomMissionMoment.teach(getRandNum());
        System.out.println("....................................................");
        RandomEvent.suprise(getRandNum());
        System.out.println("....................................................");
        
        System.out.println("Congrats you Made it 1 year.");
        System.out.println("....................................................");
        System.out.println("******* STATUS UPDATE *******");
        System.out.println(missionary.toString());
        if ( tigreCheck() == true )
        {
            System.out.println("You've been a terrible missionary. The mission president has sent you home early.");
            System.out.println("GAME OVER");
            System.exit(0);
        }
        else if ( flechaCheck() == true)
        {
            System.out.println("You were too good of a missionary. The other missionaries have shanked you. you died.");
            System.out.println("GAME OVER");
            System.exit(0);
        }
        System.out.println("....................................................");
        RandomMissionMoment.teach(getRandNum());
        System.out.println("....................................................");
        RandomEvent.suprise(getRandNum());
        System.out.println("....................................................");
        RandomMissionMoment.teach(getRandNum());
        System.out.println("....................................................");
        RandomEvent.suprise(getRandNum());
        System.out.println("....................................................");
        
        System.out.println("Congrats you Made it 1 year 6 Moths.");
        System.out.println("....................................................");
        System.out.println("******* STATUS UPDATE *******");
        System.out.println(missionary.toString());
        if ( tigreCheck() == true )
        {
            System.out.println("You've been a terrible missionary. The mission president has sent you home early.");
            System.out.println("GAME OVER");
            System.exit(0);
        }
        else if ( flechaCheck() == true)
        {
            System.out.println("You were too good of a missionary. The other missionaries have shanked you. you died.");
            System.out.println("GAME OVER");
            System.exit(0);
        }
        RandomMissionMoment.teach(getRandNum());
        System.out.println("....................................................");
        RandomEvent.suprise(getRandNum());
        System.out.println("....................................................");
        RandomMissionMoment.teach(getRandNum());
        System.out.println("....................................................");
        RandomEvent.suprise(getRandNum());
        System.out.println("....................................................");
        System.out.println("Congrats!!!!!! you Made it to 2 years!!!!!!!!.");
        System.out.println("....................................................");
        System.out.println("******* STATUS UPDATE *******");
        System.out.println(missionary.toString());
        if ( tigreCheck() == true )
        {
            System.out.println("You've been a terrible missionary. The mission president has sent you home early.");
            System.out.println("GAME OVER");
            System.exit(0);
        }
        else if ( flechaCheck() == true)
        {
            System.out.println("You were too good of a missionary. The other missionaries have shanked you. you died.");
            System.out.println("GAME OVER");
            System.exit(0);
        }
        System.exit(0);
    }
    
    public static int getRandNum(){
    	int d = (int) ((Math.random() * 10) + 1);
		//System.out.println(d);
		return d;
    }
    
    public static boolean tigreCheck()
    {
        if(Player.getTigre() >= 30)
        {
           return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean flechaCheck()
    {
        if (Player.getFlecha() >= 30)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    /*************************************************************************
     * DESCRIPTION:     Print author information for start of program
    *************************************************************************
    * PRE-CONDITIONS:	All parameters are given a value
    *************************************************************************
    * POST-CONDITIONS:	Outputs author info to console
    ************************************************************************/
    public static void printHeader(int homework, String lastModified) 
    {
        //constants
        final String NAME = "EVAN POWELL";
        final String COURSE = "CS 111 Intro to CS I";
        final String SECTION = "TuTh 11:30am-3:20pm";
		
        //output
        System.out.println("/********************************************");
        System.out.println("* AUTHOR:        " + NAME);
        System.out.println("* COURSE:        " + COURSE);
        System.out.println("* SECTION:       " + SECTION);
        System.out.println("* HOMEWORK #:    " + homework);
        System.out.println("* LAST MODIFIED: " + lastModified);
        System.out.println("********************************************/");
    }
}
