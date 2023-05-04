/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author miche
 */
public class DefinirTamanhoMaximoCampoDeTexto extends PlainDocument
{

    private int tamanhoMaximo;

    public DefinirTamanhoMaximoCampoDeTexto(int tamanhoMaximo)
    {
        this.tamanhoMaximo = tamanhoMaximo;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException
    {
        if (getLength() + str.length() <= tamanhoMaximo)
        {
            super.insertString(offs, str, a);
        }
    }
}
