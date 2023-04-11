package com.bookshop.book;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    @SequenceGenerator(name = "book_id_sequence",
            sequenceName = "book_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_id_sequence"
    )
    private Integer id;
    @Column(unique=true)
    private String name;
    private Integer price;

    public Book(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    public Book() {
    }

}
