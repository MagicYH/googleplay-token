package com.github.yeriomin.playstoreapi;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class HttpClientAdapter {

    abstract public byte[] get(String url, Map<String, String> params, Map<String, String> headers) throws IOException;
    abstract public byte[] postWithoutBody(String url, Map<String, String> urlParams, Map<String, String> headers) throws IOException;
    abstract public byte[] post(String url, Map<String, String> params, Map<String, String> headers) throws IOException;
    abstract public byte[] post(String url, byte[] body, Map<String, String> headers) throws IOException;
    abstract public String buildUrl(String url, Map<String, String> params);

    public byte[] get(String url, Map<String, String> params) throws IOException {
        return get(url, params, new HashMap<String, String>());
    }

    public byte[] get(String url) throws IOException {
        return get(url, new HashMap<String, String>());
    }
}
