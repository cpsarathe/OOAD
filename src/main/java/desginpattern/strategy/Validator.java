package desginpattern.strategy;

/**
 * Defines Validator as a family of algorithm to imeplement validation logic on input data.
 * Whoever class implements this interface must supply their own validation logic
 */
public interface Validator<T> {

    public boolean validate(T t) throws ValidationError;

}
