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
 * The class for the Base Outlook User Supported Time Zones Collection Request Builder.
 */
public class BaseOutlookUserSupportedTimeZonesCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseOutlookUserSupportedTimeZonesCollectionRequestBuilder {

    /**
     * The request builder for this collection of OutlookUser
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseOutlookUserSupportedTimeZonesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this collection of OutlookUser
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseOutlookUserSupportedTimeZonesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final TimeZoneStandard timeZoneStandard) {
        super(requestUrl, client, requestOptions);
        mFunctionOptions.add(new FunctionOption("timeZoneStandard", timeZoneStandard));
      }

    public IOutlookUserSupportedTimeZonesCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IOutlookUserSupportedTimeZonesCollectionRequest buildRequest(final java.util.List<Option> requestOptions) {
        OutlookUserSupportedTimeZonesCollectionRequest request = new OutlookUserSupportedTimeZonesCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : mFunctionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}