import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Atm
{
    HashMap<Integer,Account> accounts = new HashMap<>();
    Scanner scan = new Scanner(System.in);
    public static void main(String args[] )
    { 
        Atm atm = new Atm();
        Account acct1 = new Account(1,"Ayush",25000);
        Account acct2 = new Account(2,"Danish",10000);
        atm.accounts.put(acct1.getAcctNummber(), acct1);
        atm.accounts.put(acct2.getAcctNummber(),acct2);
        
        while(true)
        {
            System.out.println("ATM Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = atm.scan.nextInt();
            switch(n)
            {
                case 1:
                        atm.withdraw();
                break;
 
                case 2:
                        atm.deposit();
                break;
                case 3:
                    atm.balance();
                break;
                case 4:
                System.exit(0);
            }
        }
    }

    private void withdraw()
    {
        Account account = checkAccount();
        if(account==null)
        {
            System.out.println("Sorry no account found.");
            return;   
        }
        int amount;
        System.out.println("Enter the amount to be Withdrawn: ");
        try{
            amount = scan.nextInt();
            scan.nextLine();
        }catch(InputMismatchException e)
        {
            System.out.println("Sorry amount should be a number.");
            scan.nextLine();
            return;
        }
        if(account.getBalance()>amount)
        {
            account.setBalance(account.getBalance()-amount);
        }else{
            System.out.println("Sorry low balance");
        }

    }

    private void deposit()
    {
        Account account = checkAccount();
        if(account==null)
        {
            System.out.println("Sorry no account found.");
            return;   
        }
        int amount;
        System.out.println("Enter the amount to be Deposited: ");
        try{
            amount = scan.nextInt();
            scan.nextLine();
        }catch(InputMismatchException e)
        {
            System.out.println("Sorry amount should be a number.");
            scan.nextLine();
            return;
        }
       account.setBalance(account.getBalance()+amount);
       System.out.println("Amount deposited sucessfully");

    }

    private void balance()
    {
        Account account=checkAccount();
        if(account!=null)
        {
            System.out.println("Balance = "+account.getBalance());
        }else{
            System.out.println("Sorry no account found");
        }
    }

    private Account checkAccount()
    {
        int n;
        System.out.println("Enter the account number:");
        n=scan.nextInt();
        if(accounts.get(n)==null)
        {
            return null;
        }
        System.out.println("Account Exist");
        return accounts.get(n);
    }

  
    

}