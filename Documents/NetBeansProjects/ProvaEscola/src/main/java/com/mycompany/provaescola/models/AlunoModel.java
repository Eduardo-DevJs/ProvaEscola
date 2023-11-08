
package com.mycompany.provaescola.models;


public class AlunoModel {
    private int id_aluno;
    private String nome;
    private int idade;
    private String matricula;
    private String telefone;
    private String turma;

    public AlunoModel() {
    }
    
    

    public AlunoModel(int id_aluno, String nome, int idade, String matricula, String telefone) {
        this.id_aluno = id_aluno;
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.telefone = telefone;
    }

    public AlunoModel(String nome, int idade, String matricula, String telefone, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.telefone = telefone;
        this.turma = turma;
    }
    
   

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
    
}
