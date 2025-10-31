package org.example.model;

import java.util.List;

public record BlogResponse(
        List<BlogItem> items
) {
    public record BlogItem(
            String title,
            String link,
            String description,
            String bloggername,
            String bloggerlink,
            String postdate
    ) {}
}
