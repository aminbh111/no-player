package com.novoda.noplayer.model;

public class PlayerVideoTrackFormat {

    private final int width;
    private final int height;
    private final int fps;
    private final int bitrate;

    PlayerVideoTrackFormat(int width, int height, int fps, int bitrate) {
        this.width = width;
        this.height = height;
        this.fps = fps;
        this.bitrate = bitrate;
    }

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }

    public int fps() {
        return fps;
    }

    public int bitrate() {
        return bitrate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PlayerVideoTrackFormat that = (PlayerVideoTrackFormat) o;

        if (width != that.width) {
            return false;
        }
        if (height != that.height) {
            return false;
        }
        if (fps != that.fps) {
            return false;
        }
        return bitrate == that.bitrate;
    }

    @Override
    public int hashCode() {
        int result = width;
        result = 31 * result + height;
        result = 31 * result + fps;
        result = 31 * result + bitrate;
        return result;
    }

    @Override
    public String toString() {
        return "PlayerVideoTrackFormat{" +
                "width=" + width +
                ", height=" + height +
                ", fps=" + fps +
                ", bitrate=" + bitrate +
                '}';
    }

    public static class Builder {
        private int width;
        private int height;
        private int fps;
        private int bitrate;

        public Builder width(int width) {
            this.width = width;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder fps(int fps) {
            this.fps = fps;
            return this;
        }

        public Builder bitrate(int bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        public PlayerVideoTrackFormat build() {
            return new PlayerVideoTrackFormat(width, height, fps, bitrate);
        }
    }
}
