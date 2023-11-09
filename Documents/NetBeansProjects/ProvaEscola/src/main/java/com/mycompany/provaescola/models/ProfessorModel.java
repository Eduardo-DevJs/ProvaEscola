package com.mycompany.provaescola.models;

public class ProfessorModel {

    private int id_professor;
    private String nome_professor;
    private String disciplina;
    private String telefone;
    private String email;
    private String turma;

    public ProfessorModel() {
    }

    public ProfessorModel(int id_professor, String nome_professor, String disciplina, String telefone, String email) {
        this.id_professor = id_professor;
        this.nome_professor = nome_professor;
        this.disciplina = disciplina;
        this.telefone = telefone;
        this.email = email;
    }

    public ProfessorModel(String nome_professor, String disciplina, String telefone, String email, String turma) {
        this.nome_professor = nome_professor;
        this.disciplina = disciplina;
        this.telefone = telefone;
        this.email = email;
        this.turma = turma;

    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
}
