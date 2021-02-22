package no.ntnu.idata.mappevurdering_v1;

/**
 * A person...
 *
 * @author Yasmine
 * @version 0.0.1
 */
public abstract class Person {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * Creates an instance of class Person
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public Person(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Returns first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Return last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns full name
     * @return full name
     */
    public String getFullName(){
        return firstName + lastName;
    }

    /**
     * Return social security number
     * @return social security number
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Return the person's identity
     * @return
     */
    public String getPerson(){
        return "Name: "+ firstName + " " + lastName + ". SSN: " + socialSecurityNumber;
    }
    /**
     * Sets new first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Set new last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Set new social security number
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}

