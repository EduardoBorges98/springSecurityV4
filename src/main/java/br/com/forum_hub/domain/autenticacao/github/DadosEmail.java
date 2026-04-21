package br.com.forum_hub.domain.autenticacao.github;

public record DadosEmail(String email,
                         boolean primary,
                         boolean verified,
                         String visibility) {
}
