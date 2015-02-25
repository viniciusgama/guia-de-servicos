package br.gov.servicos.servico;

import lombok.Value;
import org.springframework.data.elasticsearch.annotations.Field;

import static org.springframework.data.elasticsearch.annotations.FieldType.String;

@Value
public class Orgao {

    @Field(type = String)
    String nome;

    @Field(type = String)
    String telefone;

    public Orgao() {
        this(null, null);
    }

    public Orgao(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
}
