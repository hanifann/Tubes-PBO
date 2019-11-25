/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.record.Model;

import medical.record.Controller.Auth;

/**
 *
 * @author saftrn
 */
public class Karyawan extends Auth{
    private int id_karyawan;
    private String namaKaryawan;
    private String genderKAryawan;
    private String tglLahir;
    private String tglMulaiKerja;
    private String statusKaryawan;    
    private String password;

    public Karyawan() {
    }

    public Karyawan(int id_karyawan, String namaKaryawan, String genderKAryawan, String tglLahir, String tglMulaiKerja) {
        this.id_karyawan = id_karyawan;
        this.namaKaryawan = namaKaryawan;
        this.genderKAryawan = genderKAryawan;
        this.tglLahir = tglLahir;
        this.tglMulaiKerja = tglMulaiKerja;
    }
    
    

    public Karyawan(int id_karyawan, String password) {
        this.id_karyawan = id_karyawan;
        this.password = password;
    }
    
    
    
    
}
