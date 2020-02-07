package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by heindrichpaul on 07/02/2020
 */
@Controller
public class PublisherController {
    private final PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @RequestMapping("/publishers")
    public String getPublishers(Model model) {
        model.addAttribute("publishers", publisherRepository.findAll());
        return "publishers";
    }
}
