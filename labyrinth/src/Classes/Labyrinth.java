/**
 * Labyrinth.java.
 * Clase user para usar constructor
 * OAGS - 2021/22
 * version v1.0.0
 */

package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Labyrinth {
    private char[][] map;
    private String filename;
    private boolean loaded;
    private int startI, startJ, endI, endJ;
    private ArrayList<Coordinate> path = new ArrayList<Coordinate>();
    /**
     * PATH
     * utilizará el algoritmo para guardar las coordenadas y dirección del camino a buscar
     * para luego mostrarlo
     * */

    public Labyrinth()
    {
        loaded = false;
    }

    public void loadLabyrinth() throws IOException {
        File[] archives = listDirectory();
        for (int i = 0; i < archives.length; i++) {
            System.out.println((i + 1) + ". " + archives[i].getName());
        }
        System.out.println("0. Cancelar\n");
        int option = Interface.getInt("Selecciona opcion: ");
        if (option == 0) {
            return;
        }
        if (option < 0 || option > archives.length) {
            System.err.println("Opcion introducida no valida");
            return;
        }

        ArrayList<String> lines = readLabyFile(archives[option - 1].getName());

        int rows = lines.size();
        int columns = lines.get(0).length();
        map = new char[rows][columns];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = lines.get(i).charAt(j);
            }
        }
        filename = archives[option - 1].getName();
        loaded = true;
        System.out.println(filename + " CARGADO CORRECTAMENTE");
    }

    private ArrayList<String> readLabyFile(String namefile) {
        ArrayList<String> lines = new ArrayList<String>();
        try {
            File myObj = new File(Config.LABIRYNTHPATH + namefile);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro archivo.");
            e.printStackTrace();
        }
        return lines;
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

    public void showMap() throws IOException, InterruptedException
    {
        if (loaded == false)
        {
            System.err.print("No se ha cargado el laberinto");
        }
        else
        {
            for (int i = 0; i < map.length; i++)
            {
                    for (int j = 0; j < map[i].length; j++)
                    {
                        if (startI == i && startJ == j)
                        {
                            System.out.print("E ");
                        }
                        else if (endI == i && endJ == j)
                        {
                            System.out.print("S ");
                        }
                        else
                        {
                            ArrayList<Coordinate> path = new ArrayList<Coordinate>();
                            //https://stackoverflow.com/questions/30551194/find-shortest-path-in-a-maze-with-recursive-algorithm
                            System.out.print(map[i][j] + " ");
                        }
                    }
                System.out.println();
            }
        }
    }

    public void setEntranceExit() throws IOException, InterruptedException {

        if (loaded == false) {
            System.err.print("No se ha cargado el laberinto");
        } else {
            int iE = Interface.getInt("Introduzca coordenada de fila de entrada (i): ");
            int jE = Interface.getInt("Introduzca coordenada de columna de entrada (j): ");
            if (iE < 0 || iE >= map.length || jE < 0 || jE >= map.length || map[iE][jE] != ' ') {
                System.err.println("Coordenada no valida.");
                return;
            }

            int iS = Interface.getInt("Introduzca coordenada de fila de salida (i): ");
            int jS = Interface.getInt("Introduzca coordenada de columna de salida (j): ");
            if (iS < 0 || iS >= map.length || jS < 0 || jS >= map.length || map[iS][jS] != ' ') {
                System.err.println("Coordenada no valida.");
                return;
            }
            startI = iE;
            startJ = jE;
            endI = iS;
            endJ = jS;
        }
        /**
         si loaded == false --> ERROR --> FIN

         -pedir i y j de entrada (crear las variables, todavia no meterlas en las generales)
         si (i o j son < 0)                            |
         si (i o j son >= longitud de las dimensiones) | ERROR --> FIN
         si (map[sI][sJ] == '#')                       |

         Pedir i y j de salida
         a- "las mismas de arriba "			|
         b- "las mismas de arriba "			| ERROR --> FIN
         c- "las mismas de arriba"			|
         d- Si eI == sI && eJ == sJ   		|

         -Meter valores en startI,startJ,endI,endJ
         */
    }

}

/**
 * Listado de acciones
 * -------------------
 * -Obtener listado ficheros
 * -Listar directorio con todos los ficheros
 * -Pedir el numero correspondiente al fichero escogido (opcion)
 * -Abrir fichero laberinto
 * -Establecer dimension de la matriz
 * -Recorrer filas y columnas
 * -Guarda cada caracter leido en la matriz
 * -Poner loaded a true y filename con su nombre
 * -Mensaje (CARGADO CORRECTAMENTE)
 */