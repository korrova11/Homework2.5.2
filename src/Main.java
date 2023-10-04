import accountException.WrongLoginException;
import accountException.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        try {
            AccountService.checkAccount("gjgjgj", "fhjdldh", "fhjdld");
        } catch (WrongLoginException e) {
            System.out.println("Неправильный логин");

        } catch (WrongPasswordException e) {
            System.out.println("Неправильный пароль");
        }


    }


}