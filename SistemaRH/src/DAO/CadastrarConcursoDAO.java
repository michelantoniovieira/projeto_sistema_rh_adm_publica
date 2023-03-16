/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CadastrarConcursoDTO;
import DTO.CadastrarUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author miche
 */
public class CadastrarConcursoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public ResultSet verificarAntesDeCadastrar(CadastrarConcursoDTO objcadastrarconcursodto) {
        conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "SELECT * FROM concurso_publico WHERE numero_concurso = ? AND ano_concurso = ?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objcadastrarconcursodto.getNumero_Concurso());
            pstm.setInt(2, objcadastrarconcursodto.getAno_Concurso());

            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar CadastrarConcursoDAO" + erro);
            return null;
        }
    }

    public void CadastrarConcursoDAO(CadastrarConcursoDTO objcadastrarconcursodto) {
        String sql = "INSERT INTO concurso_publico (numero_concurso, ano_concurso, situacao_concurso, fk_matricula_responsavel_concurso, fk_codigo_banca) values (?,?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objcadastrarconcursodto.getNumero_Concurso());
            pstm.setInt(2, objcadastrarconcursodto.getAno_Concurso());
            pstm.setInt(3, objcadastrarconcursodto.getSituacao_Concurso());
            pstm.setInt(4, objcadastrarconcursodto.getFk_Matricula_Responsavel_Concurso());
            pstm.setInt(5, objcadastrarconcursodto.getFk_codigo_banca());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastrarConcursoDAO - Cadastrar" + erro);
        }
    }

    public void update(CadastrarConcursoDTO objcadastrarconcursodto) {
        String sql = "UPDATE concurso_publico SET  numero_concurso = ?, ano_concurso = ?, situacao_concurso = ?, fk_matricula_responsavel_concurso = ?, fk_codigo_banca = ? WHERE codigo_concurso = '" + objcadastrarconcursodto.getCodigo_concurso() + "'";
        conn = new ConexaoDAO().conectaBD();

        {
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1, objcadastrarconcursodto.getNumero_Concurso());
                pstm.setInt(2, objcadastrarconcursodto.getAno_Concurso());
                pstm.setInt(3, objcadastrarconcursodto.getSituacao_Concurso());
                pstm.setInt(4, objcadastrarconcursodto.getFk_Matricula_Responsavel_Concurso());
                pstm.setInt(5, objcadastrarconcursodto.getFk_codigo_banca());

                pstm.execute();
                pstm.close();
            } catch (SQLException erro) {
                erro.printStackTrace();
            } finally {
                ConexaoDAO.encerrarConexao(conn, pstm);
            }
        }
    }

    public void delete(CadastrarConcursoDTO objcadastrarconcursodto) {
        Connection conexao = ConexaoDAO.conectaBD();
        PreparedStatement stmt = null;
        {
            try {
                stmt = conexao.prepareStatement("DELETE from concurso_publico WHERE numero_concurso = '" + objcadastrarconcursodto.getNumero_Concurso() + "'");
                stmt.executeUpdate();
            } catch (SQLException erro) {
                erro.printStackTrace();
            } finally {
                ConexaoDAO.encerrarConexao(conexao, stmt);
            }
        }
    }

    public ArrayList<CadastrarConcursoDTO> botaoNavegacao() {
        Connection conexao = ConexaoDAO.conectaBD();
        PreparedStatement stmt = null;
        ArrayList<CadastrarConcursoDTO> objcadastrarconcursodto = new ArrayList<>();

        try {
            stmt = conexao.prepareStatement("SELECT * FROM concurso_publico");
            rs = stmt.executeQuery();
            while (rs.next()) {
                CadastrarConcursoDTO ccdto = new CadastrarConcursoDTO();
                ccdto.setCodigo_Concurso(rs.getInt("codigo_concurso"));
                ccdto.setNumero_Concurso(rs.getInt("numero_concurso"));
                ccdto.setAno_Concurso(rs.getInt("ano_concurso"));
                ccdto.setSituacao_Concurso(rs.getInt("situacao_concurso"));
                ccdto.setFk_Matricula_Responsavel_Concurso(rs.getInt("fk_matricula_responsavel_concurso"));
                ccdto.setFk_codigo_banca(rs.getInt("fk_codigo_banca"));
                objcadastrarconcursodto.add(ccdto);

            }
        } catch (SQLException erro) {
            erro.printStackTrace();
        } finally {
            ConexaoDAO.encerrarConexao(conexao, stmt, rs);
        }
        return objcadastrarconcursodto;
    }

}
