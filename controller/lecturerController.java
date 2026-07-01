/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.lecturerDAO;
import model.lecturer;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


/**
 *
 * @author User
 */
public class lecturerController {
    private final lecturerDAO lecturerDao;
    
    public lecturerController(){
        this.lecturerDao = new lectrurerDAO();
    }
    
    public List<Lecturer> getAllLecturers(){
        return lecturerDao.getAll();   
    }
            
                   
    
    
}
