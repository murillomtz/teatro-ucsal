package br.ucsal.teatroucsal.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

import static com.fasterxml.jackson.annotation.JsonInclude.*;

@Entity
@Table(name = "tb_espetaculo")
@Data
@NoArgsConstructor
public class EspetaculoEntity implements Serializable {

    @JsonInclude(Include.NON_NULL)
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Long id;

    @JsonInclude(Include.NON_EMPTY)
    @Column(name = "valor")
    private Integer valor;

    @JsonInclude(Include.NON_EMPTY)
    @Column(name = "nome")
    private String nome;

}