import java.util.*;
public class Lec_2 {
    public static void main(String[] args) {  

        
/* 
-lec_1 is class name 
public used becuase the main function can be used outside 
static becuase to use method withoput creating object of it because JVM needs an entry point
javac and complie the .java to .class 
string[] args stroe command line arguments
javac -d . lec_1.java  this will make .class file in previous directory (used in terminal)
javac -d .. lec_1.java  this will make .class file in previous to previous directory (used in terminal)
javac lec_1.java will make class in the same directory (used in terimnal)
java has a class for everything and the starting for letter of it is always be a capital
 (not always just it is a convential way pascal case )

*/
        System.out.println("Starting Java journey!");
        System.out.println("teseting name change!");
        System.out.println("adds a new when do ln !");
        System.out.print("will start from same line ");
        System.out.println(".  teseting");



        //taking input 
        Scanner input = new Scanner(System.in);
        // Scanner is the class name input is the variable name given to it which can be anything
        // new creates new  Scanner object 
        System.out.print("Enter your age");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);
        input.close();// this we have to do because it consume resources
    }
}
