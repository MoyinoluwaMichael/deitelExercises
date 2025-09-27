package timothy.chapterThree.account;

public class Account {
    private String name;
    private String accountNumber;
    private double balance;
    private String pin;

    public Account(){

    }

    public Account(String name, String accountNumber, double balance, String pin){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public Account(String name, String accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}
