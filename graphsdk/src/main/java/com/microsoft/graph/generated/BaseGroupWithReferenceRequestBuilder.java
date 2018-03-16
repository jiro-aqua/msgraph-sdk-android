// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Group With Reference Request Builder.
 */
public class BaseGroupWithReferenceRequestBuilder extends BaseRequestBuilder implements IBaseGroupWithReferenceRequestBuilder {

    /**
     * The request builder for the Group
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseGroupWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IGroupWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
     */
    public IGroupWithReferenceRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new GroupWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IGroupReferenceRequestBuilder reference(){
        return new GroupReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
