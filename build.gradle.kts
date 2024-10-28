plugins {
    id("java")
}

group = "io.swagger"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.swagger.core.v3:swagger-annotations:2.0.0")
    implementation("com.squareup.okhttp:okhttp:2.7.5")
    implementation("com.squareup.okhttp:logging-interceptor:2.7.5")
    implementation("com.google.code.gson:gson:2.8.1")
    implementation("io.gsonfire:gson-fire:1.8.3")
    implementation("org.threeten:threetenbp:1.3.5")
    implementation("javax.annotation:javax.annotation-api:1.3.2")

    testImplementation("junit:junit:4.13.1")
}

tasks {
    withType<JavaCompile> {
        sourceCompatibility = "1.7"
        targetCompatibility = "1.7"
        options.encoding = "UTF-8"
    }

    jar {
        manifest {
            attributes["Implementation-Title"] = "swagger-java-client"
            attributes["Implementation-Version"] = version
        }
    }

    val copyDependencies by registering(Copy::class) {
        from(configurations.runtimeClasspath)
        into("$buildDir/libs/lib")
    }

    val sourcesJar by registering(Jar::class) {
        archiveClassifier.set("sources")
        from(sourceSets.main.get().allSource)
    }


    artifacts {
        archives(sourcesJar)
    }
}
