package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.NewContact;
import views.formdata.ContactFormData;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns newContact, which contains a simple form.
   * @return The NewContact page.
   */
  public static Result newContact() {
    Form<ContactFormData> formData = Form.form(ContactFormData.class);
    return ok(NewContact.render(formData));
    
  }
  
  /**
   * Handles posting of form data by the user.
   * @return The NewContact page with form data
   */
  public static Result postContact() {
    Form<ContactFormData> formData = Form.form(ContactFormData.class).bindFromRequest();
    ContactFormData data = formData.get();
    System.out.println(data.firstName + " " + data.lastName + " " + data.telephone + " " + data.address);
    
    return ok(NewContact.render(formData));
    
  }
}
