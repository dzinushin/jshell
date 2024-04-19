plugins {
	java
	id("org.springframework.boot") version "3.2.5"
	id("io.spring.dependency-management") version "1.1.4"
	id("com.github.mrsarm.jshell.plugin") version "1.2.1"
}

group = "dz.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

// Generate classpath
tasks.register("generateClasspath") {
	doLast {
		val mainClasspath = sourceSets["main"].runtimeClasspath.asPath
		val testClasspath = sourceSets["test"].runtimeClasspath.asPath
		val fullClasspath = "$mainClasspath${System.getProperty("path.separator")}$testClasspath"
		file("classpath.txt").writeText(fullClasspath)
	}
}
