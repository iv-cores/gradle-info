# gradle-properties-writer

A Gradle plugin to write a properties file.

## Overview

The `gradle-properties-writer` plugin allows you to generate a properties file during your Gradle build process.
This can be useful for storing project metadata or other configuration details in a standardized format.

## Installation

To apply the plugin, add the following to your `build.gradle.kts`:

```kotlin
plugins {
    id("org.ivcode.gradle-info") version "0.1-SNAPSHOT"
}
```

## Configuration
The plugin can be configured using the info extension. Here are the available configuration options:  

| Property         | Description                                                                                                                     |
|------------------|---------------------------------------------------------------------------------------------------------------------------------|
| `outputDir`      | The directory where the properties file will be written. Default is `build/properties`.                                         |
| `outputFileName` | The name of the properties file. Default is `build.properties`.                                                                 |
| `properties`     | A map of properties to be written to the file. If not specified, default properties (`group`, `name`, `version`) will be used.  |

Example configuration:
```kotlin
info {
    outputDir = file("build/generated")
    outputFileName = "my-properties.properties"
    properties = mapOf(
        "key1" to "value1",
        "key2" to "value2"
    )
}
```

## Usage
To generate the properties file, run the `writeProperties` task:

```shell
./gradlew info
```
This will generate a properties file in the specified output directory with the specified properties.