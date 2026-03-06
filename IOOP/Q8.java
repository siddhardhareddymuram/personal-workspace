class BankAccount{
    int accountNumber;
    String holderName;
    double balance;
    BankAccount(int accNo, String name, double bal){
        accountNumber = accNo;
        holderName=name;
        balance=bal;
    }
    BankAccount(BankAccount obj){
        accountNumber=obj.accountNumber;
        holderName=obj.holderName;
        balance=obj.balance;
    }
    void deposit(double amount){
        if(balance>0){
              balance=balance+amount;
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    void transfer(BankAccount obj){
        if(obj.balance>2000){
            balance=balance+obj.balance;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void getAccountCopy(BankAccount obj){
        obj.accountNumber=accountNumber;
        obj.holderName=holderName;
        obj.balance=balance;
    }
    void display(){
        System.out.println("Account Number is: "+accountNumber);
        System.out.println("Holder Name: "+holderName);
        System.out.println("Balance is: "+balance);
    }
}
public class Q8 {
    public static void main(String[] args){
        BankAccount bank=new BankAccount(23456,"Siddu",3000);
        bank.deposit(2000);
        BankAccount bank2=new BankAccount(14236,"sunny",5000);
        bank.transfer(bank2);
        bank.display();
    }
    
}
