package com.example.vaccineManagement.Models;
import com.example.vaccineManagement.Enums.Gender;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "user_name")
    private String name;

    private int age;

    @Column(unique = true)
    private String emailId;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String mobileNo;

    @JsonIgnore
    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Dose dose; //the above two line is used for bidirectinal mapping? here in parent(user)
    // we are making the object of child(dose) class

    @JsonIgnore
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Appointment> appointmentList = new ArrayList<>(); //one user having of list
    //appointment to yha user and appointment me user(parent) hai and appointment(child) hai
    //to user parent hai to jo uper ki do line hai wo ye bat rahi hai ki kis tarahse parent
    //and child ko connect karte hai aur parent side me is tarah se likhte hai yha cascading
    //hui hai jo bhi chees parent me karenge wo automatically child me ho jai gi

}
