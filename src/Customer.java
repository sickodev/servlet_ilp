public class Customer {
    long id;
    String name;
    String email;
    String address;
    String contact;
    String aadhar;
    String pan;
    String account;

    public Customer(String pan, String aadhar, String contact, String address, String email, String name) {
        this.id = (long)Math.floor(Math.random()*1_0_000_000);
        this.pan = pan;
        this.aadhar = aadhar;
        this.contact = contact;
        this.address = address;
        this.email = email;
        this.name = name;
        this.account = String.valueOf((long)Math.floor(Math.random()*1_000_000_000));
    }
}
