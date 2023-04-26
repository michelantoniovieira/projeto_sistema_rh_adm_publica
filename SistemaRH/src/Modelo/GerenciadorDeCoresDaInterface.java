/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Color;
import java.awt.Panel;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author miche
 */
public class GerenciadorDeCoresDaInterface
{

    private String menuItem = "#cbdad5";
    private String menuBarra = "#bfd6c7";
    private String cabecalho = "#cee1d8";
    private String corpo = "#efece2";
    private String rodape = "#cee1d8";

    public GerenciadorDeCoresDaInterface()
    {

    }

    public void definirCorMenuDeBarra(JMenuBar mn)
    {
        mn.setBackground(Color.decode(menuBarra));
    }

    public void definirCorMenuItem(ArrayList<JMenuItem> mn)
    {
        for (int i = 0; i < mn.size(); i++)
        {
            mn.get(i).setBackground(Color.decode(menuItem));
        }
    }

    public void definirCorCabecalho(JDesktopPane jdp, Panel pn)
    {
        jdp.setBackground(Color.decode(cabecalho));
        pn.setBackground(Color.decode(cabecalho));
    }

    public void definirCorCorpo(JDesktopPane jdp)
    {
        jdp.setBackground(Color.decode(corpo));
    }

    public void definirCorRodape(JDesktopPane jdp, JPanel pn)
    {
        jdp.setBackground(Color.decode(cabecalho));
        pn.setBackground(Color.decode(cabecalho));
    }
}
