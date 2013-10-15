package models;

/**
 * Holds the first, last, and telephone.
 * @author Eli
 *
 */
public class Contact {
    
    private long id;
    private String firstName;
    private String lastName;
    private String telephone;
    
    /**
     * Creates a new contact.
     * @param id the ID.
     * @param firstName first name.
     * @param lastName last name.
     * @param telephone telephone number.
     */
    public Contact(long id, String firstName, String lastName, String telephone) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.telephone = telephone;
    }
    
    /**
     * Gets the first name.
     * @return first name.
     */
    public String getFirstName() {
      return firstName;
    }
    
    /**
     * @param firstName first name of contact.
     */
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }
    
    /**
     * @return the last name.
     */
    public String getLastName() {
      return lastName;
    }
    
    /**
     * @param lastName sets the last name.
     */
    public void setLastName(String lastName) {
      this.lastName = lastName;
    }
    
    /**
     * @return telephone number.
     */
    public String getTelephone() {
      return telephone;
    }
    
    /**
     * 
     * @param telephone telephone number of contact.
     */
    public void setTelephone(String telephone) {
      this.telephone = telephone;
    }
    
    /**
     * Gets ID.
     * @return The ID.
     */
    public long getId() {
      return id;
    }


}
