package desafionext.cesarschool.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getters e Stters
@Builder //contrutores
@NoArgsConstructor // contrutor sem atributos
@Entity //diz que essa clase será mapeapa para uma tabela em um banco de dados relacional. 
@AllArgsConstructor // Construtor com todos os atributos

public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 

    private Long id_vehicle;
    private String vehicle_brand;
    private String vehicle_model;
    private int year; 
}
