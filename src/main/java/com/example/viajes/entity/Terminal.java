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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "terminal")
public class Terminal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Te_CodTerm;

    private String Te_DireTerm;
    private String Te_NombTerm;

    // Relaciones
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "Fl_CodiTerm")
    @JsonIgnore
    private List<Flota> flota = new ArrayList<>();
}