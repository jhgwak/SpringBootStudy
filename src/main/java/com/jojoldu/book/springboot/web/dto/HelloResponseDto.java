package com.jojoldu.book.springboot.web.dto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Getter//필드에 get 메서드 추가
@RequiredArgsConstructor//final 필드가 포함된 생성자를 생성 final이 없는 필드는 생성자 포함안됨

public class HelloResponseDto {
    private final String name;
    private final int amount;
}
