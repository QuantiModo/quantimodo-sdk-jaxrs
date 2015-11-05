package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse20011;
import java.math.BigDecimal;
import io.swagger.model.MeasurementPost;
import java.io.File;
import io.swagger.model.InlineResponse20012;
import io.swagger.model.Measurement;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-05T03:16:00.332Z")
public abstract class MeasurementsApiService {
  
      public abstract Response measurementsGet(Integer userId,String clientId,Integer connectorId,Integer variableId,Integer startTime,BigDecimal value,BigDecimal originalValue,Integer duration,String note,BigDecimal latitude,BigDecimal longitude,String location,String createdAt,String updatedAt,String error,Integer limit,Integer offset,String sort)
      throws NotFoundException;
  
      public abstract Response measurementsPost(MeasurementPost body)
      throws NotFoundException;
  
      public abstract Response measurementsCsvGet()
      throws NotFoundException;
  
      public abstract Response measurementsRequestCsvPost()
      throws NotFoundException;
  
      public abstract Response measurementsIdGet(Integer id)
      throws NotFoundException;
  
      public abstract Response measurementsIdPut(Integer id,Measurement body)
      throws NotFoundException;
  
      public abstract Response measurementsIdDelete(Integer id)
      throws NotFoundException;
  
}
