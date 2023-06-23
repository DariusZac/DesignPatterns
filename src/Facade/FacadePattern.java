package Facade;

public class FacadePattern {

    public static void main(String[] args) {
        System.out.println("Account with valid values:\n");
        Application application = new Application();
        Account accountWithCorrectValues = new Account();
        accountWithCorrectValues.setEmail("email@mail.com");
        accountWithCorrectValues.setName("Name");
        application.registerNewAccount(accountWithCorrectValues);

        System.out.println("\nAccount with invalid values:\n");
        Account accountWithInvalidEmail = new Account();
        accountWithInvalidEmail.setName("SomeName");
        accountWithInvalidEmail.setEmail("mail.com");
        application.registerNewAccount(accountWithInvalidEmail);
    }
}
