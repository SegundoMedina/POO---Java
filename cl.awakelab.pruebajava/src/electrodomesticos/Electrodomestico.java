package electrodomesticos;

public class Electrodomestico {

    // Constantes -------------------------------------------------------------

    /** Valor asignado por defecto para el atributo precio base */
    public final static long PRECIO_BASE_DEFECTO=100000;
    
    /** Valor asignado por defecto para el atributo color */
    public final static String COLOR_DEFECTO="blanco";

    /** Valor asignado por defecto para el atributo consumo energetico */
    public final static char CONSUMO_ENERGETICO_DEFECTO='F';

    /** Valor asignado por defecto para el atributo peso */
    public final static double PESO_DEFECTO=5;

    // Atributos --------------------------------------------------------------

    public long precioBase;
    public String color;
    public char consumoEnergetico;
    public double peso;

    // Constructores ----------------------------------------------------------

    /** Contructor por defecto */
    public Electrodomestico(){
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, 
                COLOR_DEFECTO);
    }

    /**
     * Contructor de la clase
     * @param precioBase del electrodomestico
     * @param peso del electrodomestico
     */
    public Electrodomestico(long precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO);
    }

    /**
     * Constructor de la clase
     * @param precioBase Precio base del producto
     * @param peso Precio del producto
     * @param consumoEnergetico Consumo energetico del producto
     * @param color Color del producto
     */
    public Electrodomestico(long precioBase, double peso, 
            char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;

        verificarConsumoEnergetico(consumoEnergetico);
        verificarColor(color);
    }

    // Metodos ----------------------------------------------------------------


    /**
     * Verifica el color del electrodomestico
     * @param color
     */
    private void verificarColor(String color){

        //Colores disponibles para seleccionar
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorConfirmado=false;

        for(int i=0;i<colores.length && !colorConfirmado;i++){

            if(colores[i].equals(color)){
                colorConfirmado=true;
            }
        }

        if(colorConfirmado){
            this.color=color;
        }else{
            this.color=COLOR_DEFECTO;
        }
    }

    /**
     * Verifica el consumo energetico del electrodomestico
     * @param consumoEnergetico
     */
    private void verificarConsumoEnergetico(char consumoEnergetico) {
        char energia[]={'A', 'B', 'C', 'D', 'E', 'F'};
        boolean consumoVerificado = false;
        for(char e : energia) {
            if(e == consumoEnergetico)
                consumoVerificado = true;
        }
        if(consumoVerificado) {
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEFECTO;
        }
    }   

    /**
     * Retorna el precio final del electrodomestico
     * @return precioBase+incremento
     * @return precioFinal
     */
    public long precioFinal(){
        long incremento=0;
        switch(consumoEnergetico){
        case 'A':
            incremento+=100;
            break;
        case 'B':
            incremento+=80;
            break;
        case 'C':
            incremento+=60;
            break;
        case 'D':
            incremento+=50;
            break;
        case 'E':
            incremento+=30;
            break;
        case 'F':
            incremento+=10;
            break;
        }

        if(peso>=0 && peso<19){
            incremento+=10;
        }else if(peso>=20 && peso<49){
            incremento+=50;
        }else if(peso>=50 && peso<=79){
            incremento+=80;
        }else if(peso>=80){
            incremento+=100;
        }

        return precioBase+incremento;
    }

    // Métodos de obtencion ---------------------------------------------------
    /**
     * Retorna el precio base del electrodomestico
     * @return precioBase
     */
    public long getPrecioBase() {
        return precioBase;
    }
    /**
     * Retorna el color del electrodomestico
     * @return color 
     */
    public String getColor() {
        return color;
    }

    /**
     * Retorna el consumo energetico del electrodomestico
     * @return consumoEnergetico
     */
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    /**
     * Retorna el peso del electrodomestico
     * @return peso
     */
    public double getPeso() {
        return peso;
    }
}