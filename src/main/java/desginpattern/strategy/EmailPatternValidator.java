package desginpattern.strategy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validate email Pattern
 */
public class EmailPatternValidator implements Validator<CustomerDTO> {

    public static final String regex  = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";


    public boolean validate(CustomerDTO customerDTO) throws ValidationError {
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern .matcher(customerDTO.getEmail());
        return matcher.find();
    }
}
