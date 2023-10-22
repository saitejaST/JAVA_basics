
public class pratice
{
    public static void main(String[] args)
    {
        try{
            int a=25;
            int b=0;
            int result=a/b;
            System.out.print("The result of the division of two numbers is "+result);
        }
        catch(ArithmeticException e){
            System.out.println("OOps an error has been caught");
        }
    }
}