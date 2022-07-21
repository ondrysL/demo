package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "song")
@EntityListeners(AuditingEntityListener.class)
public class Song {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String author;

    @Column
    private String link;

}
