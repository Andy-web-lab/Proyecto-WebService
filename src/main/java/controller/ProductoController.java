package controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import model.Producto;
import repository.ProductoRepository;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoRepository repository;

    public ProductoController(ProductoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto producto){
        System.out.println(producto);
        return repository.save(producto);
    }

    @GetMapping
    public List<Producto> listar(){
        return repository.findAll();
    }
}
