public class Account{

    private int acctNumber;
    private int balance;
    private String name;

    public Account(int acctNumber  , String name, int balance)
    {
        this.acctNumber = acctNumber;
        this.balance = balance;
        this.name = name;
    }

    public void setAcctNumber(int acctNumber)
    {
        this.acctNumber = acctNumber;

    }
    
    public int getAcctNummber()
    {
        return acctNumber;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;

    }

    public int getBalance()
    {
        return balance;
    }


}