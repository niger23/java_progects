package HomeWorks.HomeWorks011.Core.Models.CheckValid;

public class EmailValidityCheck {

    public static boolean isValidEmail(String email) {
        if (!email.contains("@"))
            return false;
        return true;
    }

}
