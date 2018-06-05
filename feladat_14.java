class Feladat_14 {

    public static void main(String[] args) {
        
        System.out.println( wordsToUppercase( args[0] ) );

    }

    static String wordsToUppercase( String s ) {

        String[] words =  s.split("\\s");
        StringBuilder newString = new StringBuilder();

        for( int i=0; i < words.length; i++ ) {

            newString.append( Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1) + " " );

        }

        return newString.toString();

    }

}