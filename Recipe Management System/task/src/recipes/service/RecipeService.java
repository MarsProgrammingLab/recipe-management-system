package recipes.service;

import recipes.model.Recipe;

// Blueprint for RecipeServiceImpl
public interface RecipeService {
    void createRecipe(Recipe recipe);
    Recipe getRecipe();
}
