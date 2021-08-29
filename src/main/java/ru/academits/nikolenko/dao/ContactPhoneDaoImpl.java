package ru.academits.nikolenko.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ru.academits.nikolenko.model.Contact;
import ru.academits.nikolenko.model.ContactPhone;

import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class ContactPhoneDaoImpl extends GenericDaoImpl<ContactPhone, Long> implements ContactPhoneDao {
    public ContactPhoneDaoImpl() {
        super(ContactPhone.class);
    }

    private static final Logger logger = LoggerFactory.getLogger(ContactPhoneDao.class);

    @Override
    public List<ContactPhone> getContactPhoneByContactId(Contact contact) {
        TypedQuery<ContactPhone> q = entityManager.createQuery(
                "SELECT cp FROM ContactPhone cp WHERE cp.contact = :contact", clazz);
        q.setParameter("contact", contact);

        return q.getResultList();
    }

    @Override
    public List<ContactPhone> getAllContactPhones() {
        logger.info("Called method getAllPhoneContacts in ContactDaoImpl");

        return findAll();
    }
}
