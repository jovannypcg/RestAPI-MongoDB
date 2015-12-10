package mx.com.jovannypcg.repository;

import mx.com.jovannypcg.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * The repository to handle the Contact model.
 * Spring implements it and creates a bean for it.
 *
 * The parameters in MongoRepository<S, T>, are:
 *     S: the model that mongodb will handle.
 *     T: The data type of the id from the model.
 *
 * @author  OCPJP Jovanny Pablo Cruz Gomez.
 *          Software Engineer.
 *
 * @version 1.0.
 */
public interface ContactRepository extends MongoRepository<Contact, String> {}
