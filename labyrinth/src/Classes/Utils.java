package Classes;

public class Utils
{
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
         else{
            //this.password = encryptMD5(password);
            // return text.matches(Regex.Password);
             }
        return false;
    }
    public static void encryptMD5()
    {
        //Método estático público el cual recibirá una contraseña y la devolverá encriptada en MD5.
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
    public static boolean validateDNI(String DNI)
    {
        String regexDNI = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]";
        if(!DNI.matches(regexDNI))
        {
            System.out.println("FORMATO VALIDO");
            return true;
        }
        return false;
    }
    public static void getAge()
    {//Método estático público el cual recibirá
        // una fecha de nacimiento y devolverá la edad en función de dicha fecha.
    }
    public static boolean validateDate()
    {   //Método estático público el cual recibirá una fecha y devolverá un valor booleano
        // en función si la fecha tiene el formato adecuado y también es válida.
        return false;
    }
    public static void formatDateEU()
    {   //Método estático público el cual recibirá una fecha en formato
        // Date de SQL (aaaa-mm-dd) y la devolverá en formato europeo (dd/mm/aaaa).
        /**
         * private static String[] date_formats =
         * {
         *         "yyyy-MM-dd",
         *         "yyyy/MM/dd",
         *         "dd/MM/yyyy",
         *         "dd-MM-yyyy",
         *         "yyyy MMM dd",
         *         "yyyy dd MMM",
         *         "dd MMM yyyy",
         *         "dd MMM yyyy"
         };

          A brute-force workaround for Java's failure to accept "any arbitrary date format"

         public static Date tryDifferentFormats (String sDate){
         Date myDate = null;
         for (String formatString : date_formats) {
         try {
         SimpleDateFormat format = new SimpleDateFormat(formatString);
         format.setLenient(false);
         myDate = format.parse(sDate);
         break;
         }
               catch(ParseException e){
                   // System.out.println("  fmt: " + formatString + ": FAIL");
         }
         }
         return myDate;
         }
          */
    }
    public static void formatDateSQL()
    {   //Método estático público el cual recibirá una fecha en formato europeo (dd/mm/aaaa)
        // y la devolverá en formato Date de SQL (aaaa-mm-dd).
    }


}
