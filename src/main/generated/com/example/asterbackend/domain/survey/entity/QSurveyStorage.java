package com.example.asterbackend.domain.survey.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSurveyStorage is a Querydsl query type for SurveyStorage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSurveyStorage extends EntityPathBase<SurveyStorage> {

    private static final long serialVersionUID = 1568550488L;

    public static final QSurveyStorage surveyStorage = new QSurveyStorage("surveyStorage");

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.example.asterbackend.domain.survey.entity.type.SurveyType> surveyType = createEnum("surveyType", com.example.asterbackend.domain.survey.entity.type.SurveyType.class);

    public QSurveyStorage(String variable) {
        super(SurveyStorage.class, forVariable(variable));
    }

    public QSurveyStorage(Path<? extends SurveyStorage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSurveyStorage(PathMetadata metadata) {
        super(SurveyStorage.class, metadata);
    }

}

