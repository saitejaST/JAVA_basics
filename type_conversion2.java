import java.util.*;
public class type_conversion2
{
    public static void main(String[] args)
    {
        int implicitycon=5;
        double implici=implicitycon;
        double explicitycon=5.7;
        int explici=(int)explicitycon;
        System.out.println(implici);
        System.out.println(explicitycon);
    }
}