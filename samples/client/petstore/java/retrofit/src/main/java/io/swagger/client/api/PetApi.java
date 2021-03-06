package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit.Callback;
import retrofit.http.*;
import retrofit.mime.*;

import io.swagger.client.model.Pet;
import io.swagger.client.model.InlineResponse200;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PetApi {
  /**
   * Add a new pet to the store
   * Sync method
   * 
   * @param body Pet object that needs to be added to the store (optional)
   * @return Void
   */
  
  @POST("/pet")
  Void addPet(
    @Body Pet body
  );

  /**
   * Add a new pet to the store
   * Async method
   * @param body Pet object that needs to be added to the store (optional)
   * @param cb callback method
   * @return void
   */
  
  @POST("/pet")
  void addPet(
    @Body Pet body, Callback<Void> cb
  );
  /**
   * Fake endpoint to test byte array in body parameter for adding a new pet to the store
   * Sync method
   * 
   * @param body Pet object in the form of byte array (optional)
   * @return Void
   */
  
  @POST("/pet?testing_byte_array&#x3D;true")
  Void addPetUsingByteArray(
    @Body byte[] body
  );

  /**
   * Fake endpoint to test byte array in body parameter for adding a new pet to the store
   * Async method
   * @param body Pet object in the form of byte array (optional)
   * @param cb callback method
   * @return void
   */
  
  @POST("/pet?testing_byte_array&#x3D;true")
  void addPetUsingByteArray(
    @Body byte[] body, Callback<Void> cb
  );
  /**
   * Deletes a pet
   * Sync method
   * 
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @return Void
   */
  
  @DELETE("/pet/{petId}")
  Void deletePet(
    @Path("petId") Long petId, @Header("api_key") String apiKey
  );

  /**
   * Deletes a pet
   * Async method
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @param cb callback method
   * @return void
   */
  
  @DELETE("/pet/{petId}")
  void deletePet(
    @Path("petId") Long petId, @Header("api_key") String apiKey, Callback<Void> cb
  );
  /**
   * Finds Pets by status
   * Sync method
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for query (optional, default to available)
   * @return List<Pet>
   */
  
  @GET("/pet/findByStatus")
  List<Pet> findPetsByStatus(
    @Query("status") List<String> status
  );

  /**
   * Finds Pets by status
   * Async method
   * @param status Status values that need to be considered for query (optional, default to available)
   * @param cb callback method
   * @return void
   */
  
  @GET("/pet/findByStatus")
  void findPetsByStatus(
    @Query("status") List<String> status, Callback<List<Pet>> cb
  );
  /**
   * Finds Pets by tags
   * Sync method
   * Muliple tags can be provided with comma seperated strings. Use tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (optional)
   * @return List<Pet>
   */
  
  @GET("/pet/findByTags")
  List<Pet> findPetsByTags(
    @Query("tags") List<String> tags
  );

  /**
   * Finds Pets by tags
   * Async method
   * @param tags Tags to filter by (optional)
   * @param cb callback method
   * @return void
   */
  
  @GET("/pet/findByTags")
  void findPetsByTags(
    @Query("tags") List<String> tags, Callback<List<Pet>> cb
  );
  /**
   * Find pet by ID
   * Sync method
   * Returns a pet when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions
   * @param petId ID of pet that needs to be fetched (required)
   * @return Pet
   */
  
  @GET("/pet/{petId}")
  Pet getPetById(
    @Path("petId") Long petId
  );

  /**
   * Find pet by ID
   * Async method
   * @param petId ID of pet that needs to be fetched (required)
   * @param cb callback method
   * @return void
   */
  
  @GET("/pet/{petId}")
  void getPetById(
    @Path("petId") Long petId, Callback<Pet> cb
  );
  /**
   * Fake endpoint to test inline arbitrary object return by &#39;Find pet by ID&#39;
   * Sync method
   * Returns a pet when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions
   * @param petId ID of pet that needs to be fetched (required)
   * @return InlineResponse200
   */
  
  @GET("/pet/{petId}?response&#x3D;inline_arbitrary_object")
  InlineResponse200 getPetByIdInObject(
    @Path("petId") Long petId
  );

  /**
   * Fake endpoint to test inline arbitrary object return by &#39;Find pet by ID&#39;
   * Async method
   * @param petId ID of pet that needs to be fetched (required)
   * @param cb callback method
   * @return void
   */
  
  @GET("/pet/{petId}?response&#x3D;inline_arbitrary_object")
  void getPetByIdInObject(
    @Path("petId") Long petId, Callback<InlineResponse200> cb
  );
  /**
   * Fake endpoint to test byte array return by &#39;Find pet by ID&#39;
   * Sync method
   * Returns a pet when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions
   * @param petId ID of pet that needs to be fetched (required)
   * @return byte[]
   */
  
  @GET("/pet/{petId}?testing_byte_array&#x3D;true")
  byte[] petPetIdtestingByteArraytrueGet(
    @Path("petId") Long petId
  );

  /**
   * Fake endpoint to test byte array return by &#39;Find pet by ID&#39;
   * Async method
   * @param petId ID of pet that needs to be fetched (required)
   * @param cb callback method
   * @return void
   */
  
  @GET("/pet/{petId}?testing_byte_array&#x3D;true")
  void petPetIdtestingByteArraytrueGet(
    @Path("petId") Long petId, Callback<byte[]> cb
  );
  /**
   * Update an existing pet
   * Sync method
   * 
   * @param body Pet object that needs to be added to the store (optional)
   * @return Void
   */
  
  @PUT("/pet")
  Void updatePet(
    @Body Pet body
  );

  /**
   * Update an existing pet
   * Async method
   * @param body Pet object that needs to be added to the store (optional)
   * @param cb callback method
   * @return void
   */
  
  @PUT("/pet")
  void updatePet(
    @Body Pet body, Callback<Void> cb
  );
  /**
   * Updates a pet in the store with form data
   * Sync method
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name Updated name of the pet (optional)
   * @param status Updated status of the pet (optional)
   * @return Void
   */
  
  @FormUrlEncoded
  @POST("/pet/{petId}")
  Void updatePetWithForm(
    @Path("petId") String petId, @Field("name") String name, @Field("status") String status
  );

  /**
   * Updates a pet in the store with form data
   * Async method
   * @param petId ID of pet that needs to be updated (required)
   * @param name Updated name of the pet (optional)
   * @param status Updated status of the pet (optional)
   * @param cb callback method
   * @return void
   */
  
  @FormUrlEncoded
  @POST("/pet/{petId}")
  void updatePetWithForm(
    @Path("petId") String petId, @Field("name") String name, @Field("status") String status, Callback<Void> cb
  );
  /**
   * uploads an image
   * Sync method
   * 
   * @param petId ID of pet to update (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @param file file to upload (optional)
   * @return Void
   */
  
  @Multipart
  @POST("/pet/{petId}/uploadImage")
  Void uploadFile(
    @Path("petId") Long petId, @Part("additionalMetadata") String additionalMetadata, @Part("file") TypedFile file
  );

  /**
   * uploads an image
   * Async method
   * @param petId ID of pet to update (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @param file file to upload (optional)
   * @param cb callback method
   * @return void
   */
  
  @Multipart
  @POST("/pet/{petId}/uploadImage")
  void uploadFile(
    @Path("petId") Long petId, @Part("additionalMetadata") String additionalMetadata, @Part("file") TypedFile file, Callback<Void> cb
  );
}
