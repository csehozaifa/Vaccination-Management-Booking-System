package com.example.vaccineManagement.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "appointments")
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date appointmentDate;

    private LocalTime appointmentTime;

    @ManyToOne
    @JoinColumn
    private Doctor doctor; //is case me appointment child hai and doctor parent hai to parent and
    //child ko connect kar ne ke liye child me is tarah se likha jata hai

    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private User user;  //is case me appointment child hai and doctor parent hai to parent and
    //child ko connect kar ne ke liye child me is tarah se likha jata kar


}
