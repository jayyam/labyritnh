package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils
{
    public static boolean validateEmail()
    {
        String email = "pepe.al@gmail.com";
        String regex = "^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";//Comprueba si contiene
        //comprobando email

        if(email.matches(regex))
        {
            System.out.println("FORMATO DE EMAIL VALIDO");
        }

        else
        {
            System.out.println("FORMATO DE EMAIL NO VALIDO");
        }
        return false;
    }
    public static boolean validatePassword()
    {
        return false;
    }
    public static boolean validateUsername()
    {
        String texto = "abc dfdgfdg asdrabcty";//texto con numeros y letras
        String regex = "[a-zA-Z]{1,10}";//Comprueba si hay patrones formados por un minimo de 5
        // letras mayusculas o minusculas y un maximo de 10

        Pattern patron = Pattern.compile(regex);
        Matcher concordancias = patron.matcher(texto);

        System.out.println("\nConcordancias: ");
        while (concordancias.find()) {
            System.out.println("Indice: "
                    + concordancias.start()
                    + " Texto: " + concordancias.group()
                    + ")");
        }
        return false;
    }
    public static boolean validateName()
    {
        String texto = "abc dfdgfdg asdrabcty";//texto con numeros y letras
        String regex = "[a-zA-Z]{1,10}";//Comprueba si hay patrones formados por un minimo de 5
        // letras mayusculas o minusculas y un maximo de 10

        Pattern patron = Pattern.compile(regex);
        Matcher concordancias = patron.matcher(texto);

        System.out.println("\nConcordancias: ");
        while (concordancias.find()) {
            System.out.println("Indice: "
                    + concordancias.start()
                    + " Texto: " + concordancias.group()
                    + ")");
        }
        return false;
    }
    public static boolean validateNif()
    {
        String texto = "abc dfdgfdg asdrabcty";//texto con numeros y letras
        String regex = "[a-zA-Z]{9,10}";//Comprueba si hay patrones formados por un minimo de 5
        // letras mayusculas o minusculas y un maximo de 10

        Pattern patron = Pattern.compile(regex);
        Matcher concordancias = patron.matcher(texto);

        System.out.println("\nConcordancias: ");
        while (concordancias.find()) {
            System.out.println("Indice: "
                    + concordancias.start()
                    + " Texto: " + concordancias.group()
                    + ")");
        }
        return false;
    }
    public static boolean validateDate()
    {
        return false;
    }
    public static void encryptMd5()
    {

    }
}
