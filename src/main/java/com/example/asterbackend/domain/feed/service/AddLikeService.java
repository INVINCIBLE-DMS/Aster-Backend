package com.example.asterbackend.domain.feed.service;

import com.example.asterbackend.domain.feed.entity.Feed;
import com.example.asterbackend.domain.feed.entity.Like;
import com.example.asterbackend.domain.feed.facade.FeedFacade;
import com.example.asterbackend.domain.feed.facade.FeedFacade;
import com.example.asterbackend.domain.feed.repository.LikeRepository;
import com.example.asterbackend.domain.user.entity.User;
import com.example.asterbackend.domain.user.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddLikeService {

    private final FeedFacade feedFacade;

    private final UserFacade userFacade;

    private final LikeRepository likeRepository;

    public void addLike(Long feedId) {
        Feed feed = feedFacade.currentFeed(feedId);

        User user = userFacade.getCurrentUser();

        if (likeRepository.existsByFeedIdAndNickname(feedId, user.getNickname())) {
            feed.addLike();

            likeRepository.deleteByFeedIdAndNickname(feedId, user.getNickname());
        }
        else {
            feed.cancelLike();

            likeRepository.save(
                    Like.builder()
                            .Feed(feed)
                            .nickname(user.getNickname())
                            .build());
        }
    }

}
