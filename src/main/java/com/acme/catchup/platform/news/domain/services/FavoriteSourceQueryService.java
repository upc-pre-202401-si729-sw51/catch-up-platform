package com.acme.catchup.platform.news.domain.services;

import com.acme.catchup.platform.news.domain.model.aggregates.FavoriteSource;
import com.acme.catchup.platform.news.domain.model.queries.GetFavoriteSourceByNewsApiKeyAndSourceIdQuery;
import com.acme.catchup.platform.news.domain.model.queries.GetFavoriteSourcesByNewsApiKeyQuery;

import java.util.List;
import java.util.Optional;

public interface FavoriteSourceQueryService {
    List<FavoriteSource> handle(GetFavoriteSourcesByNewsApiKeyQuery query);
    Optional<FavoriteSource> handle(GetFavoriteSourceByNewsApiKeyAndSourceIdQuery query);
}
