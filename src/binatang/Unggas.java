package binatang;

/**
 *
 * @author sye
 */
public class Unggas extends Binatang{
    
    public void Unggas(String nama){
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Unggas [Binatang [nama = " + nama + "]]";
    } 
}