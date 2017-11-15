package br.com.smartrent.services;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

@Service
public class GoogleMapsService {


	private GeoApiContext context;


	@PostConstruct
	public void init() {
		context = new GeoApiContext.Builder().apiKey("AIzaSyDRHuTIw-J9LQldN6aBMBVBLS__gRNNmXQ").build();
	}

	
	public LatLng getLatLng(String endereco) throws ApiException, InterruptedException, IOException {
		
		GeocodingResult[] results =  GeocodingApi.geocode(context, endereco).await();

		return results != null ? results[0].geometry.location : new LatLng();			
	}
	
	



}
