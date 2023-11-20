package com.example.asterbackend.global.error.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {

    // jwt
    EXPIRED_TOKEN(401 , "Expired token"),
    INVALID_TOKEN(401, "Invalid token"),
    REFRESH_TOKEN_NOT_FOUND(403,"RefreshToken not found"),


    //user
    USER_EXISTS(403, "User exists"),
    USER_NOT_FOUND(404, "User not found"),
    PASSWORD_MISMATCH(404, "Password mismatch"),
    NOT_ADMIN(403, "Not admin"),
    EMAIL_MATCHED(409,"email matched"),
    NOT_AUTHENTICATED(401, "NotAuthenticated"),
    CANDY_NOT_ENOUGH(404, "Candy not enough"),
    NOT_STUDENT(403, "Not student"),
    WRITER_MISMATCH(403, "Writer mismatched"),
    SCHOOL_CLASS_NOT_FOUND(404, "School class not found"),

    //Feed
    FEED_NOT_FOUND(404, "Feed not found"),

    //Comment
    COMMENT_NOT_FOUND(404, "Comment not found"),
    NOT_WRITER(403, "Not writer"),

    // general
    BAD_REQUEST(400, "Bad request"),
    INTERNAL_SERVER_ERROR(500, "Internal server error"),

    //survey
    SURVEY_NOT_FOUND(404, "Survey not found"),

    //image
    IMAGE_UPLOAD_FAIL(400, "Image upload fail"),
    WRONG_IMAGE(400, "Wrong Image");

    private final int statusCode;
    private final String message;
}
