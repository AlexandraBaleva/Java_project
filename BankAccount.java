public class BankAccount {
    String owner;
    double balance; 

    public static void main(String[] args) {
        BankAccount myBank = new BankAccount("Alex", 10);
        myBank.deposit(1900); 
          myBank.withdraw(1000);
    }

public BankAccount(String owner, double balance){
    this.owner = owner;
    this.balance = balance;
}

public void deposit(double amount){
    balance += amount;
    System.out.println("Vneseni sa " + amount +  "lv");

}
public void withdraw(double amount){
    if (balance >= amount) {
        balance = amount;

        System.out.println("Izteglihte " + amount  + "lv");
    }else{
        System.out.println("Greshka");
    }
}

}