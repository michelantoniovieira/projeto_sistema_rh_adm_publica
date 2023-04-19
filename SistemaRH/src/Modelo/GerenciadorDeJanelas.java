/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author miche
 */
public class GerenciadorDeJanelas
{

    private Set<String> frameTitles = new HashSet<>();
    String title;

    public void gerenciadorJanela(JDesktopPane jdp, JMenu mn)
    {
        JInternalFrame[] janelas = jdp.getAllFrames();

        for (JInternalFrame janela : janelas)
        {
            adicionarJiFrameNoMenu(janela, mn);
        }
    }

    private void adicionarJiFrameNoMenu(final JInternalFrame frame, JMenu menuJanelas)
    {
        title = frame.getTitle();
        if (frameTitles.contains(title))
        {
            System.out.println("Título já adicionado: " + title); // adicionado para fins de debug
            return; // título já adicionado, retorna sem adicionar ao menu
        }
        else
        {
            frameTitles.add(title); // adiciona título ao set de títulos
            for (int i = 0; i < menuJanelas.getMenuComponentCount(); i++)
            {
                JMenuItem menuItem = (JMenuItem) menuJanelas.getMenuComponent(i);
                if (menuItem.getText().equals(title))
                {
                    return; // título já adicionado, retorna sem adicionar ao menu
                }
            }
            JMenuItem menuItem = new JMenuItem(title);
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
            menuJanelas.add(menuItem);

            // adiciona ouvinte de eventos para remover item do menu quando a janela é fechada
            frame.addInternalFrameListener(new InternalFrameAdapter()
            {
                @Override
                public void internalFrameClosed(InternalFrameEvent e)
                {
                    menuJanelas.remove(menuItem);
                    frameTitles.remove(title);
                }
            });
        }
    }

}
