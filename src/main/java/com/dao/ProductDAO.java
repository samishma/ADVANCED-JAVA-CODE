package com.dao;

import java.sql.*;
import java.util.*;
import com.model.Product;

public class ProductDAO {

    // ✅ ADD PRODUCT (WITH MANUAL ID)
    public static int addProduct(Product p) {
        int status = 0;

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO Products VALUES(?,?,?,?,?)"
            );

            ps.setInt(1, p.getId());
            ps.setString(2, p.getName());
            ps.setString(3, p.getCategory());
            ps.setDouble(4, p.getPrice());
            ps.setInt(5, p.getQuantity());

            status = ps.executeUpdate();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // ✅ GET ALL PRODUCTS
    public static List<Product> getAllProducts() {

        List<Product> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("SELECT * FROM Products");
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Product p = new Product();

                p.setId(rs.getInt("ProductID"));
                p.setName(rs.getString("ProductName"));
                p.setCategory(rs.getString("Category"));
                p.setPrice(rs.getDouble("Price"));
                p.setQuantity(rs.getInt("Quantity"));

                list.add(p);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // ✅ DELETE PRODUCT
    public static int deleteProduct(int id) {
        int status = 0;

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM Products WHERE ProductID=?"
            );

            ps.setInt(1, id);
            status = ps.executeUpdate();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // ✅ UPDATE PRODUCT
    public static int updateProduct(Product p) {
        int status = 0;

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "UPDATE Products SET ProductName=?, Category=?, Price=?, Quantity=? WHERE ProductID=?"
            );

            ps.setString(1, p.getName());
            ps.setString(2, p.getCategory());
            ps.setDouble(3, p.getPrice());
            ps.setInt(4, p.getQuantity());
            ps.setInt(5, p.getId());

            status = ps.executeUpdate();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // ✅ REPORT: PRICE
    public static List<Product> getProductsByPrice(double price) {

        List<Product> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM Products WHERE Price > ?"
            );

            ps.setDouble(1, price);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Product p = new Product();

                p.setId(rs.getInt("ProductID"));
                p.setName(rs.getString("ProductName"));
                p.setCategory(rs.getString("Category"));
                p.setPrice(rs.getDouble("Price"));
                p.setQuantity(rs.getInt("Quantity"));

                list.add(p);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // ✅ REPORT: CATEGORY
    public static List<Product> getProductsByCategory(String category) {

        List<Product> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM Products WHERE Category=?"
            );

            ps.setString(1, category);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Product p = new Product();

                p.setId(rs.getInt("ProductID"));
                p.setName(rs.getString("ProductName"));
                p.setCategory(rs.getString("Category"));
                p.setPrice(rs.getDouble("Price"));
                p.setQuantity(rs.getInt("Quantity"));

                list.add(p);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // ✅ REPORT: TOP N
    public static List<Product> getTopProducts(int limit) {

        List<Product> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM Products ORDER BY Quantity DESC LIMIT ?"
            );

            ps.setInt(1, limit);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Product p = new Product();

                p.setId(rs.getInt("ProductID"));
                p.setName(rs.getString("ProductName"));
                p.setCategory(rs.getString("Category"));
                p.setPrice(rs.getDouble("Price"));
                p.setQuantity(rs.getInt("Quantity"));

                list.add(p);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}