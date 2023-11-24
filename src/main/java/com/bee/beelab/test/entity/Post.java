package com.bee.beelab.test.entity;

import lombok.*;

/**
 * @author : ejum
 * @fileName : Post
 * @since : 2023/11/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private String title;
    private String content;
    private String nickName;
    private String rank;
    private boolean microphoneSelected; // 마이크 선택 상태를 나타내는 필드


    public Post(String title, String content, boolean microphoneSelected, String nickName, String rank) {
        this.title = title;
        this.content = content;
        this.microphoneSelected = microphoneSelected;
        this.nickName = nickName;
        this.rank = rank;
    }

}
