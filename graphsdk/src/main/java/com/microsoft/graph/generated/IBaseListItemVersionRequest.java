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
 * The interface for the Base List Item Version Request.
 */
public interface IBaseListItemVersionRequest extends IHttpRequest {

    /**
     * Gets the ListItemVersion from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<ListItemVersion> callback);

    /**
     * Gets the ListItemVersion from the service
     * @return The ListItemVersion from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ListItemVersion get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ListItemVersion with a source
     * @param sourceListItemVersion The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final ListItemVersion sourceListItemVersion, final ICallback<ListItemVersion> callback);

    /**
     * Patches this ListItemVersion with a source
     * @param sourceListItemVersion The source object with updates
     * @return The updated ListItemVersion
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ListItemVersion patch(final ListItemVersion sourceListItemVersion) throws ClientException;

    /**
     * Posts a ListItemVersion with a new object
     * @param newListItemVersion The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final ListItemVersion newListItemVersion, final ICallback<ListItemVersion> callback);

    /**
     * Posts a ListItemVersion with a new object
     * @param newListItemVersion The new object to create
     * @return The created ListItemVersion
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ListItemVersion post(final ListItemVersion newListItemVersion) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseListItemVersionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseListItemVersionRequest expand(final String value);

}

