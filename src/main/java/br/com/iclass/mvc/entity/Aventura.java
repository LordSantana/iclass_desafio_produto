package br.com.iclass.mvc.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Aventura {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 private String detalhe;

	@CreationTimestamp
	private LocalDateTime data;
	
	@Min(0)
	private int XP;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public int getXP() {
		return XP;
	}

	public void setXP(int xP) {
		XP = xP;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}
	
	public Aventura() {
	
	}
	
	public Aventura(String detalhe, int XP) {
		this.detalhe = detalhe;
		this.XP = XP;
	}
	
}
