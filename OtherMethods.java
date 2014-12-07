package finalproject;
public class OtherMethods 
{
    //Random number Generator
    public static boolean RandomNum()
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
        return result;
    }
    
   public static void ManyPrintln(int quantity)
   {
       for(int i = 0; i < quantity; i++ )
       {
           System.out.println();
       }
   }
   
   public static String MissionaryRules()
   {
       return ("Here is a list of the rules you'll be required to obey.\n"
               + "********** MISSIONARY RULES **********\n"
               + "1. Must stay with assigned companion at all times\n"
               + "2. No video games, tv, or other things to distract your from your misisonary work\n"
               + "3. Stay away from memebers of the opposite sex\n"
               + "4. Keep your house clean\n"
               + "5. Do not swim. EVER!\n"
               + "6. Never leave your assigned mission area\n"
               + "7. Do good things to earn Flecha points\n"
               + "8. Do bad things to earn Tigre pints\n"
               + "9. Maintain a even balance of Flecha points and Tigre Points\n"
               + "10. Don't get sent home dishonorably for having too many Tigre points\n"
               + "11. Don't get shaked by other misisonaries for having too many Flecha points\n");
   }    
}
