package com.example.bookmark.bookmarkapi.controller;

import com.example.bookmark.bookmarkapi.dto.BookmarkDTO;
import com.example.bookmark.bookmarkapi.dto.BookmarksDTO;
import com.example.bookmark.bookmarkapi.dto.CreateBookmarkRequest;
import com.example.bookmark.bookmarkapi.service.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
    private final BookmarkService bookmarkService;

    @GetMapping
    public BookmarksDTO getBookmarks(@RequestParam(name = "page", defaultValue = "1") Integer page,
                                     @RequestParam(name = "query", required = false) String query) {
        if (query == null || query.trim().isEmpty()) {
            return bookmarkService.getBookmarks(page);
        }
        return bookmarkService.searchBookmarks(page, query);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookmarkDTO createBookmark(@RequestBody @Valid CreateBookmarkRequest createBookmarkRequest) {
        return bookmarkService.createBookmark(createBookmarkRequest);
    }

    @GetMapping("/{id}")
    public BookmarkDTO getBookmarkById(@PathVariable("id") Long id) {
        return bookmarkService.geyBookmarkById(id);
    }
}
