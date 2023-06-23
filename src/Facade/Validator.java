package Facade;

public class Validator {

    public boolean validateCredentials(Account account) {
        String name = account.getName();
        if (name == null || name.length() > 20 || account.getEmail() == null) {
            return false;
        }
        return true;
    }
}
