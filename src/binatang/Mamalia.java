package binatang;

/**
 *
 * @author sye
 */
public class Mamalia extends Binatang{
    
    public void Mamalia(String nama){
        nama = this.nama;
    }

    @Override
    public String toString() {
        return "Mamalia [Binatang [nama = " + nama + "]]";
    }
}
