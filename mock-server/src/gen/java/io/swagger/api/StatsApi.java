package io.swagger.api;

import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse4041;
import io.swagger.model.InlineResponse5001;

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

@Path("/stats")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2021-12-13T13:08:34.799Z[GMT]")
public class StatsApi {

    @GET
    @Produces({ "application/json" })
    @Operation(summary = "Showing all player statistics", description = "", tags={ "player" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Show all player statistics", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = InlineResponse2003.class)))),
        @ApiResponse(responseCode = "500", description = "Error occuring when showing all player statistics", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse5001.class)))
    })
    public Response statsGet() {
        return Response.ok().entity("magic!").build();
    }
    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    @Operation(summary = "show the player statistics", description = "", tags={ "player" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Show all player statistics", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2004.class))),
        @ApiResponse(responseCode = "404", description = "There is no player with the given id", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse4041.class))),
        @ApiResponse(responseCode = "500", description = "Error occuring when showing the player statistics", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse5001.class)))
    })
    public Response statsIdGet( @PathParam("id")

 @Parameter(description = "id player") String id
) {
        return Response.ok().entity("magic!").build();
    }}
