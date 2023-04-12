package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "resume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "position", nullable = false)
    private String position;
    @Column(name = "company", nullable = true)
    private String company;
    @Column(name = "comment", nullable = true)
    private String comment;
    @Column(name = "salary", nullable = false)
    private Long salary;



}