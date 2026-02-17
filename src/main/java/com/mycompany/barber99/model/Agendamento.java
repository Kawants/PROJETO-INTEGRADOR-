package com.mycompany.barber99.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "agendamentos")
public class Agendamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String cliente;
    private String servico;
    private String dataHora;

    // Construtores, Getters e Setters
    public Agendamento() {}
    public Long getId() { return id; }
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public String getServico() { return servico; }
    public void setServico(String servico) { this.servico = servico; }
    public String getDataHora() { return dataHora; }
    public void setDataHora(String dataHora) { this.dataHora = dataHora; }
}