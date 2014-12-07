package finalproject;

public class Player 
{
    static private String firstName;
    static private String lastName;
    static private int flecha;
    static private int tigre;
    static boolean hasContraband;
    static String[] contraband = new String[5];
    static int contrabandPosition = 0;
    static int dinero;
    
    public static int getContrabandPosition() 
    {
        return contrabandPosition;
    }

    public static void setContrabandPosition(int contrabandPostion) 
    {
        contrabandPosition = contrabandPosition;
    }

    public Player(String fName, String lName)
    {
        this.firstName = fName;
        this.lastName = lName;
           
    }
    
    public Player()
    {
        firstName = "John doe";
        
    }
    
    public Player(String name)
    {
        this.firstName = name;
    }
    
    public void setFirstName(String name)
    {
        this.firstName = name;
    }
    
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String toString()
    {
        return ("First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
               "Tigre points: " + tigre + "\n" +
                "Fleha points: " + flecha + "\n" +
                "Money: $" +  dinero + "\n");
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public static int getFlecha() 
    {
	return flecha;
    }

    public void setFlecha(int flecha) 
    {
        this.flecha = flecha;
    }
	
    public static int getTigre() 
    {
        return tigre;
    }

    public static void setTigre(int tigre) 
    {
        tigre = tigre;
    }
    
    public static int getDinero() 
    {
	return dinero;
    }

    public static void setDinero(int i) 
    {
	dinero = i;
    }
	
    public static void addDinero(int money)
    {
        dinero = dinero + money;
    }
	
    public static void subtractDinero(int money)
    {
        dinero = dinero - money;
    }

    public static void addTigrePoints(int points)
    {
        tigre = tigre + points;
    }
	
    public static void addFlechaPoints(int points)
    {
        flecha = flecha + points;
    }
    
    public static void subtractTigrePoints(int points)
    {
        tigre = tigre - points;
    }
	
    public static void subtractFlechaPoints(int points)
    {
        flecha = flecha - points;
    }
}
