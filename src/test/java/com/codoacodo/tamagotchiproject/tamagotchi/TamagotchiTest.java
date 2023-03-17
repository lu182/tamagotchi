package com.codoacodo.tamagotchiproject.tamagotchi;

import org.junit.Assert;
import org.junit.Test;

public class TamagotchiTest {

    //Tamagotchi tama; //declaro el Objeto

    /*void setUp(){
        //Tamagotchi tama = new Tamagotchi(); //este Objeto "tama" lo vamos a poder utilizar en c/u de los tests
        //es decir, ese Objeto va a vivir en c/u de los métodos @Test que creemos.
        //Acá El setUp ya me va a crear el Tamagotchi con el constructor vacío por defecto (sin nombre)

        //Instancio el Objeto
        tama = new Tamagotchi(); //este Objeto "tama" lo voy a utilizar en testQuePruebaQueAlComerConEstadoHambrientaCambiaElEstadoAContenta()
    }
    */


    //1) Creo el Test con un nombre que explique lo que se va a probar:
    @Test
    public void testQuePruebaQuePuedoCrearUnTamagotchiConNombre(){
        //Creo el Objeto y ejecuto la prueba brindandole un nombre como indica el test:
        Tamagotchi mascota1 = new Tamagotchi("Tama"); //esta funcionalidad no está en el constructor de la clase real. Lo creo.
                                                   // El nombre en el constructor es lo mismo que hacer --> mascota.setNombre("Tama");

        //Utilizo la clase Assert para validar si estamos obteniendo el resultado esperado:
        Assert.assertEquals(mascota1.getNombre(), "Tama"); //compara si el nombre ingresado por parametro arriba (el esperado) es igual al nombre actual
                             //Object expected - object actual
    }

    @Test
    public void testQuePruebaQueAlComerConEstadoHambrientaCambiaElEstadoAContenta(){
        Tamagotchi mascota = new Tamagotchi();
        mascota.setEstado("hambrienta");
        mascota.comer(); //ejecuto la funcionalidad que quiero probar
        Assert.assertEquals(mascota.getEstado(),"contenta");
        //Hacemos que el estado actual de la mascota coincida con el estado obtenido

        //Esperado:
        //Actual: contenta
    }

    @Test
    public void testQuePruebaQueAlJugarConEstadoHambrientaCambiaElEstadoAContenta(){
        Tamagotchi mascota = new Tamagotchi();
        mascota.setEstado("hambrienta");
        mascota.jugar(); //Si la hago jugar hambrienta no se va a poner contenta. La mascota va a estar hambrienta y no va a poder jugar
        Assert.assertEquals(mascota.getEstado(),"contenta"); //es correcto que figure --> Expected: hambrienta - Actual: contenta

    }

}
