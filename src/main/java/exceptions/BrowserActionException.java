package exceptions;

public class BrowserActionException extends RuntimeException{
    public BrowserActionException(String message) { super(String.format("Browser Action Error: An error occured - %s", message));}
}
