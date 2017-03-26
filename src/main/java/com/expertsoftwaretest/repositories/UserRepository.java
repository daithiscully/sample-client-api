package com.expertsoftwaretest.repositories;

import com.expertsoftwaretest.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {


    private static List<User> userList = new ArrayList<>();


    public UserRepository() {
        User user1 = new User("Test01_FN", "Test01_SN", "test01@email.com");
        User user2 = new  User("Test02_FN","Test02_SN","test02@email.com");
        User user3 = new  User("Test03_FN","Test03_SN","test03@email.com");
        User user4 = new  User("Test04_FN","Test04_SN","test04@email.com");
        User user5 = new  User("Test05_FN","Test05_SN","test05@email.com");
        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public List<User> getUsersList(){
        return userList;
    }

    public List<User> saveUser(User user){
        getUsersList().add(user);
        return userList;
    }


}
