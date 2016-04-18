package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.UserGroupsChangeBatchRequest;
import io.swagger.client.model.UserRoomsAddBatchRequest;
import io.swagger.client.model.UserData;
import io.swagger.client.model.CreateUserRequest;
import io.swagger.client.model.UserRoomsDeleteBatchRequest;
import io.swagger.client.model.UserGroupList;
import io.swagger.client.model.UserList;
import io.swagger.client.model.RoomTreeDataList;
import io.swagger.client.model.UserAttributes;
import io.swagger.client.model.UpdateUserRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add groups to the user
   * Batch function. New groups will be added to the existing set.
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User ID (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void addUserGroupsBatch(String xSdsAuthToken, Integer userId, UserGroupsChangeBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling addUserGroupsBatch");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addUserGroupsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addUserGroupsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Add rooms to the user
   * Batch function. New grants will be added, existing grants will not be affected.
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User Id (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void addUserRoomsBatch(String xSdsAuthToken, Long userId, UserRoomsAddBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling addUserRoomsBatch");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addUserRoomsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addUserRoomsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/rooms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Create user
   * All input fields are limited to &lt;b&gt;150&lt;/b&gt; characters&lt;/b&gt;&lt;br/&gt;Allowed characters: &lt;b&gt;All&lt;/b&gt;&lt;br/&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Authentication method parameters&lt;/h4&gt;&lt;dl&gt;&lt;dt&gt;SQL&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;\&quot;login\&quot;: E-Mail Address&lt;/code&gt;&lt;br/&gt;&lt;code&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Active Directory Username &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Active Directory Username according to auth setting &#39;user_filter&#39;\&quot;&lt;br/&gt;additional parameters (optional):&lt;br/&gt;key: \&quot;more_username\&quot; &lt;b style&#x3D;&#39;color: red;&#39;&gt;  DEPRECATED, please do not use&lt;/b&gt;&lt;br&gt;value: \&quot;(one or more e-mail addresses, separated by &#39;;&#39;)\&quot; &lt;b style&#x3D;&#39;color: red;&#39;&gt;  DEPRECATED, please do not use&lt;/b&gt;&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;RADIUS  &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Radius user name\&quot;&lt;br/&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param body  (required)
   * @return UserData
   * @throws ApiException if fails to make API call
   */
  public UserData createUser(String xSdsAuthToken, CreateUserRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling createUser");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createUser");
    }
    
    // create path and map variables
    String localVarPath = "/users".replaceAll("\\{format\\}","json");

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

    GenericType<UserData> localVarReturnType = new GenericType<UserData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete user
   * User cannot be deleted if he is the last room admin
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUser(String xSdsAuthToken, Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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
   * Delete custom user attribute
   * Delete custom user attribute. Allowed characters for keys are: [a-zA-Z0-9_-]
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User ID (required)
   * @param key Key (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserAttributes(String xSdsAuthToken, Integer userId, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteUserAttributes");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserAttributes");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling deleteUserAttributes");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/userAttributes/{key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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
   * Remove groups from the user
   * Batch function
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User ID (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserGroupsBatch(String xSdsAuthToken, Integer userId, UserGroupsChangeBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteUserGroupsBatch");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserGroupsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteUserGroupsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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
   * Revoke rooms from the user
   * Batch function
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User Id (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserRoomsBatch(String xSdsAuthToken, Long userId, UserRoomsDeleteBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteUserRoomsBatch");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserRoomsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteUserRoomsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/rooms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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
   * Get user
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Authentication method parameters&lt;/h4&gt;&lt;dl&gt;&lt;dt&gt;SQL&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;\&quot;login\&quot;: E-Mail Address&lt;/code&gt;&lt;br/&gt;&lt;code&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Active Directory Username &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Active Directory Username according to auth setting &#39;user_filter&#39;\&quot;&lt;br/&gt;additional parameters (optional):&lt;br/&gt;key: \&quot;more_username\&quot; &lt;b style&#x3D;&#39;color: red;&#39;&gt;  DEPRECATED, please do not use&lt;/b&gt;&lt;br&gt;value: \&quot;(one or more e-mail addresses, separated by &#39;;&#39;)\&quot; &lt;b style&#x3D;&#39;color: red;&#39;&gt;  DEPRECATED, please do not use&lt;/b&gt;&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;RADIUS  &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Radius user name\&quot;&lt;br/&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User ID (required)
   * @return UserData
   * @throws ApiException if fails to make API call
   */
  public UserData getUser(String xSdsAuthToken, Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UserData> localVarReturnType = new GenericType<UserData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get groups that user is a member of or/and can become a member
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Group name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;is_member&lt;/dt&gt;&lt;dd&gt;Filter the groups which the user is or is not member of&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false|any]. Default value is &lt;code&gt;true&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;Example: &lt;samp&gt;is_member:eq:false|name:cn:searchstring&lt;/samp&gt;&lt;br/&gt;- get all groups that the user is not member of and whose name is like searchstring&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User ID (required)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @param filter Group filter (optional)
   * @return UserGroupList
   * @throws ApiException if fails to make API call
   */
  public UserGroupList getUserGroups(String xSdsAuthToken, Integer userId, Integer offset, Integer limit, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getUserGroups");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserGroups");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

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

    GenericType<UserGroupList> localVarReturnType = new GenericType<UserGroupList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get users
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Get users entry point. Returns a list of datapsace users.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; none.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; none.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt;&lt;br/&gt;Authentication with &lt;b&gt;X-Sds-Auth-Token&lt;/b&gt; required.&lt;/p&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;p&gt;Filter string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;OPERATOR&amp;gt;:&amp;lt;VALUE&amp;gt;&lt;/dfn&gt;&lt;br/&gt;Multiple fields is supported.&lt;/p&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;login&lt;/dt&gt;&lt;dd&gt;Login name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (User login name contains value)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;firstName&lt;/dt&gt;&lt;dd&gt;First name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (User first name contains value)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;lastName&lt;/dt&gt;&lt;dd&gt;Last name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (User last name contains value)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;globalPermissions_manageDataspace&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;Manage all&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (User global manage all permissions)&lt;br/&gt;VALUE: [true|false].&lt;/dd&gt;&lt;dt&gt;globalPermissions_manageUsers&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;Manage users&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (User global manage users permissions)&lt;br/&gt;VALUE: [true|false].&lt;/dd&gt;&lt;dt&gt;lockStatus&lt;/dt&gt;&lt;dd&gt;Lock status: 0 - Locked, 1 - Web access allowed, 2 - Web and mobile access allowed,&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (User lock status)&lt;br/&gt;VALUE: [0|1|2].&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;&lt;b&gt;Logical grouping:&lt;/b&gt; filtering according first three fields (login, lastName, firstName)&lt;br&gt;is intrinsically processed by the API as logical &lt;i&gt;OR&lt;/i&gt;.  In opposite, filtering according to&lt;br/&gt;last three fields (globalPermissions_manageDataspace, globalPermissions_manageUsers,lockStatus)&lt;br/&gt;is processed intrinsically as logical &lt;i&gt;AND&lt;/i&gt;.&lt;/p&gt;&lt;p&gt;Example: &lt;samp&gt;login:cn:searchString_1|firstName:cn:searchString_2|lockStatus:eq:2 &lt;/samp&gt;&lt;br/&gt;- filter by login contains searchString_1 or firstName contains searchString_2 and user are not locked&lt;/p&gt;&lt;h4&gt;Sort&lt;/h4&gt;&lt;p&gt;Sort string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;ORDER&amp;gt;&lt;/dfn&gt;&lt;br/&gt;Order can be &lt;code&gt;asc&lt;/code&gt; or &lt;code&gt;desc&lt;/code&gt;&lt;br/&gt;Multiple fields is supported.&lt;/p&gt;&lt;h5&gt;Sort fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;globalPermissions&lt;/dt&gt;&lt;dd&gt;User global permissions&lt;/dd&gt;&lt;dt&gt;expireAt&lt;/dt&gt;&lt;dd&gt;Expiration date&lt;/dd&gt;&lt;dt&gt;lastLoginSuccessAt&lt;/dt&gt;&lt;dd&gt;Last successful logon date&lt;/dd&gt;&lt;dt&gt;login&lt;/dt&gt;&lt;dd&gt;Login name&lt;/dd&gt;&lt;dt&gt;salutation &lt;b style&#x3D;&#39;color: red;&#39;&gt;&amp;nbsp;DEPRECATED&lt;/b&gt;&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;Salutation&lt;/dd&gt;&lt;dt&gt;firstName&lt;/dt&gt;&lt;dd&gt;First name&lt;/dd&gt;&lt;dt&gt;lastName&lt;/dt&gt;&lt;dd&gt;Last name&lt;/dd&gt;&lt;dt&gt;lockStatus&lt;/dt&gt;&lt;dd&gt;User lock status&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;lastLoginSuccessAt:asc|firstName:desc&lt;/samp&gt;&lt;br/&gt;- sort by lastLoginSuccessAt ascending and by firstName descending&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @param filter Filter string (optional)
   * @param sort Sort string (optional)
   * @param includeAttributes Include custom user attributes. (default:false) (optional)
   * @return UserList
   * @throws ApiException if fails to make API call
   */
  public UserList getUsers(String xSdsAuthToken, Integer offset, Integer limit, String filter, String sort, Boolean includeAttributes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getUsers");
    }
    
    // create path and map variables
    String localVarPath = "/users".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_attributes", includeAttributes));

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

    GenericType<UserList> localVarReturnType = new GenericType<UserList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * &lt;span style&#x3D;\&quot;color: red;\&quot;&gt;[DEPRECATED]&lt;/span&gt; Get User Roles
   * 
   * @param xSdsAuthToken Authentication token (required)
   * @throws ApiException if fails to make API call
   */
  public void getUsersRoles(String xSdsAuthToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getUsersRoles");
    }
    
    // create path and map variables
    String localVarPath = "/users/roles".replaceAll("\\{format\\}","json");

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


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get rooms granted to the user or/and rooms that can be granted
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Room name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;is_granted&lt;/dt&gt;&lt;dd&gt;Filter the rooms which the user is or is not granted&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false|any]. Default value are &lt;code&gt;true&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;is_last_admin&lt;/dt&gt;&lt;dd&gt;Filter the rooms which the user is last Data Room administrator. Only with connect &lt;b&gt;is_granted:eq:true&lt;/b&gt; possible.&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true].&lt;/dd&gt;&lt;/dl&gt;Example: &lt;samp&gt;is_granted:eq:false|name:cn:searchstring&lt;/samp&gt;&lt;br/&gt;- get all rooms that the user is not granted and whose name is like searchstring&lt;br&gt;&lt;br&gt;Example: &lt;samp&gt;is_granted:eq:true|is_last_admin:eq:true|name:cn:searchstring&lt;/samp&gt;&lt;br/&gt;- get all rooms that the user is granted and is last admin and whose name is like searchstring&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User Id (required)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @param filter Room filter (optional)
   * @return RoomTreeDataList
   * @throws ApiException if fails to make API call
   */
  public RoomTreeDataList getUsersRooms(String xSdsAuthToken, Long userId, Integer offset, Integer limit, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getUsersRooms");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUsersRooms");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/rooms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

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

    GenericType<RoomTreeDataList> localVarReturnType = new GenericType<RoomTreeDataList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set custom user attributes
   * Set custom user attributes. Batch function. All existing user attributes will be deleted. Allowed characters for keys are: [a-zA-Z0-9_-].
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User ID (required)
   * @param body  (required)
   * @return UserData
   * @throws ApiException if fails to make API call
   */
  public UserData setAllUserAttributes(String xSdsAuthToken, Integer userId, UserAttributes body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling setAllUserAttributes");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setAllUserAttributes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setAllUserAttributes");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/userAttributes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UserData> localVarReturnType = new GenericType<UserData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add or edit custom user attributes
   * Set custom user attributes. Batch function. If an entry exists before, it will be overwritten. Allowed characters for keys are: [a-zA-Z0-9_-].
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User ID (required)
   * @param body  (required)
   * @return UserData
   * @throws ApiException if fails to make API call
   */
  public UserData setUserAttributes(String xSdsAuthToken, Integer userId, UserAttributes body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling setUserAttributes");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setUserAttributes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setUserAttributes");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/userAttributes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UserData> localVarReturnType = new GenericType<UserData>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set groups for the user
   * Batch function. All existing group membership will be deleted
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User ID (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void setUserGroupsBatch(String xSdsAuthToken, Integer userId, UserGroupsChangeBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling setUserGroupsBatch");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setUserGroupsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setUserGroupsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set rooms to the user
   * Batch function. All existing grants will be deleted. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Attention! &lt;/b&gt; Overwrites rights to ALL rooms, all not specified rights will be wiped out! Ownership to any missing from the list room is erased! Causes orphan room/sub-room if the right to the last DRA not present in the parameter list!
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User Id (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void setUserRoomsBatch(String xSdsAuthToken, Long userId, UserRoomsAddBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling setUserRoomsBatch");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setUserRoomsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setUserRoomsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}/rooms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update user
   * All input fields are limited to &lt;b&gt;150&lt;/b&gt; characters&lt;/b&gt;&lt;br/&gt;Allowed characters: &lt;b&gt;All&lt;/b&gt;&lt;br/&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Authentication method parameters&lt;/h4&gt;&lt;dl&gt;&lt;dt&gt;SQL&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;\&quot;login\&quot;: E-Mail Address&lt;/code&gt;&lt;br/&gt;&lt;code&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Active Directory Username &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Active Directory Username according to auth setting &#39;user_filter&#39;\&quot;&lt;br/&gt;additional parameters (optional):&lt;br/&gt;key: \&quot;more_username\&quot; &lt;b style&#x3D;&#39;color: red;&#39;&gt;  DEPRECATED, please do not use&lt;/b&gt;&lt;br&gt;value: \&quot;(one or more e-mail addresses, separated by &#39;;&#39;)\&quot; &lt;b style&#x3D;&#39;color: red;&#39;&gt;  DEPRECATED, please do not use&lt;/b&gt;&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;RADIUS  &lt;/dt&gt;&lt;dd&gt;&lt;code&gt;&lt;br/&gt;key : \&quot;username\&quot;&lt;br/&gt;value: \&quot;Radius user name\&quot;&lt;br/&gt;no additional parameters&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param userId User ID (required)
   * @param body  (required)
   * @return UserData
   * @throws ApiException if fails to make API call
   */
  public UserData updateUser(String xSdsAuthToken, Integer userId, UpdateUserRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling updateUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUser");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/{user_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UserData> localVarReturnType = new GenericType<UserData>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
