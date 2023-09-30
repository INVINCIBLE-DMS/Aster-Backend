package com.example.asterbackend.domain.comment.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoComment is a Querydsl query type for CoComment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoComment extends EntityPathBase<CoComment> {

    private static final long serialVersionUID = -1350244119L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCoComment coComment = new QCoComment("coComment");

    public final QComment comment;

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nickname = createString("nickname");

    public QCoComment(String variable) {
        this(CoComment.class, forVariable(variable), INITS);
    }

    public QCoComment(Path<? extends CoComment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCoComment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCoComment(PathMetadata metadata, PathInits inits) {
        this(CoComment.class, metadata, inits);
    }

    public QCoComment(Class<? extends CoComment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.comment = inits.isInitialized("comment") ? new QComment(forProperty("comment"), inits.get("comment")) : null;
    }

}

