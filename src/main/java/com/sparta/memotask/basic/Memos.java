package com.sparta.memotask.basic;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Memos {
    private Long id;
    private String title; //제목
    private String name; // 작성자명
    private String content; // 내용
    private String password; // 이름, 숫자 조합 가능
    private Date date; // 날짜 자동

    public Memos() {
    }

    public Memos(String title, String name, String content, String password) {
        this.title = title;
        this.name = name;
        this.content = content;
        this.password = password;

        Date creationTime = new Date();
        this.date = creationTime; //작성시간 : 파파고 creationTime
    }
}
