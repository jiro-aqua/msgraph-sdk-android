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
 * The interface for the Base Workbook Chart Item At Request.
 */
public interface IBaseWorkbookChartItemAtRequest {

    /**
     * Patches the WorkbookChartItemAt
     *
     * @param srcWorkbookChart The WorkbookChart with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    void patch(WorkbookChart srcWorkbookChart, final ICallback<WorkbookChart> callback);

    /**
     * Patches the WorkbookChartItemAt
     *
     * @param srcWorkbookChart The WorkbookChart with which to PATCH
     * @return The WorkbookChart
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
    WorkbookChart patch(WorkbookChart srcWorkbookChart) throws ClientException;

    /**
     * Puts the WorkbookChartItemAt
     *
     * @param srcWorkbookChart The WorkbookChart to PUT
     * @param callback The callback to be called after success or failure
     */
    void put(WorkbookChart srcWorkbookChart, final ICallback<WorkbookChart> callback);

    /**
     * Puts the WorkbookChartItemAt
     *
     * @param srcWorkbookChart The WorkbookChart to PUT
     * @return The WorkbookChart
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     WorkbookChart put(WorkbookChart srcWorkbookChart) throws ClientException;
    /**
     * Gets the WorkbookChart
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookChart> callback);

    /**
     * Gets the WorkbookChart
     *
     * @return The WorkbookChart
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    WorkbookChart get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IWorkbookChartItemAtRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IWorkbookChartItemAtRequest expand(final String value);

}
