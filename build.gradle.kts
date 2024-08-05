group = "org.ivcode"
version = "0.1-SNAPSHOT"

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
    id("org.ivcode.gradle-publish") version "0.1-SNAPSHOT"
}

repositories {
    mavenCentral()
}

java {
    withSourcesJar()
}

gradlePlugin {
    plugins {
        create("gradle-info") {
            id = "org.ivcode.gradle-info"
            implementationClass = "org.ivcode.gradle.info.InfoPlugin"
        }
    }
}
