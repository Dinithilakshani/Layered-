package com.example.layeredarchitecture.bo.custom.impl;

import com.example.layeredarchitecture.DTO.CustomerDTO;
import com.example.layeredarchitecture.bo.custom.ItemBO;
import com.example.layeredarchitecture.dao.DAOFactory;
import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.DTO.ItemDTO;
import com.example.layeredarchitecture.entity.Customer;
import com.example.layeredarchitecture.entity.Item;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl implements ItemBO {

    ItemDAO itemDAO = (ItemDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOType.ITEM);
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {

        ArrayList<Item>items=itemDAO.getAll();
        ArrayList<ItemDTO>itemDTOS = new ArrayList<>();
        for (Item i : items){
            ItemDTO itemDTO = new ItemDTO(i.getCode(),i.getDescription(),i.getUnitPrice(),i.getQtyOnHand());
            itemDTOS.add(itemDTO);
        }

        return itemDTOS;
    }



    public boolean delete(String code) throws SQLException, ClassNotFoundException {


        return itemDAO.delete(code);

    }

    public boolean add(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.add(new Item(dto.getCode(),dto.getDescription(),dto.getUnitPrice(),dto.getQtyOnHand()));

    }

    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.update(new Item(dto.getCode(),dto.getDescription(),dto.getUnitPrice(),dto.getQtyOnHand()));
    }

    public boolean exist(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exist(code);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return itemDAO.generateNewID();

    }

    public ItemDTO search(String code) throws SQLException, ClassNotFoundException {

        Item i = itemDAO.search(code);
        ItemDTO itemDTO = new ItemDTO(i.getCode(),i.getDescription(),i.getUnitPrice(),i.getQtyOnHand());
        return itemDTO;

    }
}
