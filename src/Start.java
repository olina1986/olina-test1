public class Start {

    //metoda startowa
    static public void main(String[] args) {

        Produkt poszewka = new Produkt("poszewka", "materiał", 20L);
        Produkt kokarda = new Produkt ("kokarda", "materiał", 10L);
        Produkt zamek = new Produkt("zamek", "zamek błyskawiczny", 10L);
        Koszyk koszyk = new Koszyk ();
        koszyk.dodajProdukt(poszewka);
        koszyk.dodajProdukt(kokarda);
        koszyk.dodajProdukt(zamek);


        System.out.println("Wartość koszyka: "+koszyk.pokazCena());
    }

}
