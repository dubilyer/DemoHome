package Dao;

import model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ed_ao on 02.10.2016.
 */
@Transactional
@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<Account> getAllAccounts() {
        return this.hibernateTemplate.loadAll(Account.class);
    }

    public Integer createAccount(Account account) {
        Account mergeAccount = this.hibernateTemplate.merge(account);
        return mergeAccount.getId();
    }
}
