pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://api.touchlab.dev/mvn/F4559E63B6074A89B3F88CB723")
    }
}

plugins {
    id("co.touchlab.faktory-build-cache") version "0.8.13"
}

include(":app", ":shared")
rootProject.name = "KaMPKit"

enableFeaturePreview("VERSION_CATALOGS")
