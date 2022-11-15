package co.edu.unisabana.gestionproductosmicroservicio.controller;

import org.springframework.http.HttpStatus;
import co.edu.unisabana.gestionproductosmicroservicio.entity.ProductoEntity;
import co.edu.unisabana.gestionproductosmicroservicio.repository.ProductoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ProductoControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private ProductoRepository productoRepository;
    private ProductoEntity productoEntity;
    
    private static final String PATH_LOOKFOR = "/api/productos";

    @Test
    public void Given__When_getAllProductos_Then_return_List (){
        ProductoEntity productoEntity = new ProductoEntity();
        productoRepository.insert(productoEntity);
        ResponseEntity<List> result = restTemplate.getForEntity(PATH_LOOKFOR,List.class);
        assertEquals(null ,result.getBody());
    }

    @Test
    public void Given_productoEntity_When_crearProducto_Then_return_pEntity (){
        ProductoEntity pEntity = new ProductoEntity();
        restTemplate.postForEntity(PATH_LOOKFOR,pEntity, ProductoEntity.class);
        ResponseEntity<ProductoEntity> result = restTemplate.postForEntity(PATH_LOOKFOR, pEntity, ProductoEntity.class);
        assertEquals(null,result.getBody());
    }
}
