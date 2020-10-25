package br.com.iclass.mvc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class AventuraPersonagem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "aventura_id")
	private Aventura aventura;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "personagem_id")
	private Personagem personagem;
	
	@Min(0)
	private int XPpersonagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aventura getAventura() {
		return aventura;
	}

	public void setAventura(Aventura aventura) {
		this.aventura = aventura;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public int getXPpersonagem() {
		return XPpersonagem;
	}

	public void setXPpersonagem(int xPpersonagem) {
		XPpersonagem = xPpersonagem;
	}
	
	@Override
	public String toString() {
		return "AventuraPersonagem{"
				+ "Id: " + getId() +
				"Personagem: " + personagem.getNome() +
				"Aventura: " + aventura.getDetalhe() +
				"XP Personagem: " + getXPpersonagem();
	}
}
