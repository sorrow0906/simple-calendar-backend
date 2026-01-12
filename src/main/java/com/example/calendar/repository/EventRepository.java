package com.example.calendar.repository;

import com.example.calendar.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByStartDateTimeBetweenAndUserId(LocalDateTime start, LocalDateTime end, Long userId);

    List<Event> findByUserId(Long userId);
}
