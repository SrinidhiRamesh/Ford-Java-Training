package Bank;



public class BankServiceImpl implements BankService {


    @Override
    public Double addFundsToAccount(Account accountObj, Double amount) throws AccountException {

        if (accountObj == null) {
        throw new AccountException("Account can't be null");
        }
        if (amount < 0) throw new AccountException("Amount should be >=1 Rs.");
        accountObj.setBalance(accountObj.getBalance() + amount);

        return accountObj.getBalance();
    }

    @Override
    public Double withdrawFundsFromAccount(Account accountObj, Double amount) throws AccountException {
        if (accountObj.getBalance() < amount) throw new AccountException("Insufficient Balance");
        if(amount<0)
          throw new AccountException("Amount Can't be negative");


        accountObj.setBalance(accountObj.getBalance() - amount);
        return accountObj.getBalance();
    }

    @Override
    public Boolean fundTransfer(Account fromAccount, Account toAccount, Double amount) throws AccountException {
        if (withdrawFundsFromAccount(fromAccount, amount) != null)
            addFundsToAccount(toAccount, amount);


        return null;
    }

    @Override
    public void displayAccountInfo() {

    }
}
