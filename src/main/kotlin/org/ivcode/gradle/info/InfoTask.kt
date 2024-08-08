package org.ivcode.gradle.info

open class InfoTask : org.gradle.api.DefaultTask() {

    @org.gradle.api.tasks.TaskAction
    fun writeProperties() = with(project){
        val extension = extensions.getByType(InfoExtension::class.java)
        val outputDir = file(extension.outputDir)
        val outputFile = outputDir.resolve(extension.outputFileName)

        outputFile.parentFile.mkdirs()

        val properties = java.util.Properties()
        properties.putAll(extension.properties)

        outputFile.outputStream().use { properties.store(it, null) }
    }
}