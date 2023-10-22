import java.util.*;
class Animal{
    public void eat(){
        System.out.println("Nom Nom Nom");
    }
}
class Cat extends Animal{
    public void meow(){
        System.out.println("Meow");
    }
}
public class reference_type_conversion {
    public static void main(String[] args)
    {
        Cat mycat=new Cat();
        Animal myanimal=mycat;
        myanimal.eat();  //access a method to the animal object using the cat method
        doSomething(mycat);  //pass the cat object to the animal to expect the methods
    }   
    public static void doSomething(Animal myanimal){
        myanimal.eat();
    }
}
