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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Table Item At Request.
 */
public interface IBaseWorkbookTableItemAtRequest {

    /**
     * Patches the WorkbookTableItemAt
     *
     * @param srcWorkbookTable The WorkbookTable with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    void patch(WorkbookTable srcWorkbookTable, final ICallback<WorkbookTable> callback);

    /**
     * Patches the WorkbookTableItemAt
     *
     * @param srcWorkbookTable The WorkbookTable with which to PATCH
     * @return The WorkbookTable
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
    WorkbookTable patch(WorkbookTable srcWorkbookTable) throws ClientException;

    /**
     * Puts the WorkbookTableItemAt
     *
     * @param srcWorkbookTable The WorkbookTable to PUT
     * @param callback The callback to be called after success or failure
     */
    void put(WorkbookTable srcWorkbookTable, final ICallback<WorkbookTable> callback);

    /**
     * Puts the WorkbookTableItemAt
     *
     * @param srcWorkbookTable The WorkbookTable to PUT
     * @return The WorkbookTable
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     WorkbookTable put(WorkbookTable srcWorkbookTable) throws ClientException;
    /**
     * Gets the WorkbookTable
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookTable> callback);

    /**
     * Gets the WorkbookTable
     *
     * @return The WorkbookTable
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    WorkbookTable get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IWorkbookTableItemAtRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IWorkbookTableItemAtRequest expand(final String value);

}
