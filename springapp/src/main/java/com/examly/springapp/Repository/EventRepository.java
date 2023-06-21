package com.examly.springapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import com.examly.springapp.Model.EventModel;

public interface EventRepository extends JpaRepository<EventModel,Integer>{
    List<EventModel> findByuserId(long userId);
}