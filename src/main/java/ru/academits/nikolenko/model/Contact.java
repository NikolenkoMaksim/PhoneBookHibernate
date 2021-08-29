package ru.academits.nikolenko.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "contact")
    private List<ContactPhone> contactPhoneList;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String phone;

    @Column
    private boolean isDeleted;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        this.isDeleted = deleted;
    }

    public List<ContactPhone> getContactPhoneList() {
        return contactPhoneList;
    }

    public void setContactPhoneList(List<ContactPhone> contactPhoneList) {
        this.contactPhoneList = contactPhoneList;
    }

    @Override
    public String toString() {
        return "{firstName = " + firstName + "; lastName = " + lastName + "; phone = " + phone + "}";
    }
}
