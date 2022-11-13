package com.api.treinaRecifeWeb.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Curso {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public static Integer idCurso;
    String nomeCurso;
    float chAula;
    float chTotal;
    String turno;
    float valor;
    Integer seg;
    Integer ter;
    Integer qua;
    Integer qui;
    Integer sex;
    Integer sab;
    
    public Curso(String nomeCurso, float chAula, float chTotal, String turno, float valor, Integer seg, Integer ter,
            Integer qua, Integer qui, Integer sex, Integer sab) {
        this.nomeCurso = nomeCurso;
        this.chAula = chAula;
        this.chTotal = chTotal;
        this.turno = turno;
        this.valor = valor;
        this.seg = seg;
        this.ter = ter;
        this.qua = qua;
        this.qui = qui;
        this.sex = sex;
        this.sab = sab;
    }

    public static Integer getIdCurso() {
        return idCurso;
    }
    public static void setIdCurso(Integer idCurso) {
        Curso.idCurso = idCurso;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public float getChAula() {
        return chAula;
    }
    public void setChAula(float chAula) {
        this.chAula = chAula;
    }
    public float getChTotal() {
        return chTotal;
    }
    public void setChTotal(float chTotal) {
        this.chTotal = chTotal;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Integer getSeg() {
        return seg;
    }
    public void setSeg(Integer seg) {
        this.seg = seg;
    }
    public Integer getTer() {
        return ter;
    }
    public void setTer(Integer ter) {
        this.ter = ter;
    }
    public Integer getQua() {
        return qua;
    }
    public void setQua(Integer qua) {
        this.qua = qua;
    }
    public Integer getQui() {
        return qui;
    }
    public void setQui(Integer qui) {
        this.qui = qui;
    }
    public Integer getSex() {
        return sex;
    }
    public void setSex(Integer sex) {
        this.sex = sex;
    }
    public Integer getSab() {
        return sab;
    }
    public void setSab(Integer sab) {
        this.sab = sab;
    }
    
}
