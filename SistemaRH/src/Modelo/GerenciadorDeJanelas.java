/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author miche
 */
public class GerenciadorDeJanelas
{

    String title;
    boolean temSeparador = false;
    static int contador = 1;

    public void gerenciadorJanela(JInternalFrame janela, JDesktopPane jdp, JMenu mn, JMenuItem fecharJanelas)
    {

        adicionarSeparadorNoMenu(mn);
        adicionarJiFrameNoMenu(janela, mn, fecharJanelas, jdp);
        fecharTodasAsJanelasDoMenu(janela, mn, fecharJanelas, jdp);

    }

    public void adicionarSeparadorNoMenu(JMenu menuJanelas)
    {

        //verifica se ja existe um separador na janela
        Component[] componentes = menuJanelas.getMenuComponents();
        for (Component componente : componentes)
        {
            if (componente instanceof JSeparator)
            {
                temSeparador = true;
                break;
            }
        }

        //Se não houver separador cria um
        if (temSeparador == false)
        {
            menuJanelas.addSeparator();
        }
    }

    private void adicionarJiFrameNoMenu(final JInternalFrame frame, JMenu menuJanelas, JMenuItem fecharJanelas, JDesktopPane jdp)
    {
        title = contador++ + " - " + frame.getTitle();
        System.out.println(title);

        for (int i = 0; i < menuJanelas.getMenuComponentCount(); i++)
        {
            Component componentes = menuJanelas.getMenuComponent(i);
            if (componentes instanceof JMenuItem)
            {
                JMenuItem menuItem = (JMenuItem) menuJanelas.getMenuComponent(i);

                if (menuItem.getText().equals(title))
                {
                    return;
                }
            }
        }

        //focar na janela clicada
        JMenuItem menuItem = new JMenuItem(title);

        //adiciona o nome da janela aberta no menu
        menuJanelas.add(menuItem);

        menuItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    frame.setSelected(true);
                }
                catch (PropertyVetoException ex)
                {
                    ex.printStackTrace();
                }
            }
        });

        // adiciona ouvinte de eventos para remover item do menu quando a janela é fechada
        frame.addInternalFrameListener(new InternalFrameAdapter()
        {
            @Override
            public void internalFrameClosed(InternalFrameEvent e)
            {
                menuJanelas.remove(menuItem);
                contador = contador - 1;
            }
        });
    }

    private void fecharTodasAsJanelasDoMenu(JInternalFrame janela, JMenu menuJanelas, JMenuItem fecharJanelas, JDesktopPane jdp)
    {
        //fechar todas as janelas ao clicar no item fechar todas as janelas
        fecharJanelas.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //fechar janelas abertas
                for (JInternalFrame jif : jdp.getAllFrames())
                {
                    jif.dispose();
                    jdp.removeAll();
                    jdp.repaint();
                    contador = 1;
                }
            }
        });
    }

}
