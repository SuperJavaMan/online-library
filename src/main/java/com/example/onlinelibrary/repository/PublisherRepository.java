package com.example.onlinelibrary.repository;

import com.example.onlinelibrary.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
    List<Publisher> findById(int id);
    Publisher findByName(String name);
    Publisher findByContact(String contact);

}
