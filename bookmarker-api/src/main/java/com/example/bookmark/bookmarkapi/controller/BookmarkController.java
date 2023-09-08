package com.example.bookmark.bookmarkapi.controller;

import com.example.bookmark.bookmarkapi.dto.BookmarkDTO;
import com.example.bookmark.bookmarkapi.dto.BookmarksDTO;
import com.example.bookmark.bookmarkapi.dto.CreateBookmarkRequest;
import com.example.bookmark.bookmarkapi.service.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
    private final BookmarkService bookmarkService;

    @GetMapping
    public BookmarksDTO getBookmarks(@RequestParam(name = "page", defaultValue = "1") Integer page,
                                     @RequestParam(name = "query", required = false) String query) {
        if (query == null || query.trim().length() == 0) {
            return bookmarkService.getBookmarks(page);
        }
        return bookmarkService.searchBookmarks(page, query);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookmarkDTO createBookmark(@RequestBody @Valid CreateBookmarkRequest createBookmarkRequest) {
        return bookmarkService.createBookmark(createBookmarkRequest);
    }
}
