package com.example.asterbackend.domain.user.feed.presentation.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FeedRequest {

    @NotNull
    private String content;

    private String feedImageUrl;
}
