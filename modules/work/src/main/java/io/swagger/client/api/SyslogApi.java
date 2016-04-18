package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.SyslogEventList;
import java.util.Date;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class SyslogApi {
  private ApiClient apiClient;

  public SyslogApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SyslogApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get system events
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve syslog (&#x3D; audit log) events.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Role Data Space Admin required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Output may be limited to a certain number of entries. Please use filter criteria and paging.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @param dateStart Start date (2015-12-31T23:59:00) (optional)
   * @param dateEnd End date (2015-12-31T23:59:00) (optional)
   * @param type Operation ID type (see table LOG_OPERATIONS) (optional)
   * @param userId User ID (optional)
   * @param status Operation status: 0 &#x3D; SUCCESS, 2 &#x3D; ERROR (optional)
   * @param userClient User client (optional)
   * @return SyslogEventList
   * @throws ApiException if fails to make API call
   */
  public SyslogEventList getSyslogEvents(String xSdsAuthToken, Integer offset, Integer limit, Date dateStart, Date dateEnd, List<Integer> type, List<Integer> userId, List<Integer> status, List<String> userClient) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getSyslogEvents");
    }
    
    // create path and map variables
    String localVarPath = "/syslog/events".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date_start", dateStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date_end", dateEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "user_id", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "user_client", userClient));

    if (xSdsAuthToken != null)
      localVarHeaderParams.put("X-Sds-Auth-Token", apiClient.parameterToString(xSdsAuthToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SyslogEventList> localVarReturnType = new GenericType<SyslogEventList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
