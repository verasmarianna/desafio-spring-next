package desafionext.cesarschool.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id_insutance;

    @Enumerated(EnumType.STRING)
    private type_insurance type_insurance;
    
    private int risk_insurance;
    
    @Enumerated(EnumType.STRING)
    private analysis_insurance analysis_insurance;
    
    private String observation_insurance;

}
