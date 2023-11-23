package com.example.viajes.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "viajes")
public class Viajes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Vi_NumeVuelta;

    // private int Vi_Placa;
    // private String Vi_codiRuta;
    private int Vi_NumePasajero;
    private String Vi_FechViaje;
    // private String Vi_CodiConduc;
    private String Vi_ValoPasaj;

    // Relaciones
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "Vi_Placa", referencedColumnName = "Bu_Placa")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Buses bus;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "Vi_CodiConduc", referencedColumnName = "Co_CodiConduc")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Conductores conductor;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "Vi_codiRuta", referencedColumnName = "Ru_CodiRuta")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Rutas ruta;
}