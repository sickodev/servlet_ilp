public class Employee {
    long id;
    String name;
    String email;
    String password;
    String address;
    String phone;

    public Employee(String name, String email, String password, String address, String phone) {
        this.id = (long)Math.floor(Math.random()*1_0_000_000);
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }
}
