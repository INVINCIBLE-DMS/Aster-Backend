package com.example.asterbackend.domain.comment.entity;

import com.example.asterbackend.domain.feed.entity.Feed;
import lombok.*;

import javax.persistence.*;
import java.util.List;

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

    @Column(name = "is_update", nullable = false)
    private boolean isUpdate = false;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "feed_id", nullable = false)
    private Feed feed;

    @OneToMany(mappedBy = "comment")
    private List<CoComment> coCommentList;

    @Column(name = "comment_like_count", nullable = false)
    private int commentLikeCount = 0;

    public void updateContent(String content) {
        this.content = content;
        this.isUpdate = true;
    }

    public void addCoComment(CoComment cocomment) {
        coCommentList.add(cocomment);
    }

    public void deleteCoComment(CoComment cocomment) {
        coCommentList.remove(cocomment);
    }

    public void addCommentLike(Comment comment) {
        comment.commentLikeCount++;
    }

    public void cancelCommentLike(Comment comment) {
        comment.commentLikeCount--;
    }

}
