package com.example.asterbackend.domain.user.entity;

import com.example.asterbackend.domain.user.entity.type.Part;
import com.example.asterbackend.domain.user.entity.type.Sex;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @Size(min = 1, max = 15)
    private String nickname;

    @NotNull
    @Size(min = 2, max = 4)
    private String username;

    @Enumerated(EnumType.STRING)
    @Column
    private Sex sex;

    @Enumerated(EnumType.STRING)
    @Column
    private Part part;

    private int candy = 0;

}

