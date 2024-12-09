public class Manager {
    private InputHandler handler = InputHandler.getInstance();
    private Repository repository = Repository.getInstance();
    public Employee registerEmployee() {
        System.out.print("Name:\t");
        String name = handler.in.nextLine();

        System.out.print("Email:\t");
        String email = handler.in.nextLine();

        System.out.print("Password:\t");
        String password = handler.in.nextLine();

        System.out.print("Address:\t");
        String address = handler.in.nextLine();

        System.out.print("Contact:\t");
        String contact = handler.in.nextLine();

        return new Employee(name, email, password, address, contact);
    }

    // Register Customer
    public void registerCustomer(){
        System.out.println("Fill in Customer Details!!");
        Customer customer = enterDetails();

        repository.map.put(customer.id, customer);
        System.out.println("Customer registered!");
        System.out.println("\n");
        displayCustomer(customer);

    }

    public void getCustomerById(){
        System.out.println("Find By SSN Id");
        System.out.print("Enter SSN Id:\t");
        if (getById()) return;
    }

    public void updateCustomer(){
        System.out.println("Update Customer Details!!");
        System.out.println("Enter SSN Id:\t");
        if (getById()) return;
        Customer customer;

        System.out.println("Update Customer Details!!");


        customer = enterDetails();

        repository.map.put(customer.id, customer);
        System.out.println("Customer updated!");
        System.out.println("\n");
        displayCustomer(customer);
    }

    public void deleteCustomer(){
        System.out.println("Delete Customer Details!!");
        System.out.println("Enter SSN Id:\t");
        if (getById()) return;

    }

    private boolean getById() {
        long ssnId = handler.in.nextLong();

        Customer customer = repository.map.get(ssnId);
        if(customer == null){
            System.out.println("Customer not found!");
            return true;
        }

        System.out.println("Customer found!");
        System.out.println("\n");
        displayCustomer(customer);
        return false;
    }

    private void displayCustomer(Customer customer) {
        System.out.println("SSN ID:\t" + customer.id);
        System.out.println("Account Number:\t" + customer.account);
        System.out.println("Name:\t" + customer.name);
        System.out.println("Email:\t" + customer.email);
        System.out.println("Address:\t" + customer.address);
        System.out.println("Contact:\t" + customer.contact);
        System.out.println("Aadhaar:\t" + customer.aadhar);
        System.out.println("PAN:\t" + customer.pan);
    }

    private Customer enterDetails() {
        System.out.print("Name:\t");
        String name = handler.in.nextLine();
        System.out.print("Email:\t");
        String email = handler.in.nextLine();
        System.out.print("Address:\t");
        String address = handler.in.nextLine();
        System.out.print("Contact:\t");
        String contact = handler.in.nextLine();
        System.out.print("Aadhaar:\t");
        String aadhaar = handler.in.nextLine();
        System.out.print("PAN: \t");
        String pan = handler.in.nextLine();

        return new Customer(name, email, address, contact, aadhaar, pan);
    }
}
