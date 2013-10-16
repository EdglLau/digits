package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import views.formdata.ContactFormData;

/**
 * Database for the contacts.
 * @author Edgar Lau
 */
public class ContactDB {
  
  private static Map<Long, Contact> contacts = new HashMap<>();
  
  /**
   * Updata database with new Contact if id = 0 or update if pre-existing contacts exist. 
   * @param formData Contact data.
   * @return new contact.
   */
  public static Contact addContact(ContactFormData formData) {
    long idVal = (formData.id == 0) ? contacts.size() + 1 : formData.id;
    Contact contact = new Contact(idVal, formData.firstName, formData.lastName, formData.telephone);
    contacts.put(idVal, contact);
    return contact;
  }
  
  /**
   * Returns all contacts.
   * @return A list of contact instances.
   */
  public static List<Contact> getContacts() {
    return new ArrayList<>(contacts.values());
  }
  
  /**
   * Returns contact associated with ID or RuntimeException if ID not found.
   * @param id Id of contact.
   * @return The ID.
   */
  public static Contact getContact(long id) {
    Contact contact = contacts.get(id);
    if (contact == null) {
      throw new RuntimeException("Passed bad id: " + id);
    }
    return contact;
  }
  
  
  public static void deleteContact(long id) {
    contacts.remove(id);
    
  }
  
  
}
