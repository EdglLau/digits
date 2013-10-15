package views.formdata;

import java.util.ArrayList;
import java.util.List;
import play.data.validation.ValidationError;

/**
 * 
 * @author Edgar
 */
public class ContactFormData {
  /**The first name form field*/
  public String firstName = "";
  /**The last name form field*/
  public String lastName = "";
  /**The telephone form field*/
  public String telephone = "";


/**
 * 
 * @return
 */
  public List<ValidationError> validate() {
  
    List<ValidationError> errors = new ArrayList<>();
  
    if(firstName == null || firstName.length() ==0) {
      errors.add(new ValidationError("firstName", "Please type in first name"));
    }
  
    if(lastName == null || lastName.length() ==0) {
      errors.add(new ValidationError("lastName", "Please type in last name"));
    }
  
    if(telephone == null || telephone.length() ==0) {
      errors.add(new ValidationError("telephone", "Please type telephone number"));
    }
  
    if(telephone.length() != 12) {
      errors.add(new ValidationError("telephone", "Please type telephone number"));
    }
  
  
    return errors.isEmpty() ? null : errors;
  }
}

