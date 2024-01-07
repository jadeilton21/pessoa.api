package api.pessoa.social.pessoa;

import api.pessoa.social.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtulizarPessoa(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {


}