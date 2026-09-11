class Business {
    private String name;
    private String owner;
    private double funds;
    private static int totalBusinesses = 0;
    public static final double TAX_RATE = 0.3;

    // Overloaded constructor for a business name that is a "project"
    public Business(String name){
        this.name = name;
        totalBusinesses++;
    }
    
    // Overloaded constructor for a business name that has been greenlighted and is searching for a owner to take hold of
    public Business(String name, double funds){
        this.name = name;
        this.funds = funds;
        totalBusinesses++;

    }
 
    // The actual constructor for creating businesses
    public Business(String name, String owner, double funds) {
        this.name = name;
        this.owner = owner;
        this.funds = funds;
        totalBusinesses++;
    }
    // Returning the calculation of how many businesses there are for the main class
    public static int getTotalBusinesses() {
        return totalBusinesses;
    }


    // Returning the calculation of the funds after the taxes were done
    public double payTaxes() {
        return funds - funds * TAX_RATE;
    }

    // A method for it to be instantiated to BloxburgGame.java for the business display concerning of one
    public void display() {
        System.out.println("Business: " + name);
        System.out.println("Owner: " + owner);
        System.out.println("Funds before taxes: $" + funds);
        System.out.println("Funds after taxes: $" + payTaxes());
    }
 
    class Employee {
        private String name;
        private String role;
        private double salary;
 
        public Employee(String name, String role, double salary) {
            this.name = name;
            this.role = role;
            this.salary = salary;
        }
        // Same comment for the business display method, except it is for the employees.
        public void display() {
            System.out.println("Employee: " + name + " | " + "Role: " + role + " | " + "Salary: $" + salary + "/hour");
        }
    }
}