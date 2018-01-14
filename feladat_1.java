public class SzakdogaFeladatok {
    
    public static void main(String[] args) {     
        task12("Ez itt a 9991 osztója, az 1");
    }
    
    // 1. Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy prímszám-e, vagy sem!
    public static boolean isPrime(int num) {
	if ((num != 0) && (num != 1)) {
            for ( int i=2; i<num; i++ ) {
		if ( (num%i == 0) && ((num != i) && (i != 1)) ) {
                    return false;
		}
            }
	}
        else if(num==0 || num==1) {
            return false;
        }
	else {
            return true;
	}
        
        return true;
    }
    
    
}

