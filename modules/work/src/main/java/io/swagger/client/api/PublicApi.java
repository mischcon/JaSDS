package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.UserFileKeyList;
import io.swagger.client.model.PublicUploadedFileData;
import io.swagger.client.model.PublicDownloadTokenGenerateRequest;
import io.swagger.client.model.PublicDownloadTokenGenerateResponse;
import io.swagger.client.model.CreateShareUploadChannelRequest;
import io.swagger.client.model.CreateShareUploadChannelResponse;
import io.swagger.client.model.BrandingServerInfo;
import io.swagger.client.model.PublicDownloadShare;
import io.swagger.client.model.PublicUploadShare;
import io.swagger.client.model.SoftwareVersionData;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class PublicApi {
  private ApiClient apiClient;

  public PublicApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PublicApi(ApiClient apiClient) {
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
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Abort (chunked) upload via Upload Share.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid UploadID.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Aborts upload and invalidates UploadId/Token.&lt;/p&gt;&lt;/div&gt;
   * @param accessKey Access key (required)
   * @param uploadId Upload Id (required)
   * @throws ApiException if fails to make API call
   */
  public void cancelShareUpload(String accessKey, String uploadId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling cancelShareUpload");
    }
    
    // verify the required parameter 'uploadId' is set
    if (uploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'uploadId' when calling cancelShareUpload");
    }
    
    // create path and map variables
    String localVarPath = "/public/shares/uploads/{access_key}/{upload_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "access_key" + "\\}", apiClient.escapeString(accessKey.toString()))
      .replaceAll("\\{" + "upload_id" + "\\}", apiClient.escapeString(uploadId.toString()));

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
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Finalize (chunked) upload via Upload Share.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid UploadID.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Finalizes upload.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Chunked uploads (range requests) are supported (please cf. &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc7233\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RCF 7233&lt;/a&gt; for details).&lt;/p&gt;&lt;/div&gt;
   * @param accessKey Access key (required)
   * @param uploadId Upload Id (required)
   * @param userFileKeyList Mandatory for encrypted shares (optional)
   * @return PublicUploadedFileData
   * @throws ApiException if fails to make API call
   */
  public PublicUploadedFileData completeShareUpload(String accessKey, String uploadId, UserFileKeyList userFileKeyList) throws ApiException {
    Object localVarPostBody = userFileKeyList;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling completeShareUpload");
    }
    
    // verify the required parameter 'uploadId' is set
    if (uploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'uploadId' when calling completeShareUpload");
    }
    
    // create path and map variables
    String localVarPath = "/public/shares/uploads/{access_key}/{upload_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "access_key" + "\\}", apiClient.escapeString(accessKey.toString()))
      .replaceAll("\\{" + "upload_id" + "\\}", apiClient.escapeString(uploadId.toString()));

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

    GenericType<PublicUploadedFileData> localVarReturnType = new GenericType<PublicUploadedFileData>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Generate download token
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Generate a download token to retrieve a shared file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Download token is generated and returned.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; After generating the download token a download is possible with &lt;code&gt;GET /public/shares/downloads/{access_key}/{token}&lt;/code&gt;.&lt;/p&gt;&lt;/div&gt;
   * @param accessKey Access key (required)
   * @param body  (required)
   * @return PublicDownloadTokenGenerateResponse
   * @throws ApiException if fails to make API call
   */
  public PublicDownloadTokenGenerateResponse createPublicDownloadShareToken(String accessKey, PublicDownloadTokenGenerateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling createPublicDownloadShareToken");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createPublicDownloadShareToken");
    }
    
    // create path and map variables
    String localVarPath = "/public/shares/downloads/{access_key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "access_key" + "\\}", apiClient.escapeString(accessKey.toString()));

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

    GenericType<PublicDownloadTokenGenerateResponse> localVarReturnType = new GenericType<PublicDownloadTokenGenerateResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create new file upload channel
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Create a new upload channel.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Upload channel is created and corresponding token/uploadId returned.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; The token from the response can be used at:&lt;ul&gt;&lt;li&gt;POST /uploads/{token}&lt;/li&gt;&lt;li&gt;PUT /uploads/{token}&lt;/li&gt;&lt;li&gt;DELETE /uploads/{token}&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Room/Folder/File name convention&lt;/h4&gt;&lt;h5&gt;Room/Folder/File names are limited to 150 characters.&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;Not allowed Room/Folder/File names&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;CON&#39;, &#39;PRN&#39;, &#39;AUX&#39;, &#39;NUL&#39;, &#39;COM1&#39;, &#39;COM2&#39;, &#39;COM3&#39;, &#39;COM4&#39;, &#39;COM5&#39;, &#39;COM6&#39;, &#39;COM7&#39;, &#39;COM8&#39;, &#39;COM9&#39;, &#39;LPT1&#39;, &#39;LPT2&#39;, &#39;LPT3&#39;, &#39;LPT4&#39;, &#39;LPT5&#39;, &#39;LPT6&#39;, &#39;LPT7&#39;, &#39;LPT8&#39;, &#39;LPT9&#39;,&#39;.&#39;,&#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;Not allowed characters in Room/Folder/File name&lt;/dt&gt;&lt;dd&gt;&lt;br/&gt;&lt;code&gt;&#39;../&#39;, &#39;\\&#39;, &#39;&amp;lt;&#39;,&#39;&amp;gt;&#39;, &#39;:&#39;, &#39;\&quot;&#39;, &#39;|&#39;, &#39;?&#39;, &#39;*&#39;, &#39;/&#39;&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;&lt;/div&gt;
   * @param accessKey Access key (required)
   * @param body  (required)
   * @return CreateShareUploadChannelResponse
   * @throws ApiException if fails to make API call
   */
  public CreateShareUploadChannelResponse createShareUpload(String accessKey, CreateShareUploadChannelRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling createShareUpload");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createShareUpload");
    }
    
    // create path and map variables
    String localVarPath = "/public/shares/uploads/{access_key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "access_key" + "\\}", apiClient.escapeString(accessKey.toString()));

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

    GenericType<CreateShareUploadChannelResponse> localVarReturnType = new GenericType<CreateShareUploadChannelResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get branding info
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Public branding information.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; If &lt;b&gt;brandingServerBrandingId&lt;/b&gt; is set, &lt;b&gt;brandingServerCustomer&lt;/b&gt; is not supplied.&lt;/p&gt;&lt;/div&gt;
   * @return BrandingServerInfo
   * @throws ApiException if fails to make API call
   */
  public BrandingServerInfo getBrandingServerInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/public/branding/info".replaceAll("\\{format\\}","json");

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

    GenericType<BrandingServerInfo> localVarReturnType = new GenericType<BrandingServerInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get public download share info
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve the public information of a Download Share.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
   * @param accessKey Access key (required)
   * @return PublicDownloadShare
   * @throws ApiException if fails to make API call
   */
  public PublicDownloadShare getPublicDownloadShare(String accessKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getPublicDownloadShare");
    }
    
    // create path and map variables
    String localVarPath = "/public/shares/downloads/{access_key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "access_key" + "\\}", apiClient.escapeString(accessKey.toString()));

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

    GenericType<PublicDownloadShare> localVarReturnType = new GenericType<PublicDownloadShare>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Download file
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Download a file.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid download token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Range requests are supported (please cf. &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc7233\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RCF 7233&lt;/a&gt; for details).&lt;/p&gt;&lt;/div&gt;
   * @param accessKey Access key (required)
   * @param token Download token (required)
   * @param range Range (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getPublicFileData(String accessKey, String token, String range) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getPublicFileData");
    }
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling getPublicFileData");
    }
    
    // create path and map variables
    String localVarPath = "/public/shares/downloads/{access_key}/{token}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "access_key" + "\\}", apiClient.escapeString(accessKey.toString()))
      .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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
   * Get download file headers
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Retrieve the header of a file transmission. Please cf. &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc7233\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RCF 7233&lt;/a&gt; for details.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid download token.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
   * @param accessKey Access key (required)
   * @param token Download token (required)
   * @throws ApiException if fails to make API call
   */
  public void getPublicFileDataHead(String accessKey, String token) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getPublicFileDataHead");
    }
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling getPublicFileDataHead");
    }
    
    // create path and map variables
    String localVarPath = "/public/shares/downloads/{access_key}/{token}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "access_key" + "\\}", apiClient.escapeString(accessKey.toString()))
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


    apiClient.invokeAPI(localVarPath, "HEAD", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get public upload share
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br/&gt;Provides information about the desired Upload Share.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; If no password is set, the returned information is reduced to the following attributes (if available):&lt;ul&gt;&lt;li&gt;name&lt;/li&gt;&lt;li&gt;maxSlots&lt;/li&gt;&lt;li&gt;createdAt&lt;/li&gt;&lt;li&gt;isProtected&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;Only if the Password is transmitted as &lt;b&gt;X-Sds-Share-Password&lt;/b&gt; header, all values are returned.&lt;/p&gt;&lt;/div&gt;
   * @param accessKey Access key (required)
   * @param xSdsSharePassword Upload share password (optional)
   * @return PublicUploadShare
   * @throws ApiException if fails to make API call
   */
  public PublicUploadShare getPublicUploadShare(String accessKey, String xSdsSharePassword) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getPublicUploadShare");
    }
    
    // create path and map variables
    String localVarPath = "/public/shares/uploads/{access_key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "access_key" + "\\}", apiClient.escapeString(accessKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xSdsSharePassword != null)
      localVarHeaderParams.put("X-Sds-Share-Password", apiClient.parameterToString(xSdsSharePassword));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PublicUploadShare> localVarReturnType = new GenericType<PublicUploadShare>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get software version info
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Public software version information.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; The version of SDS Server consists of two components: API and Core (refered to as \&quot;server\&quot;) that are versioned individually.&lt;/p&gt;&lt;/div&gt;
   * @return SoftwareVersionData
   * @throws ApiException if fails to make API call
   */
  public SoftwareVersionData getSoftwareVersion() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/public/software/version".replaceAll("\\{format\\}","json");

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

    GenericType<SoftwareVersionData> localVarReturnType = new GenericType<SoftwareVersionData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Upload file
   * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br/&gt;Chunked upload of files via Upload Share.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Valid UploadID.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; Chunk of file is uploaded.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; Chunked uploads (range requests) are supported (please cf. &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc7233\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RCF 7233&lt;/a&gt; for details).&lt;/p&gt;&lt;/div&gt;
   * @param accessKey Access key (required)
   * @param uploadId Upload Id (required)
   * @param file  (required)
   * @param contentRange Content Range (format: \&quot;bytes 0-999/3980\&quot;) (optional)
   * @throws ApiException if fails to make API call
   */
  public void uploadShare(String accessKey, String uploadId, File file, String contentRange) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling uploadShare");
    }
    
    // verify the required parameter 'uploadId' is set
    if (uploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'uploadId' when calling uploadShare");
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling uploadShare");
    }
    
    // create path and map variables
    String localVarPath = "/public/shares/uploads/{access_key}/{upload_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "access_key" + "\\}", apiClient.escapeString(accessKey.toString()))
      .replaceAll("\\{" + "upload_id" + "\\}", apiClient.escapeString(uploadId.toString()));

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
