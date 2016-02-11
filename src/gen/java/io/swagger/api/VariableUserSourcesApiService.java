package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20010;
import io.swagger.model.VariableUserSource;
import io.swagger.model.InlineResponse20033;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class VariableUserSourcesApiService {
  
      public abstract Response variableUserSourcesGet(String accessToken,Integer variableId,Integer userId,Integer timestamp,Integer earliestMeasurementTime,Integer latestMeasurementTime,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response variableUserSourcesPost(String accessToken,VariableUserSource body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response variableUserSourcesIdGet(Integer id,Integer sourceId,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response variableUserSourcesIdPut(Integer id,Integer sourceId,String accessToken,VariableUserSource body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response variableUserSourcesIdDelete(Integer id,Integer sourceId,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
