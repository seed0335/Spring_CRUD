package com.sparta.memotask.basic;

import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
public class Memo implements Comparable<Memo>{
    private Long id;
    private String title; //제목
    private String name; // 작성자명
    private String content; // 내용
    private String password; // 이름, 숫자 조합 가능
    private String creationTime; // 작성 날짜 및 시간

    public Memo() {
    }

    public Memo(String title, String name, String content, String password) {
        this.title = title;
        this.name = name;
        this.content = content;
        this.password = password;

        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        String date = sdf.format(now);
        this.creationTime = date;
    }

    @Override
    public int compareTo(Memo o) {
        return (o.creationTime.compareTo(creationTime));
    }
}
