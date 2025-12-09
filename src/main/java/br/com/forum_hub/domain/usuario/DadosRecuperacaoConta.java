package br.com.forum_hub.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosRecuperacaoConta(@NotBlank String novaSenha,
                                    @NotBlank String novaSenhaConfirmacao) {
}
