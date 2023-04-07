package com.luna.hostel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_hospedagem")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Hospedagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataDeEntrada;

    private LocalDate dataDeSaida;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

}
