/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;
import javax.swing.JInternalFrame;

/**
 *
 * @author miche
 * @param <frm>
 */
public interface MetodosComunsParaTodosOsJIF<frm>
{
    public List<Integer> gerenciadorNavegacao(String acao);
    
    public String getCodigo();
    
    public void desativarCampos();
    
    public void ativarCampos();
    
    public void cadastrar(frm frm);
}
