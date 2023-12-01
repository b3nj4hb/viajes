package com.example.viajes.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "flota")
public class Flota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Fl_CodiFlot;

    private String Fl_NombFlot;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "Fl_CodiTerm", referencedColumnName = "Te_CodTerm")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Terminal Fl_CodiTerm;

    // Relaciones
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "Bu_CodiFlot")
    @JsonIgnore
    private List<Buses> bus = new ArrayList<>();
}