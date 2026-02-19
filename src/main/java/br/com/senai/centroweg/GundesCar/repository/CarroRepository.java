package br.com.senai.centroweg.GundesCar.repository;

import br.com.senai.centroweg.GundesCar.model.Carro;
import br.com.senai.centroweg.GundesCar.util.Db;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarroRepository {


    public Carro cadastrarCarro (Carro carro) throws SQLException{

        String query = """
                INSERT into carros
                (modelo,
                ano,
                marca,
                cor,
                preco,
                peso) VALUES
                (?,?,?,?,?,?)
                """;

        try(Connection conn = Db.conectar();
            PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){

            stmt.setString(1, carro.getModelo());
            stmt.setInt(2, carro.getAno());
            stmt.setString(3, carro.getMarca());
            stmt.setString(4, carro.getCor());
            stmt.setDouble(5, carro.getPreco());
            stmt.setDouble(6, carro.getPeso());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()){
                carro.setId(rs.getInt(1));
            }
            return carro;
        }
    }

    public List<Carro> verCarros() throws SQLException{
        String query = "SELECT id, modelo, ano, marca, cor, preco, peso FROM carros";
        List<Carro> carros = new ArrayList<>();

        try(Connection conn = Db.conectar();
            var stmt = conn.prepareStatement(query)){

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                carros.add(new Carro(
                        rs.getInt("id"),
                        rs.getString("modelo"),
                        rs.getInt("ano"),
                        rs.getString("marca"),
                        rs.getString("cor"),
                        rs.getDouble("preco"),
                        rs.getDouble("peso")
                ));
            }
            return carros;
        }
    }

    public List<Carro> verCarrosFiltrados(String marca) throws SQLException{
        String query = "SELECT id, modelo, ano, marca, cor, preco, peso FROM carros WHERE marca = ?";
        List<Carro> carros = new ArrayList<>();

        try(Connection conn = Db.conectar();
            var stmt = conn.prepareStatement(query)){

            stmt.setString(1, marca);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                carros.add(new Carro(
                        rs.getInt("id"),
                        rs.getString("modelo"),
                        rs.getInt("ano"),
                        rs.getString("marca"),
                        rs.getString("cor"),
                        rs.getDouble("preco"),
                        rs.getDouble("peso")
                ));
            }
            return carros;
        }
    }

    public Carro escolherCarro(int id) throws SQLException{

        String query = """
                SELECT
                id,
                modelo,
                ano,
                marca,
                cor,
                preco,
                peso
                FROM carros
                WHERE id = ?
                """;

        try(Connection conn = Db.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()){

                return new Carro(
                        rs.getInt("id"),
                        rs.getString("modelo"),
                        rs.getInt("ano"),
                        rs.getString("marca"),
                        rs.getString("cor"),
                        rs.getDouble("preco"),
                        rs.getDouble("peso")
                );
            }
        }
        return null;
    }

    public void comprarCarro(int id) throws SQLException{
        String query = "DELETE FROM carros WHERE id = ?";

        try(Connection conn = Db.conectar();
            var stmt = conn.prepareStatement(query)){

            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

}
