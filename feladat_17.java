class Feladat_17 {

    public static void main(String[] args) {
        
        squareASCII();

    }

    static void squareASCII() {

        // 65 A -> 122 z
        for( int i = 65; i <= 122; i++ ) {


            if( Math.pow( (int)Math.sqrt(i), 2 ) == i ) {

                System.out.print( (char)i );

            }

        }

        System.out.print("\n");

    }

}