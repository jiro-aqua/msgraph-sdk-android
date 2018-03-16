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
 * The class for the Base Group Lifecycle Policy Request.
 */
public class BaseGroupLifecyclePolicyRequest extends BaseRequest implements IBaseGroupLifecyclePolicyRequest {

    /**
     * The request for the GroupLifecyclePolicy
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseGroupLifecyclePolicyRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the GroupLifecyclePolicy from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<GroupLifecyclePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupLifecyclePolicy from the service
     * @return The GroupLifecyclePolicy from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public GroupLifecyclePolicy get() throws ClientException {
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
     * Patches this GroupLifecyclePolicy with a source
     * @param sourceGroupLifecyclePolicy The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final GroupLifecyclePolicy sourceGroupLifecyclePolicy, final ICallback<GroupLifecyclePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupLifecyclePolicy);
    }

    /**
     * Patches this GroupLifecyclePolicy with a source
     * @param sourceGroupLifecyclePolicy The source object with updates
     * @return The updated GroupLifecyclePolicy
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public GroupLifecyclePolicy patch(final GroupLifecyclePolicy sourceGroupLifecyclePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupLifecyclePolicy);
    }

    /**
     * Creates a GroupLifecyclePolicy with a new object
     * @param newGroupLifecyclePolicy The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final GroupLifecyclePolicy newGroupLifecyclePolicy, final ICallback<GroupLifecyclePolicy> callback) {
        send(HttpMethod.POST, callback, newGroupLifecyclePolicy);
    }

    /**
     * Creates a GroupLifecyclePolicy with a new object
     * @param newGroupLifecyclePolicy The new object to create
     * @return The created GroupLifecyclePolicy
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public GroupLifecyclePolicy post(final GroupLifecyclePolicy newGroupLifecyclePolicy) throws ClientException {
        return send(HttpMethod.POST, newGroupLifecyclePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IGroupLifecyclePolicyRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (GroupLifecyclePolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IGroupLifecyclePolicyRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (GroupLifecyclePolicyRequest)this;
     }

}

