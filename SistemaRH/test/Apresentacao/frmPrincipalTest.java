/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Apresentacao;

import Modelo.GerenciadorDeJanelas;
import Modelo.MetodosComunsParaTodosOsJIF;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author miche
 */
public class frmPrincipalTest
{
    
    public frmPrincipalTest()
    {
    }
    
    @BeforeAll
    public static void setUpClass()
    {
    }
    
    @AfterAll
    public static void tearDownClass()
    {
    }
    
    @BeforeEach
    public void setUp()
    {
    }
    
    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Test of setDesativarBotoesFrmCC method, of class frmPrincipal.
     */
    @Test
    public void testSetDesativarBotoesFrmCC()
    {
        System.out.println("setDesativarBotoesFrmCC");
        boolean desativarBotoesFrmCC = false;
        frmPrincipal instance = new frmPrincipal();
        instance.setDesativarBotoesFrmCC(desativarBotoesFrmCC);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGravarAlteracaoFrmCC method, of class frmPrincipal.
     */
    @Test
    public void testSetGravarAlteracaoFrmCC()
    {
        System.out.println("setGravarAlteracaoFrmCC");
        boolean gravarAlteracaoFrmCC = false;
        frmPrincipal instance = new frmPrincipal();
        instance.setGravarAlteracaoFrmCC(gravarAlteracaoFrmCC);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class frmPrincipal.
     */
    @Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        frmPrincipal.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarIndicePeloValor method, of class frmPrincipal.
     */
    @Test
    public void testEncontrarIndicePeloValor()
    {
        System.out.println("encontrarIndicePeloValor");
        List<Integer> lista = null;
        int valor = 0;
        frmPrincipal instance = new frmPrincipal();
        int expResult = 0;
        int result = instance.encontrarIndicePeloValor(lista, valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atalhoSair method, of class frmPrincipal.
     */
    @Test
    public void testAtalhoSair()
    {
        System.out.println("atalhoSair");
        frmPrincipal instance = new frmPrincipal();
        instance.atalhoSair();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atalhoNovo method, of class frmPrincipal.
     */
    @Test
    public void testAtalhoNovo()
    {
        System.out.println("atalhoNovo");
        frmPrincipal instance = new frmPrincipal();
        instance.atalhoNovo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atalhoPesquisar method, of class frmPrincipal.
     */
    @Test
    public void testAtalhoPesquisar()
    {
        System.out.println("atalhoPesquisar");
        frmPrincipal instance = new frmPrincipal();
        instance.atalhoPesquisar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atalhoAlterar method, of class frmPrincipal.
     */
    @Test
    public void testAtalhoAlterar()
    {
        System.out.println("atalhoAlterar");
        frmPrincipal instance = new frmPrincipal();
        instance.atalhoAlterar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atalhoExcluir method, of class frmPrincipal.
     */
    @Test
    public void testAtalhoExcluir()
    {
        System.out.println("atalhoExcluir");
        frmPrincipal instance = new frmPrincipal();
        instance.atalhoExcluir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atalhoSalvar method, of class frmPrincipal.
     */
    @Test
    public void testAtalhoSalvar()
    {
        System.out.println("atalhoSalvar");
        frmPrincipal instance = new frmPrincipal();
        instance.atalhoSalvar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atalhoPrimeiro method, of class frmPrincipal.
     */
    @Test
    public void testAtalhoPrimeiro()
    {
        System.out.println("atalhoPrimeiro");
        frmPrincipal instance = new frmPrincipal();
        instance.atalhoPrimeiro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atalhoAnterior method, of class frmPrincipal.
     */
    @Test
    public void testAtalhoAnterior()
    {
        System.out.println("atalhoAnterior");
        frmPrincipal instance = new frmPrincipal();
        instance.atalhoAnterior();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atalhoProximo method, of class frmPrincipal.
     */
    @Test
    public void testAtalhoProximo()
    {
        System.out.println("atalhoProximo");
        frmPrincipal instance = new frmPrincipal();
        instance.atalhoProximo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atalhoUltimo method, of class frmPrincipal.
     */
    @Test
    public void testAtalhoUltimo()
    {
        System.out.println("atalhoUltimo");
        frmPrincipal instance = new frmPrincipal();
        instance.atalhoUltimo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of definicoesSistema method, of class frmPrincipal.
     */
    @Test
    public void testDefinicoesSistema()
    {
        System.out.println("definicoesSistema");
        frmPrincipal instance = new frmPrincipal();
        instance.definicoesSistema();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarSeAJanelaJaEstaAberta method, of class frmPrincipal.
     */
    @Test
    public void testVerificarSeAJanelaJaEstaAberta()
    {
        System.out.println("verificarSeAJanelaJaEstaAberta");
        JInternalFrame frm = null;
        JDesktopPane jdk = null;
        frmPrincipal instance = new frmPrincipal();
        boolean expResult = false;
        boolean result = instance.verificarSeAJanelaJaEstaAberta(frm, jdk);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redesenhar method, of class frmPrincipal.
     */
    @Test
    public void testRedesenhar()
    {
        System.out.println("redesenhar");
        frmPrincipal.redesenhar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerenciadorJanelasAbertas method, of class frmPrincipal.
     */
    @Test
    public void testGerenciadorJanelasAbertas()
    {
        System.out.println("gerenciadorJanelasAbertas");
        GerenciadorDeJanelas gerenciador = null;
        JInternalFrame janela = null;
        frmPrincipal.gerenciadorJanelasAbertas(gerenciador, janela);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerenciadorNavegacao method, of class frmPrincipal.
     */
    @Test
    public void testGerenciadorNavegacao()
    {
        System.out.println("gerenciadorNavegacao");
        MetodosComunsParaTodosOsJIF mtd = null;
        JInternalFrame frm = null;
        String tituloJanela = "";
        String acao = "";
        boolean rapido = false;
        frmPrincipal instance = new frmPrincipal();
        instance.gerenciadorNavegacao(mtd, frm, tituloJanela, acao, rapido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
