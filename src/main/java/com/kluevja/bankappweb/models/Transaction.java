package com.kluevja.bankappweb.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@ToString

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Account sendder;
    @ManyToOne
    private Account getter;
    private double valueOfPayment;
    private Date dataOfPayment;
}
