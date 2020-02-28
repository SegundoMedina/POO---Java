package electrodomesticos;

public class Lavadora extends Electrodomestico {

    // Constantes -------------------------------------------------------------
    
    /** Valor asignado por defecto para el atributo carga */
    public final static int CARGA_DEFECTO=5;
    
    // Atributos --------------------------------------------------------------

    private int carga;
   
    // Constructores ----------------------------------------------------------

    /** Contructor por defecto */
    public Lavadora(){
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, 
                COLOR_DEFECTO, CARGA_DEFECTO);
    }
  
    /**
     * Constructor de la clase
     * @param precioBase Precio del producto
     * @param peso Peso del producto
     */
    public Lavadora(long precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEFECTO, COLOR_DEFECTO, 
                CARGA_DEFECTO);
    }
  
    /**
     * Constructor de la clase 
     * @param precioBase Precio base del producto
     * @param peso Peso del producto
     * @param consumoEnergetico Consumo energetico del producto
     * @param color Color del producto
     * @param carga Carga del producto
     */
    public Lavadora(long precioBase, double peso, char consumoEnergetico, 
            String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }

    // Metodos ----------------------------------------------------------------

    /**
     * Retorna la carga de la lavadora
     * @return carga
     */
    public int getCarga() {
        return carga;
    }
  
    /**
     * Retorna Precio final de la lavadora
     * @return precio final
     */
    public long precioFinal(){
        //Invocamos el método precioFinal del método de la clase padre
        long incremento=super.precioFinal();
  
        //Si la carga es mayor de 30kg incrementa 50 euros al precio final
        if (carga>30){
            incremento+=50;
        }
        return incremento;
    }
}