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
 * The interface for the Base Education School Collection With References Request.
 */
public interface IBaseEducationSchoolCollectionWithReferencesRequest {

    void get(final ICallback<IEducationSchoolCollectionWithReferencesPage> callback);

    IEducationSchoolCollectionWithReferencesPage get() throws ClientException;

    IEducationSchoolCollectionWithReferencesRequest expand(final String value);
    
    IEducationSchoolCollectionWithReferencesRequest select(final String value);

    IEducationSchoolCollectionWithReferencesRequest top(final int value);

}
