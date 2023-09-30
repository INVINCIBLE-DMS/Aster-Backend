package com.example.asterbackend.domain.comment.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSurveyComment is a Querydsl query type for SurveyComment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSurveyComment extends EntityPathBase<SurveyComment> {

    private static final long serialVersionUID = 1901693755L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSurveyComment surveyComment = new QSurveyComment("surveyComment");

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isUpdate = createBoolean("isUpdate");

    public final StringPath nickname = createString("nickname");

    public final com.example.asterbackend.domain.survey.entity.QSurvey survey;

    public QSurveyComment(String variable) {
        this(SurveyComment.class, forVariable(variable), INITS);
    }

    public QSurveyComment(Path<? extends SurveyComment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSurveyComment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSurveyComment(PathMetadata metadata, PathInits inits) {
        this(SurveyComment.class, metadata, inits);
    }

    public QSurveyComment(Class<? extends SurveyComment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.survey = inits.isInitialized("survey") ? new com.example.asterbackend.domain.survey.entity.QSurvey(forProperty("survey")) : null;
    }

}

