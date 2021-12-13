package io.swagger.api;

import io.swagger.model.InlineResponse2001;

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

@Path("/players")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2021-12-13T13:08:34.799Z[GMT]")
public class PlayersApi {

    @GET
    @Produces({ "application/json" })
    @Operation(summary = "Showing the all player with his biodata", description = "", tags={ "player" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "List of all players and his biodata", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2001.class)))
    })
    public Response playersGet() {
        return Response.ok().entity("magic!").build();
    }}
