package com.trau.propertymanagementdatabase.mapper;

import com.trau.propertymanagementdatabase.dto.request.UserCreationRequest;
import com.trau.propertymanagementdatabase.dto.request.UserUpdateRequest;
import com.trau.propertymanagementdatabase.dto.response.UserResponse;
import com.trau.propertymanagementdatabase.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
