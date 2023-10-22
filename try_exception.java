import java.util.*;
public class try_exception{
    public static void main(String[] args)
    {
        try{
            int a=25;
            int b=0;
            int result=a/b;   //demonstrating the try_catch_exception by declaring values and dividing with 0 that we 
            System.out.println(result);
        }
        catch(ArithmeticException e){ //catching the error message and saying that error has occured
            System.out.println("Oops an error has occured"+e.getMessage());
        }
        finally{
            System.out.println("The code has been finally executed");  //finally statement used when the code is ready for the execution
        }
    }
}
