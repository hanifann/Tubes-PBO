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
public class Dokter {
    int id_Dokter;
    int id_Spesialisasi;
    int id_poliklinik;
    String namaDokter;
    String tglLahirDokter;
    String noTelpDokter;
    String alamatDokter;

    public Dokter() {
    }

    public Dokter(int id_Dokter, int id_Spesialisasi, int id_poliklinik, String namaDokter, String tglLahirDokter, String noTelpDokter, String alamatDokter) {
        this.id_Dokter = id_Dokter;
        this.id_Spesialisasi = id_Spesialisasi;
        this.id_poliklinik = id_poliklinik;
        this.namaDokter = namaDokter;
        this.tglLahirDokter = tglLahirDokter;
        this.noTelpDokter = noTelpDokter;
        this.alamatDokter = alamatDokter;
    }
    
    
    
}
