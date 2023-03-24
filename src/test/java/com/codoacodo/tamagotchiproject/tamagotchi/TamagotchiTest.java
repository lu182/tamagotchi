package com.codoacodo.tamagotchiproject.tamagotchi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TamagotchiTest {

    private Tamagotchi mascota1; //declaro el Objeto

    @Before
    public void setUp(){
        //Este Objeto "mascota1" lo vamos a poder utilizar en c/u de los tests, es decir, ese Objeto va a vivir en c/u
        //de los métodos @Test que creemos.
        //Acá El setUp ya me va a crear el Tamagotchi con el constructor vacío por defecto (sin nombre)
        mascota1 = new Tamagotchi();

        //Instancio el Objeto
        //tama = new Tamagotchi(); //este Objeto "tama" lo voy a utilizar en testQuePruebaQueAlComerConEstadoHambrientaCambiaElEstadoAContenta()
    }


    //1) Creo el Test con un nombre que explique lo que se va a probar:
    @Test
    public void testQuePruebaQuePuedoCrearUnTamagotchiConNombre(){
        //Creo el Objeto y ejecuto la prueba brindandole un nombre como indica el test.
        //Esta funcionalidad no está en el constructor de la clase real. Lo creo.
        mascota1 = new Tamagotchi("Amy");
        // El nombre en el constructor es lo mismo que hacer --> mascota1.setNombre("Amy");

        //Utilizo la clase Assert para validar si estamos obteniendo el resultado esperado:
        //compara si el nombre ingresado por parametro arriba (el esperado) es igual al nombre actual que obtuvo
        Assert.assertEquals("Amy", mascota1.getNombre());
                             //Object expected - object actual
    }

    @Test
    public void testQuePruebaQueAlComerConEstadoHambrientaCambiaElEstadoAContenta(){
        mascota1.setEstado("hambrienta");
        mascota1.comer(); //ejecuto la funcionalidad que quiero probar
        Assert.assertEquals("contenta", mascota1.getEstado());

        //Esperado: contenta
        //Actual (obtenido): contenta
    }

    @Test
    public void testQuePruebaQueAlComerConEstadoContentaSuNivelSeIncrementaEnUnaUnidad(){
        mascota1.setEstado("contenta");
        mascota1.comer();
        Assert.assertEquals(1, mascota1.getNivel().intValue());
    }

    @Test
    public void testQuePruebaQueAlComerConEstadoAburridaYHaceMasDe80MinEstaAburridaSePoneContenta(){
        mascota1.setEstado("aburrida");
        mascota1.setTiempoEnMinutos(90);
        mascota1.comer();

        Assert.assertEquals("contenta", mascota1.getEstado());
    }

    @Test
    public void testQuePruebaQueAlComerConEstadoAburridaDesdeHace80MinNoCambiaNada(){
        mascota1.setEstado("aburrida");
        mascota1.setTiempoEnMinutos(80);
        mascota1.comer();

        Assert.assertEquals("aburrida", mascota1.getEstado());
    }

    @Test
    public void testQuePruebaQueAlJugarConEstadoContentaSuNivelSeIncrementa2Unidades(){
        mascota1.setEstado("contenta");
        mascota1.jugar();

        Assert.assertEquals(2, mascota1.getNivel().intValue());
    }

    @Test
    public void testQuePruebaQueAlJugarConEstadoAburridaSePoneContenta(){
        //mascota1.setEstado("hambrienta");
        //mascota1.jugar(); //Si la hago jugar hambrienta no se va a poner contenta. La mascota va a estar hambrienta y no va a poder jugar
        //Assert.assertEquals("contenta", mascota1.getEstado());
        //es correcto que figure --> Expected: contenta - Actual: hambrienta

        mascota1.setEstado("aburrida");
        mascota1.jugar(); //si está aburrida pero la hago jugar, se pone contenta.
        Assert.assertEquals("contenta", mascota1.getEstado());
    }

    @Test
    public void testQuePruebaQueAlJugarConEstadoHambrientaNoProduceNingunEfecto(){
        mascota1.setEstado("hambrienta");
        mascota1.jugar();

        Assert.assertEquals("hambrienta", mascota1.getEstado());
    }

}
