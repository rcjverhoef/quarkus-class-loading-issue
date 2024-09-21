plugins {
    kotlin("jvm") version "2.0.0"
    id("io.quarkus") version "3.10.2"
}

apply(plugin = "org.jetbrains.kotlin.jvm")

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("io.quarkus:quarkus-smallrye-openapi")
    implementation(kotlin("stdlib-jdk8"))
    implementation(enforcedPlatform("io.quarkus:quarkus-bom:3.10.2"))
    implementation("io.quarkus:quarkus-kotlin:3.10.2")
    implementation("org.apache.ranger:ranger-plugins-common:2.5.0")
    testImplementation("io.quarkus:quarkus-junit5:3.10.2")
}


configurations.all {
    resolutionStrategy.eachDependency {
        if (requested.group == "org.scala-lang") {
            useVersion("2.12.17") // Force using Scala 2.12
        }
    }
}