package org.ivcode.gradle.info

import org.gradle.api.Project

/**
 * The extension for the `info` plugin.
 */
open class InfoExtension {
    var outputDir: String = "build/properties"
    var outputFileName: String = "build.properties"
    var properties: Map<CharSequence, CharSequence> = emptyMap()
}

/**
 * Sets the default properties for the extension.
 */
internal fun InfoExtension.setDefaultProperties(project: Project) {
    if (properties.isEmpty()) {
        properties = mapOf(
            "group" to project.group.toString(),
            "name" to project.name,
            "version" to project.version.toString()
        )
    }
}
