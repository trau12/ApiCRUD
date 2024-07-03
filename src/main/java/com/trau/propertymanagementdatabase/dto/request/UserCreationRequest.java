package com.trau.propertymanagementdatabase.dto.request;

import com.trau.propertymanagementdatabase.validator.DobConstraint;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 4, message = "USERNAME_INVALID")
    private String username;

    @Size(min = 8, message = "INVALID_PASSWORD")
    private String password;
    private String name;

    @DobConstraint(min = 12, message = "INVALID_DOB")
    private LocalDate dob;
}
