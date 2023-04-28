/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Apresentacao.frmPrincipal;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.event.MouseInputAdapter;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author miche
 */
public class CentralizarJanela extends JInternalFrame
{

    private JComponent titlePane;

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

    public JInternalFrame NaoUltrapassarLimites(JInternalFrame jif, JDesktopPane jdkp)
    {
        frmPrincipal.redesenhar();
        
        if (jif.getLocation().y <= 0)
        {
            jif.setLocation(jif.getLocation().x, (int)(jif.getLocation().y + 0.000001f));
            jdkp.repaint();
        }

        return jif;
    }
}
