package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2004;
import io.swagger.model.Credential;
import io.swagger.model.InlineResponse20019;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-09T02:16:56.359Z")
public abstract class CredentialsApiService {
  
      public abstract Response credentialsGet(String accessToken,Integer userId,Integer connectorId,String attrKey,String attrValue,String createdAt,String updatedAt,Integer limit,Integer offset,String sort,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response credentialsPost(String accessToken,Credential body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response credentialsIdGet(Integer id,String attrKey,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response credentialsIdPut(Integer id,String attrKey,String accessToken,Credential body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response credentialsIdDelete(Integer id,String attrKey,String accessToken,SecurityContext securityContext)
      throws NotFoundException;
  
}
