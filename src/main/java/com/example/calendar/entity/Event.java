package com.example.calendar.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    private String description;

    @NotNull(message = "Start time is required")
    private LocalDateTime startDateTime;

    @NotNull(message = "End time is required")
    private LocalDateTime endDateTime;

    private String location;

    @Column(name = "user_id")
    private Long userId;

    private Boolean isTodo = false;
    private Boolean completed = false;
}
