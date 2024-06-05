/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package com.areg.microservices.access_control_service.controllers;

public class EndpointsConstants {

    public static final String ALL = "/**";
    public static final String API_ACCESS_CONTROL = "/api/access_control";
    public static final String GET_ALL = "/all";

    public static final String AUTH = API_ACCESS_CONTROL + "/auth";
    public static final String USER = API_ACCESS_CONTROL + "/user";
    public static final String USER_GROUP = API_ACCESS_CONTROL + "/user_group";
    public static final String ROLE = API_ACCESS_CONTROL + "/role";

    public static final String SIGNUP = "/signup";
    public static final String VERIFY_EMAIL = "/verify_email";
    public static final String LOGIN = "/login";
    public static final String LOGOUT = "/logout";
    public static final String REFRESH_TOKEN = "/refresh_token";

    public static final String AUTH_SIGNUP_VERIFY_EMAIL = AUTH + SIGNUP + VERIFY_EMAIL;
}
