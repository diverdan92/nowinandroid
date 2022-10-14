/*
 * Copyright 2022 The Android Open Source Project
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

package com.google.samples.apps.nowinandroid.core.model.data

/* ktlint-disable max-line-length */

/**
 * External data layer representation of a NiA Topic
 */
data class Topic(
    val id: String,
    val name: String,
    val shortDescription: String,
    val longDescription: String,
    val url: String,
    val imageUrl: String,
)

val topic0 = Topic(
    id = "0",
    name = "Headlines",
    shortDescription = "News we want everyone to see",
    longDescription = "Stay up to date with the latest events and announcements from Android!",
    imageUrl = "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Headlines.svg?alt=media&token=506faab0-617a-4668-9e63-4a2fb996603f",
    url = ""
)

val topic1 = Topic(
    id = "1",
    name = "UI",
    shortDescription = "Material Design, Navigation, Text, Paging, Accessibility (a11y), Internationalization (i18n), Localization (l10n), Animations, Large Screens, Widgets",
    longDescription = "Learn how to optimize your app's user interface - everything that users can see and interact with. Stay up to date on tocpis such as Material Design, Navigation, Text, Paging, Compose, Accessibility (a11y), Internationalization (i18n), Localization (l10n), Animations, Large Screens, Widgets, and many more!",
    imageUrl = "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_UI.svg?alt=media&token=0ee1842b-12e8-435f-87ba-a5bb02c47594",
    url = ""
)

val topic2 = Topic(
    id = "2",
    name = "Android Studio",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)

val topic3 = Topic(
    id = "3",
    name = "New APIs & Libraries",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)
val topic4 = Topic(
    id = "4",
    name = "WearOS",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)
val topic5 = Topic(
    id = "5",
    name = "Compose",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)

val topic6 = Topic(
    id = "6",
    name = "Accessibility",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)

val topic7 = Topic(
    id = "7",
    name = "UI",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)

val topic8 = Topic(
    id = "8",
    name = "Testing",
    shortDescription = "CI, Espresso, TestLab, etc",
    longDescription = "Testing is an integral part of the app development process. By running tests against your app consistently, you can verify your app's correctness, functional behavior, and usability before you release it publicly. Stay up to date on the latest tricks in CI, Espresso, and Firebase TestLab.",
    imageUrl = "https://firebasestorage.googleapis.com/v0/b/now-in-android.appspot.com/o/img%2Fic_topic_Testing.svg?alt=media&token=a11533c4-7cc8-4b11-91a3-806158ebf428",
    url = ""
)

val topic9 = Topic(
    id = "9",
    name = "Camera & Media",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)

val topic10 = Topic(
    id = "10",
    name = "Data Storage",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)
val topic11 = Topic(
    id = "11",
    name = "Kotlin",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)
val topic12 = Topic(
    id = "12",
    name = "Publishing & Distribution",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)

val topic13 = Topic(
    id = "13",
    name = "Tools",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)

val topic14 = Topic(
    id = "14",
    name = "Platform & Releases",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)

val topic15 = Topic(
    id = "15",
    name = "Architecture",
    shortDescription = "",
    longDescription = "",
    url = "",
    imageUrl = ""
)

val previewTopics = listOf(
    topic0,topic1,topic2,topic3,topic4,topic5,topic6,topic7,topic8,topic9,topic10,topic11,topic12,topic13,topic14,topic15
)
