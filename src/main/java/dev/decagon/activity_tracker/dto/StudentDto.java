package dev.decagon.activity_tracker.dto;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class StudentDto {
    private Long id;
    private String name;
    private String email;

}
