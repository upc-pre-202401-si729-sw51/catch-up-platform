package com.acme.catchup.platform.news.domain.model.queries;

public record GetFavoriteSourcesByNewsApiKeyQuery(String newsApiKey) {
    public GetFavoriteSourcesByNewsApiKeyQuery {
        if (newsApiKey == null || newsApiKey.isBlank()) throw new IllegalArgumentException("newsApiKey cannot be null");
    }
}
