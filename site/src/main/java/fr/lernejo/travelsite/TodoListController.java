package fr.lernejo.travelsite;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class TodoListController {
    private final ArrayList<Travels> ListTravels = new ArrayList<>();
    private final ArrayList<Inscription> ListInscription = new ArrayList<>();

    @GetMapping(value = "/api/travels")
    public ArrayList<Travels> SendList(@RequestParam String userName) {
        ListTravels.add(new Travels("Caribbean", 32.4));
        ListTravels.add(new Travels("Australia", 35.1));
        return ListTravels;
    }

    @PostMapping(value = "/api/inscription")
    public void postInscription(@RequestBody Inscription inscription) {
        ListInscription.add(inscription);
    }
}


