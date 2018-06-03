class feladat_3 {
    /* 3. Írjon olyan függvényt vagy metódust, amely egy karakterláncban vagy sztringben
        véletlenszerűen összekeveri a karaktereket (véletlenszám–generátor használható)! */
    public static void main(String[] args) {
        kevero(args[0]);
        System.out.print("Heelllo");
    }

    public static void kevero(String szoveg) {
        char tomb[] = new char[szoveg.length()];
        char kar = 'a';
        int mit;
        
        for(int i=0; i<szoveg.length(); i++) {
            tomb[i] = szoveg.charAt(i);
        }
        for(int j=0; j<szoveg.length(); j++) {
            mit = 0 + (int)(Math.random() * szoveg.length());
            kar = tomb[j];
            tomb[j] = tomb[mit];
            tomb[mit] = kar;
        }
        for(int k=0; k<tomb.length; k++) {
            System.out.print(tomb[k]);
        }
    }

}