package mx.com.jovannypcg.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents the information of a contact.
 *
 * @author  OCPJP Jovanny Pablo Cruz Gomez.
 *          Software Engineer.
 *
 * @version 1.0.
 */
@Document
public class Contact {
    /** The ID used by MongoDB. */
    @Id private String id;

    /** The first name of the contact */
    private String firstName;

    /** The last name of the contact */
    private String lastName;

    /** The address of the contact */
    private String address;

    /** The phone number of the contact */
    private String phoneNumber;

    /** The email of the contact */
    private String email;

    /** The twitter of the contact */
    private String twitterHandle;

    /** The facebook profile of the contact */
    private String facebookProfile;

    /** The linked in profile of the contact */
    private String linkedInProfile;

    /** The google plus of the contact */
    private String googlePlusProfile;

    /**
     * Gets the id used by MongoDB.
     * @return The id used by MongoDB.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id used by MongoDB.
     * @param id The id used by MongoDB.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the first name.
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     * @param firstName The first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     * @param lastName The last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the address.
     * @return The address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address.
     * @param address The address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the phone number.
     * @return The phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number.
     * @param phoneNumber The phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the email.
     * @return The email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * @param email The email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the twitter.
     * @return The twitter,
     */
    public String getTwitterHandle() {
        return twitterHandle;
    }

    /**
     * Sets the twitter.
     * @param twitterHandle The twitter.
     */
    public void setTwitterHandle(String twitterHandle) {
        this.twitterHandle = twitterHandle;
    }

    /**
     * Gets the facebook profile.
     * @return The facebook profile.
     */
    public String getFacebookProfile() {
        return facebookProfile;
    }

    /**
     * Sets the facebook profile.
     * @param facebookProfile The facebookprofile.
     */
    public void setFacebookProfile(String facebookProfile) {
        this.facebookProfile = facebookProfile;
    }

    /**
     * Gets the linked in profile.
     * @return The linked in profile.
     */
    public String getLinkedInProfile() {
        return linkedInProfile;
    }

    /**
     * Sets the linked in profile.
     * @param linkedInProfile The linked in profile.
     */
    public void setLinkedInProfile(String linkedInProfile) {
        this.linkedInProfile = linkedInProfile;
    }

    /**
     * Gets the google plus profile.
     * @return The google plus profile.
     */
    public String getGooglePlusProfile() {
        return googlePlusProfile;
    }

    /**
     * Sets the google plus profile.
     * @param googlePlusProfile The google plus profile.
     */
    public void setGooglePlusProfile(String googlePlusProfile) {
        this.googlePlusProfile = googlePlusProfile;
    }
}
