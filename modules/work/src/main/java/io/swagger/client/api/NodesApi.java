package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Node;
import io.swagger.client.model.RoomGroupsAddBatchRequest;
import io.swagger.client.model.RoomUsersAddBatchRequest;
import io.swagger.client.model.CompleteUploadRequest;
import io.swagger.client.model.FileData;
import io.swagger.client.model.NodeId;
import io.swagger.client.model.NodesCopyRequest;
import io.swagger.client.model.BulkErrorResponse;
import io.swagger.client.model.DownloadTokenGenerateResponse;
import io.swagger.client.model.CreateFileUploadRequest;
import io.swagger.client.model.CreateFileUploadResponse;
import io.swagger.client.model.FolderData;
import io.swagger.client.model.CreateFolderRequest;
import io.swagger.client.model.RoomData;
import io.swagger.client.model.CreateRoomRequest;
import io.swagger.client.model.DeleteDeletedNodesRequest;
import io.swagger.client.model.NodesDeleteRequest;
import io.swagger.client.model.RoomGroupsDeleteBatchRequest;
import io.swagger.client.model.RoomUsersDeleteBatchRequest;
import io.swagger.client.model.EncryptRoomRequest;
import io.swagger.client.model.FileKey;
import io.swagger.client.model.NodeList;
import io.swagger.client.model.DeletedNode;
import io.swagger.client.model.DeletedNodeVersionsList;
import io.swagger.client.model.DeletedNodeSummaryList;
import io.swagger.client.model.ZipDownloadRequest;
import io.swagger.client.model.SyslogEventList;
import java.util.Date;
import io.swagger.client.model.RoomPermissions;
import io.swagger.client.model.RoomGroupList;
import io.swagger.client.model.RoomUserList;
import io.swagger.client.model.MissingKeysResponse;
import io.swagger.client.model.NodesMoveRequest;
import io.swagger.client.model.NotRestoredNodeList;
import io.swagger.client.model.RestoreDeletedNodesRequest;
import io.swagger.client.model.UserKeyPairContainer;
import io.swagger.client.model.UserFileKeySetBatchRequest;
import io.swagger.client.model.UpdateFileRequest;
import io.swagger.client.model.UpdateFolderRequest;
import io.swagger.client.model.UpdateRoomRequest;
import io.swagger.client.model.ChangeRoomRequest;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class NodesApi {
  private ApiClient apiClient;

  public NodesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NodesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Mark a node (room or folder) as favorite
   * 
   * @param xSdsAuthToken Authentication token (required)
   * @param nodeId Node Id (required)
   * @return Node
   * @throws ApiException if fails to make API call
   */
  public Node addFavorite(String xSdsAuthToken, Integer nodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling addFavorite");
    }
    
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling addFavorite");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{node_id}/favorite".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId.toString()));

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

    GenericType<Node> localVarReturnType = new GenericType<Node>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add granted groups to room
   * Batch function. Add new group permissions to the existing set
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void addRoomGroupsBatch(String xSdsAuthToken, Long roomId, RoomGroupsAddBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling addRoomGroupsBatch");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling addRoomGroupsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addRoomGroupsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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
   * Add granted users to room
   * Batch function. Add user permissions to the existing set
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void addRoomUsersBatch(String xSdsAuthToken, Long roomId, RoomUsersAddBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling addRoomUsersBatch");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling addRoomUsersBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addRoomUsersBatch");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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
   * Cancel file upload
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Cancel an upload and destroy the Upload Channel.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; An Upload Channel has been created.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; The Upload Channel is removed and all temporary uploaded data is purged.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt;It is recommended to notify the API about cancelled uploads if possible.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param uploadId Upload channel Id (required)
   * @throws ApiException if fails to make API call
   */
  public void cancelFileUpload(String xSdsAuthToken, String uploadId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling cancelFileUpload");
    }
    
    // verify the required parameter 'uploadId' is set
    if (uploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'uploadId' when calling cancelFileUpload");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/uploads/{upload_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "upload_id" + "\\}", apiClient.escapeString(uploadId.toString()));

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
   * Complete file upload
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Finishes an upload and closes the corresponding Upload Channel.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; An Upload Channel has been created and data has been transmitted.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; The upload is finished and the temporary file is moved to the productive environment.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; The provided file name might be changed in accordance with the resolution strategy:&lt;br/&gt;&#39;autorename&#39; changes the file name and adds a number to avoid conflicts.&lt;br/&gt;&#39;overwrite&#39; deletes any old file with the same file name.&lt;br/&gt;&#39;fail&#39; returns an error. In this case, another PUT request with a different file name may be sent.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param uploadId Upload channel Id (required)
   * @param body  (optional)
   * @return FileData
   * @throws ApiException if fails to make API call
   */
  public FileData completeFileUpload(String xSdsAuthToken, String uploadId, CompleteUploadRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling completeFileUpload");
    }
    
    // verify the required parameter 'uploadId' is set
    if (uploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'uploadId' when calling completeFileUpload");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/uploads/{upload_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "upload_id" + "\\}", apiClient.escapeString(uploadId.toString()));

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

    GenericType<FileData> localVarReturnType = new GenericType<FileData>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Copy node to the folder
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Copies a node (file, folder) to another parent folder.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Authenticated user with write permissions in the parent node.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; A new copy of the node is created.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Rooms cannot be children of folders.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param folderId Folder ID. (required)
   * @param body Source file or folder reference (required)
   * @return Node
   * @throws ApiException if fails to make API call
   */
  public Node copyNodeToFolder(String xSdsAuthToken, Integer folderId, NodeId body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling copyNodeToFolder");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling copyNodeToFolder");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling copyNodeToFolder");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/folders/{folder_id}/children".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "folder_id" + "\\}", apiClient.escapeString(folderId.toString()));

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

    GenericType<Node> localVarReturnType = new GenericType<Node>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Copy node to the room
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Copies a node (room, folder, file) to another parent room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Authenticated user with write permissions in the parent node.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; The node is copied.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Rooms are only supported at the two topmost levels.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param body  (required)
   * @return Node
   * @throws ApiException if fails to make API call
   */
  public Node copyNodeToRoom(String xSdsAuthToken, Integer roomId, NodeId body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling copyNodeToRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling copyNodeToRoom");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling copyNodeToRoom");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/children".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    GenericType<Node> localVarReturnType = new GenericType<Node>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Copy file system nodes
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br /&gt;Copies nodes (folder,file) to another parent.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Authenticated user with read permissions in the source parent and write permissions in the target parent node.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Nodes are copied to target parent.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Nodes must be in same source parent. Rooms cannot be copied.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param nodeId Target Parent Node ID (required)
   * @param body  (required)
   * @return Node
   * @throws ApiException if fails to make API call
   */
  public Node copyNodes(String xSdsAuthToken, Long nodeId, NodesCopyRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling copyNodes");
    }
    
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling copyNodes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling copyNodes");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{node_id}/copy_to".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId.toString()));

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

    GenericType<Node> localVarReturnType = new GenericType<Node>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Generate download token
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Create a download token to retrieve a file without X-Sds-Auth-Token Header.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User may access file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Download token is generated and returned.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; The token is necessary to access /downloads ressources.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param fileId File Id (required)
   * @return DownloadTokenGenerateResponse
   * @throws ApiException if fails to make API call
   */
  public DownloadTokenGenerateResponse createFileDownloadToken(String xSdsAuthToken, Integer fileId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling createFileDownloadToken");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling createFileDownloadToken");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/{file_id}/downloads".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

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

    GenericType<DownloadTokenGenerateResponse> localVarReturnType = new GenericType<DownloadTokenGenerateResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create new file upload channel
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;This endpoint creates a new upload channel which is the first step in any file upload workflow.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has right to write files in the parent container (room or folder).&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; A new upload channel for a file is created. Its ID and an upload token are returned.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; The uploadID is used for uploads with X-Sds-Auth-Token header, the upload token can be used for uploads without authentication header.&lt;/p&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Room/Folder/File name convention&lt;/h4&gt;&lt;h5&gt;Room/Folder/File names are limited to 150 characters.&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;Not allowed Room/Folder/File names&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;CON&#39;, &#39;PRN&#39;, &#39;AUX&#39;, &#39;NUL&#39;, &#39;COM1&#39;, &#39;COM2&#39;, &#39;COM3&#39;, &#39;COM4&#39;, &#39;COM5&#39;, &#39;COM6&#39;, &#39;COM7&#39;, &#39;COM8&#39;, &#39;COM9&#39;, &#39;LPT1&#39;, &#39;LPT2&#39;, &#39;LPT3&#39;, &#39;LPT4&#39;, &#39;LPT5&#39;, &#39;LPT6&#39;, &#39;LPT7&#39;, &#39;LPT8&#39;, &#39;LPT9&#39;,&#39;.&#39;,&#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Not allowed characters in Room/Folder/File name&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;../&#39;, &#39;\\&#39;, &#39;&amp;lt;&#39;,&#39;&amp;gt;&#39;, &#39;:&#39;, &#39;\&quot;&#39;, &#39;|&#39;, &#39;?&#39;, &#39;*&#39;, &#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param body  (required)
   * @return CreateFileUploadResponse
   * @throws ApiException if fails to make API call
   */
  public CreateFileUploadResponse createFileUpload(String xSdsAuthToken, CreateFileUploadRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling createFileUpload");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createFileUpload");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/uploads".replaceAll("\\{format\\}","json");

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

    GenericType<CreateFileUploadResponse> localVarReturnType = new GenericType<CreateFileUploadResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create new folder
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Creates a new folder.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has right to create folders in the current Data Room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; A new folder is created.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Folders cannot be created on top level (without parent element).&lt;/p&gt;&lt;p&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Room/Folder/File name convention&lt;/h4&gt;&lt;h5&gt;Room/Folder/File names are limited to 150 characters.&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;Not allowed Room/Folder/File names&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;CON&#39;, &#39;PRN&#39;, &#39;AUX&#39;, &#39;NUL&#39;, &#39;COM1&#39;, &#39;COM2&#39;, &#39;COM3&#39;, &#39;COM4&#39;, &#39;COM5&#39;, &#39;COM6&#39;, &#39;COM7&#39;, &#39;COM8&#39;, &#39;COM9&#39;, &#39;LPT1&#39;, &#39;LPT2&#39;, &#39;LPT3&#39;, &#39;LPT4&#39;, &#39;LPT5&#39;, &#39;LPT6&#39;, &#39;LPT7&#39;, &#39;LPT8&#39;, &#39;LPT9&#39;,&#39;.&#39;,&#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Not allowed characters in Room/Folder/File name&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;../&#39;, &#39;\\&#39;, &#39;&amp;lt;&#39;,&#39;&amp;gt;&#39;, &#39;:&#39;, &#39;\&quot;&#39;, &#39;|&#39;, &#39;?&#39;, &#39;*&#39;, &#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param body  (required)
   * @return FolderData
   * @throws ApiException if fails to make API call
   */
  public FolderData createFolder(String xSdsAuthToken, CreateFolderRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling createFolder");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createFolder");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/folders".replaceAll("\\{format\\}","json");

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

    GenericType<FolderData> localVarReturnType = new GenericType<FolderData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create new room
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Creates a new Data Room at the provided parent node.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has write permissions in the parent room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; A new room is created.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Rooms can only be created at the first and second level and may only have other rooms as parent. Rooms on the top level do not have any parent.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param body  (required)
   * @return RoomData
   * @throws ApiException if fails to make API call
   */
  public RoomData createRoom(String xSdsAuthToken, CreateRoomRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling createRoom");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createRoom");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms".replaceAll("\\{format\\}","json");

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

    GenericType<RoomData> localVarReturnType = new GenericType<RoomData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete nodes from Recycle Bin
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Permanently remove a list of nodes from the recycle bin.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has delete permissions in parent room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; All provided nodes are removed.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; The removal of deleted nodes from the recycle bin is irreversible.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDeletedNodes(String xSdsAuthToken, DeleteDeletedNodesRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteDeletedNodes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteDeletedNodes");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/deleted_nodes".replaceAll("\\{format\\}","json");

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
   * Delete file
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Deletes a file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User may delete file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; File is deleted.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param fileId File ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFile(String xSdsAuthToken, Integer fileId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteFile");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling deleteFile");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/{file_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

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
   * Delete folder
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Delete an existing folder.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has right to delete folders in the current Data Room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; The folder and all of its contents are removed.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param folderId Folder ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFolder(String xSdsAuthToken, Integer folderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteFolder");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling deleteFolder");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/folders/{folder_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "folder_id" + "\\}", apiClient.escapeString(folderId.toString()));

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
   * Delete file system nodes
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Delete nodes (room, folder, file).&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Authenticated user with delete permissions on supplied nodes.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Nodes are deleted.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Nodes must be in same parent.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteNodes(String xSdsAuthToken, NodesDeleteRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteNodes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteNodes");
    }
    
    // create path and map variables
    String localVarPath = "/nodes".replaceAll("\\{format\\}","json");

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
   * Delete room
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Deletes a Data Room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has delete permissions.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Room is deleted with all its contents.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRoom(String xSdsAuthToken, Integer roomId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling deleteRoom");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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
   * Revoke group permissions from room
   * Batch function. Revoke groups from room
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRoomGroupsBatch(String xSdsAuthToken, Long roomId, RoomGroupsDeleteBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteRoomGroupsBatch");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling deleteRoomGroupsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteRoomGroupsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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
   * Revoke user permissions from room
   * Batch function. Revoke users from room
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRoomUsersBatch(String xSdsAuthToken, Long roomId, RoomUsersDeleteBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling deleteRoomUsersBatch");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling deleteRoomUsersBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteRoomUsersBatch");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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
   * Empty Recycle Bin
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br /&gt;Empty a recycle bin.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has delete permissions in parent room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; All files in the recycle bin are permanently removed.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Actually removes the previosly deleted files from the system. This action is irreversible.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param nodeId Parent node ID (required)
   * @throws ApiException if fails to make API call
   */
  public void emptyDeletedNodes(String xSdsAuthToken, Long nodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling emptyDeletedNodes");
    }
    
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling emptyDeletedNodes");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{node_id}/deleted_nodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId.toString()));

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
   * Encrypt room
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Activates the client-side encryption for a Data Room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User needs to be Data Room Admin.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Encryption of Data Room is activated.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Only empty rooms at the top level my be encrypted. This endpoint may also be used to disable encryption of an empty room.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param body  (required)
   * @return RoomData
   * @throws ApiException if fails to make API call
   */
  public RoomData encryptRoom(String xSdsAuthToken, Integer roomId, EncryptRoomRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling encryptRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling encryptRoom");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling encryptRoom");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/encrypt".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    GenericType<RoomData> localVarReturnType = new GenericType<RoomData>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Data Room Rescue file key
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Returns the fileKey for the Data Room Rescue Key of a certain file (if available).&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has right to access file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; none.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param fileId File Id (required)
   * @return FileKey
   * @throws ApiException if fails to make API call
   */
  public FileKey getDataRoomFileKey(String xSdsAuthToken, Integer fileId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getDataRoomFileKey");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getDataRoomFileKey");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/{file_id}/data_room_file_key".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

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

    GenericType<FileKey> localVarReturnType = new GenericType<FileKey>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get DataSpace Rescue file key
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Returns the fileKey for the Data Space Rescue Key of a certain file (if available).&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has right to access file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; none.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param fileId File Id (required)
   * @return FileKey
   * @throws ApiException if fails to make API call
   */
  public FileKey getDataSpaceFileKey(String xSdsAuthToken, Integer fileId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getDataSpaceFileKey");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getDataSpaceFileKey");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/{file_id}/data_space_file_key".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

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

    GenericType<FileKey> localVarReturnType = new GenericType<FileKey>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get file meta data
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Provides a file&#39;s meta data.&lt;/p&gt;&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User may access file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param fileId File ID (required)
   * @return FileData
   * @throws ApiException if fails to make API call
   */
  public FileData getFile(String xSdsAuthToken, Long fileId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getFile");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getFile");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/{file_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

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

    GenericType<FileData> localVarReturnType = new GenericType<FileData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Download file
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Download a file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User may access file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Range requests are supported (please cf. &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc7233\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RCF 7233&lt;/a&gt; for details).&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param fileId File Id (required)
   * @param range Range (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getFileData(String xSdsAuthToken, Integer fileId, String range) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getFileData");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getFileData");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/{file_id}/downloads".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xSdsAuthToken != null)
      localVarHeaderParams.put("X-Sds-Auth-Token", apiClient.parameterToString(xSdsAuthToken));
if (range != null)
      localVarHeaderParams.put("Range", apiClient.parameterToString(range));

    
    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get file headers
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve the header of a file transmission. Please cf. &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc7233\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RCF 7233&lt;/a&gt; for details.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User may access file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Equivalent of &lt;code&gt;HEAD /downloads/{token}&lt;/code&gt;, when a client can set &lt;em&gt;X-Sds-Auth-Token&lt;/em&gt; header.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param fileId File Id (required)
   * @throws ApiException if fails to make API call
   */
  public void getFileDataHead(String xSdsAuthToken, Integer fileId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getFileDataHead");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getFileDataHead");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/{file_id}/downloads".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

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


    apiClient.invokeAPI(localVarPath, "HEAD", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get folder data
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Retrieves all meta data about the requested folder.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has right to access the folder.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param folderId Folder Id (required)
   * @return FolderData
   * @throws ApiException if fails to make API call
   */
  public FolderData getFolder(String xSdsAuthToken, Integer folderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getFolder");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolder");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/folders/{folder_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "folder_id" + "\\}", apiClient.escapeString(folderId.toString()));

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

    GenericType<FolderData> localVarReturnType = new GenericType<FolderData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get folder child nodes
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Provides a hierarchical list of child elements (folders, files) of a given parent folder that are accessible by the current user.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Authenticated user with access to the parent node.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;p&gt;Filter string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;OPERATOR&amp;gt;:&amp;lt;VALUE&amp;gt;[:&amp;lt;VALUE&amp;gt;...]&lt;/dfn&gt;&lt;/p&gt;&lt;h5&gt;Fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;type&lt;/dt&gt;&lt;dd&gt;Node type filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values allowed)&lt;br/&gt;VALUE: &lt;code&gt;room|folder|file&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;perm&lt;/dt&gt;&lt;dd&gt;Permissions filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values allowed)&lt;br/&gt;VALUE: &lt;code&gt;read|change|manage|create|share|encrypt&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;child_perm&lt;/dt&gt;&lt;dd&gt;The same as perm, but less restrictive (applied to child nodes only)&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values allowed)&lt;br/&gt;VALUE: &lt;code&gt;read|change|manage|create|share|encrypt&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Node name filter&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (name contains value, multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;encrypted&lt;/dt&gt;&lt;dd&gt;Node encryption status filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (Node is encrypted, multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;true|false&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;type:eq:room:folder|perm:eq:read&lt;/samp&gt;&lt;br/&gt;&amp;rarr; Get nodes where type equals &#39;room&#39; or &#39;folder&#39; AND user has read permissions.&lt;/p&gt;&lt;h4&gt;Sort&lt;/h4&gt;&lt;p&gt;Sort string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;ORDER&amp;gt;&lt;/dfn&gt;&lt;br/&gt;Order can be &lt;code&gt;asc&lt;/code&gt; or &lt;code&gt;desc&lt;/code&gt;.&lt;br/&gt;Multiple fields not supported.&lt;/p&gt;&lt;h5&gt;Sort fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Node name&lt;/dd&gt;&lt;dt&gt;createdBy&lt;/dt&gt;&lt;dd&gt;Creator user name&lt;/dd&gt;&lt;dt&gt;createdAt&lt;/dt&gt;&lt;dd&gt;Creation date&lt;/dd&gt;&lt;dt&gt;updatedBy&lt;/dt&gt;&lt;dd&gt;Modifier user name&lt;/dd&gt;&lt;dt&gt;updatedAt&lt;/dt&gt;&lt;dd&gt;Modification date&lt;/dd&gt;&lt;dt&gt;fileType&lt;/dt&gt;&lt;dd&gt;File type (extension)&lt;/dd&gt;&lt;dt&gt;classification&lt;/dt&gt;&lt;dd&gt;Classification&lt;/dd&gt;&lt;dt&gt;size&lt;/dt&gt;&lt;dd&gt;Node size&lt;/dd&gt;&lt;dt&gt;cntAdmins&lt;/dt&gt;&lt;dd&gt;For rooms only: Number of admins&lt;/dd&gt;&lt;dt&gt;cntUsers&lt;/dt&gt;&lt;dd&gt;For rooms only: Number of users&lt;/dd&gt;&lt;dt&gt;cntChildren&lt;/dt&gt;&lt;dd&gt;For rooms/subrooms/folder only: Number of direct children (not recursive)&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;name:desc&lt;/samp&gt;&lt;br/&gt;&amp;rarr; sort by name descending&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param folderId Folder ID. (required)
   * @param depthLevel &lt;ul&gt;&lt;li&gt;0 - top-level nodes only;&lt;/li&gt;&lt;li&gt;-1 - the the full tree;&lt;/li&gt;&lt;li&gt;any positive N - include N down levels starting from the current node&lt;/li&gt;&lt;/ul&gt; (optional, default to 0)
   * @param filter Filter string - see syntax in &lt;a href&#x3D;&#39;#!/nodes.json/getFsNodes&#39;&gt;getFsNodes&lt;/a&gt; (optional)
   * @param sort Sorting string - see syntax in &lt;a href&#x3D;&#39;#!/nodes.json/getFsNodes&#39;&gt;Get filesystem nodes&lt;/a&gt; (optional)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @return NodeList
   * @throws ApiException if fails to make API call
   */
  public NodeList getFolderNodes(String xSdsAuthToken, Integer folderId, Integer depthLevel, String filter, String sort, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getFolderNodes");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolderNodes");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/folders/{folder_id}/children".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "folder_id" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "depth_level", depthLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

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

    GenericType<NodeList> localVarReturnType = new GenericType<NodeList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get deleted node
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Get the meta data of one deleted node.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User can access parent room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param deletedNodeId Deleted Node ID (required)
   * @return DeletedNode
   * @throws ApiException if fails to make API call
   */
  public DeletedNode getFsDeletedNode(String xSdsAuthToken, Long deletedNodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getFsDeletedNode");
    }
    
    // verify the required parameter 'deletedNodeId' is set
    if (deletedNodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'deletedNodeId' when calling getFsDeletedNode");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/deleted_nodes/{deleted_node_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deleted_node_id" + "\\}", apiClient.escapeString(deletedNodeId.toString()));

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

    GenericType<DeletedNode> localVarReturnType = new GenericType<DeletedNode>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get deleted versions
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Retrieve all deleted versions of a node.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User can access parent room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; The node is identified by three parameters: parent ID, name and type (file|folder).&lt;/p&gt;&lt;h4&gt;Sort&lt;/h4&gt;&lt;p&gt;Sort string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;ORDER&amp;gt;&lt;/dfn&gt;&lt;br/&gt;Order can be &lt;code&gt;asc&lt;/code&gt; or &lt;code&gt;desc&lt;/code&gt;.&lt;br/&gt;Multiple fields not supported.&lt;/p&gt;&lt;h5&gt;Sort fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;expireAt&lt;/dt&gt;&lt;dd&gt;Expiration date&lt;/dd&gt;&lt;dt&gt;accessedAt&lt;/dt&gt;&lt;dd&gt;Last access date&lt;/dd&gt;&lt;dt&gt;size&lt;/dt&gt;&lt;dd&gt;Node size&lt;/dd&gt;&lt;dt&gt;classification&lt;/dt&gt;&lt;dd&gt;Classification ID. File only&lt;/dd&gt;&lt;dt&gt;createdAt&lt;/dt&gt;&lt;dd&gt;Creation date&lt;/dd&gt;&lt;dt&gt;createdBy&lt;/dt&gt;&lt;dd&gt;Node created by user&lt;/dd&gt;&lt;dt&gt;updatedAt&lt;/dt&gt;&lt;dd&gt;Modification date &lt;/dd&gt;&lt;dt&gt;updatedBy&lt;/dt&gt;&lt;dd&gt;Node modified by user&lt;/dd&gt;&lt;dt&gt;deletedAt&lt;/dt&gt;&lt;dd&gt;Deleted date&lt;/dd&gt;&lt;dt&gt;deletedBy&lt;/dt&gt;&lt;dd&gt;Node deleted by user&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;expireAt:desc&lt;/samp&gt;&lt;br/&gt;&amp;rarr; sort by expireAt descending&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param nodeId Parent Node ID (required)
   * @param type Node type (required)
   * @param name Node name (required)
   * @param sort Sorting string (optional)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @return DeletedNodeVersionsList
   * @throws ApiException if fails to make API call
   */
  public DeletedNodeVersionsList getFsDeletedNodeVersions(String xSdsAuthToken, Long nodeId, String type, String name, String sort, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getFsDeletedNodeVersions");
    }
    
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling getFsDeletedNodeVersions");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getFsDeletedNodeVersions");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getFsDeletedNodeVersions");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{node_id}/deleted_nodes/versions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

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

    GenericType<DeletedNodeVersionsList> localVarReturnType = new GenericType<DeletedNodeVersionsList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get deleted nodes
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br /&gt;Retrieve a list of deleted nodes in a recycle bin.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User can access parent room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Only room IDs are accepted as node ID since only rooms have recycle bins.&lt;/p&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;p&gt;Filter string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;OPERATOR&amp;gt;:&amp;lt;VALUE&amp;gt;[:&amp;lt;VALUE&amp;gt;...]&lt;/dfn&gt;&lt;/p&gt;&lt;h5&gt;Fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;type&lt;/dt&gt;&lt;dd&gt;Node type filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values allowed)&lt;br/&gt;VALUE: &lt;code&gt;folder|file&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Node name filter&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (Node name contains value, multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;parentPath&lt;/dt&gt;&lt;dd&gt;Parent path filter&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (Parent path contains value, multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;type:eq:file:folder|name:cn:searchString|parentPath:cn:searchString1&lt;/samp&gt;&lt;br/&gt;&amp;rarr; Get deleted nodes where type equals &#39;file&#39; or &#39;folder&#39; AND deleted node name contains &#39;searchString&#39; AND deleted node parent path contains &#39;searchString1&#39;.&lt;/p&gt;&lt;h4&gt;Sort&lt;/h4&gt;&lt;p&gt;Sort string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;ORDER&amp;gt;&lt;/dfn&gt;&lt;br/&gt;Order can be &lt;code&gt;asc&lt;/code&gt; or &lt;code&gt;desc&lt;/code&gt;.&lt;br/&gt;Multiple fields not supported.&lt;/p&gt;&lt;h5&gt;Sort fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Node name&lt;/dd&gt;&lt;dt&gt;cntVersions&lt;/dt&gt;&lt;dd&gt;Number of deleted versions of this file&lt;/dd&gt;&lt;dt&gt;firstDeletedAt&lt;/dt&gt;&lt;dd&gt;First deleted version&lt;/dd&gt;&lt;dt&gt;lastDeletedAt&lt;/dt&gt;&lt;dd&gt;Last deleted version&lt;/dd&gt;&lt;dt&gt;parentPath&lt;/dt&gt;&lt;dd&gt;Parent path of deleted node&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;name:desc&lt;/samp&gt;&lt;br/&gt;&amp;rarr; sort by name descending&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param nodeId Auth parent node ID (required)
   * @param filter Filter string (optional)
   * @param sort Sorting string (optional)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @return DeletedNodeSummaryList
   * @throws ApiException if fails to make API call
   */
  public DeletedNodeSummaryList getFsDeletedNodesSummary(String xSdsAuthToken, Long nodeId, String filter, String sort, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getFsDeletedNodesSummary");
    }
    
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling getFsDeletedNodesSummary");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{node_id}/deleted_nodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

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

    GenericType<DeletedNodeSummaryList> localVarReturnType = new GenericType<DeletedNodeSummaryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get node
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br /&gt;Get all file system node (Room, Folder, File)&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has read permissions in auth parent room/subroom.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param nodeId Node id (required)
   * @return Node
   * @throws ApiException if fails to make API call
   */
  public Node getFsNode(String xSdsAuthToken, Long nodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getFsNode");
    }
    
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling getFsNode");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{node_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId.toString()));

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

    GenericType<Node> localVarReturnType = new GenericType<Node>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get file system nodes
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Provides a hierarchical list of file system nodes (Rooms, Folders, Files) of a given parent that are accessible by the current user.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Authenticated user.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; EncryptionInfo is not provided.&lt;/p&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;p&gt;Filter string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;OPERATOR&amp;gt;:&amp;lt;VALUE&amp;gt;[:&amp;lt;VALUE&amp;gt;...]&lt;/dfn&gt;&lt;/p&gt;&lt;h5&gt;Fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;type&lt;/dt&gt;&lt;dd&gt;Node type filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values allowed)&lt;br/&gt;VALUE: &lt;code&gt;room|folder|file&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;perm&lt;/dt&gt;&lt;dd&gt;Permissions filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values allowed)&lt;br/&gt;VALUE: &lt;code&gt;read|change|manage|create|share|encrypt&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;child_perm&lt;/dt&gt;&lt;dd&gt;The same as perm, but less restrictive (applied to child nodes only)&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values allowed)&lt;br/&gt;VALUE: &lt;code&gt;read|change|manage|create|share|encrypt&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Node name filter&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (name contains value, multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;encrypted&lt;/dt&gt;&lt;dd&gt;Node encryption status filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (Node is encrypted, multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;true|false&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;type:eq:room:folder|perm:eq:read&lt;/samp&gt;&lt;br/&gt;&amp;rarr; Get nodes where type equals &#39;room&#39; or &#39;folder&#39; AND user has read permissions.&lt;/p&gt;&lt;h4&gt;Sort&lt;/h4&gt;&lt;p&gt;Sort string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;ORDER&amp;gt;&lt;/dfn&gt;&lt;br/&gt;Order can be &lt;code&gt;asc&lt;/code&gt; or &lt;code&gt;desc&lt;/code&gt;.&lt;br/&gt;Multiple fields not supported.&lt;/p&gt;&lt;h5&gt;Sort fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Node name&lt;/dd&gt;&lt;dt&gt;createdBy&lt;/dt&gt;&lt;dd&gt;Creator user name&lt;/dd&gt;&lt;dt&gt;createdAt&lt;/dt&gt;&lt;dd&gt;Creation date&lt;/dd&gt;&lt;dt&gt;updatedBy&lt;/dt&gt;&lt;dd&gt;Modifier user name&lt;/dd&gt;&lt;dt&gt;updatedAt&lt;/dt&gt;&lt;dd&gt;Modification date&lt;/dd&gt;&lt;dt&gt;fileType&lt;/dt&gt;&lt;dd&gt;File type (extension)&lt;/dd&gt;&lt;dt&gt;classification&lt;/dt&gt;&lt;dd&gt;Classification&lt;/dd&gt;&lt;dt&gt;size&lt;/dt&gt;&lt;dd&gt;Node size&lt;/dd&gt;&lt;dt&gt;cntAdmins&lt;/dt&gt;&lt;dd&gt;For rooms only: Number of admins&lt;/dd&gt;&lt;dt&gt;cntUsers&lt;/dt&gt;&lt;dd&gt;For rooms only: Number of users&lt;/dd&gt;&lt;dt&gt;cntChildren&lt;/dt&gt;&lt;dd&gt;For rooms/subrooms/folder only: Number of direct children (not recursive)&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;name:desc&lt;/samp&gt;&lt;br/&gt;&amp;rarr; sort by name descending&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param depthLevel &lt;ul&gt;&lt;li&gt;0 - top-level nodes only;&lt;/li&gt;&lt;li&gt;-1 - full tree;&lt;/li&gt;&lt;li&gt;any positive N - include N levels starting from the current node&lt;/li&gt;&lt;/ul&gt; (optional, default to 0)
   * @param parentId Parent node ID. Only rooms and folders can be parents. Parent ID 0 or empty is the root node. (optional)
   * @param filter Filter string (optional)
   * @param sort Sorting string (optional)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @return NodeList
   * @throws ApiException if fails to make API call
   */
  public NodeList getFsNodes(String xSdsAuthToken, Integer depthLevel, Long parentId, String filter, String sort, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getFsNodes");
    }
    
    // create path and map variables
    String localVarPath = "/nodes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "depth_level", depthLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "parent_id", parentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

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

    GenericType<NodeList> localVarReturnType = new GenericType<NodeList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Generate download token for zip download
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Create a download token to retrieve several files in one ZIP archive.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User may access files.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Download token is generated and returned.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; The token is necessary to access /downloads ressources.&lt;br/&gt;ZIP download is only available for files and folders.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param body  (required)
   * @return DownloadTokenGenerateResponse
   * @throws ApiException if fails to make API call
   */
  public DownloadTokenGenerateResponse getNodesAsZip(String xSdsAuthToken, ZipDownloadRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getNodesAsZip");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getNodesAsZip");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/zip".replaceAll("\\{format\\}","json");

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

    GenericType<DownloadTokenGenerateResponse> localVarReturnType = new GenericType<DownloadTokenGenerateResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get room data
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve a Data Room&#39;s meta data.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has access to the room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @return RoomData
   * @throws ApiException if fails to make API call
   */
  public RoomData getRoom(String xSdsAuthToken, Integer roomId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoom");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    GenericType<RoomData> localVarReturnType = new GenericType<RoomData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get events of a room
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve syslog (&#x3D; audit log) events related to a Room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Role Data Space Admin required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Output may be limited to a certain number of entries. Please use filter criteria and paging.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @param dateStart Start date (2015-12-31T23:59:00) (optional)
   * @param dateEnd End date (2015-12-31T23:59:00) (optional)
   * @param type Operation ID type (see table LOG_OPERATIONS) (optional)
   * @param userId User ID (optional)
   * @param status Operation status: 0 &#x3D; SUCCESS, 1 &#x3D; ERROR (optional)
   * @return SyslogEventList
   * @throws ApiException if fails to make API call
   */
  public SyslogEventList getRoomActivitiesLog(String xSdsAuthToken, Integer roomId, Integer offset, Integer limit, Date dateStart, Date dateEnd, List<Integer> type, List<Integer> userId, List<Integer> status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getRoomActivitiesLog");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoomActivitiesLog");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/activities_log".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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
  /**
   * Get group permissions
   * 
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param groupId Granted group Id (required)
   * @return RoomPermissions
   * @throws ApiException if fails to make API call
   */
  public RoomPermissions getRoomGroupPermissions(String xSdsAuthToken, Integer roomId, Integer groupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getRoomGroupPermissions");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoomGroupPermissions");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getRoomGroupPermissions");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/groups/{group_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()))
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

    GenericType<RoomPermissions> localVarReturnType = new GenericType<RoomPermissions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get room granted groups or/and groups that can be granted
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Group name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;is_granted&lt;/dt&gt;&lt;dd&gt;Filter the groups that have access/no access to this room&lt;br/&gt;&lt;b&gt;Attention! This filter is only available for data room administrators.&lt;br/&gt; Other users can only look for users in their rooms, so this filter is TRUE and cannot be overridden.&lt;/b&gt;&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false|any]. Default value is &lt;code&gt;true&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;Example: &lt;samp&gt;is_granted:eq:false|name:cn:searchstring&lt;/samp&gt;&lt;br/&gt;- get all groups that have no rights to this room of and whose name is like searchstring&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @param filter Group filter (optional)
   * @return RoomGroupList
   * @throws ApiException if fails to make API call
   */
  public RoomGroupList getRoomGroups(String xSdsAuthToken, Integer roomId, Integer offset, Integer limit, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getRoomGroups");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoomGroups");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    GenericType<RoomGroupList> localVarReturnType = new GenericType<RoomGroupList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get room child nodes
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Provides a hierarchical list of child elements (rooms, folders, files) of a given parent room that are accessible by the current user.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Authenticated user with access to the parent node.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;p&gt;Filter string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;OPERATOR&amp;gt;:&amp;lt;VALUE&amp;gt;[:&amp;lt;VALUE&amp;gt;...]&lt;/dfn&gt;&lt;/p&gt;&lt;h5&gt;Fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;type&lt;/dt&gt;&lt;dd&gt;Node type filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values allowed)&lt;br/&gt;VALUE: &lt;code&gt;room|folder|file&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;perm&lt;/dt&gt;&lt;dd&gt;Permissions filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values allowed)&lt;br/&gt;VALUE: &lt;code&gt;read|change|manage|create|share|encrypt&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;child_perm&lt;/dt&gt;&lt;dd&gt;The same as perm, but less restrictive (applied to child nodes only)&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values allowed)&lt;br/&gt;VALUE: &lt;code&gt;read|change|manage|create|share|encrypt&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Node name filter&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (name contains value, multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;encrypted&lt;/dt&gt;&lt;dd&gt;Node encryption status filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (Node is encrypted, multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;true|false&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;type:eq:room:folder|perm:eq:read&lt;/samp&gt;&lt;br/&gt;&amp;rarr; Get nodes where type equals &#39;room&#39; or &#39;folder&#39; AND user has read permissions.&lt;/p&gt;&lt;h4&gt;Sort&lt;/h4&gt;&lt;p&gt;Sort string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;ORDER&amp;gt;&lt;/dfn&gt;&lt;br/&gt;Order can be &lt;code&gt;asc&lt;/code&gt; or &lt;code&gt;desc&lt;/code&gt;.&lt;br/&gt;Multiple fields not supported.&lt;/p&gt;&lt;h5&gt;Sort fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Node name&lt;/dd&gt;&lt;dt&gt;createdBy&lt;/dt&gt;&lt;dd&gt;Creator user name&lt;/dd&gt;&lt;dt&gt;createdAt&lt;/dt&gt;&lt;dd&gt;Creation date&lt;/dd&gt;&lt;dt&gt;updatedBy&lt;/dt&gt;&lt;dd&gt;Modifier user name&lt;/dd&gt;&lt;dt&gt;updatedAt&lt;/dt&gt;&lt;dd&gt;Modification date&lt;/dd&gt;&lt;dt&gt;fileType&lt;/dt&gt;&lt;dd&gt;File type (extension)&lt;/dd&gt;&lt;dt&gt;classification&lt;/dt&gt;&lt;dd&gt;Classification&lt;/dd&gt;&lt;dt&gt;size&lt;/dt&gt;&lt;dd&gt;Node size&lt;/dd&gt;&lt;dt&gt;cntAdmins&lt;/dt&gt;&lt;dd&gt;For rooms only: Number of admins&lt;/dd&gt;&lt;dt&gt;cntUsers&lt;/dt&gt;&lt;dd&gt;For rooms only: Number of users&lt;/dd&gt;&lt;dt&gt;cntChildren&lt;/dt&gt;&lt;dd&gt;For rooms/subrooms/folder only: Number of direct children (not recursive)&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;name:desc&lt;/samp&gt;&lt;br/&gt;&amp;rarr; sort by name descending&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param depthLevel &lt;ul&gt;&lt;li&gt;0 - top-level nodes only;&lt;/li&gt;&lt;li&gt;-1 - the the full tree;&lt;/li&gt;&lt;li&gt;any positive N - include N down levels starting from the current node&lt;/li&gt;&lt;/ul&gt; (optional, default to 0)
   * @param filter Filter string - see syntax in &lt;a href&#x3D;&#39;#!/nodes.json/getFsNodes&#39;&gt;Get filesystem nodes&lt;/a&gt; (optional)
   * @param sort Sorting string - see syntax in &lt;a href&#x3D;&#39;#!/nodes.json/getFsNodes&#39;&gt;Get filesystem nodes&lt;/a&gt; (optional)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @return NodeList
   * @throws ApiException if fails to make API call
   */
  public NodeList getRoomNodes(String xSdsAuthToken, Integer roomId, Integer depthLevel, String filter, String sort, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getRoomNodes");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoomNodes");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/children".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "depth_level", depthLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

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

    GenericType<NodeList> localVarReturnType = new GenericType<NodeList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user permissions
   * 
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param userId Granted user Id (required)
   * @return RoomPermissions
   * @throws ApiException if fails to make API call
   */
  public RoomPermissions getRoomUserPermissions(String xSdsAuthToken, Integer roomId, Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getRoomUserPermissions");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoomUserPermissions");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getRoomUserPermissions");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/users/{user_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()))
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

    GenericType<RoomPermissions> localVarReturnType = new GenericType<RoomPermissions>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get room granted users or/and users that can be granted
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;displayName&lt;/dt&gt;&lt;dd&gt;User display name (firstName, lastName, login)&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;is_granted&lt;/dt&gt;&lt;dd&gt;Filter the users that have access/no access to this room.&lt;br/&gt;&lt;b&gt;Attention! This filter is only available for data room administrators.&lt;br/&gt; Other users can only look for users in their rooms, so this filter is TRUE and cannot be overridden.&lt;/b&gt;&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false|any]. Default value is &lt;code&gt;true&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;permissions_manage&lt;/dt&gt;&lt;dd&gt;Filter the users that have/don&#39;t have manage right in this room&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false].&lt;/dd&gt;&lt;/dl&gt;Example: &lt;samp&gt;is_granted:eq:true|displayName:cn:searchstring|permissions_manage:eq:true&lt;/samp&gt;&lt;br/&gt;- get all users that have manage rights to this room of and whose name is like searchstring&lt;br/&gt;&lt;br/&gt;&lt;b&gt;The filters are connected by AND&lt;/b&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @param filter User filter (optional)
   * @return RoomUserList
   * @throws ApiException if fails to make API call
   */
  public RoomUserList getRoomUsers(String xSdsAuthToken, Integer roomId, Integer offset, Integer limit, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getRoomUsers");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling getRoomUsers");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    GenericType<RoomUserList> localVarReturnType = new GenericType<RoomUserList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user&#39;s file key
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Returns the FileKey for the current user (if available).&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User may access file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; The symmetric FileKey is encrypted with the user&#39;s PublicKey.&lt;br/&gt;FileKeys are generated with the Workflow \&quot;Generate FileKeys\&quot; that starts at &lt;b&gt;GET /nodes/missingFileKeys&lt;/b&gt;.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param fileId File Id (required)
   * @return FileKey
   * @throws ApiException if fails to make API call
   */
  public FileKey getUserFileKey(String xSdsAuthToken, Integer fileId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling getUserFileKey");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling getUserFileKey");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/{file_id}/user_file_key".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

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

    GenericType<FileKey> localVarReturnType = new GenericType<FileKey>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Grant group to the room
   * 
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param groupId Granted group Id (required)
   * @param body  (required)
   * @param propagate Propagate the granted permissions to the existing child rooms (optional)
   * @return RoomPermissions
   * @throws ApiException if fails to make API call
   */
  public RoomPermissions grantGroupToRoom(String xSdsAuthToken, Integer roomId, Integer groupId, RoomPermissions body, Boolean propagate) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling grantGroupToRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling grantGroupToRoom");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling grantGroupToRoom");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling grantGroupToRoom");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/groups/{group_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()))
      .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "propagate", propagate));

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

    GenericType<RoomPermissions> localVarReturnType = new GenericType<RoomPermissions>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set user permissions
   * 
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param userId Granted user Id (required)
   * @param body  (required)
   * @param propagate Propagate the granted permissions to the existing child rooms (optional)
   * @return RoomPermissions
   * @throws ApiException if fails to make API call
   */
  public RoomPermissions grantUserToRoom(String xSdsAuthToken, Integer roomId, Integer userId, RoomPermissions body, Boolean propagate) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling grantUserToRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling grantUserToRoom");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling grantUserToRoom");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling grantUserToRoom");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/users/{user_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()))
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "propagate", propagate));

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

    GenericType<RoomPermissions> localVarReturnType = new GenericType<RoomPermissions>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get files where the user has no filekey
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Requests a list of missing FileKeys that may be generated by the current user.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has a KeyPair.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Clients should regularly request missing FileKeys to provide access to files for other users. The returned list is ordered by priority (Rescue Keys are returned first).&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @param roomId Room Id (optional)
   * @param fileId File Id (optional)
   * @param userId User Id (optional)
   * @return MissingKeysResponse
   * @throws ApiException if fails to make API call
   */
  public MissingKeysResponse missingFileKeys(String xSdsAuthToken, Integer offset, Integer limit, Integer roomId, Integer fileId, Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling missingFileKeys");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/missingFileKeys".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "room_id", roomId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "file_id", fileId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

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

    GenericType<MissingKeysResponse> localVarReturnType = new GenericType<MissingKeysResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Move node to the folder
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Moves a node (file, folder) to another parent folder.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Authenticated user with write permissions in the parent node.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; A node is moved.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Rooms cannot be children of folders.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param folderId Folder ID. (required)
   * @param body Source file or folder reference (required)
   * @return Node
   * @throws ApiException if fails to make API call
   */
  public Node moveNodeToFolder(String xSdsAuthToken, Integer folderId, NodeId body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling moveNodeToFolder");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling moveNodeToFolder");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling moveNodeToFolder");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/folders/{folder_id}/children".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "folder_id" + "\\}", apiClient.escapeString(folderId.toString()));

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

    GenericType<Node> localVarReturnType = new GenericType<Node>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Move node to the room
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Moves a node (room, folder, file) to another parent room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Authenticated user with write permissions in the parent node.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; The node is moved.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Rooms are only supported at the two topmost levels.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param body  (required)
   * @return Node
   * @throws ApiException if fails to make API call
   */
  public Node moveNodeToRoom(String xSdsAuthToken, Integer roomId, NodeId body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling moveNodeToRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling moveNodeToRoom");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling moveNodeToRoom");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/children".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    GenericType<Node> localVarReturnType = new GenericType<Node>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Move file system nodes
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br /&gt;Moves nodes (folder,file) to another parent.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Authenticated user with read and delete permissions in the source parent and write permissions in the target parent node.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Nodes are moved to target parent.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Nodes must be in same source parent. Rooms cannot be moved.&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param nodeId Target Parent Node ID (required)
   * @param body  (required)
   * @return Node
   * @throws ApiException if fails to make API call
   */
  public Node moveNodes(String xSdsAuthToken, Long nodeId, NodesMoveRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling moveNodes");
    }
    
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling moveNodes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling moveNodes");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{node_id}/move_to".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId.toString()));

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

    GenericType<Node> localVarReturnType = new GenericType<Node>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Restore deleted nodes
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Restore a list of deleted nodes.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has write permissions in parent room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; The selected files are moved from the recycle bin to the chosen productive container.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; If no parent ID is provided, the node is restored to its previous location.&lt;br/&gt;The default resolution strategy is &lt;code&gt;autorename&lt;/code&gt; that adds numbers to the file name until the conflict is solved. If an existing file is overwritten, it is moved to the recycle bin instead of the restored one.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void restoreNodes(String xSdsAuthToken, RestoreDeletedNodesRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling restoreNodes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling restoreNodes");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/deleted_nodes/actions/restore".replaceAll("\\{format\\}","json");

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
   * Revoke group from room
   * 
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param groupId Granted group Id (required)
   * @throws ApiException if fails to make API call
   */
  public void revokeGroupFromRoom(String xSdsAuthToken, Integer roomId, Integer groupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling revokeGroupFromRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling revokeGroupFromRoom");
    }
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling revokeGroupFromRoom");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/groups/{group_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()))
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
   * Revoke user permissions
   * 
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param userId Granted user Id (required)
   * @throws ApiException if fails to make API call
   */
  public void revokeUserFromRoom(String xSdsAuthToken, Integer roomId, Integer userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling revokeUserFromRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling revokeUserFromRoom");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling revokeUserFromRoom");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/users/{user_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()))
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
   * Get Data Room Rescue KeyPair
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve the Data Room Rescue Key Pair.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has access to the Data Room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @return UserKeyPairContainer
   * @throws ApiException if fails to make API call
   */
  public UserKeyPairContainer roomRescueKey(String xSdsAuthToken, Integer roomId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling roomRescueKey");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling roomRescueKey");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/keypair".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    GenericType<UserKeyPairContainer> localVarReturnType = new GenericType<UserKeyPairContainer>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search file system nodes
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Provides a flat list of file system nodes (Rooms, Folders, Files) of a given parent that are accessible by the current user.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Authenticated user.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt;&lt;br/&gt; A maximum of 500 results is returned. For more results please use paging (offset + limit).&lt;br/&gt; EncryptionInfo is not provided.&lt;br/&gt; Wildcard character is the asterisk (*).&lt;/p&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;p&gt;Filter string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;OPERATOR&amp;gt;:&amp;lt;VALUE&amp;gt;[:&amp;lt;VALUE&amp;gt;...]&lt;/dfn&gt;&lt;/p&gt;&lt;h5&gt;Fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;type&lt;/dt&gt;&lt;dd&gt;Node type filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt;&lt;br/&gt;VALUE: &lt;code&gt;room|folder|file&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;file_type&lt;/dt&gt;&lt;dd&gt;File type filter (file extension)&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (name contains value, multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;classification&lt;/dt&gt;&lt;dd&gt;File classification  filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt;&lt;br/&gt;VALUE: &lt;code&gt;1|2|3|4&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;created_by&lt;/dt&gt;&lt;dd&gt;Creation username filter&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (name contains value, multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;created_at&lt;/dt&gt;&lt;dd&gt;Creation data filter&lt;br/&gt;OPERATOR: &lt;code&gt;ge|le&lt;/code&gt;&lt;br/&gt;VALUE: &lt;code&gt;Date (yyyy-HH-mm)&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;updated_by&lt;/dt&gt;&lt;dd&gt;Last change username filter&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (name contains value, multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;updated_at&lt;/dt&gt;&lt;dd&gt;Last change date filter&lt;br/&gt;OPERATOR: &lt;code&gt;ge|le&lt;/code&gt;&lt;br/&gt;VALUE: &lt;code&gt;Date (yyyy-HH-mm)&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;expire_at&lt;/dt&gt;&lt;dd&gt;Expire date filter&lt;br/&gt;OPERATOR: &lt;code&gt;ge|le&lt;/code&gt;&lt;br/&gt;VALUE: &lt;code&gt;Date (yyyy-HH-mm)&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;size&lt;/dt&gt;&lt;dd&gt;Size filter&lt;br/&gt;OPERATOR: &lt;code&gt;ge|le&lt;/code&gt;&lt;br/&gt;VALUE: &lt;code&gt;Size in bytes&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;is_favorite&lt;/dt&gt;&lt;dd&gt;Favorite filter&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt;&lt;br/&gt;VALUE: &lt;code&gt;true|false&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;type:eq:file|created_at:ge:2015-01-01&lt;/samp&gt;&lt;br/&gt;&amp;rarr; Get nodes where type equals file AND file was created at or after 2015-01-01&lt;/p&gt;&lt;h4&gt;Sort&lt;/h4&gt;&lt;p&gt;Sort string syntax: &lt;dfn&gt;&amp;lt;FIELD_NAME&amp;gt;:&amp;lt;ORDER&amp;gt;&lt;/dfn&gt;&lt;br/&gt;Order can be &lt;code&gt;asc&lt;/code&gt; or &lt;code&gt;desc&lt;/code&gt;.&lt;br/&gt;Multiple fields not supported.&lt;/p&gt;&lt;h5&gt;Sort fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Node name&lt;/dd&gt;&lt;dt&gt;createdBy&lt;/dt&gt;&lt;dd&gt;Creator user name&lt;/dd&gt;&lt;dt&gt;createdAt&lt;/dt&gt;&lt;dd&gt;Creation date&lt;/dd&gt;&lt;dt&gt;updatedBy&lt;/dt&gt;&lt;dd&gt;Modifier user name&lt;/dd&gt;&lt;dt&gt;updatedAt&lt;/dt&gt;&lt;dd&gt;Modification date&lt;/dd&gt;&lt;dt&gt;fileType&lt;/dt&gt;&lt;dd&gt;File type (extension)&lt;/dd&gt;&lt;dt&gt;classification&lt;/dt&gt;&lt;dd&gt;Classification&lt;/dd&gt;&lt;dt&gt;size&lt;/dt&gt;&lt;dd&gt;Node size&lt;/dd&gt;&lt;dt&gt;cntAdmins&lt;/dt&gt;&lt;dd&gt;For rooms only: Number of admins&lt;/dd&gt;&lt;dt&gt;cntUsers&lt;/dt&gt;&lt;dd&gt;For rooms only: Number of users&lt;/dd&gt;&lt;dt&gt;cntChildren&lt;/dt&gt;&lt;dd&gt;For rooms/subrooms/folder only: Number of direct children (not recursive)&lt;/dd&gt;&lt;/dl&gt;&lt;p&gt;Example: &lt;samp&gt;name:desc&lt;/samp&gt;&lt;br/&gt;&amp;rarr; sort by name descending&lt;/p&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param searchString Search string (required)
   * @param depthLevel &lt;ul&gt;&lt;li&gt;0 - top-level nodes only;&lt;/li&gt;&lt;li&gt;-1 - full tree;&lt;/li&gt;&lt;li&gt;any positive N - include N levels starting from the current node&lt;/li&gt;&lt;/ul&gt; (optional, default to 0)
   * @param parentId Parent node ID. Only rooms and folders can be parents. Parent ID 0 or empty is the root node. (optional)
   * @param filter Filter string (optional)
   * @param sort Sorting string (optional)
   * @param offset Range offset (optional)
   * @param limit Range limit (optional)
   * @return NodeList
   * @throws ApiException if fails to make API call
   */
  public NodeList searchFsNodes(String xSdsAuthToken, String searchString, Integer depthLevel, Long parentId, String filter, String sort, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling searchFsNodes");
    }
    
    // verify the required parameter 'searchString' is set
    if (searchString == null) {
      throw new ApiException(400, "Missing the required parameter 'searchString' when calling searchFsNodes");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search_string", searchString));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "depth_level", depthLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "parent_id", parentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

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

    GenericType<NodeList> localVarReturnType = new GenericType<NodeList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set room granted groups
   * Batch function. All existing groups will be revoked
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void setRoomGroupsBatch(String xSdsAuthToken, Long roomId, RoomGroupsAddBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling setRoomGroupsBatch");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling setRoomGroupsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setRoomGroupsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/groups".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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
   * Set room granted users
   * Batch function. All existing permissions will be revoked
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void setRoomUsersBatch(String xSdsAuthToken, Long roomId, RoomUsersAddBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling setRoomUsersBatch");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling setRoomUsersBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setRoomUsersBatch");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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
   * Set FileKeys for a list of users and files
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Sets symmetric FileKeys for several users and files.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has FileKeys for the files.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Stores new FileKeys for other users.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Only users with copies of the FileKey (encrypted with their public keys) can access a certain file. This endpoint is used for the distribution of FileKeys amongst an authorized user base.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void setUserFileKeys(String xSdsAuthToken, UserFileKeySetBatchRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling setUserFileKeys");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setUserFileKeys");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/keys".replaceAll("\\{format\\}","json");

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
   * Unmark a node (room or folder) as favorite
   * 
   * @param xSdsAuthToken Authentication token (required)
   * @param nodeId Node Id (required)
   * @throws ApiException if fails to make API call
   */
  public void unmarkFavorite(String xSdsAuthToken, Integer nodeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling unmarkFavorite");
    }
    
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling unmarkFavorite");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/{node_id}/favorite".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "node_id" + "\\}", apiClient.escapeString(nodeId.toString()));

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
   * Update file meta data
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Updates a file&#39;s meta data.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User may update file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Meta data changed.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; &lt;code&gt;ExpireAt&lt;/code&gt; is a mandatory field. If the file should not expire, send an empty String.&lt;/p&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Room/Folder/File name convention&lt;/h4&gt;&lt;h5&gt;Room/Folder/File names are limited to 150 characters.&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;Not allowed Room/Folder/File names&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;CON&#39;, &#39;PRN&#39;, &#39;AUX&#39;, &#39;NUL&#39;, &#39;COM1&#39;, &#39;COM2&#39;, &#39;COM3&#39;, &#39;COM4&#39;, &#39;COM5&#39;, &#39;COM6&#39;, &#39;COM7&#39;, &#39;COM8&#39;, &#39;COM9&#39;, &#39;LPT1&#39;, &#39;LPT2&#39;, &#39;LPT3&#39;, &#39;LPT4&#39;, &#39;LPT5&#39;, &#39;LPT6&#39;, &#39;LPT7&#39;, &#39;LPT8&#39;, &#39;LPT9&#39;,&#39;.&#39;,&#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Not allowed characters in Room/Folder/File name&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;../&#39;, &#39;\\&#39;, &#39;&amp;lt;&#39;,&#39;&amp;gt;&#39;, &#39;:&#39;, &#39;\&quot;&#39;, &#39;|&#39;, &#39;?&#39;, &#39;*&#39;, &#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param fileId File ID (required)
   * @param body  (required)
   * @return FileData
   * @throws ApiException if fails to make API call
   */
  public FileData updateFile(String xSdsAuthToken, Integer fileId, UpdateFileRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling updateFile");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
      throw new ApiException(400, "Missing the required parameter 'fileId' when calling updateFile");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateFile");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/{file_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "file_id" + "\\}", apiClient.escapeString(fileId.toString()));

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

    GenericType<FileData> localVarReturnType = new GenericType<FileData>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update folder
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Renames an existing folder.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has right to edit folders in the current Data Room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; The folder is renamed.&lt;/p&gt;&lt;p&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Room/Folder/File name convention&lt;/h4&gt;&lt;h5&gt;Room/Folder/File names are limited to 150 characters.&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;Not allowed Room/Folder/File names&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;CON&#39;, &#39;PRN&#39;, &#39;AUX&#39;, &#39;NUL&#39;, &#39;COM1&#39;, &#39;COM2&#39;, &#39;COM3&#39;, &#39;COM4&#39;, &#39;COM5&#39;, &#39;COM6&#39;, &#39;COM7&#39;, &#39;COM8&#39;, &#39;COM9&#39;, &#39;LPT1&#39;, &#39;LPT2&#39;, &#39;LPT3&#39;, &#39;LPT4&#39;, &#39;LPT5&#39;, &#39;LPT6&#39;, &#39;LPT7&#39;, &#39;LPT8&#39;, &#39;LPT9&#39;,&#39;.&#39;,&#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Not allowed characters in Room/Folder/File name&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;../&#39;, &#39;\\&#39;, &#39;&amp;lt;&#39;,&#39;&amp;gt;&#39;, &#39;:&#39;, &#39;\&quot;&#39;, &#39;|&#39;, &#39;?&#39;, &#39;*&#39;, &#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param folderId Folder Id (required)
   * @param body  (required)
   * @return FolderData
   * @throws ApiException if fails to make API call
   */
  public FolderData updateFolder(String xSdsAuthToken, Integer folderId, UpdateFolderRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling updateFolder");
    }
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling updateFolder");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateFolder");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/folders/{folder_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "folder_id" + "\\}", apiClient.escapeString(folderId.toString()));

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

    GenericType<FolderData> localVarReturnType = new GenericType<FolderData>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update room
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Update a room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User is admin in superordinated level.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Room&#39;s meta data is changed.&lt;/p&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Room/Folder/File name convention&lt;/h4&gt;&lt;h5&gt;Room/Folder/File names are limited to 150 characters.&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;Not allowed Room/Folder/File names&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;CON&#39;, &#39;PRN&#39;, &#39;AUX&#39;, &#39;NUL&#39;, &#39;COM1&#39;, &#39;COM2&#39;, &#39;COM3&#39;, &#39;COM4&#39;, &#39;COM5&#39;, &#39;COM6&#39;, &#39;COM7&#39;, &#39;COM8&#39;, &#39;COM9&#39;, &#39;LPT1&#39;, &#39;LPT2&#39;, &#39;LPT3&#39;, &#39;LPT4&#39;, &#39;LPT5&#39;, &#39;LPT6&#39;, &#39;LPT7&#39;, &#39;LPT8&#39;, &#39;LPT9&#39;,&#39;.&#39;,&#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Not allowed characters in Room/Folder/File name&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;../&#39;, &#39;\\&#39;, &#39;&amp;lt;&#39;,&#39;&amp;gt;&#39;, &#39;:&#39;, &#39;\&quot;&#39;, &#39;|&#39;, &#39;?&#39;, &#39;*&#39;, &#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param body  (required)
   * @return RoomData
   * @throws ApiException if fails to make API call
   */
  public RoomData updateRoom(String xSdsAuthToken, Integer roomId, UpdateRoomRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling updateRoom");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling updateRoom");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateRoom");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    GenericType<RoomData> localVarReturnType = new GenericType<RoomData>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update room
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Update a room.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; User has write access.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Room&#39;s meta data is changed.&lt;/p&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Room/Folder/File name convention&lt;/h4&gt;&lt;h5&gt;Room/Folder/File names are limited to 150 characters.&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;Not allowed Room/Folder/File names&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;CON&#39;, &#39;PRN&#39;, &#39;AUX&#39;, &#39;NUL&#39;, &#39;COM1&#39;, &#39;COM2&#39;, &#39;COM3&#39;, &#39;COM4&#39;, &#39;COM5&#39;, &#39;COM6&#39;, &#39;COM7&#39;, &#39;COM8&#39;, &#39;COM9&#39;, &#39;LPT1&#39;, &#39;LPT2&#39;, &#39;LPT3&#39;, &#39;LPT4&#39;, &#39;LPT5&#39;, &#39;LPT6&#39;, &#39;LPT7&#39;, &#39;LPT8&#39;, &#39;LPT9&#39;,&#39;.&#39;,&#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Not allowed characters in Room/Folder/File name&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;../&#39;, &#39;\\&#39;, &#39;&amp;lt;&#39;,&#39;&amp;gt;&#39;, &#39;:&#39;, &#39;\&quot;&#39;, &#39;|&#39;, &#39;?&#39;, &#39;*&#39;, &#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param roomId Room Id (required)
   * @param body  (required)
   * @return RoomData
   * @throws ApiException if fails to make API call
   */
  public RoomData updateRoom_0(String xSdsAuthToken, Integer roomId, ChangeRoomRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling updateRoom_0");
    }
    
    // verify the required parameter 'roomId' is set
    if (roomId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomId' when calling updateRoom_0");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateRoom_0");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/rooms/{room_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "room_id" + "\\}", apiClient.escapeString(roomId.toString()));

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

    GenericType<RoomData> localVarReturnType = new GenericType<RoomData>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Upload file
   * &lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Uploads a file or parts of it in an active Upload Channel.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; An Upload Channel has been created.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; A file or parts of it are uploaded to a temporary location.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; This endpoints supports chunked upload. Please cf. &lt;a href&#x3D;&#39;https://tools.ietf.org/html/rfc7233&#39; target&#x3D;&#39;_blank&#39;&gt;RFC 7233&lt;/a&gt; for further information.&lt;/p&gt;
   * @param xSdsAuthToken Authentication token (required)
   * @param uploadId Upload channel Id (required)
   * @param file  (required)
   * @param contentRange Content Range (format: \&quot;bytes 0-999/3980\&quot;) (optional)
   * @throws ApiException if fails to make API call
   */
  public void uploadFile(String xSdsAuthToken, String uploadId, File file, String contentRange) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xSdsAuthToken' is set
    if (xSdsAuthToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xSdsAuthToken' when calling uploadFile");
    }
    
    // verify the required parameter 'uploadId' is set
    if (uploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'uploadId' when calling uploadFile");
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling uploadFile");
    }
    
    // create path and map variables
    String localVarPath = "/nodes/files/uploads/{upload_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "upload_id" + "\\}", apiClient.escapeString(uploadId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xSdsAuthToken != null)
      localVarHeaderParams.put("X-Sds-Auth-Token", apiClient.parameterToString(xSdsAuthToken));
if (contentRange != null)
      localVarHeaderParams.put("Content-Range", apiClient.parameterToString(contentRange));

    if (file != null)
      localVarFormParams.put("file", file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
