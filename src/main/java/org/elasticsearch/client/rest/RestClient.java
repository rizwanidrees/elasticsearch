package org.elasticsearch.client.rest;

import org.elasticsearch.action.*;
import org.elasticsearch.client.AdminClient;
import org.elasticsearch.client.support.AbstractClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.threadpool.ThreadPool;

public class RestClient extends AbstractClient {

    public RestClient() {
    }

    @Override
    public Settings settings() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public AdminClient admin() {
        return null;
    }

    @Override
    public <Request extends ActionRequest, Response extends ActionResponse, RequestBuilder extends ActionRequestBuilder<Request, Response, RequestBuilder>> ActionFuture<Response> execute(Action<Request, Response, RequestBuilder> action, Request request) {
        return null;
    }

    @Override
    public <Request extends ActionRequest, Response extends ActionResponse, RequestBuilder extends ActionRequestBuilder<Request, Response, RequestBuilder>> void execute(Action<Request, Response, RequestBuilder> action, Request request, ActionListener<Response> listener) {

    }

    @Override
    public ThreadPool threadPool() {
        return null;
    }
}
