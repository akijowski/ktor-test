package io.kijowski.routes

import io.kijowski.plugins.appMicrometerRegistry
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.metricsRouting() {
    route("/metrics") {
        get {
            call.respond(appMicrometerRegistry.scrape())
        }
    }
}