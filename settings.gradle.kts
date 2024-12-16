pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google() // Required for Android dependencies
        mavenCentral() // Required for Compose and other libraries
        maven("https://jitpack.io") // For third-party libraries like Lottie if needed
    }
}

rootProject.name = "ComposeAudioLib"
include(":composeAudioLib")
