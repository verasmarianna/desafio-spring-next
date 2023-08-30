package desafionext.cesarschool.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getters e Stters
@Builder //contrutores
@NoArgsConstructor // contrutor sem atributos
@Entity //diz que essa clase será mapeapa para uma tabela em um banco de dados relacional. 
@AllArgsConstructor // Construtor com todos os atributos

public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_House;

    @Enumerated(EnumType.STRING)
    private ownership_status ownership_status;
    
    private String house_location;
    private String house_zipcode;
    
    private Date houseCreateInfo;
    private Date houseUpdateInfo;
    
    @ManyToOne
    private Client client_id;

}
