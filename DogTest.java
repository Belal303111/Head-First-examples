import java.util.*;

public class DogTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
   Dog D=new Dog();
        System.out.println("please enter the name of the dog");
        String name=s.nextLine();
        System.out.println("please enter the size of the dog");
        int size=s.nextInt();
   D.setName(name);
   D.setSize(size);
   System.out.println("The information of the dog");
   D.pringInfo();
   D.bark();
    }
}