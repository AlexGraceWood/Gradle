plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":service"))
    implementation(project(":db"))
}

tasks.test {
    useJUnitPlatform()
}