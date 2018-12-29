import java.util.ArrayList;
import java.util.List;

public class Koszyk {

    private List<Produkt> listaProduktow = new ArrayList<>();

    public void dodajProdukt (Produkt produkt){
        listaProduktow.add(produkt);
    }


}
