package co.touchlab.kmmbridgekickstart

fun startSDK(analytics: Analytics): SDKHandle {
    println("startSDK kpg/ios_changes_01")
    val analyticsHandle = initAnalytics(analytics)
    return SDKHandle(
        breedRepository = breedStartup(analyticsHandle),
        appAnalytics = analyticsHandle.appAnalytics,
        breedAnalytics = analyticsHandle.breedAnalytics
    )
}

fun sayHello() = "Hello from Kotlin!"