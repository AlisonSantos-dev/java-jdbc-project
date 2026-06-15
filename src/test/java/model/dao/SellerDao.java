package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj); //Insere os Vendedores
    void update(Seller obj); //Atualiza os Vendedores
    void deleteById(Integer id); //Deleta os IDs
    Seller findById(Integer id); //Consulta no Banco Vendedores com tal ID
    List<Seller> findAll(); //Tras todos os Vendedores
    List<Seller> findByDepartment(Department department); //Lista os Departamentos por Clientes
}
