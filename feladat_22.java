class Feladat_22 {

    public static void main(String[] args) {
        
        int[] arr = { 10, 2, 2, 3, 4, 3 };

        System.out.println( vanELeggyakrabbSzam(arr) );

    }

    static boolean vanELeggyakrabbSzam( int[] arr ) {

        int maxElofordulas = 0;
        int elofordulas = 0;
        boolean bool = false;

        for( int i=0; i < arr.length; i++ ) {

            for( int j = i + 1; j < arr.length; j++) {

                if( arr[j] == arr[i] ) {

                    elofordulas++;

                }

            }

            if(elofordulas > maxElofordulas) {

                maxElofordulas = elofordulas;

            }
            else if( elofordulas == maxElofordulas ) {

                elofordulas = 0;
                maxElofordulas = 0;

            }
            else if( i == arr.length - 1 && elofordulas < maxElofordulas ) {

                bool = true;

            }

            elofordulas = 0;

        }

        return bool;

    }

}