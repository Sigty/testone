package com.effectivesoft.espoll.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuestionDto {

    private Integer id;
    private String question;
    private String version;
}
