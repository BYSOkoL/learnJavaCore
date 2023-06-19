package dmitry.sokolov.classwork.lection11.Task;


import dmitry.sokolov.classwork.lection11.Task.contacts.Contact;
import dmitry.sokolov.classwork.lection11.Task.contacts.FavoriteContact;
import dmitry.sokolov.classwork.lection11.Task.contacts.NumberType;
import dmitry.sokolov.classwork.lection11.Task.exceptions.contact.ContactAlreadyExistException;
import dmitry.sokolov.classwork.lection11.Task.exceptions.contact.FastCallDigitInvalidException;
import dmitry.sokolov.classwork.lection11.Task.exceptions.number.NumberDuplicateException;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, Contact> regularContactsByName = new HashMap<>();
    Map<Integer, FavoriteContact> favoriteContactsByFastDigit = new HashMap<>();

    public Contact addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException(
                    "Contact is null"
            );
        }
        if (regularContactsByName.containsKey(contact.getName())) {
            throw new ContactAlreadyExistException(
                    "Contact with name " + contact.getName() + " already exist"
            );
        }
        return regularContactsByName.put(contact.getName(), contact);
    }

    public boolean removeContact(String name) {
        return regularContactsByName.remove(name) != null;
    }

    public Contact changeContact(String oldName, Contact newContact) {
        if (oldName == null || newContact == null) {
            throw new IllegalArgumentException(
                    "Old name or contact is null"
            );
        }
        if (oldName.equals(newContact.getName())) {
            return regularContactsByName.replace(oldName, newContact);
        }
        addContact(newContact);
        return regularContactsByName.remove(oldName);
    }

    public FavoriteContact addContactToFavorite(String name, int fastCallDigit) {
        if (name == null) {
            throw new IllegalArgumentException(
                    "Name is null"
            );
        }
        if (fastCallDigit > 9 || fastCallDigit < 0) {
            throw new FastCallDigitInvalidException(
                    "Number must be in range [0-9]"
            );
        }
        if (favoriteContactsByFastDigit.containsKey(fastCallDigit)) {
            throw new FastCallDigitInvalidException(
                    "This digit: " + fastCallDigit + " already in use"
            );
        }
        Contact contact = regularContactsByName.get(name);
        if (contact == null) {
            throw new NullPointerException(
                    "No contact with name: " + name
            );
        }
        return favoriteContactsByFastDigit.put(
                fastCallDigit,
                new FavoriteContact(contact, fastCallDigit)
        );
    }

    public boolean removeContactFromFavorite(int fastCallDigit) {
        if (fastCallDigit > 9 || fastCallDigit < 0) {
            throw new FastCallDigitInvalidException(
                    "Number must be in range [0-9]"
            );
        }
        return favoriteContactsByFastDigit.remove(fastCallDigit) != null;
    }

    public Contact addNumberToContact(String name, NumberType type, String number) {
        if (name == null || type == null || number == null) {
            throw new IllegalArgumentException(
                    "Name, type or number is null"
            );
        }
        Contact contact = regularContactsByName.get(name);
        if (contact.isNumberExist(type, number)) {
            throw new NumberDuplicateException(
                    "Number " + number + " cant be work and normal at the same time"
            );
        }
        contact.addNumber(type, number);
        return contact;
    }

    public boolean removeNumberFromContact(String name, NumberType type, String number) {
        if (name == null || type == null || number == null) {
            throw new IllegalArgumentException(
                    "Name, type or number is null"
            );
        }
        Contact contact = regularContactsByName.get(name);
        if (contact.isNumberExist(type, number)) {
            throw new NumberDuplicateException(
                    "Number " + number + " cant be work and normal at the same time"
            );
        }
        return contact.removeNumber(type, number);
    }

    public boolean changeNumber(String name, NumberType type, String oldNumber, String newNumber) {
        if (name == null || type == null || oldNumber == null || newNumber == null) {
            throw new IllegalArgumentException(
                    "Name, type or number is null"
            );
        }
        Contact contact = regularContactsByName.get(name);
        if (contact.isNumberExist(type, newNumber)) {
            throw new NumberDuplicateException(
                    "Number " + oldNumber + " cant be work and normal at the same time"
            );
        }
        return contact.changeNumber(type, oldNumber, newNumber);
    }
}
