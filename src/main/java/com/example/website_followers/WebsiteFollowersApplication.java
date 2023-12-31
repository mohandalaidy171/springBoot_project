package com.example.website_followers;

import com.example.website_followers.entity.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class WebsiteFollowersApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsiteFollowersApplication.class, args);
    }
private final Users user1;


}
