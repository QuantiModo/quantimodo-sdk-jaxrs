package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CommonVariableRelationshipsApiService;
import io.swagger.api.factories.CommonVariableRelationshipsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse20012;
import io.swagger.model.InlineResponse20013;
import io.swagger.model.CommonVariableRelationship;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/commonVariableRelationships")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the commonVariableRelationships API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public class CommonVariableRelationshipsApi  {
   private final CommonVariableRelationshipsApiService delegate = CommonVariableRelationshipsApiServiceFactory.getCommonVariableRelationshipsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all CommonVariableRelationships", notes = "Get all CommonVariableRelationships", response = InlineResponse20012.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "CommonVariableRelationship",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20012.class) })

    public Response commonVariableRelationshipsGet(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@ApiParam(value = "id") @QueryParam("id") Integer id
,@ApiParam(value = "Our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors") @QueryParam("confidence_level") String confidenceLevel
,@ApiParam(value = "A quantitative representation of our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors") @QueryParam("confidence_score") BigDecimal confidenceScore
,@ApiParam(value = "Direction is positive if higher predictor values generally precede higher outcome values. Direction is negative if higher predictor values generally precede lower outcome values.") @QueryParam("direction") String direction
,@ApiParam(value = "Estimated number of seconds following the onset delay in which a stimulus produces a perceivable effect") @QueryParam("duration_of_action") Integer durationOfAction
,@ApiParam(value = "error_message") @QueryParam("error_message") String errorMessage
,@ApiParam(value = "Estimated number of seconds that pass before a stimulus produces a perceivable effect") @QueryParam("onset_delay") Integer onsetDelay
,@ApiParam(value = "Variable ID for the outcome variable") @QueryParam("outcome_variable_id") Integer outcomeVariableId
,@ApiParam(value = "Variable ID for the predictor variable") @QueryParam("predictor_variable_id") Integer predictorVariableId
,@ApiParam(value = "ID for default unit of the predictor variable") @QueryParam("predictor_unit_id") Integer predictorUnitId
,@ApiParam(value = "A value representative of the relevance of this predictor relative to other predictors of this outcome.  Usually used for relevancy sorting.") @QueryParam("sinn_rank") BigDecimal sinnRank
,@ApiParam(value = "A value represented to the size of the effect which the predictor appears to have on the outcome.") @QueryParam("strength_score") BigDecimal strengthScore
,@ApiParam(value = "Can be weak, medium, or strong based on the size of the effect which the predictor appears to have on the outcome relative to other variable relationship strength scores.") @QueryParam("strength_level") String strengthLevel
,@ApiParam(value = "Number of users who feel that there is a plausible causal relationship between the predictor and outcome variables.") @QueryParam("up_votes") Integer upVotes
,@ApiParam(value = "Number of users who do not feel that there is a plausible causal relationship between the predictor and outcome variables.") @QueryParam("down_votes") Integer downVotes
,@ApiParam(value = "Value for the predictor variable (in it's default unit) which typically precedes an above average outcome value") @QueryParam("value_predicting_high_outcome") BigDecimal valuePredictingHighOutcome
,@ApiParam(value = "Value for the predictor variable (in it's default unit) which typically precedes a below average outcome value") @QueryParam("value_predicting_low_outcome") BigDecimal valuePredictingLowOutcome
,@ApiParam(value = "Number of users whose data was aggregated to obtain this relationship") @QueryParam("number_of_users") Integer numberOfUsers
,@ApiParam(value = "data_source") @QueryParam("data_source") String dataSource
,@ApiParam(value = "The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.") @QueryParam("limit") Integer limit
,@ApiParam(value = "OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Sort by given field. If the field is prefixed with '-', it will sort in descending order.") @QueryParam("sort") String sort
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.commonVariableRelationshipsGet(accessToken,id,confidenceLevel,confidenceScore,direction,durationOfAction,errorMessage,onsetDelay,outcomeVariableId,predictorVariableId,predictorUnitId,sinnRank,strengthScore,strengthLevel,upVotes,downVotes,valuePredictingHighOutcome,valuePredictingLowOutcome,numberOfUsers,dataSource,limit,offset,sort,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store CommonVariableRelationship", notes = "Store CommonVariableRelationship", response = InlineResponse20013.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "CommonVariableRelationship",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20013.class) })

    public Response commonVariableRelationshipsPost(@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "CommonVariableRelationship that should be stored" ) CommonVariableRelationship body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.commonVariableRelationshipsPost(accessToken,body,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get CommonVariableRelationship", notes = "Get CommonVariableRelationship", response = InlineResponse20013.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "CommonVariableRelationship",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20013.class) })

    public Response commonVariableRelationshipsIdGet(
@ApiParam(value = "id of CommonVariableRelationship",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.commonVariableRelationshipsIdGet(id,accessToken,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update CommonVariableRelationship", notes = "Update CommonVariableRelationship", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "CommonVariableRelationship",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response commonVariableRelationshipsIdPut(
@ApiParam(value = "id of CommonVariableRelationship",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,
@ApiParam(value = "CommonVariableRelationship that should be updated" ) CommonVariableRelationship body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.commonVariableRelationshipsIdPut(id,accessToken,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete CommonVariableRelationship", notes = "Delete CommonVariableRelationship", response = InlineResponse2002.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "quantimodo_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
        })
    }, tags={ "CommonVariableRelationship" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response commonVariableRelationshipsIdDelete(
@ApiParam(value = "id of CommonVariableRelationship",required=true) @PathParam("id") Integer id,@ApiParam(value = "User's OAuth2 access token") @QueryParam("access_token") String accessToken
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.commonVariableRelationshipsIdDelete(id,accessToken,securityContext);
    }
}
