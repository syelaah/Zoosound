package binatang;

/**
 *
 * @author sye
 */
public class Ayam extends Unggas{
    
    public void Ayam(String nama){
        this.nama = nama;
    }
    
    public String suara(){
        return "Petok petok";
    }
    
    public String suara(Ayam lainnya){
        return "Kukuruyuk";
    }

    @Override
    public String toString() {
        return "Ayam [Unggas [Binatang [nama = " + nama + "]]]";
    }
}