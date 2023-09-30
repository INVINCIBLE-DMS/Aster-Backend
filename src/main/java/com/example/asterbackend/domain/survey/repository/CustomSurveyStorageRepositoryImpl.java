package com.example.asterbackend.domain.survey.repository;

import com.example.asterbackend.domain.survey.entity.Survey;
import com.example.asterbackend.domain.survey.entity.type.SurveyType;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.asterbackend.domain.survey.entity.QSurvey.survey;

@Repository
@RequiredArgsConstructor
public class CustomSurveyStorageRepositoryImpl implements CustomSurveyStorageRepository {

    private final JPAQueryFactory queryFactory;

    public List<Survey> findEnumSurvey(SurveyType surveyType) {
        return queryFactory
                .selectFrom(survey)
                .where(survey.surveyType.eq(surveyType))
                .fetch();
    }

}
