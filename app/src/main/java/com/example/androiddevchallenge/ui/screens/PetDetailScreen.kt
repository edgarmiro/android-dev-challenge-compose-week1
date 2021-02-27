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
package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androiddevchallenge.common.getResource
import com.example.androiddevchallenge.data.PET_LIST
import com.example.androiddevchallenge.data.pet0
import com.example.androiddevchallenge.domain.Pet
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PetDetailScreen(navController: NavController, id: String) {
    PetDetail(
        PET_LIST.first { it.id == id },
        {
            navController.navigateUp()
        }
    )
}

@Composable
fun PetDetail(pet: Pet, onBackClick: () -> Unit = {}, onAdoptClick: () -> Unit = {}) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = pet.name,
                        color = Color.Black,
                    )
                },
                backgroundColor = Color.White,
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) {
        Surface(
            color = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxHeight()
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(Modifier.fillMaxWidth()) {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .background(MaterialTheme.colors.background)
                    ) {
                        Image(
                            ImageBitmap.imageResource(context.getResource("pet_${pet.id}")),
                            contentDescription = "${pet.name}'s photo",
                            modifier = Modifier
                                .height(256.dp)
                                .fillMaxWidth()
                        )
                    }

                    Column(Modifier.fillMaxWidth().padding(horizontal = 8.dp)) {
                        PetFeature("Specie", pet.specie.name.toLowerCase().capitalize())
                        PetFeature("Gender", pet.gender.name.toLowerCase().capitalize())
                        PetFeature("Breed", pet.breed)
                        PetFeature("Age", "${pet.age} years")
                        PetFeature("Info", pet.description + pet.description + pet.description)
                    }
                }

                Button(
                    onClick = onAdoptClick,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter)
                        .padding(8.dp)
                ) {
                    Text(text = "Adopt ${pet.name}")
                }
            }
        }
    }
}

@Composable
fun PetFeature(title: String, value: String) {
    Card(
        Modifier.padding(8.dp),
        elevation = 3.dp
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp),
        ) {
            Text(
                title,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
                modifier = Modifier.width(90.dp),
            )
            Text(value)
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun PetDetailLightPreview() {
    MyTheme {
        PetDetail(pet0)
    }
}
