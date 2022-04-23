
public class ArithmeticExceptionExample {
	
	public static void main(String[] args) {
        int a=28;
        int b=0;
        int c=7;
        
        try {
         System.out.println("'a' divide by 'c'= "+a/c);        
         System.out.println("'a' divide by 'b'= "+a/b);         //exception occur , flow control goes to catch block
        }
        catch(ArithmeticException e)
        {
                System.out.println("ArithmeticException: on dividing 'a' by 'b' ");
        }
}

}
