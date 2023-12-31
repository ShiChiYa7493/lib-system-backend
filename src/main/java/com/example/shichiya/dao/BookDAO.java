package com.example.shichiya.dao;

import com.example.shichiya.pojo.Book;
import com.example.shichiya.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDAO extends JpaRepository<Book,Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
    List<Book> findAllByAbsLike(String keyword);
}
