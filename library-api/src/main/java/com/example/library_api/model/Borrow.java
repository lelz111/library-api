package com.example.library_api.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "borrows")
@Data
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("book_id")
    @Column(name = "book_id")
    private Long bookId;

    @JsonProperty("member_id")
    @Column(name = "member_id")
    private Long memberId;

    @JsonProperty("borrowed_at")
    @Column(name = "borrowed_at")
    private LocalDateTime borrowedAt = LocalDateTime.now();
}

