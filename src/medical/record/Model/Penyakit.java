/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.record.Model;

/**
 *
 * @author safrn
 */
public class Penyakit {
    private int kode_penyakit;
    private String namaPenyakit;

    public Penyakit() {
    }

    public Penyakit(int kode_penyakit, String namaPenyakit) {
        this.kode_penyakit = kode_penyakit;
        this.namaPenyakit = namaPenyakit;
    }
    
}
