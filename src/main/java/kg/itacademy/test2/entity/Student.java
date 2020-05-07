package kg.itacademy.test2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student extends SuperPuper {
    @Column(name = "fio")
    private String name;
    @ManyToOne
    @JoinColumn(name = "course")
    private Course course;
    @Column(name = "total_cost")
    private Integer totalCost;
    @Column(name = "isActive")
    private Integer isActive;
}
