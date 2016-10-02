package Dao;

import model.Account;

import java.util.List;

/**
 * Created by ed_ao on 02.10.2016.
 */
public interface AccountDao {
    public List<Account> getAllAccounts();
    public Integer createAccount(Account account);
}
