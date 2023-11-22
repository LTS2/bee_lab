package com.bee.beelab.test.controller;

import com.bee.beelab.test.entity.Post;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : ejum
 * @fileName : testController
 * @since : 2023/11/21
 */

public class TestController {
    public static List<Post> generateTestData() {
        List<Post> testData = new ArrayList<>();
        testData.add(new Post("게시글 1", "그마 이상 자랭하실분 구해요.",true,"o민주몬o","E2"));
        testData.add(new Post("게시글 2", "플레 이상 듀오 구해요.",false,"o우진몬o","E3"));
        testData.add(new Post("게시글 3", "골드 이상 듀오 구해요.",true,"Hide on bush","C"));
        testData.add(new Post("게시글 3", "골드 이상 듀오 구해요.",true,"이주멍","C"));
        testData.add(new Post("게시글 3", "골드 이상 듀오 구해요.",true,"T1 zeus","C"));
        testData.add(new Post("게시글 3", "골드 이상 듀오 구해요.",true,"빡 갱","B1"));
        // 원하는 만큼 데이터를 추가할 수 있습니다.
        return testData;
    }

}
