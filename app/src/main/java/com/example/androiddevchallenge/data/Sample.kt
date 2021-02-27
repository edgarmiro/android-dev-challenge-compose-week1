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
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.domain.Gender.FEMALE
import com.example.androiddevchallenge.domain.Gender.MALE
import com.example.androiddevchallenge.domain.Pet
import com.example.androiddevchallenge.domain.Specie.DOG

val PET_LIST by lazy {
    listOf(
        pet0,
        pet1,
        pet2,
        pet3,
        pet4,
        pet5,
        pet6,
        pet7,
        pet8,
        pet9,
        pet10,
        pet11
    )
}

val pet0 = Pet(
    id = "0",
    name = "Dante",
    specie = DOG,
    gender = MALE,
    breed = "Shar Pei",
    age = 6,
    description = "Dante is my name. I came from a pretty rural shelter in TX with absolutely no hope!!",
)
val pet1 = Pet(
    id = "1",
    name = "Elvis",
    specie = DOG,
    gender = MALE,
    breed = "Golden Retriever",
    age = 1,
    description = "Elvis is a spritely boy that finds joy in just about anything. He loves to run about the yard playing with everything.",
)
val pet2 = Pet(
    id = "2",
    name = "Mindee",
    specie = DOG,
    gender = FEMALE,
    breed = "Catahoula Leopard Dog",
    age = 3,
    description = "Mindee is a happy, healthy pup who will make a great companion for the right family.",
)
val pet3 = Pet(
    id = "3",
    name = "Mila",
    specie = DOG,
    gender = FEMALE,
    breed = "Siberian Husky",
    age = 4,
    description = "Mila is a happy, healthy pup who will make a great companion for the right family.",
)
val pet4 = Pet(
    id = "4",
    name = "Tyson",
    specie = DOG,
    gender = MALE,
    breed = "Bulldog",
    age = 7,
    description = "Hey hey there! My name is Tyson and I am here to hopefully hop right into your heart.",
)
val pet5 = Pet(
    id = "5",
    name = "Oliver",
    specie = DOG,
    gender = MALE,
    breed = "French Bulldog",
    age = 2,
    description = "Oliver is located at our Fort Campbell Facility, call us for any questions 931-472-5820",
)
val pet6 = Pet(
    id = "6",
    name = "Amaya",
    specie = DOG,
    gender = FEMALE,
    breed = "Siberian Husky",
    age = 3,
    description = "Little Amaya was found in the roadway. She is a petite and loving little girl!",
)
val pet7 = Pet(
    id = "7",
    name = "Everest",
    specie = DOG,
    gender = MALE,
    breed = "Borador",
    age = 1,
    description = "I will be looking for a family on Saturday 2\\/27 at Petsmart Stafford marketplace starting at 12pm! Come meet me!",
)
val pet8 = Pet(
    id = "8",
    name = "Pickles",
    specie = DOG,
    gender = MALE,
    breed = "Retriever",
    age = 8,
    description = "I just arrived at Alaqua Animal Refuge and staff is still getting to know me. With time they will learn...",
)
val pet9 = Pet(
    id = "9",
    name = "Patty Jane",
    specie = DOG,
    gender = FEMALE,
    breed = "Saluki",
    age = 9,
    description = "I need some help all...how do I explain to the little girl child that her Princess Elsa band aid is...",
)
val pet10 = Pet(
    id = "10",
    name = "Spicy JuM",
    specie = DOG,
    gender = MALE,
    breed = "French Bulldog",
    age = 4,
    description = "HELP, we were the lucky ones...... We were found by a foster on the road, and the rescue went into..",
)
val pet11 = Pet(
    id = "11",
    name = "Chanel SSP",
    specie = DOG,
    gender = FEMALE,
    breed = "Treeing Walker Coonhound",
    age = 11,
    description = "Chanel gives me the boldest looks and only cooperated with treats. We just love her and her name fits her..",
)
