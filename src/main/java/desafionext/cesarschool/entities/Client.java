package desafionext.cesarschool.entities;

import java.sql.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name = "client")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    //@Column(name = "client_id", nullable = false, updatable = false, unique = true)
    private Long client_id;

    @Column(nullable = false)
    private String client_name;

    @Column(nullable = false)
    private int client_age;

    @Column(nullable = false)
    private int client_dependents;

    @Column(nullable = false)
    private double client_income;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private client_marital_status client_marital_status;
    @Column(nullable = false)
    private Date createAt;
    @Column(nullable = false)
    private Date updateAt;
    
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, mappedBy = "client")
    private List<Vehicle> vehicle;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, mappedBy = "client")
    private List<House> houses;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, mappedBy = "client")
    private List<Insurance> insurance;
}
