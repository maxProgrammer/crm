package com.api.crm.apicrm.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_CLIENTE")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;

}
