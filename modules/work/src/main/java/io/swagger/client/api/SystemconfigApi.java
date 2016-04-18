package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.ActiveDirectoryConfig;
import io.swagger.client.model.CreateActiveDirectoryConfigRequest;
import io.swagger.client.model.ActiveDirectoryConfigList;
import io.swagger.client.model.TestActiveDirectoryConfigRequest;
import io.swagger.client.model.TestActiveDirectoryConfigResponse;
import io.swagger.client.model.UpdateActiveDirectoryConfigRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class SystemconfigApi {
  private ApiClient apiClient;

  public SystemconfigApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SystemconfigApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create active directory configuration
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt; Create a new AD configuration.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Data Space Admin on SDS Dedicated or SDS for Linux/Windows.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; New AD configuration stored.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Empty strings are ignored.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param body  (required)
   * @return ActiveDirectoryConfig
   * @throws ApiException if fails to make API call
   */
  public ActiveDirectoryConfig createAdConfig(String xSdsAuthToken, CreateActiveDirectoryConfigRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling createAdConfig");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createAdConfig");
    }
    
    // create path and map variables
    String localVarPath = "/system/config/auth/ads".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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

    GenericType<ActiveDirectoryConfig> localVarReturnType = new GenericType<ActiveDirectoryConfig>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * delete active directory settings
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt; Delete an existing AD configuration.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Data Space Admin on SDS Dedicated or SDS for Linux/Windows.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; AD configuration removed.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param adId Active Directory ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAdConfig(String xSdsAuthToken, Integer adId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteAdConfig");
    }
    
    // verify the required parameter 'adId' is set
    if (adId == null) {
      throw new ApiException(400, "Missing the required parameter 'adId' when calling deleteAdConfig");
    }
    
    // create path and map variables
    String localVarPath = "/system/config/auth/ads/{ad_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ad_id" + "\\}", apiClient.escapeString(adId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get active directory settings
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve a list of configured ADs.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Data Space Admin on SDS Dedicated or SDS for Linux/Windows.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; SDS tries to establish a connection with the provided information.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @return ActiveDirectoryConfigList
   * @throws ApiException if fails to make API call
   */
  public ActiveDirectoryConfigList getAdConfigs(String xSdsAuthToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getAdConfigs");
    }
    
    // create path and map variables
    String localVarPath = "/system/config/auth/ads".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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

    GenericType<ActiveDirectoryConfigList> localVarReturnType = new GenericType<ActiveDirectoryConfigList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get active directory settings
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve the configuration of one AD.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Data Space Admin on SDS Dedicated or SDS for Linux/Windows.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param adId Active Directory ID (required)
   * @return ActiveDirectoryConfig
   * @throws ApiException if fails to make API call
   */
  public ActiveDirectoryConfig getAuthAdSetting(String xSdsAuthToken, Integer adId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getAuthAdSetting");
    }
    
    // verify the required parameter 'adId' is set
    if (adId == null) {
      throw new ApiException(400, "Missing the required parameter 'adId' when calling getAuthAdSetting");
    }
    
    // create path and map variables
    String localVarPath = "/system/config/auth/ads/{ad_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ad_id" + "\\}", apiClient.escapeString(adId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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

    GenericType<ActiveDirectoryConfig> localVarReturnType = new GenericType<ActiveDirectoryConfig>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Test active directory configuration
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Test AD configuration.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Data Space Admin on SDS Dedicated or SDS for Linux/Windows.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; SDS tries to establish a connection with the provided information.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param body  (required)
   * @return TestActiveDirectoryConfigResponse
   * @throws ApiException if fails to make API call
   */
  public TestActiveDirectoryConfigResponse testAdConfig(String xSdsAuthToken, TestActiveDirectoryConfigRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling testAdConfig");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling testAdConfig");
    }
    
    // create path and map variables
    String localVarPath = "/system/config/actions/test/ad".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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

    GenericType<TestActiveDirectoryConfigResponse> localVarReturnType = new GenericType<TestActiveDirectoryConfigResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update active directory settings
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt; Update an existing AD configuration.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Data Space Admin on SDS Dedicated or SDS for Linux/Windows.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; AD configuration updated.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Empty strings are ignored.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param adId Active Directory ID (required)
   * @param body  (required)
   * @return ActiveDirectoryConfig
   * @throws ApiException if fails to make API call
   */
  public ActiveDirectoryConfig updateAuthAdSetting(String xSdsAuthToken, Integer adId, UpdateActiveDirectoryConfigRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling updateAuthAdSetting");
    }
    
    // verify the required parameter 'adId' is set
    if (adId == null) {
      throw new ApiException(400, "Missing the required parameter 'adId' when calling updateAuthAdSetting");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAuthAdSetting");
    }
    
    // create path and map variables
    String localVarPath = "/system/config/auth/ads/{ad_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ad_id" + "\\}", apiClient.escapeString(adId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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

    GenericType<ActiveDirectoryConfig> localVarReturnType = new GenericType<ActiveDirectoryConfig>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
