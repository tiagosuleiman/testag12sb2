package com.suleiman.spring.files.upload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agente")
public class Agente {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

    @Column(name = "codigo")
	private long codigo;

	@Column(name = "data")
	private String data;

    @Column(name = "sigla")
	private String sigla;

    @Column(name = "geracao")
	private String geracao;

    @Column(name = "compra")
	private String compra;
    
    public Agente(){}

    public Agente(Long codigo, String data, String sigla, String geracao, String compra) {
        this.codigo = codigo;
		this.data = data;
        this.sigla = sigla;
        this.geracao = geracao;
        this.compra = compra;
	}


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getGeracao() {
        return this.geracao;
    }

    public void setGeracao(String geracao) {
        this.geracao = geracao;
    }

    public String getCompra() {
        return this.compra;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }
    

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", data='" + getData() + "'" +
            ", sigla='" + getSigla() + "'" +
            ", geracao='" + getGeracao() + "'" +
            ", compra='" + getCompra() + "'" +
            "}";
    }

}
