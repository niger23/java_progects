package HomeWorks.HomeWorks011.Core.Models.Exceptions;

public class BadPhoneNumberException extends Exception{
    public BadPhoneNumberException(){
        super("Номер должен содержать цифры");
    }
}
