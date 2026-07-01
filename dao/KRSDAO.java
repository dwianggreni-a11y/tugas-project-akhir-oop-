/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.KRS;

public class KRSDAO {

    private Connection conn;

    public KRSDAO(Connection conn) {
        this.conn = conn;
    }

   
    public boolean insert(KRS krs) {
        String sql = "INSERT INTO krs (course_name, lecture_name, semester, score, grade) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, krs.getCourse().getCourseName());
            ps.setString(2, krs.getLecture().getName());
            ps.setInt(3, krs.getSemester());
            ps.setDouble(4, krs.getScore());
            ps.setString(5, krs.getGrade());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Insert KRS error: " + e.getMessage());
            return false;
        }
    }

    
    public List<KRS> getAll() {
        List<KRS> list = new ArrayList<>();
        String sql = "SELECT * FROM krs";

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                
                KRS k = new KRS(
                    new model.Course(rs.getString("course_name"), "", 0, 0),
                    rs.getDouble("score")
                );

                k.setSemester(rs.getInt("semester"));
                k.setLecture(new model.lecture("", rs.getString("lecture_name"), "", ""));

                list.add(k);
            }

        } catch (SQLException e) {
            System.out.println("Get KRS error: " + e.getMessage());
        }

        return list;
    }
}
