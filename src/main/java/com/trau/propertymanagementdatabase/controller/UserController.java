package com.trau.propertymanagementdatabase.controller;

import com.trau.propertymanagementdatabase.dto.request.ApiResponse;
import com.trau.propertymanagementdatabase.dto.request.UserCreationRequest;
import com.trau.propertymanagementdatabase.dto.request.UserUpdateRequest;
import com.trau.propertymanagementdatabase.dto.response.UserResponse;
import com.trau.propertymanagementdatabase.entity.User;
import com.trau.propertymanagementdatabase.service.UserService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class UserController {
    UserService userService;

    @PostMapping
    ApiResponse<UserResponse> createUser(@RequestBody @Valid UserCreationRequest request) {
        return ApiResponse.<UserResponse>builder()
                .result(userService.createUser(request))
                .build();
    }

    @GetMapping
    ApiResponse<List<UserResponse>> getUsers(){
        return ApiResponse.<List<UserResponse>>builder()
                .result(userService.getUsers())
                .build();
    }

    @GetMapping("/{userId}")
    ApiResponse<UserResponse> getUser(@PathVariable("userId") String userId){
        return ApiResponse.<UserResponse>builder()
                .result(userService.getUser(userId))
                .build();
    }

    @GetMapping("/myInfo")
    ApiResponse<UserResponse> getMyInfo(){
        return ApiResponse.<UserResponse>builder()
                .result(userService.getMyInfo())
                .build();
    }

//    @PutMapping("/{userId}")
//    ApiResponse<UserResponse> updateUser(@PathVariable String userId,@RequestBody UserUpdateRequest request){
//        return ApiResponse.<UserResponse>builder()
//                .result(userService.updateUser(userId, request))
//                .build();
//    }

    @DeleteMapping("/{userId}")
    ApiResponse<String> deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return ApiResponse.<String>builder().result("User has been deleted").build();
    }
}
