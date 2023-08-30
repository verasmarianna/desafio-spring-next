package desafionext.cesarschool.entities;

import java.sql.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getters e Stters
@Builder //contrutores
@NoArgsConstructor // contrutor sem atributos
@Entity //diz que essa clase será mapeapa para uma tabela em um banco de dados relacional. 
@AllArgsConstructor // Construtor com todos os atributos
@RequestMapping
//!@Table(name = "clients")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long client_id;
    private String client_name;
    private Date client_birthday;
    private int client_dependents;
    private double client_income;
    
    @Enumerated(EnumType.STRING)
    private client_marital_status client_marital_status;
    
    private Date createInfo;
    private Date updateInfo;
    
    @OneToMany(mappedBy = "client_client_id")
    private List<Vehicle> listVehicle;

    @OneToMany(mappedBy = "client_client_id")
    private List<House> listHouses;
}
