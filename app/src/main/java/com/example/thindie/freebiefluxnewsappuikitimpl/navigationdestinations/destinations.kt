package com.example.thindie.freebiefluxnewsappuikitimpl.navigationdestinations

data class NewsDestination(override val route: String) : Destination
val splashScreen = NewsDestination("splash")
val onBoarding = NewsDestination("onboard")
val welcome = NewsDestination("welcome")
val signIn = NewsDestination("signIn")
val forgotPassword = NewsDestination("forgotPassword")
val verificationCode = NewsDestination("verificationCode")
val newPassword = NewsDestination("newPassword")
val signUp = NewsDestination("signUp")
val favoriteTopicSelection = NewsDestination("favoriteTopics")
val homePage = NewsDestination("homePage")
val categories = NewsDestination("categories")
val bookMarks = NewsDestination("bookMarks")
val article = NewsDestination("Article")
val userProfile = NewsDestination("profile")
val setLanguage = NewsDestination("language")
val termsAndConditions = NewsDestination("terms")

val newsDestinations = listOf(
    onBoarding,
    welcome,
    signIn,
    forgotPassword,
    verificationCode,
    newPassword,
    signUp,
    favoriteTopicSelection,
    homePage,
    categories,
    bookMarks,
    article,
    userProfile,
    setLanguage,
    termsAndConditions
)