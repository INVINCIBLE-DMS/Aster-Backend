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
    private String studentId;

    @Column(name = "username", length = 4, nullable = false)
    private String username;

}