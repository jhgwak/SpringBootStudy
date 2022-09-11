package com.jojoldu.book.springboot.domain.posts;
import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@NoArgsConstructor
@Entity

public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//pk 생셩규칙을 이야기한다
    private Long id;

    @Column(length = 400,nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String content;

    private String author;

    @Builder//setter 대신 사용하여 값을 초기화해줌
    public Posts(String title, String content,String author){//내용
        this.title=title;
        this.content=content;
        this.author=author;
    }
    public void update(String title,String content){//업데이트
        this.title=title;
        this.content=content;
    }


}
