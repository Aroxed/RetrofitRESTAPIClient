package ua.kpi.spscs.retrofitrestapiclient.network;

import ua.kpi.spscs.retrofitrestapiclient.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
