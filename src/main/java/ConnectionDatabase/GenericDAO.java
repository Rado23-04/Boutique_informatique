package ConnectionDatabase;

import Model.Client;

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
}
