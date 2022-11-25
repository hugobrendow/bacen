package br.com.ada.bankcode.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String agencia;
    private String numero;
    private TipoConta tipo;

    @ManyToOne(cascade = CascadeType.ALL)
    private Banco banco;

    @ManyToOne(cascade = CascadeType.ALL)
    private Titular titular;

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", agencia='" + agencia + '\'' +
                ", numero='" + numero + '\'' +
                ", tipo=" + tipo +
                ", banco=" + banco +
                ", titular=" + titular +
                '}';
    }
}
