
package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;



    public class Helper {

        public static String generateRandomGivenSuffix(String suffix) {
            return suffix + "-" + UUID.randomUUID().toString();
        }
    public static String getClassName(Class<?>  aClass)
    {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);

      //the String "capitalizer" is a reference to a user input//
        String capitalizer = "";

        for (int i = 0; i < className.length(); i++) {
            char currentChar = className.charAt(i);
            char currentCharToUpperCase = Character.toUpperCase(currentChar);
            capitalizer = capitalizer + currentCharToUpperCase;
        }
        return capitalizer;



        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line 17 [throw new UnsupportedOperationException("Not yet supported!");]
         * 2. Get the capitalized letter(s) from the className and return it.
         */



    }

     /*   public static void main(String[]args){

            Helper help = new Helper();

           System.out.println( "" + help.getSuffixFromClassName());

        }*/



    }
