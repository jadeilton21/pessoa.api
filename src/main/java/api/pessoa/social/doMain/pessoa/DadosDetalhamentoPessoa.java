package api.pessoa.social.doMain.pessoa;

import api.pessoa.social.doMain.endereco.Endereco;

public record DadosDetalhamentoPessoa(Long id, String nome, String email, String cpf, String telefone, String idade, Profissoess profissoess, Endereco endereco) {



    public DadosDetalhamentoPessoa(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getEmail(), pessoa.getCpf(), pessoa.getIdade(), pessoa.getTelefone(), pessoa.getProfissoess(), pessoa.getEndereco());
    }


}