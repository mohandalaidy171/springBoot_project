package com.example.website_followers.service;

import com.example.website_followers.dto.UserDto;
import com.example.website_followers.entity.Users;
import com.example.website_followers.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public Users addUser(Users user) {
        return userRepository.save(user);
    }


    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }


    public Users getById(int id) {

        return userRepository.findById(id).orElseThrow(()->new EntityNotFoundException("the id not found "));
    }

    public Users getByUserName(String userName) {

        return userRepository.getByUserName(userName);
    }

    public Users addNewUser(UserDto userDto) {

        Users user=new Users();

        user.setUser_id(userDto.getUser_id());
        user.setUser_name(userDto.getUser_name());
        user.setFirst_name(userDto.getFirst_name());
        user.setLast_name(userDto.getLast_name());
        user.setPassword(userDto.getPassword());
        user.setActivy(userDto.getActivy());
        return userRepository.save(user);
    }




    public Users UpdateUser(UserDto userDto) {
        Optional<Users> tsetId=userRepository.findById(userDto.getUser_id());
        if(tsetId.isPresent()){
            Users user=new Users();

            user.setUser_id(userDto.getUser_id());
            user.setUser_name(userDto.getUser_name());
            user.setFirst_name(userDto.getFirst_name());
            user.setLast_name(userDto.getLast_name());
            user.setPassword(userDto.getPassword());
            user.setActivy(userDto.getActivy());
            return userRepository.save(user);

        }
        return null;
    }

    public ResponseEntity<String> deleteById(int id) {
        Optional<Users> testId=userRepository.findById(id);
        if(testId.isPresent()) {
            userRepository.deleteById(id);
            return ResponseEntity.ok("Deleted successfully");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");}
        }


    public String deleteById2(int id) {
        int testId=userRepository.delIDd2(id);
        if(testId==1){
            return "Delete Succefuily";
        }
        else{
            return "Not Succefuily";}

    }
}
