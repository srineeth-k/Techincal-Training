
class InSufficientFundsException extends RuntimeException{
    public InSufficientFundsException (String message){
        super(message);
    }
}
class TransactionLimitException extends RuntimeException{
    public TransactionLimitException (String message){
        super(message);
    }
}

public class Bank {
    private  int accno;
    private  double balance;
    private  double dailyTransactions;
    Bank(int accno,double amount){
        this.accno=accno;
        balance=amount;
        this.dailyTransactions=0;
    }
    public  void credit(double amount){
        if(dailyTransactions+amount>=20000){
            //should throw tranasaction limit reached
            throw new TransactionLimitException("Transaction limit of 20000 exceeded");
        }
        else{
            balance+=amount;
        dailyTransactions+=amount;}

    }
    public void debit(double amount){
        if(dailyTransactions+amount<=20000){
            if(balance >= amount){
                balance-=amount;
                dailyTransactions+=amount;
            }
            else {
                //should throw innsufficient balance exception
                throw new InSufficientFundsException("Insufficient Balance");
            }
        }
        else{
            //should throw tranasaction limit reached
            throw new TransactionLimitException("Transaction limit of 20000 exceeded");
        }
    }
    public void transfer(Bank targetAccount, double amount){
        this.debit(amount);
        targetAccount.credit(amount);
    }


}
