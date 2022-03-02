import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true() {
        Assertions.assertTrue(false);
    }

    @Test
    public void crear_Game() {
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_un_1_voy_a_casilla_1() {
        //Arrange
        Game sut = new Game();
        sut.agregar("María");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de María es 1";

        //Act
        String actual = sut.nuevaPosicionJugador();

        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void si_hay_menos_de_2_jugadores_no_es_jugable(){
        Game sut = new Game();
        sut.agregar("Maria");
        Assertions.assertFalse(sut.esJugable());
    }
    @Test
    public void si_hay_mas_de_6_jugadores_no_es_jugable() throws ArrayIndexOutOfBoundsException{
        Game sut = new Game();
        try {
            sut.agregar("Maria");
            sut.agregar("Juan");
            sut.agregar("Luis");
            sut.agregar("Alberto");
            sut.agregar("Jose");
            sut.agregar("Pepe");
            sut.agregar("Paula");
            sut.agregar("Daniel");
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("");
        }
        Assertions.assertFalse(sut.esJugable());
    }
}