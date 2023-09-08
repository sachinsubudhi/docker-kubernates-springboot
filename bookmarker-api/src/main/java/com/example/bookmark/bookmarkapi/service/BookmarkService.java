package com.example.bookmark.bookmarkapi.service;

import com.example.bookmark.bookmarkapi.dto.BookmarkDTO;
import com.example.bookmark.bookmarkapi.dto.BookmarksDTO;
import com.example.bookmark.bookmarkapi.dto.CreateBookmarkRequest;
import com.example.bookmark.bookmarkapi.entity.Bookmark;
import com.example.bookmark.bookmarkapi.mapper.BookmarkMapper;
import com.example.bookmark.bookmarkapi.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository bookmarkRepository;
    private final BookmarkMapper bookmarkMapper;

    @Transactional(readOnly = true)
    public BookmarksDTO getBookmarks(Integer page) {
        int pageNo = page < 1 ? 0 : page - 1;
        Pageable pageable = PageRequest.of(pageNo, 10, Sort.Direction.DESC, "createdAt");
        Page<BookmarkDTO> bookmarkPage = bookmarkRepository.findBookmarks(pageable);
        return new BookmarksDTO(bookmarkPage);
    }

    @Transactional(readOnly = true)
    public BookmarksDTO searchBookmarks(Integer page, String query) {
        int pageNo = page < 1 ? 0 : page - 1;
        Pageable pageable = PageRequest.of(pageNo, 10, Sort.Direction.DESC, "createdAt");
        //Page<BookmarkDTO> bookmarkPage = bookmarkRepository.searchBookmarks(pageable, query);
        Page<BookmarkDTO> bookmarkPage = bookmarkRepository.findByTitleContainsIgnoreCase(pageable, query);
        return new BookmarksDTO(bookmarkPage);
    }

    public BookmarkDTO createBookmark(CreateBookmarkRequest createBookmarkRequest) {
        Bookmark bookmark = new Bookmark(null, createBookmarkRequest.getTitle(), createBookmarkRequest.getUrl(), Instant.now());
        Bookmark savedBookmark = bookmarkRepository.save(bookmark);

        return bookmarkMapper.toDto(savedBookmark);
    }

    @Transactional(readOnly = true)
    public BookmarkDTO geyBookmarkById(Long id) {
        return bookmarkMapper.toDto(bookmarkRepository.findById(id).orElseThrow());
    }
}
