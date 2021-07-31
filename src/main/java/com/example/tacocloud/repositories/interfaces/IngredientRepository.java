package com.example.tacocloud.repositories.interfaces;

import com.example.tacocloud.models.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
