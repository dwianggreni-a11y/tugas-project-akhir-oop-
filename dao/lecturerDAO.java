/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.DBConnection;
import model.lecture;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lecturerDAO {
    public int create(lecture lecturer) {

    try {

        String sql = "INSERT INTO lecturers(cardID,name,nidn,expertise) VALUES(?,?,?,?)";

        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, lecturer.getCardID());
        stmt.setString(2, lecturer.getName());
        stmt.setString(3, lecturer.getNidn());
        stmt.setString(4, lecturer.getExpertise());

        stmt.executeUpdate();

        return 1;

    } catch (SQLException e) {

        e.printStackTrace();
        return 0;

    }
}

    private Connection connection;

    public lecturerDAO() {
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(lecturerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<lecture> getAll() {

        List<lecture> lecturers = new ArrayList<>();

        try {

            String sql = "SELECT * FROM lecturers";

            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                String cardID = rs.getString("cardID");
                String name = rs.getString("name");
                String nidn = rs.getString("nidn");
                String expertise = rs.getString("expertise");

                lecturers.add(
                        new lecture(cardID, name, nidn, expertise)
                );

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return lecturers;

    }

}
