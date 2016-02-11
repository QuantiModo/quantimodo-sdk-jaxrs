package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20015;
import io.swagger.model.Connector;
import io.swagger.model.InlineResponse20016;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class ConnectorsApiService {
  
      public abstract Response connectorsGet(String accessToken,String name,String displayName,String image,String getItUrl,String shortDescription,String longDescription,Boolean enabled,Boolean oauth,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response connectorsPost(String accessToken,Connector body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response connectorsIdGet(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response connectorsIdPut(Integer id,String accessToken,Connector body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response connectorsIdDelete(Integer id,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
