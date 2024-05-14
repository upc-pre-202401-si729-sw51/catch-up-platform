package com.acme.catchup.platform.news.domain.model.commands;

public record CreateFavoriteSourceCommand(String newsApiKey, String sourceId) {
    public CreateFavoriteSourceCommand {
        if (newsApiKey == null || newsApiKey.isEmpty())
            throw new IllegalArgumentException("NewsApiKey cannot be null or empty");
        if (sourceId == null || sourceId.isEmpty())
            throw new IllegalArgumentException("SourceId cannot be null or empty");
    }
}
