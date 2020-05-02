package com.kristovski.spring5recipeapp.services;

import com.kristovski.spring5recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipies();
}
