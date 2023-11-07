package com.example.asterbackend.domain.user.student.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {

    @Id
    @Column(name = "student_id", length = 4, nullable = false)
    private int studentId;

    @Column(name = "username", length = 4, nullable = false)
    private String username;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    public Student(int classId, String username, Sex sex) {
        this.studentId = classId;
        this.username = username;
        this.sex = sex;
    }

}