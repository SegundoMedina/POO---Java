package electrodomesticos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelevisionTest {
    
    public Television television;

    @BeforeEach
    void setUp() throws Exception {
        
        television = new Television();
        
    }

    @Test
    final void testGetResolucion() {
        assertEquals(Television.RESOLUCION_DEFECTO, television.getResolucion());
    }
    
    @Test
    final void testGetPrecioBase() {
        assertEquals(Television.PRECIO_BASE_DEFECTO, television.getPrecioBase());
    }

    @Test
    final void testGetColor() {
        assertEquals(Television.COLOR_DEFECTO, television.getColor());
    }

    @Test
    final void testGetConsumoEnergetico() {
        assertEquals(Television.CONSUMO_ENERGETICO_DEFECTO, television.getConsumoEnergetico());
    }

    @Test
    final void testGetPeso() {
        assertEquals(Television.PESO_DEFECTO, television.getPeso());
    }

}
