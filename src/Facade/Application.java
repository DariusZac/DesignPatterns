package Facade;

public class Application {

    private AccountDao accountDao;

    private Validator validator;

    private EmailService emailService;

    public Application() {
        this.accountDao = new AccountDao();
        this.validator = new Validator();
        this.emailService = new EmailService();
    }

    public void registerNewAccount(Account account) {
        System.out.println("Validation status:");
        boolean badCredentials = !validator.validateCredentials(account);
        if (badCredentials) {
            System.out.println("    Bad credentials");
            return;
        }
        System.out.println("    OK\nEmail status:");
        boolean emailExists = emailService.checkIfEmailExists(account);
        if (!emailExists) {
            System.out.println("Please enter valid email");
            return;
        }
        System.out.println("    EXISTS");
        accountDao.saveAccount();
        emailService.sendTemporaryPassword();
    }
}
