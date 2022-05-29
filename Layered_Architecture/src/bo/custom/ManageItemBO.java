/**
 * @author : ALE_IS_TER
 * Project Name: Layered_Architecture
 * Date        : 5/28/2022
 * Time        : 1:25 AM
 * @Since : 0.1.0
 */

package bo.custom;

import bo.SuperBO;
import dto.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ManageItemBO extends SuperBO {
    ArrayList<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException;
    void deleteItems(String code) throws SQLException, ClassNotFoundException;
    void saveItems(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    void updateItems(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    boolean existItem(String code) throws SQLException, ClassNotFoundException;
    String generateNewId() throws SQLException, ClassNotFoundException;
}
