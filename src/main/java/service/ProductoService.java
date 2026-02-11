package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Producto;
import repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repository;

    public Producto guardar(Producto producto){
        return repository.save(producto);
    }

    public List<Producto> listar(){
        return repository.findAll();
    }
}