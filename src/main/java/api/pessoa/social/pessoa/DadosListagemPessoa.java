package api.pessoa.social.pessoa;

import api.pessoa.social.endereco.Endereco;

public record DadosListagemPessoa(Long id, String nome, String email, String cpf, String idade, String telefone, Profissoess profissoess, Endereco endereco) {

    public DadosListagemPessoa(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getEmail(), pessoa.getCpf(), pessoa.getNome(), pessoa.getTelefone(), pessoa.getProfissoess(),pessoa.getEndereco());
    }
}