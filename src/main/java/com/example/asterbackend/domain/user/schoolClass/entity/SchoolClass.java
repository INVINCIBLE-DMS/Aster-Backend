package com.example.asterbackend.domain.user.schoolClass.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SchoolClass {

    @Id
    @Column(name = "class_number")
    private Long classNumber;

    @Column(name = "candy_count")
    private int candyCount;
}
