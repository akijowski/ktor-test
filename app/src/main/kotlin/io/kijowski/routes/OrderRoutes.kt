package io.kijowski.routes

import io.kijowski.models.orderStorage
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.orderRouting() {
    route("/orders") {
        get {
            val headers = call.request.headers.entries().map { "${it.key}: ${it.value}" }
            call.application.environment.log.info("/orders - headers: $headers")
            call.respond(orderStorage)
        }
    }
}