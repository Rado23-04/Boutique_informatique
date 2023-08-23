package ConnectionDatabase;

import Model.Products;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class ProductsDAO extends GenericDAO<Products> {

    public ProductsDAO(Connection connection) {
        super(connection);
    }

    public void Insert (Products insert) throws SQLException{
        String sql = "INSERT INTO products (id, name, description, prix, quantity"+
                "VALUES (?,?,?,?,?)";
        try(PreparedStatement statement = getConnection().prepareStatement(sql)){
            statement.setInt(1,insert.getId());
            statement.setString(2,insert.getName());
            statement.setString(3,insert.getDescription());
            statement.setFloat(4,insert.getPrice());
            statement.setInt(5,insert.getQuantity());
            statement.executeUpdate();
        }
    }
    @Override
    public List<Products> listeProducts () throws SQLException{
        List<Products> listeProducts = new ArrayList<>();
        String sql = "SELECT * FROM products";
        try(Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql)){
            while (resultSet.next()){
                Products products = extractProductsFromResultSet(resultSet);
                listeProducts.add(products);
            }
        }
        return listeProducts;
    }

    private Products extractProductsFromResultSet(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String description = resultSet.getString("description");
        Float price = resultSet.getFloat("price");
        int quantity = resultSet.getInt("quantity");

        return new Products(id,name,description,price,quantity);
    }
    @Override
    public void delete (int id) throws SQLException{
        String sql = "DELETE FROM products WHERE id = ?";
        try (PreparedStatement statement = getConnection().prepareStatement(sql)){
            statement.setInt(1,id);
            statement.executeUpdate();
        }
    }
}
