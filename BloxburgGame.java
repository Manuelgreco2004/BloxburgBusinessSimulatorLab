public class BloxburgGame
{

    public static void main (String[] args)
    {
        // Instantiated businesses + testing for the totalBusinesses to be counted
        
        Business waterPark = new Business("Tropic Lands");
        Business pizzaPlace = new Business("Pizza Palace", "Alex", 5000);
        Business storePlace = new Business("Scrambler Arena", "George", 7500);

        // Hired employees for Pizza Palace

        Business.Employee pizzaEmployee = pizzaPlace.new Employee("John", "Chef", 25);
        Business.Employee pizzaEmployee2 = pizzaPlace.new Employee("Matthew", "Waiter", 13);
        Business.Employee pizzaEmployee3 = pizzaPlace.new Employee("Veronica", "Waitress", 15);

        // Hired employees for Scrambler Arena

        Business.Employee storeEmployee = storePlace.new Employee("Chris", "Attendant", 14);
        Business.Employee storeEmployee2 = storePlace.new Employee("Katy", "Janitor", 15);
        
        // Results for the first part
        System.out.println("------------------");
        System.out.println("Welcome to Bloxburg Business Simulator!");
        System.out.println("Total businesses created: " + Business.getTotalBusinesses()); 

        // First business results
        System.out.println();
        waterPark.display();
        System.out.println("This project has yet to be greenlighted and owned.");

        

        // Second business results
        System.out.println("----");
        pizzaPlace.display();

        System.out.println();
        pizzaEmployee.display();
        pizzaEmployee2.display();
        pizzaEmployee3.display();

        // Third business results
        System.out.println("----");
        storePlace.display();

        System.out.println();
        storeEmployee.display();
        storeEmployee2.display();
    }
}