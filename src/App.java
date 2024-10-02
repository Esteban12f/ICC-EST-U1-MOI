public class App {
    public static void main(String[] args) throws Exception {

        MetodoOrdenamiento ordenar = new MetodoOrdenamiento();

        int[] arreglo = {3,5,1,2,4};

        System.out.println("El arreglo nuevo es: ");

        int[] arreglo2 = ordenar.sort(arreglo,false);
        ordenar.printArreglo(arreglo2);

    }
}
