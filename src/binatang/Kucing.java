package binatang;

/**
 *
 * @author sye
 */
public class Kucing extends Mamalia{
    
    public void Kucing(String nama){
        this.nama = nama;
    }
    
    public String suara(){
        return "Meow";
    }

    @Override
    public String toString() {
        return "Kucing [Mamalia [Binatang [nama = " + nama + "]]]";
    } 
}