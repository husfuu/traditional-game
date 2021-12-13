package io.swagger.api;

import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse500;
import io.swagger.model.RoomsBody;
import io.swagger.model.RoomsBody1;

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

@Path("/rooms")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2021-12-13T13:08:34.799Z[GMT]")
public class RoomsApi {

    @GET
    @Produces({ "application/json" })
    @Operation(summary = "showing all rooms with open status", description = "", tags={ "room" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Look all room with open status", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2005.class))),
        @ApiResponse(responseCode = "500", description = "Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse500.class)))
    })
    public Response roomsGet() {
        return Response.ok().entity("magic!").build();
    }
    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "create a room", description = "", tags={ "room" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "create a room", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2006.class)))
    })
    public Response roomsPost(@Valid RoomsBody1 body) {
        return Response.ok().entity("magic!").build();
    }
    @PUT
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "join the room", description = "", tags={ "room" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "create a room", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2006.class)))
    })
    public Response roomsPut(@Valid RoomsBody body) {
        return Response.ok().entity("magic!").build();
    }}
