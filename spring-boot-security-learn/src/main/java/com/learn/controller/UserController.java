package com.learn.controller;

import com.learn.models.User;
import com.learn.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")      // create end point
public class UserController
{
    @Autowired // use the autowired annotations becuse create object ans call object automatacally
    private UserServices userServices;
  // get all user
  @GetMapping
   public List<User> getAllUser() {
      return this.userServices.getAllUsers();
  }
   // return single user
    @GetMapping("/{username}")
   public User getUser( @PathVariable("username") String username)
   {
      return this.userServices.getUser(username);
   }

   public User add(User user){
      return this.userServices.addUser(user);
   }

}
