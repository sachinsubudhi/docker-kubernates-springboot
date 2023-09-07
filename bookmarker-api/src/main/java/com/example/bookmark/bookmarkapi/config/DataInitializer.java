package com.example.bookmark.bookmarkapi.config;


import com.example.bookmark.bookmarkapi.entity.Bookmark;
import com.example.bookmark.bookmarkapi.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository bookmarkRepository;
    @Override
    public void run(String... args) throws Exception {
        bookmarkRepository.save(new Bookmark(null, "Sivalabs", "https://www.sivalabs.in/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "SpringBlog", "https://www.spring.io/blog", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Quarks", "https://www.quarks.io/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Micronaut", "https://www.micronaut.in/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "JOOQ", "https://www.joog.org/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "VladMihalcea", "https://www.vladMihalcea.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "DZone", "https://www.dzone.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Thoughts On Java", "https://www.thorben-jansen.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "DevOps Bookmarks", "https://www.devopsbookmarks.in/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "JavaTechie", "https://www.javatechie.in/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "UI", "https://www.thapatechnical.in/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Expressjs", "https://www.expressjs.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "baeldung", "https://www.baeldung.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "devglan", "https://www.devglan.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "javaguides", "https://www.javaguides.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "linuxize", "https://www.linuxize.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "javarevisit", "https://www.javarevisit.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Sivalabs", "https://www.sivalabs.in/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "SpringBlog", "https://www.spring.io/blog", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Quarks", "https://www.quarks.io/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Micronaut", "https://www.micronaut.in/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "JOOQ", "https://www.joog.org/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "VladMihalcea", "https://www.vladMihalcea.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "DZone", "https://www.dzone.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Thoughts On Java", "https://www.thorben-jansen.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "DevOps Bookmarks", "https://www.devopsbookmarks.in/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "JavaTechie", "https://www.javatechie.in/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "UI", "https://www.thapatechnical.in/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Expressjs", "https://www.expressjs.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "baeldung", "https://www.baeldung.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "devglan", "https://www.devglan.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "javaguides", "https://www.javaguides.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "linuxize", "https://www.linuxize.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "javarevisit", "https://www.javarevisit.com/", Instant.now()));
    }
}
