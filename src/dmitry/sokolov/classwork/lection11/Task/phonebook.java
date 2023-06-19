package roman.lis.phone;

import roman.lis.phone.contacts.Contact;
import roman.lis.phone.contacts.FavoriteContact;
import roman.lis.phone.exceptions.ContactAlreadyExistException;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, Contact> regularContactsByName = new HashMap<>();
    Map<String, FavoriteContact> favoriteContactsByName = new HashMap<>();
    public Contact addContact(Contact contact) {
        if(regularContactsByName.containsKey(contact.getName())) {
            throw new ContactAlreadyExistException(
                "Contact with name " + contact.getName() + " already exist"
            );
        }
       return regularContactsByName.put(contact.getName(), contact);
    }
    public boolean removeContact(String name) {
       return regularContactsByName.remove(name) != null;
    }
}
