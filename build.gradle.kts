// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath ("com.android.tools.build:gradle:8.2.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
    }
}

plugins {
    id("com.google.devtools.ksp") version "1.8.10-1.0.9" apply false
}
