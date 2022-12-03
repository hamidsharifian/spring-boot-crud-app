package com.example.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @Size(max = 50)
    private String id;
    @JoinColumn(name = "product_id", nullable = false)
    @ManyToOne
    private Product product;
    @JoinColumn(name = "customer_id", nullable = false)
    @ManyToOne
    private Customer customer;
    @NotNull
    @Column(nullable = false)
    private Integer count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
