import accountException.WrongLoginException;
import accountException.WrongPasswordException;

public class AccountService {

    public static void checkAccount(String login, String password, String confirmPassword) {
        if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongLoginException();
        }
        if (!(password.matches("^[a-zA-Z0-9_]{1,20}$") && (confirmPassword.matches("^[a-zA-Z0-9_]{1,20}$")) &&
                (password.equals(confirmPassword)))) {
            throw new WrongPasswordException();
        }

    }

}
