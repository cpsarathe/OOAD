package desginpattern.strategy;


public class ClientDataValidator {

    /**
     * This is an implementation of coding to interface as well as Client is not aware of internal
     * algorithm implementation of Validator (interface).
     *
     * @param customerDTO
     * @param validator
     * @return
     * @throws ValidationError
     */
    public boolean validate(CustomerDTO customerDTO , Validator<CustomerDTO> validator) throws ValidationError {
        boolean isValid = validator.validate(customerDTO);
        return isValid;
    }

    public static  void main(String ar[]) throws ValidationError {
        ClientDataValidator clientDataValidator = new ClientDataValidator();
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setEmail("CP@a.COM");
        customerDTO.setName("CP");
        customerDTO.setPhoneNo("123-4567890");

        Validator<CustomerDTO> emailPatternValidator = new EmailPatternValidator();
        boolean isEmailValid = clientDataValidator.validate(customerDTO,emailPatternValidator);//strategy

        Validator<CustomerDTO> phonePatternValidator = new PhonePatternValidator();
        boolean isPhoneValid = clientDataValidator.validate(customerDTO,phonePatternValidator);//strategy

        Validator<CustomerDTO> namePatternValidator = new NamePatternValidator();
        boolean isNameValid = clientDataValidator.validate(customerDTO,namePatternValidator);//strategy

        System.out.println("isEmailValid:"+isEmailValid);
        System.out.println("isPhoneValid:"+isPhoneValid);
        System.out.println("isNameValid:"+isNameValid);
    }

}
