/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import DTO.CadastrarCargoEmpregoDTO;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastrarCargoEmpregoValidacao extends CadastrarCargoEmpregoDTO
{

    String mensagem = "";

    public CadastrarCargoEmpregoValidacao(CadastrarCargoEmpregoDTO dto)
    {
        validar(dto);
    }

    public String validar(CadastrarCargoEmpregoDTO dto)
    {
        try
        {

        }
        catch (Exception ex)
        {
            List<String> camposVazios = new ArrayList<>();

            if (dto.getDescricaoCargoEmprego().isEmpty())
            {
                camposVazios.add("nome cargo/emprego");
            }

            if (dto.getCboCargoEmprego().isEmpty())
            {
                camposVazios.add("cbo");
            }

            if (dto.getRegimeJuridicoCargoEmprego().isEmpty())
            {
                camposVazios.add("regime jurídico");
            }

            // Exibir os campos sem informações
            if (!camposVazios.isEmpty())
            {
                mensagem = "Os seguintes campos estão sem informações:\n";
                for (String campo : camposVazios)
                {
                    mensagem += campo + "\n";
                }
                JOptionPane.showMessageDialog(null, mensagem, "Campos Vazios", JOptionPane.WARNING_MESSAGE);
            }
        }
        return mensagem;
    }

}
