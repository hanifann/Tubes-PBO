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
public class Pasien {
    int id_Pasien;
    String namaPasien;
    char genderPasien;
    String tglLahirPasien;
    String noTelpPasien;
    String alamatPasien;
    String pekerjaanPasien;

    public Pasien() {
    }

    public Pasien(int id_Pasien, String namaPasien, char genderPasien, String tglLahirPasien, String noTelpPasien, String alamatPasien, String pekerjaanPasien) {
        this.id_Pasien = id_Pasien;
        this.namaPasien = namaPasien;
        this.genderPasien = genderPasien;
        this.tglLahirPasien = tglLahirPasien;
        this.noTelpPasien = noTelpPasien;
        this.alamatPasien = alamatPasien;
        this.pekerjaanPasien = pekerjaanPasien;
    }
    
    
    
}
