package recipes.service;

import recipes.model.Recipe;
import org.springframework.stereotype.Service;

@Service // Register instance of this class as bean in the application context
public class RecipeServiceImpl implements RecipeService {
    private Recipe recipe;

    @Override
    public void createRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public Recipe getRecipe() {
        return recipe;
    }
}
