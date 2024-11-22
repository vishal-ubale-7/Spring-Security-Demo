package com.learn.services;
import com.learn.models.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices
{
    List<User> list =new ArrayList<>();

    public UserServices() {
        list.add(new User("Vishal Ubale","Pass@7775","vishalubale2019@gmail.com"));
        list.add(new User("Varad Patil","Pass@123","varad1@gmail.com"));
    }

    //get all users
    public List<User> getAllUsers()
    {
        return this.list;
    }
    // get single user
    public User getUser(String username)
    {
        return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
    }

    // add new user
    public User addUser(User user)
    {
      this.list.add(user);
      return user;
    }
}


