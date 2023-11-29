import org.gradle.kotlin.dsl.`kotlin-dsl`
import org.jetbrains.kotlin.load.kotlin.signatures

plugins {
    id("maven-publish")
    `kotlin-dsl`
    id("com.gradle.plugin-publish") version "1.1.0"
}

extra["PUBLISH_GROUP_ID"] = "com.github.shahbaz213"
extra["PUBLISH_VERSION"] = "1.0"
extra["PUBLISH_ARTIFACT_ID"] = "toolslibrary"
extra["PUBLISH_DESCRIPTION"] = "An android gradle plugin for localization"
extra["PUBLISH_URL"] = "https://github.com/shahbaz213/ToolsLibrary"
extra["PUBLISH_LICENSE_NAME"] = "Apache 2.0 License"
extra["PUBLISH_LICENSE_URL"] = "https://www.apache.org/licenses/LICENSE-2.0"
extra["PUBLISH_DEVELOPER_ID"] = "shahbaz213"
extra["PUBLISH_DEVELOPER_NAME"] = "Malik Shahbaz"
extra["PUBLISH_DEVELOPER_EMAIL"] = "malikshahbaz213@gmail.com"
extra["PUBLISH_SCM_CONNECTION"] = "scm:git:github.com/shahbaz213/ToolsLibrary.git"
extra["PUBLISH_SCM_DEVELOPER_CONNECTION"] = "scm:git:ssh://github.com/shahbaz213/ToolsLibrary.git"
extra["PUBLISH_SCM_URL"] = "https://github.com/shahbaz213/ToolsLibrary/tree/master"


version = extra["PUBLISH_VERSION"] as String
group = extra["PUBLISH_GROUP_ID"] as String
publishing{
    repositories {
        maven {
            mavenLocal()
        }
    }
}

//gradlePlugin {
//    website.set(extra["PUBLISH_URL"] as String)
//    vcsUrl.set(extra["PUBLISH_URL"] as String)
//    plugins {
//        create("InspirationAppPlugin") {
//            id = "com.github.shahbaz213.toolslibrary"
//            implementationClass = "com.app.toolslibrary.plugin.toolslibrary"
//            displayName = "Tools Android Library"
//            description = "Android gradle plugin for app's localization"
//            tags.set(listOf("android", "locale","string"))
//        }
//    }
//}

//afterEvaluate {
//    publishing {
//        publications {
//            // Creates a Maven publication called "release".
//            create<MavenPublication>("release") {
//                // Applies the component for the release build variant.
//                from(components["release"])
//                // You can then customize attributes of the publication as shown below.
//                groupId = "com.github.shahbaz213"
//                artifactId = "inspirationlibrary"
//                version = "1.0"
//            }
//        }
//    }
//}

dependencies {

    // implementation("com.android.tools.build:gradle:7.4.0-rc03")
    //implementation("org.javassist:javassist:3.29.2-GA")
    implementation("com.squareup.okhttp3:okhttp:4.11.0")
    implementation ("com.google.code.gson:gson:2.10.1")
}