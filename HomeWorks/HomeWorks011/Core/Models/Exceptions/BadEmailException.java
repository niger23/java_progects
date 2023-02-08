package HomeWorks.HomeWorks011.Core.Models.Exceptions;

public class BadEmailException extends Exception{
    public BadEmailException(){
        super("Email должен содержать '@'");
    }
}
