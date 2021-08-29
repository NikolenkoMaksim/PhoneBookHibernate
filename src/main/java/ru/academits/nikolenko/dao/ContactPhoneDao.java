package ru.academits.nikolenko.dao;

import ru.academits.nikolenko.model.Contact;
import ru.academits.nikolenko.model.ContactPhone;

import java.util.List;

public interface ContactPhoneDao extends GenericDao<ContactPhone, Long> {
    List<ContactPhone> getContactPhoneByContactId(Contact contact);

    List<ContactPhone> getAllContactPhones();
}
