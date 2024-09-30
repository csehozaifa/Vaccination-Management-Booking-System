package com.example.vaccineManagement.Repository;

import com.example.vaccineManagement.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> { //ye jo integer hai wo
    //ye bata rha hota hai ki jo user table hai usme jo primary key hai uska data type kya hai
    //jaise is case me userId primary key hai

    //Just define the function to execute :
    User findByEmailId(String emailId);  //like this there are so many predifind function are there
    //just ew have to define them and we can use that function
    //prebuilt functions : and you can use it directly....

    //Imp thing is you have to define those functions....
}
