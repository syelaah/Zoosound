package binatang;

/**
 *
 * @author sye
 */
public class Binatang {
    
    String nama;
    
    public void Hewan(String nama){
        nama = this.nama;
    }

    @Override
    public String toString() {
        return "Binatang [nama = " + nama + "]";
    }
}
