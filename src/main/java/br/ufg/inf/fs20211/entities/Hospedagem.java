package br.ufg.inf.fs20211.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_hospedagem")
public class Hospedagem implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_hospedagem")
	private Integer idhospedagem;
	
	@Column(name="id_quarto")
	private Quarto idquarto;
	
	@Column(name="id_hospede")
	private Hospede idhospede;
	
	@Column(name="dt_checkin")
	private String dtcheckin;
	
	@Column(name="dt_checkout")
	private String dtcheckout;
	
	public Hospedagem() {
		super();
	}

	public Hospedagem(Integer idhospedagem, Quarto idquarto, Hospede idhospede, String dtcheckin, String dtcheckout) {
		super();
		this.idhospedagem = idhospedagem;
		this.idquarto = idquarto;
		this.idhospede = idhospede;
		this.dtcheckin = dtcheckin;
		this.dtcheckout = dtcheckout;
	}

	public Integer getIdhospedagem() {
		return idhospedagem;
	}

	public void setIdhospedagem(Integer idhospedagem) {
		this.idhospedagem = idhospedagem;
	}

	public Quarto getIdquarto() {
		return idquarto;
	}

	public void setIdquarto(Quarto idquarto) {
		this.idquarto = idquarto;
	}

	public Hospede getIdhospede() {
		return idhospede;
	}

	public void setIdhospede(Hospede idhospede) {
		this.idhospede = idhospede;
	}

	public String getDtcheckin() {
		return dtcheckin;
	}

	public void setDtcheckin(String dtcheckin) {
		this.dtcheckin = dtcheckin;
	}

	public String getDtcheckout() {
		return dtcheckout;
	}

	public void setDtcheckout(String dtcheckout) {
		this.dtcheckout = dtcheckout;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Hospedagem [idhospedagem=" + idhospedagem + ", idquarto=" + idquarto + ", idhospede=" + idhospede
				+ ", dtcheckin=" + dtcheckin + ", dtcheckout=" + dtcheckout + "]";
	}
		
	
}
