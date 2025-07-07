package parteA.gestaoProduto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {


    Produto p1;
    Produto p2;
    Produto p3;

    @BeforeEach
    void setUp() {

        p1 = new Produto("lixivia", 10, 10, "limpeza", "nSei");
        p2 = new Produto("agua", 5, 40, "alimentacao", "luso");
        p3 = new Produto("iogurte", 2, 0, "alimentacao", "nSei");

    }

    @Test
    void testAtualizarPrecoBase() {

        p1.actualizarPrecoBase(20);
        assertEquals(20, p1.calcularPrecoFinal());


        p2.actualizarPrecoBase(0);
        assertEquals(0, p2.calcularPrecoFinal());
    }

    @Test
    void testAtualizarPrecoBaseComNegativos() {


        assertThrows(IllegalArgumentException.class, () -> p1.actualizarPrecoBase(-5));

        assertThrows(IllegalArgumentException.class, () -> p1.actualizarPrecoBase(-100));

    }


    @Test
    void testAplicarDesconto() {
        p1.aplicarDesconto(0.2);
        assertEquals(8, p1.calcularPrecoFinal());


        p3.aplicarDesconto(0.5);
        assertEquals(1, p3.calcularPrecoFinal());
    }


    @Test
    void testAplicarDescontoNegativo() {

        assertThrows(IllegalArgumentException.class, () -> p1.aplicarDesconto(-0.1));

        assertThrows(IllegalArgumentException.class, () -> p2.aplicarDesconto(-0.9));
    }


    @Test
    void testAplicarDescontoMaior1() {

        assertThrows(IllegalArgumentException.class, () -> p1.aplicarDesconto(1.1));

        assertThrows(IllegalArgumentException.class, () -> p2.aplicarDesconto(10));
    }


    @Test
    void testAdicionarStockNegativo() {

        assertThrows(IllegalArgumentException.class, () -> p1.adicionarStock(-1));

        assertThrows(IllegalArgumentException.class, () -> p2.adicionarStock(-10));
    }

    @Test
    void testAdicionarStock() {

        p1.adicionarStock(10);
        assertEquals(20, p1.getStock());


        p2.adicionarStock(20);
        assertEquals(60, p2.getStock());

    }

    @Test
    void testAdicionarStockZero() {

        p1.adicionarStock(0);
        assertEquals(10, p1.getStock());


        p2.adicionarStock(0);
        assertEquals(40, p2.getStock());

    }

    @Test
    void testRemoverStockZero() {

        p1.removerStock(0);
        assertEquals(10, p1.getStock());


        p2.removerStock(0);
        assertEquals(40, p2.getStock());

    }

    @Test
    void testRemoverStock() {

        p1.removerStock(5);
        assertEquals(5, p1.getStock());


        p2.removerStock(20);
        assertEquals(20, p2.getStock());

    }
    @Test
    void testRemoverStockNegativo() {

        assertThrows(IllegalArgumentException.class, () ->   p1.removerStock(-1));


        assertThrows(IllegalArgumentException.class, () ->   p2.removerStock(-10));
    }



}