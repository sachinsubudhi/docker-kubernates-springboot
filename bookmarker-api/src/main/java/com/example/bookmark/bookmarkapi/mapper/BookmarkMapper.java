package com.example.bookmark.bookmarkapi.mapper;


import com.example.bookmark.bookmarkapi.dto.BookmarkDTO;
import com.example.bookmark.bookmarkapi.entity.Bookmark;
import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {

    public BookmarkDTO toDto(Bookmark bookmark) {
        return new BookmarkDTO(bookmark.getId(),
                bookmark.getTitle(),
                bookmark.getUrl(),
                bookmark.getCreatedAt());
    }
}
