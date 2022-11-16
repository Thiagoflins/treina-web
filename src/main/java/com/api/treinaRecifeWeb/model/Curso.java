package com.api.treinaRecifeWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.hql.internal.ast.tree.IdentNode;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idCurso;
    private String nomeCurso;
    private float chAula;
    private float chTotal;
    private String turno;
    private float valor;
    private int seg;
    private int ter;
    private int qua;
    private int qui;
    private int sex;
    private int sab;

    public Curso() {

    }

    public Curso(int idcurso, String nomeCurso, float chAula, float chTotal, String turno, float valor, int seg, int ter,
            int qua, int qui, int sex, int sab) {
        this.idCurso = idCurso;
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

    public int getIdCurso() {
        return idCurso;
    }
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
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
    public int getSeg() {
        return seg;
    }
    public void setSeg(int seg) {
        this.seg = seg;
    }
    public int getTer() {
        return ter;
    }
    public void setTer(int ter) {
        this.ter = ter;
    }
    public int getQua() {
        return qua;
    }
    public void setQua(int qua) {
        this.qua = qua;
    }
    public int getQui() {
        return qui;
    }
    public void setQui(int qui) {
        this.qui = qui;
    }
    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public int getSab() {
        return sab;
    }
    public void setSab(int sab) {
        this.sab = sab;
    }   
}
