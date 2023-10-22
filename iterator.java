import java.util.*;
public class iterator{
    public static void main(String[] args)
    {
        ArrayList<String>names=new ArrayList<String>(); //create an array list to store the elements
        names.add("Joker");
        names.add("Bane");
        names.add("Batman");
        Iterator<String> sai=names.iterator();  //create an iterator and assign the variable that needs to be iterated
        while(sai.hasNext()){   //hasnext function is used to check whether the list contains more than one element to iterate if its true iterates or its false
            System.out.println(sai.next());    //next() function iterates the elements
        }
    }
}
//normally the iterator interface only supports the iteration in the forward direction whereas the ListIterator supports both forward and backward iteration