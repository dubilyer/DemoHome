package api;

import model.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.AccountService;

import java.util.List;

/**
 * Created by ed_ao on 02.10.2016.
 */
public class Controller {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.sivalabs");//This will load the configured components UserService, UserRepository,
        ctx.refresh();

        System.out.println(ctx);
        AccountService accountService = ctx.getBean("accountService", AccountService.class);

        List<Account> allAccounts = accountService.getAllAccounts();
        for (Account u : allAccounts)
        {
            System.out.println(u);
        }

        Account account = new Account(null, "K.siva reddy", "hyderabad");
        Integer id = accountService.createAccount(account);
        System.out.println("Newly created User Id="+id);
        allAccounts = accountService.getAllAccounts();
        for (Account u : allAccounts)
        {
            System.out.println(u);
        }
    }

}
