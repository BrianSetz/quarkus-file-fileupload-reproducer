package org.example

import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.jboss.resteasy.reactive.RestForm
import org.jboss.resteasy.reactive.multipart.FileUpload
import java.io.File

@Path("/hello")
class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello from Quarkus REST"

    @POST
    @Path("/file")
    fun postFile(@RestForm file: File): String {
        // Do nothing
        return "File"
    }

    @POST
    @Path("/fileupload")
    fun postFileUpload(@RestForm fileUpload: FileUpload): String {
        // Do nothing
        return "FileUpload"
    }
}
