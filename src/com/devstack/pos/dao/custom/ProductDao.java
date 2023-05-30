package com.devstack.pos.dao.custom;

import com.devstack.pos.entity.User;

import java.util.List;

public interface ProductDao {
    public boolean saveProduct(User user);
    public boolean updateProduct(User user);
    public boolean deleteProduct(String email);
    public boolean findProduct(String email);
    public List<Product> findAllCustomers();
}
}
