package br.com.ada.bankcode.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bankId;
    private UUID id;
    private String codigoBacen;
    private String nome;

    @Override
    public String toString() {
        return "Banco{" +
                "id=" + id +
                ", bankId=" + bankId +
                ", codigoBacen='" + codigoBacen + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
