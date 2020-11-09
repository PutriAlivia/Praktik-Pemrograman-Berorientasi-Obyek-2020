
package interfacelatihan;
import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;

/**
 *
 * @author ACER A315-41
 */
public class interfacemain {
    public static void main(String[] args) {
       Rektor pakrektor = new Rektor();
       
       Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
       Sarjana sarjanaCumlaude = new Sarjana("Putri A");
       PascaSarjana masterCumlaude = new PascaSarjana("Elok");
       
        pakrektor.beriSertifikatCumlaude(mahasiswaBiasa);
       pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
       pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
    
}
