package desginpattern.strategy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validate Name Pattern
 */
public class NamePatternValidator implements Validator<CustomerDTO> {

    public static final String regex  = "[a-zA-Z][a-zA-Z ]*";

    public boolean validate(CustomerDTO customerDTO) throws ValidationError {
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(customerDTO.getName());
        return matcher.find();
    }
}
