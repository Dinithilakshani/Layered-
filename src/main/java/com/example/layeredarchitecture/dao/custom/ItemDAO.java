package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.DTO.ItemDTO;
import com.example.layeredarchitecture.entity.Item;

public interface ItemDAO extends CrudDAO<Item> {

    /*public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;
    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException;
    public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException;
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException;
    public boolean existItem(String code) throws SQLException, ClassNotFoundException;
    public String generateNewCode() throws SQLException, ClassNotFoundException;
    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;*/
}
