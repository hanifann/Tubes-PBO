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
    private String genderDokter;
    private String tglLahirDokter;
    private String tglMulaiKerja;
    private String noTelpDokter;
    private String alamatDokter;
    

    public Dokter() {
    }

    public Dokter(int id_dokter, int id_Spesialisasi, int id_poliklinik, String namaDokter, String genderDokter, String tglLahirDokter, String noTelpDokter, String alamatDokter, String tglMulaiKerja) {
        this.id_dokter = id_dokter;
        this.id_Spesialisasi = id_Spesialisasi;
        this.id_poliklinik = id_poliklinik;
        this.namaDokter = namaDokter;
        this.genderDokter = genderDokter;
        this.tglLahirDokter = tglLahirDokter;
        this.noTelpDokter = noTelpDokter;
        this.alamatDokter = alamatDokter;
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public int getId_dokter() {
        return id_dokter;
    }

    public void setId_dokter(int id_dokter) {
        this.id_dokter = id_dokter;
    }

    public int getId_Spesialisasi() {
        return id_Spesialisasi;
    }

    public void setId_Spesialisasi(int id_Spesialisasi) {
        this.id_Spesialisasi = id_Spesialisasi;
    }

    public int getId_poliklinik() {
        return id_poliklinik;
    }

    public void setId_poliklinik(int id_poliklinik) {
        this.id_poliklinik = id_poliklinik;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getGenderDokter() {
        return genderDokter;
    }

    public void setGenderDokter(String genderDokter) {
        this.genderDokter = genderDokter;
    }

    public String getTglLahirDokter() {
        return tglLahirDokter;
    }

    public void setTglLahirDokter(String tglLahirDokter) {
        this.tglLahirDokter = tglLahirDokter;
    }

    public String getNoTelpDokter() {
        return noTelpDokter;
    }

    public void setNoTelpDokter(String noTelpDokter) {
        this.noTelpDokter = noTelpDokter;
    }

    public String getAlamatDokter() {
        return alamatDokter;
    }

    public void setAlamatDokter(String alamatDokter) {
        this.alamatDokter = alamatDokter;
    }

    public String getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    public void setTglMulaiKerja(String tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

   
}
