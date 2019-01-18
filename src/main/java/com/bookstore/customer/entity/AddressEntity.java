package com.bookstore.customer.entity;

import com.bookstore.base.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@Getter
@Setter
@Entity
@Table(name = "address", schema = "store1")
public class AddressEntity extends BaseEntity {

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "country")
    private String country;
}
