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

import com.example.androiddevchallenge.data.model.Dog
import com.example.androiddevchallenge.data.model.Image

object DoggosRepository {
    val dogList = listOf(
        Dog(
            "1",
            "cocoro",
            "Mixed Dogs",
            "3",
            Dog.Gender.FEMALE,
            "10-12",
            Image(
                "https://images.freeimages.com/images/small-previews/164/dog-1402134.jpg",
                380,
                356
            ),
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tempor quam vel gravida vulputate. Cras.\n"
        ),
        Dog(
            "2",
            "boboro",
            "Mixed Dogs",
            "5",
            Dog.Gender.MALE,
            "10-12",
            Image(
                "https://images.freeimages.com/images/small-previews/932/dog-1401776.jpg",
                1200,
                675
            ),
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tempor quam vel gravida vulputate. Cras."
        ),
        Dog(
            "3",
            "dodoro",
            "Mixed Dogs",
            "7",
            Dog.Gender.MALE,
            "10-14",
            Image(
                "https://images.freeimages.com/images/small-previews/537/dog-1550881.jpg",
                640,
                800
            ),
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tempor quam vel gravida vulputate. Cras."
        ),
        Dog(
            "4",
            "kokoro",
            "Mixed Dogs",
            "6",
            Dog.Gender.FEMALE,
            "13-16",
            Image(
                "https://images.freeimages.com/images/small-previews/c34/dog-1392233.jpg",
                460,
                290
            ),
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tempor quam vel gravida vulputate. Cras."
        ),
        Dog(
            "5",
            "tororo",
            "Mixed Dogs",
            "4",
            Dog.Gender.MALE,
            "12-14",
            Image(
                "https://images.freeimages.com/images/small-previews/460/hot-dog-1314799.jpg",
                460,
                290
            ),
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tempor quam vel gravida vulputate. Cras."
        ),
    )
}
