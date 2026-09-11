import java.util.Scanner;

public class BloxburgGame
{

    public static void main (String[] args)
    {
        Business pizzaPlace = new Business("Pizza Palace", "Alex", 5000);
        Business.Employee pizzaEmployee = pizzaPlace.new Employee("John", "Chef", 15);
        
        System.out.println("------------------");
        System.out.println("Welcome to Bloxburg Business Simulator!");
        System.out.println("Total businesses created: 1");  
        pizzaPlace.display();
    }
}