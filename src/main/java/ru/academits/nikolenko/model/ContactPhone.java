package ru.academits.nikolenko.model;

import javax.persistence.*;

@Entity
@Table(name = "phone")
public class ContactPhone {
    @ManyToOne
    @JoinColumn(name = "contactId")
    private Contact contact;

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String phone;

    public ContactPhone() {
    }

    public ContactPhone(String phone, Contact contact) {
        this.phone = phone;
        this.contact = contact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContactId(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "{phone = " + phone + ", contact = " + contact + "}";
    }
}
