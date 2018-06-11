package com.journaldev.retrofitintro;

import com.journaldev.retrofitintro.pojo.Customer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by bruno on 05/06/18.
 */
//PASSO 3
public interface CustomerResource {

    @GET("customer")
    Call<List<Customer>> listOfCustomer();

}
