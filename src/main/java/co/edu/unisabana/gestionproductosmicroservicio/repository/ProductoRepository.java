package co.edu.unisabana.gestionproductosmicroservicio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unisabana.gestionproductosmicroservicio.entity.ProductoEntity;

public interface ProductoRepository extends MongoRepository<ProductoEntity, String>
{
    
}
