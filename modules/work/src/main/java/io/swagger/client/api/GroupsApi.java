package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Group;
import io.swagger.client.model.ChangeGroupMembersRequest;
import io.swagger.client.model.GroupRoomsAddBatchRequest;
import io.swagger.client.model.CreateGroupRequest;
import io.swagger.client.model.GroupRoomsDeleteBatchRequest;
import io.swagger.client.model.RoomTreeDataList;
import io.swagger.client.model.GroupUserList;
import io.swagger.client.model.GroupList;
import io.swagger.client.model.UpdateGroupRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class GroupsApi {
  private ApiClient apiClient;

  public GroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GroupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add group members
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Add members to a group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;manage users\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; New members are added to the group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; This is a batch function. The newly provided members will be added to the existing ones.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param groupId Group ID (required)
   * @param body  (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group addGroupMembers(String xSdsAuthToken, Integer groupId, ChangeGroupMembersRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling addGroupMembers");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling addGroupMembers");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addGroupMembers");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{group_id}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add rooms to the group
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Add new granted rooms of a group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Global right \&quot;manage users\&quot; required and must be Data Room Admin in the relevant rooms.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; New grants are added for this group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; This is a batch function. New grants will be added, existing grants will not be affected.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param groupId Group ID (required)
   * @param body  (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group addGroupRoomsBatch(String xSdsAuthToken, Integer groupId, GroupRoomsAddBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling addGroupRoomsBatch");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling addGroupRoomsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addGroupRoomsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{group_id}/rooms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create new user group
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Create a new user group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;manage users\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; A new group is created.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;If a group should not expire, leave expireAt empty.&lt;/li&gt;&lt;li&gt;Group names are limited to &lt;b&gt;150&lt;/b&gt; characters&lt;/b&gt;&lt;/li&gt;&lt;li&gt;Allowed characters: &lt;b&gt;All&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param body  (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group createGroup(String xSdsAuthToken, CreateGroupRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling createGroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createGroup");
    }
    
    // create path and map variables
    String localVarPath = "/groups".replaceAll("\\{format\\}","json");

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

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete user group
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Delete a user group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;manage users\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; User group is deleted.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param groupId Group ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteGroup(String xSdsAuthToken, Integer groupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteGroup");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteGroup");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{group_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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
   * Delete group members
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Remove group members.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;manage users\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Provided users are removed from the user group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; This is a batch function. The provided users are removed from the user group.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param groupId Group ID (required)
   * @param body  (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group deleteGroupMembers(String xSdsAuthToken, Integer groupId, ChangeGroupMembersRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteGroupMembers");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteGroupMembers");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteGroupMembers");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{group_id}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Revoke rooms from the group
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Remove existing granted rooms of a group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Global right \&quot;manage users\&quot; required and must be Data Room Admin in the relevant rooms.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Provided grants are removed for this group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; This is a batch function. Other grants will not be affected.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param groupId Group ID (required)
   * @param body  (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group deleteGroupRoomsBatch(String xSdsAuthToken, Integer groupId, GroupRoomsDeleteBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteGroupRoomsBatch");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteGroupRoomsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteGroupRoomsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{group_id}/rooms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user group
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve detailed information about one user group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;manage users\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param groupId Group ID (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group getGroup(String xSdsAuthToken, Integer groupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getGroup");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroup");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{group_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get rooms granted to the group or/and rooms that can be granted
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve a list of rooms, that are granted or may be granted to the group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;manage users\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Room name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;is_granted&lt;/dt&gt;&lt;dd&gt;Filter the rooms which the group is or is not granted&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false|any]. Default value is &lt;code&gt;true&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;Example: &lt;samp&gt;is_granted:eq:false|name:cn:searchstring&lt;/samp&gt;&lt;br/&gt;- get all rooms that the group is not granted and whose name is like searchstring&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param groupId Group ID (required)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @param filter Room filter (optional)
   * @return RoomTreeDataList
   * @throws ApiException if fails to make API call
   */
  public RoomTreeDataList getGroupRooms(String xSdsAuthToken, Integer groupId, Integer offset, Integer limit, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getGroupRooms");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupRooms");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{group_id}/rooms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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
   * Get group member users or/and users who can become a member
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve a list of group members.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;manage users\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;displayName&lt;/dt&gt;&lt;dd&gt;User display name (firstName, lastName, login)&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;is_member&lt;/dt&gt;&lt;dd&gt;Filter the group members and/or users&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false|any]. Default value is &lt;code&gt;true&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;Example: &lt;samp&gt;is_member:eq:false|displayName:cn:searchstring&lt;/samp&gt;&lt;br/&gt;- get all users that are not in this group and whose display name is like searchstring&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param groupId Group ID (required)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @param filter User filter (optional)
   * @return GroupUserList
   * @throws ApiException if fails to make API call
   */
  public GroupUserList getGroupUsers(String xSdsAuthToken, Integer groupId, Integer offset, Integer limit, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getGroupUsers");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getGroupUsers");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{group_id}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<GroupUserList> localVarReturnType = new GenericType<GroupUserList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user groups
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Returns a list of user groups.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;manage users\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;h4&gt;Filters&lt;/h4&gt;&lt;p&gt;Filter string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;OPERATOR&amp;gt;:&amp;lt;VALUE&amp;gt;&lt;/dfn&gt;&lt;/p&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Group name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (Group name contains value. Multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;name:cn:searchString&lt;/samp&gt;&lt;/p&gt;&lt;h4&gt;Sorting&lt;/h4&gt;&lt;p&gt;Sort string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;ORDER&amp;gt;&lt;/dfn&gt;&lt;br/&gt;Order can be &lt;code&gt;asc&lt;/code&gt; or &lt;code&gt;desc&lt;/code&gt;&lt;br/&gt;Multiple fields are supported.&lt;/p&gt;&lt;h5&gt;Sort fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Group name&lt;/dd&gt;&lt;dt&gt;createdAt&lt;/dt&gt;&lt;dd&gt;Creation date&lt;/dd&gt;&lt;dt&gt;expireAt&lt;/dt&gt;&lt;dd&gt;Expiration date&lt;/dd&gt;&lt;dt&gt;cntUsers&lt;/dt&gt;&lt;dd&gt;Amount of users&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;name:asc|expireAt:desc&lt;/samp&gt;&lt;br/&gt;- sort by name ascending and by expireAt descending&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @param filter Filter (optional)
   * @param sort Sort string (optional)
   * @return GroupList
   * @throws ApiException if fails to make API call
   */
  public GroupList getGroups(String xSdsAuthToken, Integer offset, Integer limit, String filter, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getGroups");
    }
    
    // create path and map variables
    String localVarPath = "/groups".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

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

    GenericType<GroupList> localVarReturnType = new GenericType<GroupList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set group members
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Update the Member list of a group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;manage users\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; A new list of group members is set.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; This is a batch function. All existing members will be removed before setting the new members!&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param groupId Group ID (required)
   * @param body  (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group setGroupMembers(String xSdsAuthToken, Integer groupId, ChangeGroupMembersRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling setGroupMembers");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling setGroupMembers");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setGroupMembers");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{group_id}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set rooms to the group
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Update the granted rooms of a group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Global right \&quot;manage users\&quot; required and must be Data Room Admin in the relevant rooms.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; New grants are set for this group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; This is a batch function. All existing grants will be removed before setting the new ones!&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param groupId Group ID (required)
   * @param body  (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group setGroupRoomsBatch(String xSdsAuthToken, Integer groupId, GroupRoomsAddBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling setGroupRoomsBatch");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling setGroupRoomsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setGroupRoomsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{group_id}/rooms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update user group
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Update the meta data of a user group.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;manage users\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Meta data of a user group is updated.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;If a group should not expire, leave expireAt empty.&lt;/li&gt;&lt;li&gt;Group names are limited to &lt;b&gt;150&lt;/b&gt; characters&lt;/b&gt;&lt;/li&gt;&lt;li&gt;Allowed characters: &lt;b&gt;All&lt;/b&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param groupId Group ID (required)
   * @param body  (required)
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group updateGroup(String xSdsAuthToken, Integer groupId, UpdateGroupRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling updateGroup");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateGroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateGroup");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{group_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
