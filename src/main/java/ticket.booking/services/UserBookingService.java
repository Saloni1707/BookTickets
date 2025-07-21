package main.java.ticket.booking.services;

import main.java.ticket.booking.entities.User;

import java.io.File;

public class UserBookingService {
    private User user;
    private List<User> userList;

    private OBJECT_MAPPER ObjectMapper = new ObjectMapper();
    private static final String USERS_PATH = "../localDb/users.json";
    public UserBookingService(User user1) throws IOException{
        this.user = user1;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users,new TypeReference<List<User>>(){});
        

    }

}
