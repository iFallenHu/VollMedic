package med.voll.api.medico;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import med.voll.api.endereco.Endereco;

@Table(name ="medicos")
@Entity(name ="Medico")
public class Medico {

    private Long id;
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    private Endereco endereco;
}
