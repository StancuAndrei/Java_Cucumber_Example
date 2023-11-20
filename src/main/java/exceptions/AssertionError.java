package exceptions;

import org.testng.Assert;

public class AssertionError extends java.lang.AssertionError {
    public AssertionError(String message){ super(String.format("Assertion Error: %s", message)); }
}
