package com.jojoldu.book.springboot.web.dto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class HelloResponseDtoTest {
    @Test
    public void lombok_Test(){
        String name="test";
        int amount=1000;

        HelloResponseDto dto=new HelloResponseDto(name,amount);

        assertThat(dto.getName()).isEqualTo(name);//검증하고 싶은 메소드 인자확인
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
