package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "book")
@ToString
@EntityListeners(AuditingEntityListener.class)
public class Book {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String author;

    @Column
    private Integer site;

    @Column
    private String link;

}
