package dev.decagon.activity_tracker.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@Builder
public class StudentSignUpDto {
@NotNull(message="name cannot be null")
@Size(min=2, message="name must be more than 1 letter")
    private String name;
@Email()
    private String email;

    @NotNull(message="name cannot be null")
    @Size(min=2, max=12, message="password must be between 2 and 12 characters")
    private String password;
}
