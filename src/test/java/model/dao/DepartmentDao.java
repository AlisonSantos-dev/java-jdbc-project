package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj); //Insere os Departamentos
    void update(Department obj); //Atualiza os Departamentos
    void deleteById(Integer id); //Deleta os IDs
    Department findById(Integer id); //Consulta no Banco Departamentos com tal ID
    List<Department> findAll(); //Tras todos os Departamentos
}
