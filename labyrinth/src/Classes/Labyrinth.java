package Classes;

import java.io.IOException;
import java.io.File;
public class Labyrinth

{
    private char [][] map;
    private String filename;
    private boolean loaded;
    private int startI, startJ, endI, endJ;

    public Labyrinth()
    {
        loaded=false;
    }

    public void loadLabyrinth () throws IOException, InterruptedException

    /**
     * (Antes de flujo de Programa)
     * Opcion 1: -Pedir nombre del fichero
     *           - True = Nombre fichero laberinto correcto
     *           -False = Fichero con ese nombre no encontrado (repetir pregunta)
     *           -Flujo de Programa
     *  ---------------------------------------------------------------------------------------
     * Opcion 2: -Listar directorio con todos los ficheros
     *           -Pedir el numero correspondiente al fichero escogido
     *           -Flujo de programa
     *
     */

    {
        listDirectory(); //(OPCION 2. METODO ABAJO)
        /**
         * Flujo de programa (metodo):
         *
         *      -Abrir fichero laberinto
         *      -Establecer dimension de la matriz
         *      -Recorrer filas y columnas
         *      -Guarda cada caracter leido en la matriz
         *      -Poner loaded a true y filename con su nombre
         *      -Mensaje (CARGADO CORRECTAMENTE)
         */
    }

    public void showMap() throws IOException, InterruptedException

    {

    }

    public void setEntranceExit() throws IOException, InterruptedException

    {

    }

    private File[] listDirectory() throws IOException {
        File[] files = new File[0];
        try {
            files = new File(Config.LABIRYNTHPATH).listFiles();
        } catch (Exception e) {
            System.err.println("No se ha podido acceder al directorio de laberintos");
        }
        return files;
    }
}