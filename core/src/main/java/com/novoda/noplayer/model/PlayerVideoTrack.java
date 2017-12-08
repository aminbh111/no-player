package com.novoda.noplayer.model;

import com.novoda.noplayer.ContentType;

public class PlayerVideoTrack {

    private final String id;
    private final int groupIndex;
    private final int formatIndex;
    private final ContentType contentType;
    private final PlayerVideoTrackFormat format;

    PlayerVideoTrack(String id, int groupIndex, int formatIndex, ContentType contentType, PlayerVideoTrackFormat format) {
        this.id = id;
        this.groupIndex = groupIndex;
        this.formatIndex = formatIndex;
        this.contentType = contentType;
        this.format = format;
    }

    public int groupIndex() {
        return groupIndex;
    }

    public int formatIndex() {
        return formatIndex;
    }

    public String id() {
        return id;
    }

    public ContentType contentType() {
        return contentType;
    }

    public int width() {
        return format.width();
    }

    public int height() {
        return format.height();
    }

    public int fps() {
        return format.fps();
    }

    public int bitrate() {
        return format.bitrate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PlayerVideoTrack that = (PlayerVideoTrack) o;

        if (groupIndex != that.groupIndex) {
            return false;
        }
        if (formatIndex != that.formatIndex) {
            return false;
        }
        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }
        if (contentType != that.contentType) {
            return false;
        }
        return format != null ? format.equals(that.format) : that.format == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + groupIndex;
        result = 31 * result + formatIndex;
        result = 31 * result + (contentType != null ? contentType.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PlayerVideoTrack{" +
                "id='" + id + '\'' +
                ", groupIndex=" + groupIndex +
                ", formatIndex=" + formatIndex +
                ", contentType=" + contentType +
                ", format=" + format +
                '}';
    }

    public static class Builder {
        private String id;
        private int groupIndex;
        private int formatIndex;
        private ContentType contentType;
        private PlayerVideoTrackFormat format;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder groupIndex(int groupIndex) {
            this.groupIndex = groupIndex;
            return this;
        }

        public Builder formatIndex(int formatIndex) {
            this.formatIndex = formatIndex;
            return this;
        }

        public Builder contentType(ContentType contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder format(PlayerVideoTrackFormat format) {
            this.format = format;
            return this;
        }

        public PlayerVideoTrack build() {
            return new PlayerVideoTrack(id, groupIndex, formatIndex, contentType, format);
        }

    }
}
