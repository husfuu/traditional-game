package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse404;
import io.swagger.model.InlineResponse500;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/player")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2021-12-13T13:08:34.799Z[GMT]")
public class PlayerApi {

    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    @Operation(summary = "Showing the player biodata", description = "", tags={ "player" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Look certain player biodata", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse200.class))),
        @ApiResponse(responseCode = "404", description = "There is no user with the given id", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse404.class))),
        @ApiResponse(responseCode = "500", description = "Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse500.class)))
    })
    public Response playerIdGet( @PathParam("id")

 @Parameter(description = "Look certain player biodata") String id
) {
        return Response.ok().entity("magic!").build();
    }}
