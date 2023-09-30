package com.example.asterbackend.domain.survey.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAgree is a Querydsl query type for Agree
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAgree extends EntityPathBase<Agree> {

    private static final long serialVersionUID = -1721889213L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAgree agree = new QAgree("agree");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nickname = createString("nickname");

    public final QSurvey survey;

    public QAgree(String variable) {
        this(Agree.class, forVariable(variable), INITS);
    }

    public QAgree(Path<? extends Agree> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAgree(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAgree(PathMetadata metadata, PathInits inits) {
        this(Agree.class, metadata, inits);
    }

    public QAgree(Class<? extends Agree> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.survey = inits.isInitialized("survey") ? new QSurvey(forProperty("survey")) : null;
    }

}

