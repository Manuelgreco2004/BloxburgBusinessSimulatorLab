class Business {
    private String name;
    private String owner;
    private double funds;
    private static int totalBusinesses = 0;
    public static final double TAX_RATE = 0.1;
 
    public Business(String name, String owner, double funds) {
        this.name = name;
        this.owner = owner;
        this.funds = funds;
        totalBusinesses++;
    }
 
    public void payTaxes() {
        funds -= funds * TAX_RATE;
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
    }
}