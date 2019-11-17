/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.record.Model;

/**
 *
 * @author Acer
 */
public class Spesialisasi extends Penyakit{
    int id_spesialisasi;
    String namaSpesialisasi;

    public Spesialisasi() {
    }
    
    public Spesialisasi(int id_spesialisasi, String namaSpesialisasi, int id_penyakit, String namaPenyakit) {
        super(id_penyakit, namaPenyakit);
        this.id_spesialisasi = id_spesialisasi;
        this.namaSpesialisasi = namaSpesialisasi;
    }
    
    
   
}
