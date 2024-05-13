public class Customer {

    private String name;
    private String creditLimite;
    private String emailAdress;

    public Customer () {
        this("ninguem","ninguem@email.com");
    }

    public Customer(String name, String emailAdress) {
    this (name,"5000",emailAdress);
    }

    public Customer (String name, String creditLimite, String emailAdress) {

        System.out.println("Account constructor with parameters called");
        this.name = name;
        this.creditLimite = creditLimite;
        this.emailAdress = emailAdress;
    }

    
    public String getName() {
        return name;
    }

    public String getCreditLimite() {
        return creditLimite;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
