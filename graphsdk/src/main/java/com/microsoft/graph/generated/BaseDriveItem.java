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
 * The class for the Base Drive Item.
 */
public class BaseDriveItem extends BaseItem implements IJsonBackedObject {


    /**
     * The Audio.
     * Audio metadata, if the item is an audio file. Read-only.
     */
    @SerializedName("audio")
    @Expose
    public Audio audio;

    /**
     * The CTag.
     * An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is not returned if the item is a folder. Read-only.
     */
    @SerializedName("cTag")
    @Expose
    public String cTag;

    /**
     * The Deleted.
     * Information about the deleted state of the item. Read-only.
     */
    @SerializedName("deleted")
    @Expose
    public Deleted deleted;

    /**
     * The File.
     * File metadata, if the item is a file. Read-only.
     */
    @SerializedName("file")
    @Expose
    public File file;

    /**
     * The File System Info.
     * File system information on client. Read-write.
     */
    @SerializedName("fileSystemInfo")
    @Expose
    public FileSystemInfo fileSystemInfo;

    /**
     * The Folder.
     * Folder metadata, if the item is a folder. Read-only.
     */
    @SerializedName("folder")
    @Expose
    public Folder folder;

    /**
     * The Image.
     * Image metadata, if the item is an image. Read-only.
     */
    @SerializedName("image")
    @Expose
    public Image image;

    /**
     * The Location.
     * Location metadata, if the item has location data. Read-only.
     */
    @SerializedName("location")
    @Expose
    public GeoCoordinates location;

    /**
     * The Package.
     * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     */
    @SerializedName("package")
    @Expose
    public com.microsoft.graph.extensions.Package msgraph_package;

    /**
     * The Photo.
     * Photo metadata, if the item is a photo. Read-only.
     */
    @SerializedName("photo")
    @Expose
    public Photo photo;

    /**
     * The Remote Item.
     * Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.
     */
    @SerializedName("remoteItem")
    @Expose
    public RemoteItem remoteItem;

    /**
     * The Root.
     * If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.
     */
    @SerializedName("root")
    @Expose
    public Root root;

    /**
     * The Search Result.
     * Search metadata, if the item is from a search result. Read-only.
     */
    @SerializedName("searchResult")
    @Expose
    public SearchResult searchResult;

    /**
     * The Shared.
     * Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     */
    @SerializedName("shared")
    @Expose
    public Shared shared;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName("sharepointIds")
    @Expose
    public SharepointIds sharepointIds;

    /**
     * The Size.
     * Size of the item in bytes. Read-only.
     */
    @SerializedName("size")
    @Expose
    public Long size;

    /**
     * The Special Folder.
     * If the current item is also available as a special folder, this facet is returned. Read-only.
     */
    @SerializedName("specialFolder")
    @Expose
    public SpecialFolder specialFolder;

    /**
     * The Video.
     * Video metadata, if the item is a video. Read-only.
     */
    @SerializedName("video")
    @Expose
    public Video video;

    /**
     * The Web Dav Url.
     * WebDAV compatible URL for the item.
     */
    @SerializedName("webDavUrl")
    @Expose
    public String webDavUrl;

    /**
     * The Children.
     * Collection containing Item objects for the immediate children of Item. Only items representing folders have children. Read-only. Nullable.
     */
    public transient DriveItemCollectionPage children;

    /**
     * The List Item.
     * 
     */
    @SerializedName("listItem")
    @Expose
    public ListItem listItem;

    /**
     * The Permissions.
     * The set of permissions for the item. Read-only. Nullable.
     */
    public transient PermissionCollectionPage permissions;

    /**
     * The Thumbnails.
     * Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][]. Read-only. Nullable.
     */
    public transient ThumbnailSetCollectionPage thumbnails;

    /**
     * The Workbook.
     * 
     */
    @SerializedName("workbook")
    @Expose
    public Workbook workbook;


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


        if (json.has("children")) {
            final BaseDriveItemCollectionResponse response = new BaseDriveItemCollectionResponse();
            if (json.has("children@odata.nextLink")) {
                response.nextLink = json.get("children@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("children").toString(), JsonObject[].class);
            final DriveItem[] array = new DriveItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DriveItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            children = new DriveItemCollectionPage(response, null);
        }

        if (json.has("permissions")) {
            final BasePermissionCollectionResponse response = new BasePermissionCollectionResponse();
            if (json.has("permissions@odata.nextLink")) {
                response.nextLink = json.get("permissions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("permissions").toString(), JsonObject[].class);
            final Permission[] array = new Permission[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Permission.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            permissions = new PermissionCollectionPage(response, null);
        }

        if (json.has("thumbnails")) {
            final BaseThumbnailSetCollectionResponse response = new BaseThumbnailSetCollectionResponse();
            if (json.has("thumbnails@odata.nextLink")) {
                response.nextLink = json.get("thumbnails@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("thumbnails").toString(), JsonObject[].class);
            final ThumbnailSet[] array = new ThumbnailSet[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ThumbnailSet.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            thumbnails = new ThumbnailSetCollectionPage(response, null);
        }
    }
}
