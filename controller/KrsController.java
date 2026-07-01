/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.KRSDAO;
import java.util.List;
import model.KRS;

public class KrsController {

    private KRSDAO dao;

    public KrsController(KRSDAO dao) {
        this.dao = dao;
    }

    // INSERT DATA KRS
    public boolean insertKRS(KRS krs) {
        return dao.insert(krs);
    }

    // AMBIL SEMUA DATA
    public List<KRS> getAllKRS() {
        return dao.getAll();
    }
}