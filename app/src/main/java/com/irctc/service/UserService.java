package com.irctc.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.irctc.model.Train;
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

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final String USERS_PATH = "../LocalDb/users.json";

    public UserService(User user1) throws IOException {
        this.user = user1;
        loadUser();
    }

    public UserService() throws IOException {
        loadUser();
    }

    public List<User> loadUser() throws IOException {
        File file = new File(USERS_PATH);
        userList = objectMapper.readValue(file, new TypeReference<List<User>>() {
        });
        return userList;
    }

    public List<User> loginUser() {
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

    public boolean getUser(){
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

    public List<Train> getTrains(String source, String destination) throws IOException {

        TrainService trainService = new TrainService();
        return trainService.searchTrains(source, destination);

    }

    public List<List<Integer>> fetchSeats(Train train) {
        return train.getSeats();
    }

    public Boolean bookTrainSeat(Train train, int row, int col) {
        try{
            TrainService trainService = new TrainService();
            List<List<Integer>> seats = train.getSeats();
            if(row>=0 && row<seats.size() && col>=0 && col<seats.get(row).size()) {
                if (seats.get(row).get(col) == 0) {
                    seats.get(row).set(col, 1);
                    train.setSeats(seats);
                    trainService.addTrain(train);
                    return true; // Booking successful
                } else {
                    return false; // Seat is already booked
                }
            }
            else
            {
                return false;
            }
        }
        catch (IOException e) {
            return Boolean.FALSE;
        }
    }
}
