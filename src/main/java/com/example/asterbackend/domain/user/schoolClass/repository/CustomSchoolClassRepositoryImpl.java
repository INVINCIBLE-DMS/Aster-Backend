package com.example.asterbackend.domain.user.schoolClass.repository;

import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.asterbackend.domain.user.schoolClass.entity.QSchoolClass.schoolClass;

@Repository
@RequiredArgsConstructor
public class CustomSchoolClassRepositoryImpl implements CustomSchoolClassRepository {
    private final JPAQueryFactory queryFactory;

    public List<SchoolClass> getRank() {
        return queryFactory
                .selectFrom(schoolClass)
                .orderBy(schoolClass.candyCount.desc())
                .fetch();
    }
}
