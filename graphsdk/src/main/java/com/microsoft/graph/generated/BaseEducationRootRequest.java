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
 * The class for the Base Education Root Request.
 */
public class BaseEducationRootRequest extends BaseRequest implements IBaseEducationRootRequest {

    /**
     * The request for the EducationRoot
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseEducationRootRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the EducationRoot from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<EducationRoot> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationRoot from the service
     * @return The EducationRoot from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public EducationRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this EducationRoot with a source
     * @param sourceEducationRoot The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final EducationRoot sourceEducationRoot, final ICallback<EducationRoot> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationRoot);
    }

    /**
     * Patches this EducationRoot with a source
     * @param sourceEducationRoot The source object with updates
     * @return The updated EducationRoot
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public EducationRoot patch(final EducationRoot sourceEducationRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationRoot);
    }

    /**
     * Creates a EducationRoot with a new object
     * @param newEducationRoot The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final EducationRoot newEducationRoot, final ICallback<EducationRoot> callback) {
        send(HttpMethod.POST, callback, newEducationRoot);
    }

    /**
     * Creates a EducationRoot with a new object
     * @param newEducationRoot The new object to create
     * @return The created EducationRoot
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public EducationRoot post(final EducationRoot newEducationRoot) throws ClientException {
        return send(HttpMethod.POST, newEducationRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IEducationRootRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (EducationRootRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IEducationRootRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (EducationRootRequest)this;
     }

}

