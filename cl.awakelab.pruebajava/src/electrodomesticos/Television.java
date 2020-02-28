package electrodomesticos;

public class Television extends Electrodomestico {

    // Constantes -------------------------------------------------------------
    
    /** Valor asignado por defecto para el atributo resolucion */
    public final static int RESOLUCION_DEFECTO=20;
    
    // Atributos --------------------------------------------------------------

        private int resolucion;
        private boolean sintonizadorTDT;

    // Constructores ----------------------------------------------------------

        /** Constructor por defecto */
    public Television(){
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, 
                COLOR_DEFECTO, RESOLUCION_DEFECTO, false);
    }
  
    /**
     * Constructor de la clase 
     * @param precioBase Precio del producto
     * @param peso Peso del producto
     */
    public Television(long precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, 
                RESOLUCION_DEFECTO, false);
    }
  
    /**
     * Contructor de la clase 
     * @param precioBase Precio del producto
     * @param peso Peso del producto
     * @param consumoEnergetico Consumo energetico del producto
     * @param color Color del producto
     * @param resolucion Resolucion del producto
     * @param sintonizadorTDT Sintonizador TDT del producto
     */
    public Television(long precioBase, double peso, char consumoEnergetico, 
            String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }

    // Metodos ----------------------------------------------------------------

    /**
     * Retorna la resolucion de el televisor
     * @return resolucion
     */
    public int getResolucion() {
        return resolucion;
    }
        
    /**
     * Precio final de la television
     * @return precio final de la television
     */
    public long precioFinal(){
        //Invocamos el método precioFinal del método padre
        long incremento=super.precioFinal();
  
        //Añadimos el codigo necesario
        if (resolucion>40){
            incremento+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            incremento+=50;
        }
  
        return incremento;
    }

}