package br.com.senai.centroweg.GundesCar.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

    private static final String URL = "jdbc:mysql://localhost:3306/Gundescar?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String NAME = "root";
    private static final String PASS = "mysqlPW";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, NAME, PASS);
    }

}
