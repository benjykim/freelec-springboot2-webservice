package com.jojoldu.book.springboot.web.dto;


import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lombok_function_test() {
        String name = "test";
        int amount = 500;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
