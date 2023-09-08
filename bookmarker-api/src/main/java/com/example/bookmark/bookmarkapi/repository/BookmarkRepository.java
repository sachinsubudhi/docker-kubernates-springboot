package com.example.bookmark.bookmarkapi.repository;

import com.example.bookmark.bookmarkapi.dto.BookmarkDTO;
import com.example.bookmark.bookmarkapi.entity.Bookmark;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    //Spring JPA Projection
    @Query("select new com.example.bookmark.bookmarkapi.dto.BookmarkDTO(b.id, b. title, b.url, b.createdAt) from Bookmark b")
    Page<BookmarkDTO> findBookmarks(Pageable pageable);

    @Query(" select new com.example.bookmark.bookmarkapi.dto.BookmarkDTO(b.id, b.title, b.url, b.createdAt) " +
            "from Bookmark b where lower(b.title) like lower(concat('%', :query, '%'))")
    Page<BookmarkDTO> searchBookmarks(Pageable pageable, String query);

    Page<BookmarkDTO> findByTitleContainsIgnoreCase(Pageable pageable, String query);
}
