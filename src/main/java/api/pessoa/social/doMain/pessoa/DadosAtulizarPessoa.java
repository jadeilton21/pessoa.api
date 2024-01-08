package api.pessoa.social.doMain.pessoa;

import api.pessoa.social.doMain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtulizarPessoa(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {


}