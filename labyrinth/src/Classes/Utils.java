package Classes;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils
{
    private static String[] dateFormats = {"yyyy-MM-dd", "dd/MM/yyyy"};
    public static boolean validateUsername(String username)
    {
        String regexUsername = "^[A-ZÑa-zñ][áéíóúña-z ]+";
        if(!(username).matches(regexUsername))
        {
            System.out.println("FORMATO NO VALIDO");
            return true;
        }
        return false;
    }
    public static boolean validatePassword(String password)
    {
         String regexPassword = "[A-ZÑa-zñ0-9%&#_-]{6,18}";
         if(!(password).matches(regexPassword))
         {
             System.out.println("FORMATO NO VALIDO");
             return true;
         }
             //this.password = encryptMD5(password);
             // return text.matches(Regex.Password);
        return false;
    }
    public static String encryptMD5(String password)
    {
        //Método estático público el cual recibirá una contraseña y la devolverá encriptada en MD5.
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes(), 0, password.length());
            //Encriptado a guardar
            return new BigInteger(1, md.digest()).toString(16);
        }
        catch (NoSuchAlgorithmException e) {e.printStackTrace();}
        return "";
    }
    public static boolean validateName(String name)
    {
        String regexName = "^[A-ZÑa-zñ][áéíóúña-z ]+[ A-ZÑa-zñáéíóú]*";
        if(!name.matches(regexName))
        {
            System.out.println("FORMATO NO VALIDO");
            return true;
        }
        return false;
    }
    public static boolean validateEmail(String email)
    {
        String regexEmail = "^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if(!email.matches(regexEmail))
        {
            System.out.println("FORMATO VALIDO");
            return true;
        }
        return false;
    }
    public static boolean validateNif(String nif)
    {
        String regexNif = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]";
        if(!nif.matches(regexNif))
        {
            System.out.println("FORMATO VALIDO");
            return true;
        }
        return false;
    }
    public static void getAge()
    {//Método estático público el cual recibirá
        // una fecha de nacimiento y devolverá la edad en función de dicha fecha.
        /**

         * static int getAge(String date1) {
         *         String formatD[] = date1.split("/");
         *         int year = Integer.parseInt(formatD[2]);
         *         int week = Integer.parseInt(formatD[1]);
         *         int day = Integer.parseInt(formatD[0]);
         *         LocalDate dateToday = LocalDate.now();
         *         LocalDate dateBirth = LocalDate.of(year, week, day);
         *
         *         Period p = Period.between(dateBirth, dateToday);
         *
         *         return p.getYears();
         *
         *     }
         * */
    }
    public static boolean validateDate(String birthdate)
    {   //Método estático público el cual recibirá una fecha y devolverá un valor booleano
        // en función si la fecha tiene el formato adecuado y también es válida.

       //public static boolean validateDate(String birthdate) {

        try {

            SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

            formatDate.setLenient(false);

            formatDate.parse(birthdate);

        }
        catch (ParseException e)
        {

            return false;

        }

        return true;

    }

    public static Date formatDateSQL()
    {   //Método estático público el cual recibirá una fecha en formato europeo (dd/mm/aaaa)
        // y la devolverá en formato Date de SQL (aaaa-mm-dd).
        /**
         * public static String formatDateSQL(String date3)
         * {
         *
         *
         *     }
         * */
        return null;
    }
    public static Date formatDateEU()
    {   //Método estático público el cual recibirá una fecha en formato
        // Date de SQL (aaaa-mm-dd) y la devolverá en formato europeo (dd/mm/aaaa).
        /**
         public static Date tryDifferentFormats (String sDate)
         {
            Date myDate = null;
            for (String formatString : dateFormats)
            {
            try {
                SimpleDateFormat format = new SimpleDateFormat(formatString);
                format.setLenient(false);
                myDate = format.parse(sDate);
                break;
                }
            catch(ParseException e)
                {
                   System.out.println("  fmt: " + formatString + ": FAIL");
                }
            }
         return myDate;
         }
--------------------------------------------------------------------------------------
         public static String formatDateEU(String date2) {
         String dateFormer[] = date2.split("-");
         return dateFormer[2] + "/" + dateFormer[1] + "/" + dateFormer[0];
         }

         */
        return null;
    }
}
