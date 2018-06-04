class feladat_13 {

    public static void main( String[] args ) {
        
        System.out.println( isPalindrom( args[0] ) );

    }

    static boolean isPalindrom( String s ) {
        int palind=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s.charAt(s.length()-i-1)){
                palind++;
            }
        }
        return palind==s.length();

}
}