package co.touchlab.kmmbridgekickstart

fun startSDK(analytics: Analytics): SDKHandle {
    println("startSDK kpg/big_ios_feature")
    val analyticsHandle = initAnalytics(analytics)
    return SDKHandle(
        breedRepository = breedStartup(analyticsHandle),
        appAnalytics = analyticsHandle.appAnalytics,
        breedAnalytics = analyticsHandle.breedAnalytics
    )
}

fun sayHello() = "Hello from Kotlin!"