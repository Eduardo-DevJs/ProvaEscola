package com.mycompany.provaescola.dao;

import com.mycompany.provaescola.conexao.Conexao;
import com.mycompany.provaescola.models.AlunoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    public void criarAluno(AlunoModel alunoModelModel) {
        String sql = "INSERT INTO alunos (nome,idade,matricula,telefone,turma) VALUES (?,?,?,?,?)";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionMysql();
            ps = con.prepareStatement(sql);

            ps.setString(1, alunoModelModel.getNome());
            ps.setInt(2, alunoModelModel.getIdade());
            ps.setString(3, alunoModelModel.getMatricula());
            ps.setString(4, alunoModelModel.getTelefone());
            ps.setString(5, alunoModelModel.getTurma());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar aluno (DAO) " + e);
        }
    }

    public List<AlunoModel> mostraAlunos() {
        String sql = "SELECT * FROM alunos";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        ArrayList<AlunoModel> alunos = new ArrayList<AlunoModel>();

        try {
            con = Conexao.createConnectionMysql();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                AlunoModel alunoModel = new AlunoModel();

                alunoModel.setId_aluno(rs.getInt("id_aluno"));
                alunoModel.setNome(rs.getString("nome"));
                alunoModel.setIdade(rs.getInt("idade"));
                alunoModel.setMatricula(rs.getString("matricula"));
                alunoModel.setTelefone(rs.getString("telefone"));
                alunoModel.setTurma(rs.getString("turma"));

                alunos.add(alunoModel);
            }

        } catch (Exception e) {
            System.out.println("Erro ao mostrar alunos (DAO) " + e);
        }

        return alunos;
    }

    public void atulizarAluno(AlunoModel alunoModel) {
        String sql = "UPDATE SET alunos nome=?, idade=?, matricula=?, telefone=?, turma=? WHERE id_aluno=?";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionMysql();
            ps = con.prepareStatement(sql);

            ps.setString(1, alunoModel.getNome());
            ps.setInt(2, alunoModel.getIdade());
            ps.setString(3, alunoModel.getMatricula());
            ps.setString(4, alunoModel.getTelefone());

            ps.setInt(5, alunoModel.getId_aluno());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao atualizar alunos (DAO) " + e);
        }
    }

    public void excluirAluno(int id) {
        String sql = "DELETE FROM alunos WHERE id_aluno";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionMysql();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.execute();
        } catch (Exception e) {
            System.out.println("Erro ao deletar aluno (DAO) " + e);
        }
    }
}
