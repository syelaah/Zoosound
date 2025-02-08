package binatang;

/**
 *
 * @author sye
 */
public class Anjing extends Mamalia{
    
    public void Anjing(String nama){
        this.nama = nama;
    }
    
    public String suara(){
        return "Woof woof";
    }
    
    public String suara (Anjing lainnya){
        return "Guk guk";
    }

    @Override
    public String toString() {
        return "Anjing [Mamalia [Binatang [nama = " + nama + "]]]";
    } 
}