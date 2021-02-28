package phase1;

public class Topic1Asgn3 {

	public static void main(String[] args) {
		printYearsAndDays(45666);
	}
	
    public static void printYearsAndDays(long minutes)
    {
        if (minutes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {   
            
            double year = minutes / (365 * 24 * 60);
            double day = (minutes % (365 * 24 * 60)) / (24 * 60);
            System.out.println(minutes + " minutes = " + (int)year + " years and " +  (int)day + " days");
        }
    }

}

