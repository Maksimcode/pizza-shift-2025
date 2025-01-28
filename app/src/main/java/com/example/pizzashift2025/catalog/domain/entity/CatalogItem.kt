package com.example.pizzashift2025.catalog.domain.entity
import com.example.pizzashift2025.common.domain.DoughType
import com.example.pizzashift2025.common.domain.IngredientType
import com.example.pizzashift2025.common.domain.PizzaSize

data class CatalogResponse(
    val success: Boolean,
    val reason: String? = null,
    val catalog: List<CatalogItem>
)

data class CatalogItem(
    val id: String,
    val name: String,
    val ingredients: List<Ingredient>,
    val toppings: List<Topping>,
    val description: String,
    val sizes: List<Size>,
    val doughs: List<Dough>,
    val calories: Int,
    val protein: String,
    val totalFat: String,
    val carbohydrates: String,
    val sodium: String,
    val allergens: List<String>,
    val isVegetarian: Boolean,
    val isGlutenFree: Boolean,
    val isNew: Boolean,
    val isHit: Boolean,
    val img: String
)

data class Ingredient(
    val name: IngredientType,
    val cost: Int,
    val img: String
)

data class Topping(
    val name: IngredientType,
    val cost: Int,
    val img: String
)

data class Size(
    val name: PizzaSize,
    val price: Int
)

data class Dough(
    val name: DoughType,
    val price: Int
)