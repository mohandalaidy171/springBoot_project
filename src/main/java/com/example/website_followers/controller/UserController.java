package com.example.website_followers.controller;

import com.example.website_followers.dto.UserDto;
import com.example.website_followers.entity.Users;
import com.example.website_followers.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;




    @GetMapping("all")
    public ResponseEntity<List<Users>> getAll(){

        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("byId")
    public ResponseEntity<Users> getAll(@RequestParam int id){

        return ResponseEntity.ok(userService.getById(id));
    }

    @GetMapping("byUserName")
    public ResponseEntity<Users> getAll(@RequestParam String user_name){

        return ResponseEntity.ok(userService.getByUserName(user_name));
    }
    @PostMapping("insert")
    public ResponseEntity<Users> insertUser(@RequestBody UserDto userDto) {
        Users user = userService.addNewUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PutMapping ("update")
    public ResponseEntity<Users> updateUser(@RequestBody UserDto userDto) {
        Users user = userService.UpdateUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseEntity<String>> deleteById(@PathVariable int id) {
        return ResponseEntity.ok(userService.deleteById(id));
    }

    @DeleteMapping("/delete2/{id}")
    public ResponseEntity<String> deleteById2(@PathVariable int id) {
        return ResponseEntity.ok(userService.deleteById2(id));
    }


}
