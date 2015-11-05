package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20023;
import java.math.BigDecimal;
import io.swagger.model.VariableCategory;
import io.swagger.model.InlineResponse20024;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public abstract class VariableCategoriesApiService {
  
      public abstract Response variableCategoriesGet(String name,BigDecimal fillingValue,BigDecimal maximumAllowedValue,BigDecimal minimumAllowedValue,Integer durationOfAction,Integer onsetDelay,String combinationOperation,Integer updated,Boolean causeOnly,Integer _public,Boolean outcome,String createdAt,String updatedAt,String imageUrl,Integer defaultUnitId,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response variableCategoriesPost(VariableCategory body)
      throws NotFoundException;
  
      public abstract Response variableCategoriesIdGet(Integer id)
      throws NotFoundException;
  
      public abstract Response variableCategoriesIdPut(Integer id,VariableCategory body)
      throws NotFoundException;
  
      public abstract Response variableCategoriesIdDelete(Integer id)
      throws NotFoundException;
  
}
