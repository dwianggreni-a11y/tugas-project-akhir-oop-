/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;

import dao.lecturerDAO;
import java.util.List;
import model.lecture;

public class lecturerController {

    private final lecturerDAO lecturerDao;

    public lecturerController() {
        lecturerDao = new lecturerDAO();
    }
    public int create(lecture lecturer) {
    return lecturerDao.create(lecturer);
}

    public List<lecture> getAllLectures() {
        return lecturerDao.getAll();
    }

}
