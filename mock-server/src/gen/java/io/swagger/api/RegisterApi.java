package io.swagger.api;

import io.swagger.model.InlineResponse201;
import io.swagger.model.InlineResponse422;
import io.swagger.model.RegisterBody;

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

@Path("/register")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2021-12-13T13:08:34.799Z[GMT]")
public class RegisterApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Player registration", description = "", tags={ "player" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "registration is success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse201.class))),
        @ApiResponse(responseCode = "422", description = "error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse422.class)))
    })
    public Response registerPost(@Valid RegisterBody body) {
        return Response.ok().entity("magic!").build();
    }}
