import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    java
    id("com.gradleup.shadow") version "9.4.3"
    id("io.freefair.lombok") version "9.5.0"
}

group = "dev.austech"
version = "2.0.8"

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://oss.sonatype.org/content/groups/public/")
    maven("https://repo.maven.apache.org/maven2/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:26.1.2.build.+")
    compileOnly("me.clip:placeholderapi:2.11.6")
    compileOnly("org.jetbrains:annotations:24.1.0")
    implementation("org.bstats:bstats-bukkit:3.1.0")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<ProcessResources> {
    expand("version" to project.version)
    outputs.upToDateWhen { false }
}

tasks.withType<ShadowJar> {
    relocate("org.bstats", "dev.austech.betterreports.metrics")
    archiveClassifier.set("")
}

tasks.named("build") {
    dependsOn("shadowJar")
}
