package com.example.asterbackend.domain.survey.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSurvey is a Querydsl query type for Survey
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSurvey extends EntityPathBase<Survey> {

    private static final long serialVersionUID = -1310687581L;

    public static final QSurvey survey = new QSurvey("survey");

    public final NumberPath<Integer> agreeCnt = createNumber("agreeCnt", Integer.class);

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isUpdate = createBoolean("isUpdate");

    public final StringPath nickname = createString("nickname");

    public final EnumPath<com.example.asterbackend.domain.survey.entity.type.SurveyType> surveyType = createEnum("surveyType", com.example.asterbackend.domain.survey.entity.type.SurveyType.class);

    public QSurvey(String variable) {
        super(Survey.class, forVariable(variable));
    }

    public QSurvey(Path<? extends Survey> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSurvey(PathMetadata metadata) {
        super(Survey.class, metadata);
    }

}

