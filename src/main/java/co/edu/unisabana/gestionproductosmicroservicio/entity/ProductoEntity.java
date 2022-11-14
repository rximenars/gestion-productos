package co.edu.unisabana.gestionproductosmicroservicio.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(value = "producto")
@Getter
@Setter
@NoArgsConstructor


public class ProductoEntity 
{
    @Id
    private String id;
    private String nombreProducto;
    private String descripcionProducto;
    private Double valorProducto; 
}
