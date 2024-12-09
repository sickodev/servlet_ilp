public class Main {
    private static InputHandler handler = InputHandler.getInstance();

    public static void main(String[] args) {
        Manager manager = new Manager();

        System.out.println("Welcome to Bonk Finance");
        System.out.println("-----------------------\n\n");

        System.out.println("Register Employee");
        Employee admin = manager.registerEmployee();

        System.out.println("\n\n\n\n\n");
        System.out.println("Hello " + admin.name);
        System.out.println("Your Employee ID is " + admin.id);
        System.out.println("\n\n\n\n\n");

        System.out.println("Banking Services");
        displayOptions();

        int i = handler.in.nextInt();
        while (true) {
            handler.in.nextLine();
            switch (i) {
                case 1: // add customer
                    manager.registerCustomer();
                    break;
                case 2: // get customer details
                    manager.getCustomerById();
                    break;
                case 3: // update customer details
                    manager.updateCustomer();
                    break;
                case 4: // delete customer

                    break;
                default: //Exit
            }

            if (i == 0)
                break;

            System.out.println("\n\n\n");
            displayOptions();
            i = handler.in.nextInt();
        }

        handler.in.close();
    }

    private static void displayOptions() {
        System.out.println("Select Option to Proceed");
        System.out.println("1. Add New Customer");
        System.out.println("2. Get Customer Details");
        System.out.println("3. Update Customer Details");
        System.out.println("4. Delete Customer Details");
        System.out.println("0. Exit");
    }
}