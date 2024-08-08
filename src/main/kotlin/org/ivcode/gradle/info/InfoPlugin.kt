package org.ivcode.gradle.info

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * The plugin that adds the `info` extension and task to the project.
 */
class InfoPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.create("info", InfoExtension::class.java)
        project.tasks.register("info", InfoTask::class.java)

        project.afterEvaluate {
            val extension = project.extensions.getByType(InfoExtension::class.java)
            extension.setDefaultProperties(project)
        }
    }
}