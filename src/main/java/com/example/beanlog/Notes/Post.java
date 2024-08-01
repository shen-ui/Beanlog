package com.example.beanlog.Notes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

public class Post {
    @Id
    @SequenceGenerator(
            name = "post_sequence",
            sequenceName = "post_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator="post_sequence"
    )
    @Getter @Setter private Integer Id;
    @Getter @Setter String drink_type;
    @Getter @Setter String equipment;
    @Getter @Setter String title;
    @Getter @Setter Long body;
    public Post(String drink_type, String equipment, String title, Long body){
        setDrink_type(this.drink_type);
        setEquipment(this.equipment);
        setTitle(this.title);
        setBody(this.body);
    }
}
