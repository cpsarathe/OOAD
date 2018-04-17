package desginpattern.strategy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validate Phone Pattern
 */
public class PhonePatternValidator implements Validator<CustomerDTO> {

    public static final String regex  = "\\d{3}-\\d{7}";

    public boolean validate(CustomerDTO customerDTO) throws ValidationError {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern .matcher(customerDTO.getPhoneNo());
        return matcher.find();
    }
}
