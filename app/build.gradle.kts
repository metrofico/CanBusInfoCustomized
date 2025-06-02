plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.hzbhd"
    compileSdk = 33
    buildFeatures {
        aidl = true
    }
    testOptions {
        unitTests {
            isReturnDefaultValues = false
            isIncludeAndroidResources = false
        }
    }
    sourceSets {
        getByName("main") {
            aidl.setSrcDirs(listOf("src/main/java"))
        }
    }
    defaultConfig {
        applicationId = "com.hzbhd"
        minSdk = 33
        targetSdk = 33
        versionCode = 13
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.eventbusjava)
    implementation(libs.eventbus)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}