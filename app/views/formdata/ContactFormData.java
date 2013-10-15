package views.formdata;

import java.util.ArrayList;
import java.util.List;
import play.data.validation.ValidationError;

/**
 * 
 * @author Edgar
 */
public class ContactFormData {
  /**The first name form field.*/
  public String firstName = "";
  /**The last name form field.*/
  public String lastName = "";
  /**The telephone form field.*/
  public String telephone = "";
  /**Length of telephone number.*/
  public static final int PHONE_LENGTH = 12;

  /**
   * Validates form input by the user.
   * All fields must be non-empty
   * Telephone field must have 12 characters
   * @return null if no errors, list of ValidationErrors if errors
   */
  public List<ValidationError> validate() {
  
    List<ValidationError> errors = new ArrayList<>();
  
    if (firstName == null || firstName.length() == 0) {
      errors.add(new ValidationError("firstName", "Please type in first name"));
    }
  
    if (lastName == null || lastName.length() == 0) {
      errors.add(new ValidationError("lastName", "Please type in last name"));
    }
  
    if (telephone == null || telephone.length() == 0) {
      errors.add(new ValidationError("telephone", "Please type telephone number"));
    }
  
    if (telephone.length() != PHONE_LENGTH) {
      errors.add(new ValidationError("telephone", "Please type telephone number"));
    }
  
  
    return errors.isEmpty() ? null : errors;
  }
}

