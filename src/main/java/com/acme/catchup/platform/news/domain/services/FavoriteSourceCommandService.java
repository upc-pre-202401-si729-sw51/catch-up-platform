/**
 * @summary
 * Service that handles the commands related to the favorite sources.
 * It is responsible for creating a new favorite source.
 */
package com.acme.catchup.platform.news.domain.services;

import com.acme.catchup.platform.news.domain.model.aggregates.FavoriteSource;
import com.acme.catchup.platform.news.domain.model.commands.CreateFavoriteSourceCommand;

import java.util.Optional;

public interface FavoriteSourceCommandService {
    // Creates a new favorite source.
    Optional<FavoriteSource> handle(CreateFavoriteSourceCommand command);
}
