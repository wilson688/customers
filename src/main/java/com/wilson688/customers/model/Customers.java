package com.wilson688.customers.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
@ToString
public class Customers {


    @Id
    @Column
    private long id;


    @Column
    @NotNull(message="{NotNull.Customers.firstName")
    private String firstName;

    @Column
    private String lastName;
}
