//package com.trau.propertymanagementdatabase.mapper;
//
//import com.trau.propertymanagementdatabase.dto.request.RoleRequest;
//import com.trau.propertymanagementdatabase.dto.response.RoleResponse;
//import com.trau.propertymanagementdatabase.entity.Role;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//@Mapper(componentModel = "spring")
//public interface RoleMapper {
//    @Mapping(target = "permissions", ignore = true)
//    Role toRole(RoleRequest request);
//    RoleResponse toRoleResponse(Role role);
//}
