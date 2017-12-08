package com.novoda.noplayer.model;

import com.novoda.noplayer.ContentType;

import static com.novoda.noplayer.model.PlayerVideoTrackFormatFixture.aPlayerVideoTrackFormat;

public class PlayerVideoTrackFixture {

    private String id = "id";
    private int groupIndex = 0;
    private int formatIndex = 0;
    private ContentType contentType = ContentType.DASH;
    private PlayerVideoTrackFormat format = aPlayerVideoTrackFormat().build();

    public static PlayerVideoTrackFixture aPlayerVideoTrack() {
        return new PlayerVideoTrackFixture();
    }

    private PlayerVideoTrackFixture() {
        // Uses static factory method.
    }

    public PlayerVideoTrackFixture withGroupIndex(int groupIndex) {
        this.groupIndex = groupIndex;
        return this;
    }

    public PlayerVideoTrackFixture withFormatIndex(int formatIndex) {
        this.formatIndex = formatIndex;
        return this;
    }

    public PlayerVideoTrackFixture withId(String id) {
        this.id = id;
        return this;
    }

    public PlayerVideoTrackFixture withContentType(ContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    public PlayerVideoTrackFixture withPlayerVideoTrackFormat(PlayerVideoTrackFormat format) {
        this.format = format;
        return this;
    }

    public PlayerVideoTrack build() {
        return new PlayerVideoTrack(id, groupIndex, formatIndex, contentType, format);
    }
}
