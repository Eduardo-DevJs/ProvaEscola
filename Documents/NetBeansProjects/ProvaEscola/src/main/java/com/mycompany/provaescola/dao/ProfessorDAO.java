package com.mycompany.provaescola.dao;

import com.mycompany.provaescola.conexao.Conexao;
import com.mycompany.provaescola.models.AlunoModel;
import com.mycompany.provaescola.models.ProfessorModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {
    public void criarProfessor(ProfessorModel pm) {
        String sql = "INSERT INTO professores (nome,disciplina,telefone,email,turma) VALUES (?,?,?,?,?)";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionMysql();
            ps = con.prepareStatement(sql);

            ps.setString(1, pm.getNome_professor());
            ps.setString(2, pm.getDisciplina());
            ps.setString(3, pm.getTelefone());
            ps.setString(4, pm.getEmail());
            ps.setString(5, pm.getTurma());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar professor (DAO) " + e);
        }
    }

    public List<ProfessorModel> mostraProfessor() {
        String sql = "SELECT * FROM professores";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        ArrayList<ProfessorModel> professores = new ArrayList<ProfessorModel>();

        try {
            con = Conexao.createConnectionMysql();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ProfessorModel pm = new ProfessorModel();

                pm.setId_professor(rs.getInt("id_professor"));
                pm.setNome_professor(rs.getString("nome"));
                pm.setDisciplina(rs.getString("disciplina"));
                pm.setTelefone(rs.getString("telefone"));
                pm.setEmail(rs.getString("email"));
                pm.setTurma(rs.getString("turma"));

                professores.add(pm);
            }

        } catch (Exception e) {
            System.out.println("Erro ao mostrar alunos (DAO) " + e);
        }

        return professores;
    }

    public void atualizarProfessor(ProfessorModel pm) {
        String sql = "UPDATE SET professores nome=?, disciplina=?, telefone=?, email=?, turma=? WHERE id_professor=?";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionMysql();
            ps = con.prepareStatement(sql);

            ps.setString(1, pm.getNome_professor());
            ps.setString(2, pm.getDisciplina());
            ps.setString(3, pm.getTelefone());
            ps.setString(4, pm.getEmail());
            ps.setString(5, pm.getTurma());

            ps.setInt(6, pm.getId_professor());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao atualizar professor (DAO) " + e);
        }
    }

    public void excluirAluno(int id) {
        String sql = "DELETE FROM professores WHERE id_professor";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionMysql();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.execute();
        } catch (Exception e) {
            System.out.println("Erro ao deletar professor (DAO) " + e);
        }
    }
}
