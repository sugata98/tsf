package com.sugata.mycredibleinfo.remote;

import com.sugata.mycredibleinfo.LoginPOJO.LoginSignupData;
import com.sugata.mycredibleinfo.LoginPOJO.ServerTest;
import com.sugata.mycredibleinfo.LoginPOJO.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserService {

    @GET("test")
    Call<ServerTest> getServerStatus();

    @POST("user/login")
    Call<LoginSignupData> getUser(@Body User user);

    @POST("user/signup")
    Call<LoginSignupData> addUser(@Body User user);

    /*@GET("user/personaldetail/{id}")
    Call<PersonalDetailsData> getPersonalDetails(@Path("id") int id);

    @POST("user/personaldetail/{id}")
    Call<PersonalDetailsData> setPersonalDetails(@Path("id") int id, @Body PersonalDetails personalDetails);

    @PUT("user/personaldetail/{id}")
    Call<PersonalDetailsData> updatePersonalDetails(@Path("id") int id, @Body PersonalDetails personalDetails);

    @GET("user/personaldetail/profilepic/{id}")
    Call<byte[]> getProfilePic(@Path("id") int id);

    @POST("user/personaldetail/pp/post")
    Call<StatusMessage> setProfilePic(@Body Photo photo);

    @GET("user/educationdetail/{id}")
    Call<EducationDetailsData> getEducationalDetails(@Path("id") int id);

    @POST("user/educationdetail/{id}")
    Call<EducationDetailsData> setEducationalDetails(@Path("id") int id, @Body EducationDetails educationDetails);

    @PUT("user/educationdetail/{id}")
    Call<EducationDetailsData> updateEducationalDetails(@Path("id") int id, @Body EducationDetails educationDetails);

    @DELETE("user/educationdetail/{id}")
    Call<StatusMessage> deleteEducationalDetails(@Path("id") int id);

    @GET("user/professionaldetail/{id}")
    Call<ProfessionalDetailsData> getProfessionalDetails(@Path("id") int id);

    @POST("user/professionaldetail/{id}")
    Call<ProfessionalDetailsData> setProfessionalDetails(@Path("id") int id, @Body ProfessionalDetails professionalDetails);

    @PUT("user/professionaldetail/{id}")
    Call<ProfessionalDetailsData> updateProfessionalDetails(@Path("id") int id, @Body ProfessionalDetails professionalDetails);

    @DELETE("user/professionaldetail/{id}")
    Call<StatusMessage> deleteProfessionalDetails(@Path("id") int id);*/
}
