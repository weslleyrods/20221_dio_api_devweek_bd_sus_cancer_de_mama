package com.dio_class.devweek.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Regiao {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) //gera valores de Id automaticamente sempre que a info for inserida no banco de dados
	@Column(nullable = false)
	private Long Id;
	private String regiao;
	private Long qnt_exames;
	
	public Regiao(String regiao, Long qnt_exames) {
		super();
		this.regiao = regiao;
		this.qnt_exames = qnt_exames;
	} 
	
	public Regiao() {}

	public Long getId() {
		return Id;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public Long getQnt_exames() {
		return qnt_exames;
	}

	public void setQnt_exames(Long qnt_exames) {
		this.qnt_exames = qnt_exames;
	}
	
	

}
