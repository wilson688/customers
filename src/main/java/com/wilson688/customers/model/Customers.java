package com.wilson688.customers.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@ToString
public class Customers {


    @Id
    @Column
    private long id;


    @Column
    private String firstName;

    @Column
    private String lastName;
}
