package com.example.asterbackend.domain.user.entity;

import com.example.asterbackend.domain.user.entity.type.Part;
import com.example.asterbackend.domain.user.entity.type.Sex;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @Column(name = "nickname", nullable = false, length = 20)
    private String nickname;

    @Column(name = "username", nullable = false, length = 4)
    private String username;

    @Column(name = "student_id", nullable = false, length = 4)
    private String studentId;

    @Enumerated(EnumType.STRING)
    @Column(name = "sex", nullable = false)
    private Sex sex;

    @Enumerated(EnumType.STRING)
    @Column(name = "part", nullable = false)
    private Part part;

    @Column(name = "candy", nullable = false)
    private int candy = 0;

}