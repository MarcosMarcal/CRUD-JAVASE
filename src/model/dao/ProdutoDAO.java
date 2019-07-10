/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import con.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;

/**
 *
 * @author marcal
 */
public class ProdutoDAO {

    public void create(Produto p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produto (descricao,fornecedor,precoOrig,precoFin,qnt,limite,medida) VALUES (?,?,?,?,?,?,?)");
            stmt.setString(1, p.getDescricao());
            stmt.setString(2, p.getFornecedor());
            stmt.setFloat(3, p.getPrecoOrig());
            stmt.setFloat(4, p.getPrecoFin());
            stmt.setInt(5, p.getQnt());
            stmt.setInt(6, p.getLimite());
            stmt.setString(7, p.getMedida());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar novo produto!");
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt);

        }

    }

    public List<Produto> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList();

        try {
            stmt = con.prepareStatement("select * from produto");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setDescricao(rs.getString("descricao"));
                p.setFornecedor(rs.getString("fornecedor"));
                p.setPrecoOrig(rs.getFloat("precoOrig"));
                p.setPrecoFin(rs.getFloat("precoFin"));
                p.setLimite(rs.getInt("limite"));
                p.setMedida(rs.getString("medida"));
                p.setQnt(rs.getInt("qnt"));

                produtos.add(p);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt, rs);
            return produtos;

        }

    }
    public List<Produto> readLike(String pFind) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList();

        try {
            stmt = con.prepareStatement("select * from produto where descricao like ?");
            stmt.setString(1, "%"+pFind+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setDescricao(rs.getString("descricao"));
                p.setFornecedor(rs.getString("fornecedor"));
                p.setPrecoOrig(rs.getFloat("precoOrig"));
                p.setPrecoFin(rs.getFloat("precoFin"));
                p.setLimite(rs.getInt("limite"));
                p.setMedida(rs.getString("medida"));
                p.setQnt(rs.getInt("qnt"));

                produtos.add(p);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            ConnectionFactory.closeConnection(con, stmt, rs);
            return produtos;

        }

    }
    
    public void update(Produto p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produto SET descricao = ?, fornecedor = ?, precoOrig = ?, precoFin = ?, qnt = ?, limite = ?, medida = ? WHERE id = ?");
            stmt.setString(1, p.getDescricao());
            stmt.setString(2, p.getFornecedor());
            stmt.setFloat(3, p.getPrecoOrig());
            stmt.setFloat(4, p.getPrecoFin());
            stmt.setInt(5, p.getQnt());
            stmt.setInt(6, p.getLimite());
            stmt.setString(7, p.getMedida());
            stmt.setInt(8, p.getId());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto atualizado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar um produto!");
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
        
    }
    
    public void delete(Produto p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE id = ?");
            stmt.setInt(1, p.getId());
            
            stmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
            
        }
        
        
        
    }
    
    
    

}
