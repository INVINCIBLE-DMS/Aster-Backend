package com.example.asterbackend.domain.user.schoolClass.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@IdClass(SchoolClassId.class)
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SchoolClass {

    @Id
    @Column(name = "grade")
    private Long grade;

    @Id
    @Column(name = "class_number")
    private Long classNumber;

    @Column(name = "candy_count")
    private int candyCount;

    public void addCandy100() {
        this.candyCount+=100;
    }

    public void addCandy50() {
        this.candyCount+=50;
    }

}