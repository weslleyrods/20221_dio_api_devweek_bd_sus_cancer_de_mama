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
	private Long total_exames;
	
	public Regiao(String regiao, Long total_exames) {
		super();
		this.regiao = regiao;
		this.total_exames = total_exames;
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

	public Long getTotal_exames() {
		return total_exames;
	}

	public void setTotal_exames(Long total_exames) {
		this.total_exames = total_exames;
	}
	
	

}
