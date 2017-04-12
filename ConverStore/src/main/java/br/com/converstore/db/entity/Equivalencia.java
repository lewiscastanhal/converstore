package br.com.converstore.db.entity;
// Generated 11/04/2017 17:48:48 by Hibernate Tools 5.2.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Equivalencia generated by hbm2java
 */
@Entity
@Table(name = "equivalencia", schema = "public")
public class Equivalencia implements java.io.Serializable {

	private int cdequivalencia;
	private String dsequivalencia;
	private Date dtcadastro;

	public Equivalencia() {
	}

	public Equivalencia(int cdequivalencia) {
		this.cdequivalencia = cdequivalencia;
	}

	public Equivalencia(int cdequivalencia, String dsequivalencia, Date dtcadastro) {
		this.cdequivalencia = cdequivalencia;
		this.dsequivalencia = dsequivalencia;
		this.dtcadastro = dtcadastro;
	}

	@Id

	@Column(name = "cdequivalencia", unique = true, nullable = false)
	public int getCdequivalencia() {
		return this.cdequivalencia;
	}

	public void setCdequivalencia(int cdequivalencia) {
		this.cdequivalencia = cdequivalencia;
	}

	@Column(name = "dsequivalencia", length = 500)
	public String getDsequivalencia() {
		return this.dsequivalencia;
	}

	public void setDsequivalencia(String dsequivalencia) {
		this.dsequivalencia = dsequivalencia;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dtcadastro", length = 13)
	public Date getDtcadastro() {
		return this.dtcadastro;
	}

	public void setDtcadastro(Date dtcadastro) {
		this.dtcadastro = dtcadastro;
	}

}