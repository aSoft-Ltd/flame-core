plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("tz.co.asoft.library")
}

val tmp = 0

kotlin {
    jvm { library() }
    js(IR) { library() }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(projects.flameApiCoreEntity)
            }
        }

        val commonTest by getting {
            dependencies {
                api(libs.koncurrent.later.coroutines)
                api(libs.kommander.coroutines)
            }
        }
    }
}