package mx.com.jovannypcg.controller;

import mx.com.jovannypcg.model.Contact;
import mx.com.jovannypcg.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This controller defines the endpoints to make use of the contact model.
 * Describes the http methods GET, POST, PUT and DELETE for contact.
 *
 * @author  OCPJP Jovanny Pablo Cruz Gomez.
 *          Software Engineer.
 *
 * @version 1.0.
 */
@RestController
@RequestMapping("/contacts")
public class ContactRestController {
    /** Injects the bean repository created by Spring. */
    @Autowired
    private ContactRepository repo;

    /**
     * The GET method to retrieve all the contacts.
     * @return All the contacts which are in the database.
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Contact> getAll() {
        return repo.findAll();
    }

    /**
     * The POST method to create a new contact in the database.
     * @param contact The contact to be created in the dabatase.
     * @return The inserted contact in the database.
     */
    @RequestMapping(method = RequestMethod.POST)
    public Contact create(@RequestBody Contact contact) {
        return repo.save(contact);
    }

    /**
     * The DELETE http method to delete a contact.
     * @param id The id of the contact to be removed.
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void delete(@PathVariable String id) {
        repo.delete(id);
    }

    /**
     * The PUT http method to update an existing contact in the database.
     * @param id The id of the contact to be updated.
     * @param contact The new contact that replaces the old one.
     * @return The new contact which was inserted.
     */
    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public Contact update(@PathVariable String id, @RequestBody Contact contact) {
        Contact update = repo.findOne(id);

        update.setAddress(contact.getAddress());
        update.setEmail(contact.getEmail());
        update.setFacebookProfile(contact.getFacebookProfile());
        update.setFirstName(contact.getFirstName());
        update.setGooglePlusProfile(contact.getGooglePlusProfile());
        update.setLastName(contact.getLastName());
        update.setLinkedInProfile(contact.getLinkedInProfile());
        update.setPhoneNumber(contact.getPhoneNumber());
        update.setTwitterHandle(contact.getTwitterHandle());

        return repo.save(update);
    }
}
