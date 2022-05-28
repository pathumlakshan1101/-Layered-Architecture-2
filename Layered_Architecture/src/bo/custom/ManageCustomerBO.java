/**
 * @author : ALE_IS_TER
 * Project Name: Layered_Architecture
 * Date        : 5/28/2022
 * Time        : 12:57 AM
 * @Since : 0.1.0
 */

package bo.custom;

import model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ManageCustomerBO {
    ArrayList<CustomerDTO> loadAllCustomers() throws SQLException, ClassNotFoundException;
    void saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    void UpdateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    boolean existCustomer(String id) throws SQLException, ClassNotFoundException;
    void deleteCustomer(String id) throws SQLException, ClassNotFoundException;
    String generateNewId () throws SQLException, ClassNotFoundException;
}