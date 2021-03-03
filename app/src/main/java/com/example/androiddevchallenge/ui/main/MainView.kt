/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.main

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.DogRepository
import com.example.androiddevchallenge.navigation.Navigation

@Composable
fun MainView() {
    val dogList = DogRepository.dogList
    val navController = rememberNavController()

    NavHost(navController, startDestination = Navigation.HomeScreen.title) {
        composable(Navigation.HomeScreen.title) {
            HomeView(
                dogs = dogList,
                navigateToDetails = { dog ->
                    navController.navigate(Navigation.DetailScreen.title + "/${dog.id}")
                }
            )
        }

        composable(Navigation.DetailScreen.title + "/{id}") { backStackEntry ->
            val dogId = backStackEntry.arguments?.getString("id")
            val dog = dogList.find { it.id == dogId } ?: throw IllegalStateException("This Dog id is invalid")
            DetailsView(
                dog = dog,
                navigateBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}
