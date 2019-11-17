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

    public Karyawan() {
    }

    public Karyawan(int id_karyawan, String namaKaryawan, String jabatanKaryawan) {
        this.id_karyawan = id_karyawan;
        this.namaKaryawan = namaKaryawan;
        this.jabatanKaryawan = jabatanKaryawan;
    }
    
    
}
