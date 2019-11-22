/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.record.Model;

/**
 *
 * @author saftrn
 */
public class Dokter {
    private int id_dokter;
    private int id_Spesialisasi;
    private int id_poliklinik;
    private String namaDokter;
    private String tglLahirDokter;
    private String noTelpDokter;
    private String alamatDokter;
    private String tglMulaiKerja;

    public Dokter() {
    }

    public Dokter(int id_dokter, int id_Spesialisasi, int id_poliklinik, String namaDokter, String tglLahirDokter, String noTelpDokter, String alamatDokter, String tglMulaiKerja) {
        this.id_dokter = id_dokter;
        this.id_Spesialisasi = id_Spesialisasi;
        this.id_poliklinik = id_poliklinik;
        this.namaDokter = namaDokter;
        this.tglLahirDokter = tglLahirDokter;
        this.noTelpDokter = noTelpDokter;
        this.alamatDokter = alamatDokter;
        this.tglMulaiKerja = tglMulaiKerja;
    }    
    
}
