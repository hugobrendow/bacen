package br.com.ada.bankcode.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Chave {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Conta conta;
    private String chave;
    private TipoChave tipo;

    @Override
    public String toString() {
        return "Chave{" +
                "conta=" + conta +
                ", chave='" + chave + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
