/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Apresentacao.frmPrincipal;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;

/**
 *
 * @author miche
 */
public class CentralizarJanela
{

    public JInternalFrame CentralizarJInternalFrame(JInternalFrame frame)
    {

        //codigo para centralizar janela na tela
        //pega o tamanho da tela
        Dimension dimensoesTela = Toolkit.getDefaultToolkit().getScreenSize();
        //calcula a largura da tela
        double larguraTela = dimensoesTela.getWidth();
        //descobre a metade da tela - largura do jframe, para nao acontecer de ficar a posição 0,0 centralizada.
        int metadeLargura = (int) larguraTela / 2 - frame.getWidth() / 2;

        frame.setLocation(metadeLargura, 0);

        return frame;
    }

    public JInternalFrame NaoUltrapassarLimites(JInternalFrame frame)
    {
        frmPrincipal.redesenhar();
        //codigo para centralizar janela na tela
        //pega o tamanho da tela
        Point location = frame.getLocation();

        // Obter o tamanho da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();

        int x = location.x;
        int y = location.y;

        if (x <= 0)
        {
            x = (int) (x + 0.001f);
            frame.setLocation(x, y);
        }
        else if (x + frame.getWidth() > screenWidth)
        {
            x = (int)(screenWidth - frame.getWidth() - 0.001f);
            frame.setLocation(x, y);
        }

        return frame;
    }
}
