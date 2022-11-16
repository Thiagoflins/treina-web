package com.api.treinaRecifeWeb.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Leads {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int idLead;
    private String nomeLead;
    private String telefoneLead;
    private Date dataDeCadastro;
    private String status;
    private Date dataNovoContato;
    private String observacao;

    public Leads() {

    }
    
    public Leads(int idLedad, String nomeLead, String telefoneLead, Date dataDeCadastro, String status, Date dataNovoContato,
            String observacao) {
        this.idLead = idLedad;
        this.nomeLead = nomeLead;
        this.telefoneLead = telefoneLead;
        this.dataDeCadastro = dataDeCadastro;
        this.status = status;
        this.dataNovoContato = dataNovoContato;
        this.observacao = observacao;
    }

    public int getIdLead() {
       return idLead;
    }
    public void setIdLead(int idLead) {
        this.idLead = idLead;
    }
    public String getNomeLead() {
        return nomeLead;
    }
    public void setNomeLead(String nomeLead) {
        this.nomeLead = nomeLead;
    }
    public String getTelefoneLead() {
        return telefoneLead;
    }
    public void setTelefoneLead(String telefoneLead) {
        this.telefoneLead = telefoneLead;
    }
    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }
    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getDataNovoContato() {
        return dataNovoContato;
    }
    public void setDataNovoContato(Date dataNovoContato) {
        this.dataNovoContato = dataNovoContato;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
}
