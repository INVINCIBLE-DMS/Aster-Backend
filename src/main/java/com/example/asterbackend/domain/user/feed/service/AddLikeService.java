package com.example.asterbackend.domain.user.feed.service;

import com.example.asterbackend.domain.user.feed.entity.Feed;
import com.example.asterbackend.domain.user.feed.entity.Like;
import com.example.asterbackend.domain.user.feed.facade.FeedFacade;
import com.example.asterbackend.domain.user.feed.repository.LikeRepository;
import com.example.asterbackend.domain.user.user.entity.User;
import com.example.asterbackend.domain.user.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AddLikeService {

    private final FeedFacade feedFacade;

    private final UserFacade userFacade;

    private final LikeRepository likeRepository;

    @Transactional
    public void addLike(Long feedId) {
        Feed feed = feedFacade.currentFeed(feedId);

        User user = userFacade.getCurrentUser();

        if (likeRepository.existsByFeedIdAndNickname(feedId, user.getNickname())) {
            feed.cancelLike();

            likeRepository.deleteByFeedIdAndNickname(feedId, user.getNickname());
        }
        else {
            feed.addLike();

            likeRepository.save(
                    Like.builder()
                            .nickname(user.getNickname())
                            .feed(feed)
                            .build());
        }
    }

}
