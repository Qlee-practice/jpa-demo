package com.example.dbdemo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "orders")

public class Order {

    @Id
    public Long id;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")

    public User user;

    @Column(name = "product_name")
    public String name;

}
