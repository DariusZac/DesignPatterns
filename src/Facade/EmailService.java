package Facade;

public class EmailService {

    public void sendTemporaryPassword() {
        System.out.println("Temporary password has been sent to mail");
    }

    public boolean checkIfEmailExists(Account account) {
        //checks if email exists, but to not waste time just checks if email has "@".
        if (!account.getEmail().contains("@")) {
            System.out.println("    Email does not exist");
            return false;
        }
        return true;
    }
}
