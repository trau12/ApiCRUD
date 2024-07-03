package com.trau.propertymanagementdatabase.dto.request;

import com.trau.propertymanagementdatabase.validator.DobConstraint;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {

    private String password;
    private String name;

    @DobConstraint(min = 12, message = "INVALID_DOB")
    private LocalDate dob;
    List<String> roles;
}

