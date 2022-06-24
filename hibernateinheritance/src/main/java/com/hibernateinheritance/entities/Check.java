package com.hibernateinheritance.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.*;

@Entity
@Table(name="bankcheck")
@PrimaryKeyJoinColumn(name="id")
public class Check extends Payment{
    private String checknumber;

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumbers) {
        this.checknumber = checknumbers;
    }
}
