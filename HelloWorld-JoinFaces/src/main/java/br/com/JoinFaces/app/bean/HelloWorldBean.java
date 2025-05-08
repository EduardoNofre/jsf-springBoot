package br.com.JoinFaces.app.bean;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("helloWorldBean")
@RequestScoped
public class HelloWorldBean {
    private String nome;

    public String saudacao() {
    	return "Nome recebido: " + nome + "!";
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
