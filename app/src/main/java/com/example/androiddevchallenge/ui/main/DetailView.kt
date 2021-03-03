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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.model.Dog
import com.example.androiddevchallenge.ui.theme.purpleButtonLight
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun DetailsView(dog: Dog, navigateBack: () -> Unit) {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                Info(dog = dog)
                Header(dog = dog)
            }
        }
    }
}

@Composable
private fun Header(dog: Dog) {
    CoilImage(
        data = dog.image.url,
        contentDescription = dog.name,
        contentScale = ContentScale.Crop,
        fadeIn = true,
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(dog.image.aspectRatio)
            .background(Color.White)
    )
}

@Composable
private fun Info(dog: Dog) {
    Column(modifier = Modifier.padding(10.dp)) {
        Row(
            modifier = Modifier
                .padding(vertical = 5.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = dog.name,
                style = MaterialTheme.typography.h4
            )
        }

        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = dog.breedGroup,
                style = MaterialTheme.typography.subtitle1
            )
            Spacer(modifier = Modifier.height(18.dp))
        }
        Spacer(modifier = Modifier.height(6.dp))
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = dog.description,
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(18.dp))
        }

        Text(
            text = "Information",
            style = MaterialTheme.typography.h6
        )
        Spacer(modifier = Modifier.height(6.dp))
        Row(
            modifier = Modifier
                .padding(vertical = 5.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            InfoBanner(title = "Gender", value = dog.gender.value)
            InfoBanner(title = "Age", value = dog.ageString)
            InfoBanner(title = "Lifespan", value = dog.lifeSpan)
        }
    }
}

@Composable
fun InfoBanner(title: String, value: String) {
    Column(
        modifier = Modifier
            .defaultMinSize(minWidth = 90.dp)
            .background(
                color = purpleButtonLight,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            color = MaterialTheme.colors.onPrimary,
            style = MaterialTheme.typography.subtitle1
        )
        Spacer(modifier = Modifier.height(6.dp))
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = value,
                color = MaterialTheme.colors.onPrimary,
                style = MaterialTheme.typography.subtitle2
            )
        }
    }
}
