package dev.decagon.activity_tracker.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy = "student", cascade = {
            CascadeType.PERSIST,
            CascadeType.REMOVE
    } )
    private List <Task> studentTasks;



}
