package com.app.notekeeper.repository;

import com.app.notekeeper.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
