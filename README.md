# PuppyApp

<!--- Replace <OWNER> with your Github Username and <REPOSITORY> with the name of your repository. -->
<!--- You can find both of these in the url bar when you open your repository in github. -->
![Workflow result](https://github.com/edgarmiro/android-dev-challenge-compose-week1/workflows/Check/badge.svg)


## :scroll: Description
<!--- Describe your app in one or two sentences -->
Look for your new best friend using this small app!
It's clear, cute, and developed using Jetpack Compose!!!

## :bulb: Motivation and Context
<!--- Optionally point readers to interesting parts of your submission. -->
<!--- What are you especially proud of? -->
It's a simple application developed just to learn the new UI framework.
I'm especially proud of the usage of Navigation Compose which means that we only need a single
activity to develop modern Android applications.
The app contains two simple screens:
- PetListScreen: Even though it's in Experimental, I've used `LazyVerticalGrid` to show
  the puppy list
- PetDetailScreen: After selecting a puppy users will see the detail of each animal friend.
  In this case I've used TopAppBar to handle the back navigation

The application uses static resources, like images or texts, and it doesn't has any kind of
architecture. I think it's a good starting point with Jetpack Compose.
My purpose is to iterate this project adding ViewModels, Hilt and Flows.

## :camera_flash: Screenshots
<!-- You can add more screenshots here if you like -->
<img src="/results/screenshot_1.png" width="260">&emsp;<img src="/results/screenshot_2.png" width="260">

## License
```
Copyright 2020 The Android Open Source Project

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```