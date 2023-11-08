package com.mycompany.provaescola.controller;

import com.mycompany.provaescola.dao.AlunoDAO;
import com.mycompany.provaescola.models.AlunoModel;

public class AlunoController {

    public boolean CadastroAluno(String nome, int idade, String matricula, String telefone, String turma) {
        if (nome != null && nome.length() > 0 && idade > 0 && telefone != null && matricula != null && matricula.length() > 0 && turma != null && turma.length() > 0) {
            AlunoModel am = new AlunoModel(nome, idade, matricula, telefone, turma);
            AlunoDAO adao = new AlunoDAO();
            adao.criarAluno(am);
            return true;
        }
        return false;
    }

    public boolean EditarAluno(String nome, int idade, String matricula, String telefone, String turma) {
        if (nome != null && nome.length() > 0 && idade > 0 && telefone != null && matricula != null && matricula.length() > 0 && turma != null && turma.length() > 0) {
            AlunoModel am = new AlunoModel(nome, idade, matricula, telefone, turma);
            AlunoDAO adao = new AlunoDAO();
            adao.atulizarAluno(am);
            return true;
        }
        return false;
    }
}
