package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="Contato")
public class Contato {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Type(type = "objectid")
	private String id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "idade")
	private Integer idade;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Telefone> telefones;
	
	public Contato(){}
	
	public Contato(String nome, Integer idade, List<Telefone> telefones) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.telefones = telefones;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
