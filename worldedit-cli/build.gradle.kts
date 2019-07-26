import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

applyPlatformAndCoreConfiguration()
applyShadowConfiguration()

dependencies {
    "compile"(project(":worldedit-core"))
    "compile"("org.apache.logging.log4j:log4j-core:2.8.1")
    "compile"("org.apache.logging.log4j:log4j-slf4j-impl:2.8.1")
    "compile"("commons-cli:commons-cli:1.4")
}

tasks.named<Jar>("jar") {
    manifest {
        attributes(
                "WorldEdit-Version" to project.version,
                "Main-Class" to "com.sk89q.worldedit.cli.CLIWorldEdit"
        )
    }
}

tasks.named<ShadowJar>("shadowJar") {
    dependencies {
        include { true }
    }
    minimize {
        exclude { true }
    }
}

tasks.named("assemble").configure {
    dependsOn("shadowJar")
}
