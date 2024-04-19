plugins {
    id("java")
}

group = "spring-framework"
version = "5.2.25.RELEASE"

repositories {
    mavenCentral()
}

dependencies {
	compile(project(":spring-context"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}