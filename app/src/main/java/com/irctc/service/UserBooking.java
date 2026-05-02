package com.irctc.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.irctc.model.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserBooking {

    private User user;
    private List<User> userList;

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String USERS_PATH = "../LocalDb/users.json";

    public UserBooking(User user) {
        this.user = user;
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
}
