package com.exam.HibernateEmbeddable_example;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentInfo {
    @Id
    private int id;
    
    @Embedded
    private NameInfo name;
    
    @Embedded
    private AddressInfo address;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public NameInfo getName() {
        return name;
    }

    public void setName(NameInfo name) {
        this.name = name;
    }

    public AddressInfo getAddress() {
        return address;
    }

    public void setAddress(AddressInfo address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentInfo [id=" + id + ", name=" + name + ", address=" + address + "]";
    }
}
