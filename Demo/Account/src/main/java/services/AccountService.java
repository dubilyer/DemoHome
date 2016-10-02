package services;

import Dao.AccountDao;
import Dao.AccountDaoImpl;
import model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ed_ao on 02.10.2016.
 */
@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public List<Account> getAllAccounts(){
        return this.accountDao.getAllAccounts();
    }

    public Integer createAccount(Account account){
        return this.accountDao.createAccount(account);
    }
}
