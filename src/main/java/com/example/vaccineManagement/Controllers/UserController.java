package com.example.vaccineManagement.Controllers;


import com.example.vaccineManagement.Dtos.RequestDtos.UpdateEmailDto;
import com.example.vaccineManagement.Models.User;
import com.example.vaccineManagement.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController
{

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){

        return userService.addUser(user);
    }

    @GetMapping("/getVaccinationDate")
    public Date getVaccinationDate(@RequestParam("userId")Integer userId){
        return userService.getVaccDate(userId);
    }

    @PutMapping("/updateEmail")
    public String updateEmail(@RequestBody UpdateEmailDto updateEmailDto){ //ager UpdateEmailDto nahi
        //ho ta to hum ko user ki email ko update karne ke liye as a request hum ko sari detail send
        //karni padti lekin dto ka ye faida hua ki hum ko only dto ka object bana kar send karna pda
        //aur kam ho jata hai

        return userService.updateEmail(updateEmailDto);
    }

    @GetMapping("/getByEmail/{emailId}")
    public User getUserByEmail(@PathVariable("emailId")String email){

        return userService.getUserByEmail(email);
    }

}




















