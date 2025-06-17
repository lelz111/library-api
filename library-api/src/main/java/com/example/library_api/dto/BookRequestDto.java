package com.example.library_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor // This generates a public constructor
public class BookRequestDto {
    private String title;
    private Integer stock;
}