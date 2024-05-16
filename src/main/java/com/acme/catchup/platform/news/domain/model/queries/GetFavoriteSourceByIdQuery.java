package com.acme.catchup.platform.news.domain.model.queries;

public record GetFavoriteSourceByIdQuery(Long id) {
    public GetFavoriteSourceByIdQuery {
        if (id == null || id <= 0)
            throw new IllegalArgumentException("id cannot be null or zero");
    }
}
