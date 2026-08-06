package recipes.service;

import recipes.model.Recipe;

// Blueprint for RecipeServiceImpl
public interface RecipeService {
    Recipe createRecipe(Recipe recipe);
    Recipe getRecipe();
}
