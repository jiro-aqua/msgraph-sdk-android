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
 * The class for the Base Event.
 */
public class BaseEvent extends OutlookItem implements IJsonBackedObject {


    /**
     * The Original Start Time Zone.
     * The start time zone that was set when the event was created. A value of tzone://Microsoft/Custom indicates that a legacy custom time zone was set in desktop Outlook.
     */
    @SerializedName("originalStartTimeZone")
    @Expose
    public String originalStartTimeZone;

    /**
     * The Original End Time Zone.
     * The end time zone that was set when the event was created. A value of tzone://Microsoft/Customindicates that a legacy custom time zone was set in desktop Outlook.
     */
    @SerializedName("originalEndTimeZone")
    @Expose
    public String originalEndTimeZone;

    /**
     * The Response Status.
     * Indicates the type of response sent in response to an event message.
     */
    @SerializedName("responseStatus")
    @Expose
    public ResponseStatus responseStatus;

    /**
     * The ICal UId.
     * A unique identifier that is shared by all instances of an event across different calendars.
     */
    @SerializedName("iCalUId")
    @Expose
    public String iCalUId;

    /**
     * The Reminder Minutes Before Start.
     * The number of minutes before the event start time that the reminder alert occurs.
     */
    @SerializedName("reminderMinutesBeforeStart")
    @Expose
    public Integer reminderMinutesBeforeStart;

    /**
     * The Is Reminder On.
     * Set to true if an alert is set to remind the user of the event.
     */
    @SerializedName("isReminderOn")
    @Expose
    public Boolean isReminderOn;

    /**
     * The Has Attachments.
     * Set to true if the event has attachments.
     */
    @SerializedName("hasAttachments")
    @Expose
    public Boolean hasAttachments;

    /**
     * The Subject.
     * The text of the event's subject line.
     */
    @SerializedName("subject")
    @Expose
    public String subject;

    /**
     * The Body.
     * The body of the message associated with the event. It can be in HTML or text format.
     */
    @SerializedName("body")
    @Expose
    public ItemBody body;

    /**
     * The Body Preview.
     * The preview of the message associated with the event. It is in text format.
     */
    @SerializedName("bodyPreview")
    @Expose
    public String bodyPreview;

    /**
     * The Importance.
     * The importance of the event. Possible values are: Low, Normal, High.
     */
    @SerializedName("importance")
    @Expose
    public Importance importance;

    /**
     * The Sensitivity.
     * Possible values are: Normal, Personal, Private, Confidential.
     */
    @SerializedName("sensitivity")
    @Expose
    public Sensitivity sensitivity;

    /**
     * The Start.
     * The date, time, and time zone that the event starts.
     */
    @SerializedName("start")
    @Expose
    public DateTimeTimeZone start;

    /**
     * The Original Start.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("originalStart")
    @Expose
    public java.util.Calendar originalStart;

    /**
     * The End.
     * The date, time, and time zone that the event ends.
     */
    @SerializedName("end")
    @Expose
    public DateTimeTimeZone end;

    /**
     * The Location.
     * The location of the event.
     */
    @SerializedName("location")
    @Expose
    public Location location;

    /**
     * The Is All Day.
     * Set to true if the event lasts all day.
     */
    @SerializedName("isAllDay")
    @Expose
    public Boolean isAllDay;

    /**
     * The Is Cancelled.
     * Set to true if the event has been canceled.
     */
    @SerializedName("isCancelled")
    @Expose
    public Boolean isCancelled;

    /**
     * The Is Organizer.
     * Set to true if the message sender is also the organizer.
     */
    @SerializedName("isOrganizer")
    @Expose
    public Boolean isOrganizer;

    /**
     * The Recurrence.
     * The recurrence pattern for the event.
     */
    @SerializedName("recurrence")
    @Expose
    public PatternedRecurrence recurrence;

    /**
     * The Response Requested.
     * Set to true if the sender would like a response when the event is accepted or declined.
     */
    @SerializedName("responseRequested")
    @Expose
    public Boolean responseRequested;

