package com.novoda.noplayer.model;

public class PlayerVideoTrackFormatFixture {

    private int width = 1920;
    private int height = 1080;
    private int fps = 30;
    private int bitrate = 180000;

    public static PlayerVideoTrackFormatFixture aPlayerVideoTrackFormat() {
        return new PlayerVideoTrackFormatFixture();
    }

    private PlayerVideoTrackFormatFixture() {
        // Uses static factory method.
    }

    public PlayerVideoTrackFormatFixture withWidth(int width) {
        this.width = width;
        return this;
    }

    public PlayerVideoTrackFormatFixture withHeight(int height) {
        this.height = height;
        return this;
    }

    public PlayerVideoTrackFormatFixture withFps(int fps) {
        this.fps = fps;
        return this;
    }

    public PlayerVideoTrackFormatFixture withBitrate(int bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    public PlayerVideoTrackFormat build() {
        return new PlayerVideoTrackFormat(width, height, fps, bitrate);
    }
}
