package io.github.mbaguszulmi.tripstory.model

data class Trip (
    var title: String = "",
    var location: String = "",
    var tripImage: Int = 0,
    var tripDetail: String = "",
    var user: String = "",
    var userAvatar: Int = 0
)
