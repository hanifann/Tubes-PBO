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
public class Karyawan {
    private int id_karyawan;
    private String namaKaryawan;
    private String jabatanKaryawan;
    private String statusKaryawan;
    private String tglLahir;
    private String tglMulaiKerja;
    private String password;

    public Karyawan() {
    }

    public Karyawan(int id_karyawan, String password) {
        this.id_karyawan = id_karyawan;
        this.password = password;
    }
    
    public Karyawan(int id_karyawan, String namaKaryawan, String jabatanKaryawan, String statusKaryawan, String tglLahir, String tglMulaiKerja, String password) {
        this.id_karyawan = id_karyawan;
        this.namaKaryawan = namaKaryawan;
        this.jabatanKaryawan = jabatanKaryawan;
        this.statusKaryawan = statusKaryawan;
        this.tglLahir = tglLahir;
        this.tglMulaiKerja = tglMulaiKerja;
        this.password = password;
    }

  

    
    
}
