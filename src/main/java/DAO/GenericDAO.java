package DAO;

import Model.Client;
import Model.Products;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class GenericDAO<Z> {
    private Connection connection;
    public GenericDAO(Connection connection){
        this.connection = connection;
    }
    public Connection getConnection(){
        return connection;
    }

    public abstract List<Client> findAll() throws SQLException;

    public abstract void Insert (Products insert) throws SQLException;

    public abstract List<Products> listeProducts() throws SQLException;

    public abstract void delete(int id) throws SQLException;

    public abstract void selectById(int id_client) throws SQLException;


    public abstract void updateClient(Client update) throws SQLException;
}
