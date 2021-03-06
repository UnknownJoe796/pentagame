package penta

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import kotlinx.serialization.modules.SerializersModule

val json = Json(JsonConfiguration(unquoted = false, allowStructuredMapKeys = true, prettyPrint = false, classDiscriminator = "type"), context = SerializersModule {
    SerialNotation.install(this)
})