package com.chiranjev.patterns.builder;

public class Test {
    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient.HttpClientBuilder()
                .method("POST")
                .url("https://www.test.com")
                .secure("username","password")
                .body("{}")
                .build();
        System.out.println(httpClient);
    }
}
