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
public class Pasien {
    int id_Pasien;
    String namaPasien;
    char gender;
    String tglLahir;
    String noTelp;
    String alamat;
    String pekerjaan;

    public Pasien() {
    }

    public Pasien(int id_Pasien, String namaPasien, char gender, String tglLahir, String noTelp, String alamat, String pekerjaan) {
        this.id_Pasien = id_Pasien;
        this.namaPasien = namaPasien;
        this.gender = gender;
        this.tglLahir = tglLahir;
        this.noTelp = noTelp;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
    }
    
    
    
}
