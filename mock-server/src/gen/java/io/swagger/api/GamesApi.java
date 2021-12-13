package io.swagger.api;

import io.swagger.model.InlineResponse2007;

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

@Path("/games")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2021-12-13T13:08:34.799Z[GMT]")
public class GamesApi {

    @GET
    @Produces({ "application/json" })
    @Operation(summary = "Showing list of game that have been played by all players", description = "", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "List of game that have been played by players", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2007.class)))
    })
    public Response gamesGet() {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    @Operation(summary = "Showing list of game that have been played by the player", description = "", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "List of game that have been played by the player", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2007.class)))
    })
    public Response gamesIdGet( @PathParam("id")

 @Parameter(description = "id player") String id
) {
        return Response.ok().entity("magic!").build();
    }}
