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

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.common.getResource
import com.example.androiddevchallenge.data.PET_LIST
import com.example.androiddevchallenge.data.pet0
import com.example.androiddevchallenge.domain.Pet
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PetListScreen(navController: NavController) {
    PetList(PET_LIST) {
        navController.navigate("pet/${it.id}")
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PetList(pets: List<Pet>, onClick: (Pet) -> Unit = {}) {
    Column {
        Image(
            ImageBitmap.imageResource(R.drawable.home),
            contentDescription = "There's no place like home",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth()
        )
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            contentPadding = PaddingValues(8.dp),
        ) {
            items(pets) { pet ->
                PetItem(pet, onClick)
            }
        }
    }
}

@Composable
fun PetItem(pet: Pet, onClick: (Pet) -> Unit = {}) {
    val context = LocalContext.current

    Card(
        backgroundColor = MaterialTheme.colors.background,
        modifier = Modifier
            .padding(4.dp)
            .height(200.dp)
            .clickable { onClick(pet) },
        elevation = 3.dp
    ) {
        Box(Modifier.fillMaxWidth()) {
            Image(
                ImageBitmap.imageResource(context.getResource("pet_${pet.id}")),
                contentDescription = "${pet.name}'s photo",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Text(
                text = pet.name,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(Color(0xA4444444))
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .padding(4.dp),
            )
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun PetListLightPreview() {
    MyTheme {
        PetList(PET_LIST)
    }
}

@Preview(widthDp = 256)
@Composable
fun PetItemPreview() {
    MyTheme {
        PetItem(pet0)
    }
}
