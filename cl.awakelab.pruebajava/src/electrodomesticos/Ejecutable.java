package electrodomesticos;

public class Ejecutable {

    public static void main(String[] args) {

        //Creamos un arreglo que contendra los Electrodomesticos
        Electrodomestico listaDeVentas[]=new Electrodomestico[10];

        //Asignamos cada una de las posiciones del arreglo con valores
        listaDeVentas[0]=new Electrodomestico(300, 60, 'C', "Verde");
        listaDeVentas[1]=new Electrodomestico(700, 20, 'D', "gris");
        listaDeVentas[2]=new Electrodomestico(130, 20, 'B', "azul");
        listaDeVentas[3]=new Electrodomestico(200, 40, 'F', "rojo");
        listaDeVentas[4]=new Lavadora(180, 42, 'D', "gris", 18);
        listaDeVentas[5]=new Lavadora(350, 56, 'Z', "blanco", 20);
        listaDeVentas[6]=new Lavadora(400, 68, 'A', "azul", 30);
        listaDeVentas[7]=new Television(270, 12, 'A', "negro", 42, true);
        listaDeVentas[8]=new Television(170, 10, 'C', "rojo", 32, false);
        listaDeVentas[9]=new Television(550, 23, 'B', "plateado", 55, true);
        
        //Variables en las cuales almacenaremos la suma total de los precios
        long precioFinalElectrodomesticos=0;
        long precioFinalTelevisores=0;
        long precioFinalLavadoras=0;

        //Recorremos el arreglo llamando al metodo precioFinal
        for(int i=0;i<listaDeVentas.length;i++){

            //**Verificamos si la cadena contiene la propiedad del constructor 
            if(listaDeVentas[i] instanceof Electrodomestico){
                precioFinalElectrodomesticos+=listaDeVentas[i].precioFinal();
            }
            if(listaDeVentas[i] instanceof Lavadora){
                precioFinalLavadoras+=listaDeVentas[i].precioFinal();
            }
            if(listaDeVentas[i] instanceof Television){
                precioFinalTelevisores+=listaDeVentas[i].precioFinal();
            }
        }

        //Mostramos los resultados totales obtenidos de los electrodomesticos
        System.out.println("Los totales de la lista de electrodomesticos son:\n");
        System.out.println("El precio total de los electrodomesticos es de: "
                + precioFinalElectrodomesticos + " euros");
        System.out.println("El precio total de las lavadoras es de: "
                + precioFinalLavadoras + " euros");
        System.out.println("El precio total de los televisores es de: "
                + precioFinalTelevisores + " euros");
        
    }
}