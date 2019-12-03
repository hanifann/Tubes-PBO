/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.record.Model;

/**
 *
 * @author zetsuen
 */
public class MedicalRecord {
    
    private int id_medicalrecord;
    private int id_pasien;
    private int id_dokter;
    private int kode_penyakit;
    private int kode_spesialisasi;
    private int kode_poliklinik;
    private String nama_dokter;
    private String nama_pasien;    
    private String pengobatan;
    private String tindakan;
    private String ruangPerawatan;
    private String tglMasuk;
    private String tglKeluar;
    private String jenisRM;

    public MedicalRecord(int id_medicalrecord, int id_pasien, int id_dokter, int kode_penyakit, int kode_spesialisasi, int kode_poliklinik,String pengobatan, String tindakan, String ruangPerawatan, String tglMasuk, String tglKeluar, String jenisRM) {
        this.id_medicalrecord = id_medicalrecord;
        this.id_pasien = id_pasien;
        this.id_dokter = id_dokter;
        this.kode_penyakit = kode_penyakit;
        this.kode_spesialisasi = kode_spesialisasi;
        this.kode_poliklinik = kode_poliklinik;
        this.nama_dokter = nama_dokter;
        this.nama_pasien = nama_pasien;
        this.pengobatan = pengobatan;
        this.tindakan = tindakan;
        this.ruangPerawatan = ruangPerawatan;
        this.tglMasuk = tglMasuk;
        this.tglKeluar = tglKeluar;
        this.jenisRM = jenisRM;
    }

    public MedicalRecord(int id_medicalrecord) {
        this.id_medicalrecord = id_medicalrecord;
    }

    public String getJenisRM() {
        return jenisRM;
    }

    public void setJenisRM(String jenisRM) {
        this.jenisRM = jenisRM;
    }

    public int getId_medicalrecord() {
        return id_medicalrecord;
    }

    public void setId_medicalrecord(int id_medicalrecord) {
        this.id_medicalrecord = id_medicalrecord;
    }

    public int getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(int id_pasien) {
        this.id_pasien = id_pasien;
    }

    public int getId_dokter() {
        return id_dokter;
    }

    public void setId_dokter(int id_dokter) {
        this.id_dokter = id_dokter;
    }

    public int getKode_penyakit() {
        return kode_penyakit;
    }

    public void setKode_penyakit(int kode_penyakit) {
        this.kode_penyakit = kode_penyakit;
    }

    public int getKode_spesialisasi() {
        return kode_spesialisasi;
    }

    public void setKode_spesialisasi(int kode_spesialisasi) {
        this.kode_spesialisasi = kode_spesialisasi;
    }

    public int getKode_poliklinik() {
        return kode_poliklinik;
    }

    public void setKode_poliklinik(int kode_poliklinik) {
        this.kode_poliklinik = kode_poliklinik;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getNama_pasien() {
        return nama_pasien;
    }

    public void setNama_pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }

    public String getPengobatan() {
        return pengobatan;
    }

    public void setPengobatan(String pengobatan) {
        this.pengobatan = pengobatan;
    }

    public String getTindakan() {
        return tindakan;
    }

    public void setTindakan(String tindakan) {
        this.tindakan = tindakan;
    }

    public String getRuangPerawatan() {
        return ruangPerawatan;
    }

    public void setRuangPerawatan(String ruangPerawatan) {
        this.ruangPerawatan = ruangPerawatan;
    }

    public String getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(String tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public String getTglKeluar() {
        return tglKeluar;
    }

    public void setTglKeluar(String tglKeluar) {
        this.tglKeluar = tglKeluar;
    }
}
