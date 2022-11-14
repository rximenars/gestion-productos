package co.edu.unisabana.gestionproductosmicroservicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unisabana.gestionproductosmicroservicio.entity.ProductoEntity;
import co.edu.unisabana.gestionproductosmicroservicio.repository.ProductoRepository;

@RestController
@RequestMapping("/api/productos")
public class ProductoController 
{
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductoEntity> getAllProductos()
    {
        return productoRepository.findAll();
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void crearProducto(@RequestBody ProductoEntity productoEntity)
    {
        productoRepository.save(productoEntity);
    }
}
