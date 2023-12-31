package com.example.website_followers.repository;

import com.example.website_followers.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {





    @Query("select u from Users u where u.user_name = ?1")
    Users getByUserName(String userName);


    @Query("delete from Users s where s.user_id=?1")
    int delIDd2(int id);
}
