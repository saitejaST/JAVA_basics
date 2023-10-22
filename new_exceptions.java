class rectangle
{
    public static int CalculateArea(int lenght,int breadth) throws NegativeValueException{
        if(lenght<0||breadth<0){
            throw new NegativeValueException("Error one of the dimesions has negative value");
        }
        return lenght*breadth;
    }
}
class NegativeValueException extends Exception{
    public NegativeValueException(String message)
    {
        super(message);
    }
}
public class new_exceptions{
    public static void main(String[] args)
    {
        try{
            int length=-7;
            int breadth=10;
            rectangle rec=new rectangle();
            int area=rectangle.CalculateArea(length,breadth);
            System.out.println("THe area of the rectangle is "+area);
        }
        catch(NegativeValueException e){
            System.out.println("I got the exceptions message"+e.getMessage());
        }
    }
};