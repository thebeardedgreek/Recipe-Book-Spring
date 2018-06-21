package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class RecipeBook {
    @RequestMapping(value={"/", "/recipebook.html"})
    public String recipeBook(){
        return "recipebook";
    }
    @RequestMapping("/cerealrecipe.html")
    public String cerealRecipe(){
        return "cerealrecipe";
    }
    @RequestMapping("/crabrecipe.html")
    public String crablRecipe(){
        return "crabrecipe";
    }
    @RequestMapping("/eggsaucerecipe.html")
    public String eggSauceRecipe(){
        return "eggsaucerecipe";
    }
    @RequestMapping("/gimbaprecipe.html")
    public String gimbapRecipe(){
        return "gimbaprecipe";
    }
    @RequestMapping("/gyrorecipe.html")
    public String gyroRecipe(){
        return "gyrorecipe";
    }
    @RequestMapping("/injerarecipe.html")
    public String injeraRecipe(){
        return "injerarecipe";
    }
    @RequestMapping("/pumpkinricenoodlesrecipe.html")
    public String pumpkinRiceNoodlesRecipe(){
        return "pumpkinricenoodlesrecipe";
    }
    @RequestMapping("/wingsrecipe.html")
    public String wingsRecipe(){
        return "wingsrecipe";
    }
}
