package br.ufg.inf.fs20211.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_hospede")
public class Hospede implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_hospede")
	private Integer idhospede;
	
	@Column(name="nm_hospede")
	private String nmhospede;
	
	@Column(name="dt_nascimento")
	private String dtnascimento;
	
	@Column(name="cpf")
	private Integer cpf;
	
	public Hospede() {
		super();
	}

	public Hospede(Integer idhospede, String nmhospede, String dtnascimento, Integer cpf) {
		super();
		this.idhospede = idhospede;
		this.nmhospede = nmhospede;
		this.dtnascimento = dtnascimento;
		this.cpf = cpf;
	}

	public Integer getIdhospede() {
		return idhospede;
	}

	public void setIdhospede(Integer idhospede) {
		this.idhospede = idhospede;
	}

	public String getNmhospede() {
		return nmhospede;
	}

	public void setNmhospede(String nmhospede) {
		this.nmhospede = nmhospede;
	}

	public String getDtnascimento() {
		return dtnascimento;
	}

	public void setDtnascimento(String dtnascimento) {
		this.dtnascimento = dtnascimento;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Hospede [idhospede=" + idhospede + ", nmhospede=" + nmhospede + ", dtnascimento=" + dtnascimento
				+ ", cpf=" + cpf + "]";
	}
	
}
