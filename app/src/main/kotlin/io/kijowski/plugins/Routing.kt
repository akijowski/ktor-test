package io.kijowski.plugins

import io.kijowski.routes.homeRouting
import io.kijowski.routes.metricsRouting
import io.kijowski.routes.orderRouting
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        metricsRouting()
        homeRouting()
        orderRouting()
    }
}