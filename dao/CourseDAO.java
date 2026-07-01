/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import config.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Course;
/**
 *
 * @author User
 */
public class CourseDAO {
    private Connection connection;
    public CourseDAO(){
        try{
            connection = DBConnection.getConnection();       
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Course>getAll(){
       List<Course> course = new ArrayList<>();
       
       try{
           String sql = "SELECT * FROM courses";
           PreparedStatement stmt = connection.prepareStatement(sql);
           
           ResultSet rs = stmt.executeQuery();
           while(rs.next()){
               int id = rs.getInt("courseID");
               String code = rs.getString("code");
               String name = rs.getString("name");
               int sks = Integer.parseInt(rs.getString("sks"));
               int semester = Integer.parseInt(rs.getString("semester"));
               
               course.add(new Course(code,name,sks,semester));
               
           }
       }catch(SQLException e){
           e.printStackTrace();
       }
       return course;
    }
}
