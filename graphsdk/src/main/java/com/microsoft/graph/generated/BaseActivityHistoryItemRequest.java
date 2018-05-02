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
 * The class for the Base Activity History Item Request.
 */
public class BaseActivityHistoryItemRequest extends BaseRequest implements IBaseActivityHistoryItemRequest {

    /**
     * The request for the ActivityHistoryItem
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseActivityHistoryItemRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ActivityHistoryItem from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<ActivityHistoryItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ActivityHistoryItem from the service
     * @return The ActivityHistoryItem from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ActivityHistoryItem get() throws ClientException {
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
     * Patches this ActivityHistoryItem with a source
     * @param sourceActivityHistoryItem The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final ActivityHistoryItem sourceActivityHistoryItem, final ICallback<ActivityHistoryItem> callback) {
        send(HttpMethod.PATCH, callback, sourceActivityHistoryItem);
    }

    /**
     * Patches this ActivityHistoryItem with a source
     * @param sourceActivityHistoryItem The source object with updates
     * @return The updated ActivityHistoryItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ActivityHistoryItem patch(final ActivityHistoryItem sourceActivityHistoryItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceActivityHistoryItem);
    }

    /**
     * Creates a ActivityHistoryItem with a new object
     * @param newActivityHistoryItem The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final ActivityHistoryItem newActivityHistoryItem, final ICallback<ActivityHistoryItem> callback) {
        send(HttpMethod.POST, callback, newActivityHistoryItem);
    }

    /**
     * Creates a ActivityHistoryItem with a new object
     * @param newActivityHistoryItem The new object to create
     * @return The created ActivityHistoryItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ActivityHistoryItem post(final ActivityHistoryItem newActivityHistoryItem) throws ClientException {
        return send(HttpMethod.POST, newActivityHistoryItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IActivityHistoryItemRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ActivityHistoryItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IActivityHistoryItemRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ActivityHistoryItemRequest)this;
     }

}

