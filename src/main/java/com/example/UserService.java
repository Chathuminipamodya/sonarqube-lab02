package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserService {

    // SECURITY ISSUE: Hardcoded credentials
    private String password = "admin123";

    // Fixed: Using PreparedStatement to prevent SQL Injection
    public void findUser(String username) throws SQLException {
        String url = "jdbc:mysql://localhost/db";
        String query = "SELECT * FROM users WHERE name = ?";
        
        try (Connection conn = DriverManager.getConnection(url, "root", password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.executeQuery();
        }
    }

    // Fixed: Using PreparedStatement to prevent SQL Injection
    public void deleteUser(String username) throws SQLException {
        String url = "jdbc:mysql://localhost/db";
        String query = "DELETE FROM users WHERE name = ?";
        
        try (Connection conn = DriverManager.getConnection(url, "root", password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.execute();
        }
    }
}