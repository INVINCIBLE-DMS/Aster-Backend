package com.example.asterbackend.domain.survey.repository;

import com.example.asterbackend.domain.survey.entity.SurveyStorage;
import com.example.asterbackend.domain.survey.entity.type.SurveyType;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.asterbackend.domain.survey.entity.QSurveyStorage.surveyStorage;

@Repository
@RequiredArgsConstructor
public class CustomSurveyStorageRepositoryImpl implements CustomSurveyStorageRepository {

    private final JPAQueryFactory queryFactory;

    public List<SurveyStorage> findEnumSurvey(SurveyType surveyType) {
        List<SurveyStorage> surveys = queryFactory
                .selectFrom(surveyStorage)
                .where(surveyStorage.surveyType.eq(surveyType))
                .fetch();

        Collections.shuffle(surveys);

        return surveys.stream()
                .limit(3)
                .collect(Collectors.toList());
    }

}
