/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.record.Model;

/**
 *
 * @author NisaFitrianti
 */
public class Poliklinik extends Spesialisasi{
    int id_poliklinik;
    String namaPoliklinik;

    public Poliklinik() {
    }

    public Poliklinik(int id_poliklinik, String namaPoliklinik, int id_spesialisasi, String namaSpesialisasi, int id_penyakit, String namaPenyakit) {
        super(id_spesialisasi, namaSpesialisasi, id_penyakit, namaPenyakit);
        this.id_poliklinik = id_poliklinik;
        this.namaPoliklinik = namaPoliklinik;
    }   
    
}
