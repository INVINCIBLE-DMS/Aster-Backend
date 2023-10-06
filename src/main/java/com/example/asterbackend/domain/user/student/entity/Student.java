package com.example.asterbackend.domain.user.student.entity;

import com.example.asterbackend.domain.user.user.entity.type.Sex;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private int studentId;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    public Student(int classId, String username, Sex sex) {
        this.studentId = classId;
        this.username = username;
        this.sex = sex;
    }
}