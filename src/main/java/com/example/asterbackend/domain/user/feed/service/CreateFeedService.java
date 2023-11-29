package com.example.asterbackend.domain.user.feed.service;

import com.example.asterbackend.domain.user.feed.entity.Feed;
import com.example.asterbackend.domain.user.feed.presentation.dto.request.FeedRequest;
import com.example.asterbackend.domain.user.feed.repository.FeedRepository;
import com.example.asterbackend.domain.user.schoolClass.entity.SchoolClass;
import com.example.asterbackend.domain.user.schoolClass.repository.SchoolClassRepository;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import com.example.asterbackend.global.exception.user.SchoolClassNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CreateFeedService {

    private final FeedRepository feedRepository;

    private final UserFacade userFacade;

    private final SchoolClassRepository schoolClassRepository;

    @Transactional
    public void createFeed(FeedRequest request) {
        LocalDateTime now = LocalDateTime.now();

        User user = userFacade.getCurrentUser();

        Long grade = Long.parseLong(user.getStudentId().substring(0, 1));
        Long classNumber = Long.parseLong(user.getStudentId().substring(1, 2));

        SchoolClass schoolClass = schoolClassRepository.findSchoolClassByGradeAndClassNumber(grade, classNumber)
                .orElseThrow(()-> SchoolClassNotFoundException.EXCEPTION);

        schoolClass.addCandy(50);

        feedRepository.save(
                Feed.builder()
                        .content(request.getContent())
                        .user(user)
                        .feedImgUrl(request.getFeedImgUrl())
                        .createdAt(now)
                        .build());
    }

}
