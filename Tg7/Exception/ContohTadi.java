public class ContohTadi {
    static void checkAge(int age) throws ValidationException{
        if (age < 18) {
            throw new ValidationException("Access denied - You must be at least 18 years old.");
        }
    }
    
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ValidationException e) {
            System.out.println(e);
        }
    }
}

class ValidationException extends Throwable { // membuat exception
    ValidationException(String message) {
        super(message);
    }
    
}
