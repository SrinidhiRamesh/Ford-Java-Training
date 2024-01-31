package Bank;

public class Driver {
    public static void main(String[] args) throws AccountException {
        Account account1= new Account(1,"Ford",5000.0);
        BankServiceImpl bankServiceimpl= new BankServiceImpl();// tight coupling
        BankService bankService = new BankServiceImpl();
        System.out.println(account1);
       try{ System.out.println(bankService.addFundsToAccount(account1,5000.0));}
       catch (AccountException e){
           System.out.println(e.getMessage());
       }
        System.out.println(account1);
        Account account2 = new Account(2,"Surya",13500.0);
        try {
            bankService.withdrawFundsFromAccount(account2, 7000.0);
        }
        catch(AccountException e){
            System.out.println(e.getMessage());
        }
        System.out.println(account2);
        Account account3 =new Account (3,"Home",20000.0);
        try{bankService.fundTransfer(account2,account3,8000.0);}
        catch(AccountException e){
            System.out.println(e.getMessage());
        }
        System.out.println(account2);
        System.out.println(account3);



    }
}
