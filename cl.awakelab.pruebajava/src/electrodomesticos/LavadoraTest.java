package electrodomesticos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LavadoraTest {
    
    public Lavadora lavadora;

    @BeforeEach
    void setUp() throws Exception {
       
        lavadora = new Lavadora();
        
    }

    @Test
    final void testGetCarga() {
        assertEquals(Lavadora.CARGA_DEFECTO, lavadora.getCarga());
    }

    @Test
    final void testGetPrecioBase() {
        assertEquals(Lavadora.PRECIO_BASE_DEFECTO, lavadora.getPrecioBase());
    }

    @Test
    final void testGetColor() {
        assertEquals(Lavadora.COLOR_DEFECTO, lavadora.getColor());
    }

    @Test
    final void testGetConsumoEnergetico() {
        assertEquals(Lavadora.CONSUMO_ENERGETICO_DEFECTO, lavadora.getConsumoEnergetico());
    }

    @Test
    final void testGetPeso() {
       assertEquals(Lavadora.PESO_DEFECTO, lavadora.getPeso());
    }

}
