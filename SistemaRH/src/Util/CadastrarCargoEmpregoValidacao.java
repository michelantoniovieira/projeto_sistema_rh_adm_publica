package Util;

import DTO.CadastrarCargoEmpregoDTO;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastrarCargoEmpregoValidacao extends CadastrarCargoEmpregoDTO
{

    private String mensagem = "";

    public CadastrarCargoEmpregoValidacao(CadastrarCargoEmpregoDTO dto)
    {
        validar(dto);
    }

    public final void validar(CadastrarCargoEmpregoDTO dto)
    {
        List<String> camposVazios = new ArrayList<>();

        if (dto.getDescricaoCargoEmprego().isEmpty())
        {
            camposVazios.add("nome cargo/emprego");
        }

        if (dto.getCboCargoEmprego().isEmpty() && !camposVazios.contains("cbo"))
        {
            camposVazios.add("cbo");
        }

        // Exibir os campos sem informações
        if (!camposVazios.isEmpty())
        {
            this.mensagem = "Os seguintes campos estão sem informações:\n";
            for (String campo : camposVazios)
            {
                System.out.println(campo);
                this.mensagem += campo;
            }
            JOptionPane.showMessageDialog(null, mensagem, "Campos Vazios", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            this.setMensagem("ok");
        }
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

}
