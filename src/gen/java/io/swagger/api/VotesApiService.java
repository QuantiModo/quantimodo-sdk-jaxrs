package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20029;
import io.swagger.model.Vote;
import io.swagger.model.InlineResponse20030;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public abstract class VotesApiService {
  
      public abstract Response votesGet(String clientId,Integer userId,Integer causeId,Integer effectId,Integer value,String createdAt,String updatedAt,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response votesPost(Vote body)
      throws NotFoundException;
  
      public abstract Response votesIdGet(Integer id)
      throws NotFoundException;
  
      public abstract Response votesIdPut(Integer id,Vote body)
      throws NotFoundException;
  
      public abstract Response votesIdDelete(Integer id)
      throws NotFoundException;
  
}
