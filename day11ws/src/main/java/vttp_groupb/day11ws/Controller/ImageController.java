package vttp_groupb.day11ws.Controller;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//GET / or GET /index.html

@RequestMapping
public class ImageController {

    @GetMapping(path= {"/", "/index.html"})
    public String getIndex(Model model) {
        model.addAttribute("imageOfTheDay", getImageOfTheDay());
        return "image_of_the_day";
    }

    private String getImageOfTheDay(){
        Random rnd = new SecureRandom();
        int i = rnd.nextInt(Constants.PICS.length);
        return "/images/%s".formatted(Constants.PICS[i]);

    }

        

}

    
    

