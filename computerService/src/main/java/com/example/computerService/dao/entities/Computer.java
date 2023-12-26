package com.example.computerService.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Pc;
    private String proce;
    private int ram;
    private int HardDrive;
    private float price;
    private String macAdress;
}
