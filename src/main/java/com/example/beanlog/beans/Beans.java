package com.example.beanlog.beans;

import com.example.beanlog.Notes.Post;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import java.util.ArrayList;

public class Beans {
    @Id
    @SequenceGenerator(
            name="beans_sequence",
            sequenceName= "author_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator="beans_sequence"
    )
    private Integer id;
    @Setter @Getter private String name;
    @Setter @Getter private String brand;
    @Setter @Getter private String roast_level;
    @Setter @Getter private String origin;
    @Setter @Getter private String[] tasting_notes;
    @Setter @Getter private Double price_per_lb;
    @Setter @Getter private ArrayList<Post> posts;
    public Beans(){}
    public Beans(String brand, String name, String roast_level, String origin, String[] tasting_notes, Double price_per_lb){
        setBrand(this.brand);
        setName(this.name);
        setRoast_level(this.roast_level);
        setOrigin(this.origin);
        setPrice_per_lb(this.price_per_lb);
        setTasting_notes(this.tasting_notes);
        setPosts(new ArrayList<Post>());
    }
    public void addPost(Post post){
        posts.addLast(post);
    }
    public void deletePost(Post post){
        posts.remove(post);
    }
}
