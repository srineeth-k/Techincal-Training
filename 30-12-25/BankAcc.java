public class BankAcc {
    private int accno;
    private double balance;
    public BankAcc(int accno,double balance){
        this.accno=accno;
        this.balance=balance;
    }
    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("Amount deposisted: "+amount);
    }
    public void withdraw(double amount){
        if(this.balance>=amount){
            this.balance-=amount;
            System.out.println("Amount withdrawn: "+amount);
        }
        else{
            System.out.println("Insufficient balance.");
        }
    }

    public void display(){
        System.out.println("Account Number: "+accno+" Balance: "+balance);
    }
    public static void main(String args[]){
        BankAcc acc1=new BankAcc(1001,5000);
        acc1.display();
        acc1.deposit(2000);
        acc1.display();
        acc1.withdraw(1000);
        acc1.display();
        acc1.withdraw(7000);
        acc1.display();
    }
}
