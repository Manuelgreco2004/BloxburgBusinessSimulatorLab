public class BloxburgGame
{
    public static void main (String[] args)
    {
        Business pizzaPlace = new Business("Pizza Palace", "Alex", 5000);
        Business.Employee pizzaEmployee = pizzaPlace.new Employee("John", "Chef", 15);
 
        pizzaPlace.payTaxes();
    }
}
        
    }
}