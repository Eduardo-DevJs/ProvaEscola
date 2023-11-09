package com.mycompany.provaescola.controller;

import com.mycompany.provaescola.dao.AlunoDAO;
import com.mycompany.provaescola.dao.ProfessorDAO;
import com.mycompany.provaescola.models.AlunoModel;
import com.mycompany.provaescola.models.ProfessorModel;

public class ProfessorController {

    public boolean CadastroProfessor(String nome, String discplina, String telefone, String email, String turma) {
        if (nome != null && nome.length() > 0 && discplina != null && discplina.length() > 0 && telefone != null && telefone.length() > 0 && email != null && email.length() > 0) {
            ProfessorModel pm = new ProfessorModel(nome,discplina , telefone, email, turma);
            ProfessorDAO pdao = new ProfessorDAO();
            pdao.criarProfessor(pm);
            return true;
        }
        return false;
    }

    public boolean EditarProfessor(String nome, String discplina, String telefone, String email, String turma) {
       if (nome != null && nome.length() > 0 && discplina != null && discplina.length() > 0 && telefone != null && telefone.length() > 0 && email != null && email.length() > 0) {
            ProfessorModel pm = new ProfessorModel(nome,discplina , telefone, email, turma);
            ProfessorDAO pdao = new ProfessorDAO();
            pdao.atualizarProfessor(pm);
            return true;
        }
        return false;
    }
}
