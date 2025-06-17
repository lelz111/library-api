package com.example.library_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequestDto {

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;
}
