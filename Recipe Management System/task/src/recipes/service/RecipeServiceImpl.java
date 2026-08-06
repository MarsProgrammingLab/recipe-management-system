package recipes.service;

import recipes.model.Recipe;
import org.springframework.stereotype.Service;

@Service // Register instance of this class as bean in the application context
public class RecipeServiceImpl implements RecipeService {
    @Override
    public Recipe createRecipe(Recipe recipe) {
        return null;
    }

    @Override
    public Recipe getRecipe() {
        return null;
    }
}
