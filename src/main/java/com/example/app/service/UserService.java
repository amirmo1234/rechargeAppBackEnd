package com.example.app.service;

import com.example.app.model.UserAddMoney;
import com.example.app.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

@Service
public class UserService {


    private final RestTemplate restTemplate;

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String addMoney(UserModel userModel) {
        String url =  String.format("http://localhost:8095/users/%s/addMoney",userModel.getUserName());


        userModel.setUserAddMoney(new UserAddMoney(userModel.getAmount()));
        ResponseEntity<String> response = restTemplate.postForEntity(url,userModel,String.class);
        return "Response: " + response.getBody();


















/*        String baseUrl = String.format("http://%s:%s", "localhost", "8095");
        URI uri = new URI(baseUrl);

        // JSON data to send
        String json = String.format("{\n" +
                "    \"UserAddMoney\": {\n" +
                "        \"Amount\": %s\n" +
                "    }\n" +
                "}", userModel.getAmount());

        // تنظیم هدر
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        // تنظیم محتوای درخواست
        HttpEntity<String> entity = new HttpEntity<>(json, headers);
*//*        restTemplate.headForHeaders(baseUrl,json);*//*
        // ارسال درخواست PUT
        ResponseEntity<String> response = restTemplate.exchange(
                uri.resolve(String.format("/users/%s/addMoney", userModel.getUserName())),
                HttpMethod.POST,
                entity,
                String.class);


        return "Response: " + response.getBody();*/
    }
}
