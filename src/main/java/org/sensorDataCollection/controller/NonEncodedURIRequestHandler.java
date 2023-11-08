package org.sensorDataCollection.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static com.google.common.base.Charsets.UTF_8;

public class NonEncodedURIRequestHandler implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        System.out.println("I was here");

        return parameter.hasParameterAnnotation(EnableResolvingArgument.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
//        String parameterName = parameter.getParameterAnnotation(NonEncodedURIParam.class).name();
//        String parameterValue = Arrays.toString(webRequest.getParameterMap().get(parameterName));
//        System.out.println(parameterValue);
//        parameterValue = URLDecoder.decode(parameterValue, StandardCharsets.UTF_8);
//        parameterValue = URLEncoder.encode(parameterValue, StandardCharsets.UTF_8);
//        return parameterValue;
        System.out.println("I came for resolve arguments");
        HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
        assert request != null;
        String uriComponent = request.getRequestURI();
        return URLDecoder.decode(uriComponent, StandardCharsets.UTF_8);
    }

}


