package recipes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import recipes.model.Recipe;
import recipes.service.RecipeService;

@RestController
@RequestMapping("/api/recipe") // Base URL for every method inside this class
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService; // constructor injection
    }

    @GetMapping
    public ResponseEntity<Recipe> getRecipe() {
        return ResponseEntity.ok(recipeService.getRecipe());
    }

    @PostMapping
    public ResponseEntity<Void> postRecipe(@RequestBody Recipe recipe) {
        recipeService.createRecipe(recipe);
        return ResponseEntity.ok().build();

    }

}
