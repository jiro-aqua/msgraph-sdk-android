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
 * The class for the Base Education School With Reference Request.
 */
public class BaseEducationSchoolWithReferenceRequest extends BaseRequest implements IBaseEducationSchoolWithReferenceRequest {

    /**
     * The request for the EducationSchool
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseEducationSchoolWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSchool.class);
    }

    public void post(final EducationSchool newEducationSchool, final IJsonBackedObject payload, final ICallback<EducationSchool> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public EducationSchool post(final EducationSchool newEducationSchool, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newEducationSchool;
        }
        return null;
    }

    public void get(final ICallback<EducationSchool> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public EducationSchool get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IEducationSchoolWithReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (IEducationSchoolWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IEducationSchoolWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (EducationSchoolWithReferenceRequest)this;
    }
}
