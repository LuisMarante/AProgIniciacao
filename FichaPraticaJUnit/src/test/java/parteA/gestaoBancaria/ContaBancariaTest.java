package parteA.gestaoBancaria;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ContaBancariaTest {


    ContaBancaria conta1;
    ContaBancaria conta2;

    ContaBancaria conta3;

    @BeforeEach
    void setUp() {
        conta1 = new ContaBancaria("luis", 0, 2025, "portugal", "47274284739857");
        conta2 = new ContaBancaria("luis", 1000, 2025, "portugal", "47274284739857");
        conta3 = new ContaBancaria("luis", 5000, 2025, "portugal", "47274284739857");

    }

    @Test
    void testGetSaldo() {

        assertEquals(0, conta1.getSaldo());
        assertEquals(1000, conta2.getSaldo());
    }

    @Test
    void testDepositar() {

        conta1.depositar(10);
        assertEquals(10, conta1.getSaldo());

        conta1.depositar(40);
        assertEquals(50, conta1.getSaldo());


    }


    @Test
    void testLevantarSemFundos(){
        conta1.levantar(50);
        assertEquals(0, conta1.getSaldo());

    }

    @Test
    void testLevantarValorMenorSaldo() {

        conta2.levantar(50);
        assertEquals(950, conta2.getSaldo());

        conta2.levantar(150);
        assertEquals(800, conta2.getSaldo());

    }

    @Test
    void testLevantarValorMesmoSaldo() {

        conta2.levantar(1000);
        assertEquals(0, conta2.getSaldo());

        conta3.levantar(5000);
        assertEquals(0, conta3.getSaldo());

    }

    @Test
    void testLevantarValorMaiorSaldo() {


        conta1.levantar(50);
        assertEquals(0, conta1.getSaldo());

        conta3.levantar(5100);
        assertEquals(5000, conta3.getSaldo());


    }

    @Test
    void testLevantarValorNegativo() {


        conta1.levantar(-50);
        assertEquals(0, conta1.getSaldo());

        conta3.levantar(-50);
        assertEquals(5000, conta3.getSaldo());


    }


    @Test
    void testTransferirSemFundos(){

        conta1.transferir(conta2 , 100);
        assertEquals(1000, conta2.getSaldo());
        assertEquals(0, conta1.getSaldo());


        conta1.transferir(conta3 , 50);
        assertEquals(5000, conta3.getSaldo());
        assertEquals(0, conta1.getSaldo());

    }

    @Test
    void testTransferirValido(){

        conta2.transferir(conta1 , 100);
        assertEquals(100, conta1.getSaldo());
        assertEquals(900, conta2.getSaldo());


        conta3.transferir(conta2 , 2000);
        assertEquals(3000, conta3.getSaldo());
        assertEquals(2900, conta2.getSaldo());

    }

    @Test
    void testTransferirNaoValido(){


        conta2.transferir(conta1 , 2000);
        assertEquals(0, conta1.getSaldo());
        assertEquals(1000, conta2.getSaldo());


        conta3.transferir(conta2 , 7000);
        assertEquals(5000, conta3.getSaldo());
        assertEquals(1000, conta2.getSaldo());

    }
}