plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.ivanjaramelgarejo.ivan_jaramelgarejo_tarea5"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ivanjaramelgarejo.ivan_jaramelgarejo_tarea5"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
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
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("com.airbnb.android:lottie:5.2.0")

    // Core de Android y AppCompat
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")

    // Material Design
    implementation("com.google.android.material:material:1.11.0")

    // Activity KTX (para facilitar el uso de ViewModels y LiveData)
    implementation("androidx.activity:activity-ktx:1.8.2")

    // ConstraintLayout (para diseño de UI)
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Lottie para animaciones JSON
    implementation("com.airbnb.android:lottie:5.2.0")

    // Recyclerview (para mostrar listas de vendedores)
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    // Librería para gráficos MPAndroidChart
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")

    // Test Unitario
    testImplementation("junit:junit:4.13.2")

    // Test en Android
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}