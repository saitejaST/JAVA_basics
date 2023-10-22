import java.util.*;
public class listiterator {
    public static void main(String[] args)
    {
        ArrayList<String> names=new ArrayList<String>(); //create an arraylist to add the objects
        names.add("Apples");
        names.add("Oranges");
        names.add("Banana");
        ListIterator<String> sai=names.listIterator();    //create an list iterator and assign to the varibale which needed to iterate
        while(sai.hasNext()) //verify whether there are elements to iterate by using hasNext()
        {
            String fruits=sai.next(); //if its truue iterate the elements using the next() function the fruit can act as similar to 'i' in the for loop
            if(fruits.equals("Banana")){ //here the list name was assigned as sai and the iteration variable given as fruit
                sai.remove();
            }
            if(fruits.equals("Orange"))
            {
                sai.add("Grapefruit");
            }
            if(fruits.equals("Apples"))
            {
                sai.set("Pear");
            }
        }
        while(sai.hasPrevious()) //only the listiterator has ability to iterate forwards and backwards
        {
            String fruit=sai.previous();
            System.out.println(fruit);
        }
        sai.add("Mango");
        System.out.println(names);
        
    }
    
}
