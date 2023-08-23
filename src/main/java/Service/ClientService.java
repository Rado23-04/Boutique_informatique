package Service;

import Model.Client;

import java.sql.SQLException;
import java.util.List;

public class ClientService {
    private ClientService clientService;
    private ClientService (ClientService clientService){
        this.clientService = clientService;
    }
    public Client insert (Client insert) throws SQLException {
        this.clientService.insert(insert);
        return insert;
    }
    public List<Client> AllClients (){
        return Client
    }
}
