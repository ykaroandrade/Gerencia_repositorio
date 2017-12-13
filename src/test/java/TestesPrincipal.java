/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josevictor
 */
public class TestesPrincipal {
    
    public TestesPrincipal() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void verificaTeste() {
        assertEquals(0, 0);
    }
    
    @Test
    public void testaAddCidade() {
        br.data.entity.Cidade cid= new br.data.entity.Cidade();
        int cod = Integer.parseInt("121");
        String nome = "ibipora";
        cid.setCodigo(cod);
        cid.setNome(nome);
        assertEquals("ibipora", cid.getNome());
        int countData = new br.data.crud.CrudCidade().count();
        new br.data.crud.CrudCidade().persist(cid);
        assertEquals(countData + 1, new br.data.crud.CrudCidade().count());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
