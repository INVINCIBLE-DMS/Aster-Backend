package com.example.asterbackend.domain.user.comment.entity;

import com.example.asterbackend.domain.user.feed.entity.Feed;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content", nullable = false, length = 50)
    private String content;

    @Column(name = "is_updated", nullable = false)
    private boolean isUpdated = false;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "feed_id", nullable = false)
    private Feed feed;

    @Column(name = "comment_like_count", nullable = false)
    private int commentLikeCount = 0;

    public void updateContent(String content) {
        this.content = content;
        this.isUpdated = true;
    }

    public void addCommentLike(Comment comment) {
        comment.commentLikeCount++;
    }

    public void cancelCommentLike(Comment comment) {
        comment.commentLikeCount--;
    }

}
