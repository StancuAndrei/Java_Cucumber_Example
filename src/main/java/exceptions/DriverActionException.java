package exceptions;

public class DriverActionException extends RuntimeException{
    public DriverActionException(String message ) { super(String.format("Driver Action Error: An error occured - %s", message));}
}