    /**
     * The Series Master Id.
     * The categories assigned to the item.
     */
    @SerializedName("seriesMasterId")
    @Expose
    public String seriesMasterId;

    /**
     * The Show As.
     * The status to show. Possible values are: Free, Tentative, Busy, Oof, WorkingElsewhere, Unknown.
     */
    @SerializedName("showAs")
    @Expose
    public FreeBusyStatus showAs;

    /**
     * The Type.
     * The event type. Possible values are: SingleInstance, Occurrence, Exception, SeriesMaster. Read-only.
     */
    @SerializedName("type")
    @Expose
    public EventType type;

    /**
     * The Attendees.
     * The collection of attendees for the event.
     */
    @SerializedName("attendees")
    @Expose
    public java.util.List<Attendee> attendees;

    /**
     * The Organizer.
     * The organizer of the event.
     */
    @SerializedName("organizer")
    @Expose
    public Recipient organizer;

    /**
     * The Web Link.
     * The URL to open the event in Outlook Web App.The event will open in the browser if you are logged in to your mailbox via Outlook Web App. You will be prompted to login if you are not already logged in with the browser.This URL can be accessed from within an iFrame.
     */
    @SerializedName("webLink")
    @Expose
    public String webLink;

    /**
     * The Online Meeting Url.
     * A URL for an online meeting.
     */
    @SerializedName("onlineMeetingUrl")
    @Expose
    public String onlineMeetingUrl;

    /**
     * The Calendar.
     * The calendar that contains the event. Navigation property. Read-only.
     */
    @SerializedName("calendar")
    @Expose
    public Calendar calendar;

    /**
     * The Instances.
     * The instances of the event. Navigation property. Read-only. Nullable.
     */
    public transient EventCollectionPage instances;

    /**
     * The Extensions.
     * The collection of open extensions defined for the event. Read-only. Nullable.
     */
    public transient ExtensionCollectionPage extensions;

    /**
     * The Attachments.
     * The collection of fileAttachment and itemAttachment attachments for the event. Navigation property. Read-only. Nullable.
     */
    public transient AttachmentCollectionPage attachments;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the event. Read-only. Nullable.
     */
    public transient SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the event. Read-only. Nullable.
     */
    public transient MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;


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


        if (json.has("instances")) {
            final BaseEventCollectionResponse response = new BaseEventCollectionResponse();
            if (json.has("instances@odata.nextLink")) {
                response.nextLink = json.get("instances@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("instances").toString(), JsonObject[].class);
            final Event[] array = new Event[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Event.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            instances = new EventCollectionPage(response, null);
        }

        if (json.has("extensions")) {
            final BaseExtensionCollectionResponse response = new BaseExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }

        if (json.has("attachments")) {
            final BaseAttachmentCollectionResponse response = new BaseAttachmentCollectionResponse();
            if (json.has("attachments@odata.nextLink")) {
                response.nextLink = json.get("attachments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("attachments").toString(), JsonObject[].class);
            final Attachment[] array = new Attachment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Attachment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            attachments = new AttachmentCollectionPage(response, null);
        }

        if (json.has("singleValueExtendedProperties")) {
            final BaseSingleValueLegacyExtendedPropertyCollectionResponse response = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("singleValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("singleValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), JsonObject[].class);
            final SingleValueLegacyExtendedProperty[] array = new SingleValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SingleValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            singleValueExtendedProperties = new SingleValueLegacyExtendedPropertyCollectionPage(response, null);
        }

        if (json.has("multiValueExtendedProperties")) {
            final BaseMultiValueLegacyExtendedPropertyCollectionResponse response = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("multiValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("multiValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), JsonObject[].class);
            final MultiValueLegacyExtendedProperty[] array = new MultiValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MultiValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            multiValueExtendedProperties = new MultiValueLegacyExtendedPropertyCollectionPage(response, null);
        }
    }
}
