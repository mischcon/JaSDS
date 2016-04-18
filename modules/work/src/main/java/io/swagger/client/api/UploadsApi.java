package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.CompleteUploadRequest;
import io.swagger.client.model.FileData;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UploadsApi {
  private ApiClient apiClient;

  public UploadsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UploadsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Cancel file upload
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Cancel file upload.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid upload token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Upload canceled, token invalidated and all already transfered chunks removed.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; It is recommended to notify the API about cancelled uploads if possible.&lt;/p&gt;&lt;/div&gt;
   * @param token Upload token (required)
   * @throws ApiException if fails to make API call
   */
  public void cancelFileUploadByToken(String token) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling cancelFileUploadByToken");
    }
    
    // create path and map variables
    String localVarPath = "/uploads/{token}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
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
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Finish uploading a file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid upload token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; File created.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; The provided file name might be changed in accordance with the resolution strategy:&lt;ul&gt;&lt;li&gt;&#39;autorename&#39; changes the file name and adds a number to avoid conflicts.&lt;/li&gt;&lt;li&gt;&#39;overwrite&#39; deletes any old file with the same file name.&lt;/li&gt;&lt;li&gt;&#39;fail&#39; returns an error. In this case, another PUT request with a different file name may be sent.&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;
   * @param token Upload token (required)
   * @param body The body must be empty if public upload token is used. The resolutionStrategy in that case will be always &#39;autorename&#39; (optional)
   * @return FileData
   * @throws ApiException if fails to make API call
   */
  public FileData completeFileUploadByToken(String token, CompleteUploadRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling completeFileUploadByToken");
    }
    
    // create path and map variables
    String localVarPath = "/uploads/{token}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
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
   * Upload file by token
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Upload a chunk of a file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid upload token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Chunk uploaded.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Use this API if you cannot set custom headers during uploads. Range requests are supported (please cf. &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc7233\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RCF 7233&lt;/a&gt; for details).&lt;/p&gt;&lt;/div&gt;
   * @param token Upload token (required)
   * @param file  (required)
   * @param contentRange Content Range (format: \&quot;bytes 0-999/3980\&quot;) (optional)
   * @throws ApiException if fails to make API call
   */
  public void uploadFileByToken(String token, File file, String contentRange) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling uploadFileByToken");
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling uploadFileByToken");
    }
    
    // create path and map variables
    String localVarPath = "/uploads/{token}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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
