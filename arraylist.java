import java.util.*;
public class arraylist{
    public static void main(String[] args)
    {
        ArrayList<String> name=new ArrayList<String>();
        name.add("Alice");
        name.add("bob");
        name.add("Charlie");
        for(int i=0;i<name.size();i++){
            String names=name.get(i);
            System.out.println(names);
        }
    }
}
//we can write the above code in the following means too
/*block of code
 for(String names:name){
    System.out.println(names);
 }
 */