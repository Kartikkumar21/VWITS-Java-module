package exceptionhandling;

public class ExceptionEx {

    private static String s;

	public static void main(String[] args)
    {
        s = null; 
        
        
        System.out.println("program execution strarted..");
        
          s.toLowerCase();
        
        System.out.println("remaining program executes..");
    }

}
