package com.irctc.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.irctc.model.Booking;
import com.irctc.model.User;
import com.irctc.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    private User user;
    private List<User> userList;

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String USERS_PATH = "../LocalDb/users.json";

    public UserService(User user1) {
        this.user = user1;
        this.userList = loadUsers();
    }

    private List<User> loadUsers() {
        File users = new File(USERS_PATH);
        if (!users.exists()) {
            return new ArrayList<>();
        }

        try {
            return objectMapper.readValue(
                    users,
                    new TypeReference<List<User>>() {}
            );
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(user1 -> {
            return user1.getName().equalsIgnoreCase(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getPassword());
        }).findFirst();
        return foundUser.isPresent();
    }
    public boolean signUp(User user1) throws IOException {
        userList.add(user1);
        saveUserListToFile();
        return true;
    }

    private void saveUserListToFile() {
        try{
            File userFile = new File(USERS_PATH);
            objectMapper.writeValue(userFile, userList);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        // json --> object(user) --> Deserialize
        //object(user) --> json --> serialize
    }

}
