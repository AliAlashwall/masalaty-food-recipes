package com.example.masala_food_recipes.ui.fragment

import com.example.masala_food_recipes.data.DataManager
import com.example.masala_food_recipes.data.interactors.Cuisines
import com.example.masala_food_recipes.databinding.FragmentCuisineBinding
import com.example.masala_food_recipes.ui.recyclerview.CuisineScreenAdapter
import com.example.masala_food_recipes.ui.recyclerview.CuisineScreenListener

class CuisineScreenFragment:BaseFragment<FragmentCuisineBinding>(FragmentCuisineBinding :: inflate) {
    override fun onCreateView() {
        val recipes by lazy { DataManager(requireContext()).getAllRecipesData() }
        val cuisinesList by lazy { Cuisines(recipes).getCuisineCards() }
        binding.cuisineRecyclerFragment.adapter = CuisineScreenAdapter(cuisinesList,object :CuisineScreenListener{})
    }
}