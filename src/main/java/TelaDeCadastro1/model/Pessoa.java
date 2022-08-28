package TelaDeCadastro1.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name="seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
	private Long id;
	
	private String nome;
	private String email;
	private String Nivel;
	private String experiencia;
	private String formacao;
	private int idade;
	private double salario;
	private String rede_social;
	private byte[] curriculo;
	
	
	public byte[] getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(byte[] curriculo) {
		this.curriculo = curriculo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getRede_social() {
		return rede_social;
	}
	public void setRede_social(String rede_social) {
		this.rede_social = rede_social;
	}
	public String getNivel() {
		return Nivel;
	}
	public void setNivel(String nivel) {
		Nivel = nivel;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
}
