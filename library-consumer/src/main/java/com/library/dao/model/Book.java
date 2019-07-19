package com.library.dao.model;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String author;
    private BigDecimal price;

    //private Long clientId;

    //Genre du livre
    private String genre;

    //Nombre d'exemplaires
    private Long quantity;

    @Column(columnDefinition = "boolean default true")
    private Boolean available;

    @ManyToOne
    private Client borrower;

    //ou boolean
    //private int borrowCount;

    /*
        //Début du prêt
        private Date borrowDate;
     */

}


