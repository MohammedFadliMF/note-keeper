package com.app.notekeeper.web;

import com.app.notekeeper.entities.Note;
import com.app.notekeeper.repository.NoteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NoteController {
    private NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }
    @GetMapping("/notes")
    public String notes(Model model) {
        List<Note> notes=noteRepository.findAll();
        model.addAttribute("notes",notes );
        return "notes";
    }
    @GetMapping("/mynotes")
    public String mynotes(Model model) {
        return "mynotes";
    }
}
