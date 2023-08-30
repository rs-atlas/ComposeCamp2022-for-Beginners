plugins {

}

android {

}

dependencies {

    testImplementation("junit:junit:4.13.2")
    implementation (platform("androidx.compose:compose-bom:2023.06.01"))

    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")

    androidTestImplementation(platform("androidx.compose:compose-bom:2023.06.01"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
}