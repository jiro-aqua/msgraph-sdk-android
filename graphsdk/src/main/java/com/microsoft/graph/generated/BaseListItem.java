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
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base List Item.
 */
public class BaseListItem extends BaseItem implements IJsonBackedObject {


    /**
     * The Content Type.
     * The content type of this list item
     */
    @SerializedName("contentType")
    @Expose
    public ContentTypeInfo contentType;

    /**
     * The Sharepoint Ids.
     * 
     */
    @SerializedName("sharepointIds")
    @Expose
    public SharepointIds sharepointIds;

    /**
     * The Drive Item.
     * For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
     */
    @SerializedName("driveItem")
    @Expose
    public DriveItem driveItem;

    /**
     * The Fields.
     * 
     */
    @SerializedName("fields")
    @Expose
    public FieldValueSet fields;

    /**
     * The Versions.
     * 
     */
    public transient ListItemVersionCollectionPage versions;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;


        if (json.has("versions")) {
            final BaseListItemVersionCollectionResponse response = new BaseListItemVersionCollectionResponse();
            if (json.has("versions@odata.nextLink")) {
                response.nextLink = json.get("versions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("versions").toString(), JsonObject[].class);
            final ListItemVersion[] array = new ListItemVersion[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ListItemVersion.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            versions = new ListItemVersionCollectionPage(response, null);
        }
    }
}
