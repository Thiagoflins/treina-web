package com.api.treinaRecifeWeb.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Leads {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public static Integer idLead;
    String nomeLead;
    String telefoneLead;
    Date dataDeCadastro;
    String status2;
    Date dataNovoContato;
    String observacao;
    
    public Leads(String nomeLead, String telefoneLead, Date dataDeCadastro, String status2, Date dataNovoContato,
            String observacao) {
        this.nomeLead = nomeLead;
        this.telefoneLead = telefoneLead;
        this.dataDeCadastro = dataDeCadastro;
        this.status2 = status2;
        this.dataNovoContato = dataNovoContato;
        this.observacao = observacao;
    }

    public static Integer getIdLead() {
        return idLead;
    }
    public static void setIdLead(Integer idLead) {
        Leads.idLead = idLead;
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
    public String getStatus2() {
        return status2;
    }
    public void setStatus2(String status2) {
        this.status2 = status2;
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
