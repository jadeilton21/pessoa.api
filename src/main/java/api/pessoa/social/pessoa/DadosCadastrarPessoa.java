package api.pessoa.social.pessoa;

import api.pessoa.social.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastrarPessoa(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String cpf,
        @NotBlank
        String idade,
        @NotBlank
        String telefone,
        @NotNull
        Profissoess profissões,
        @NotNull
        @Valid
        DadosEndereco endereco) {
}