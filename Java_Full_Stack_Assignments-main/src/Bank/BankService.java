package Bank;

public interface BankService {
    Double addFundsToAccount(Account accountObj,Double amount) throws AccountException;
    Double withdrawFundsFromAccount(Account accountObj,Double amount) throws AccountException;
    Boolean fundTransfer(Account  fromAccount,Account toAccount,Double amount) throws AccountException;
    void displayAccountInfo();


}
