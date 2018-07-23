package com.novoda.demo;

import com.novoda.noplayer.NoPlayer;

class TrackSwitcher {

    private static final int BEGINNING_POSITION_IN_MILLIS = 0;
    private static final int MAIN_CONTENT_TRACK_INDEX = 0;
    private static final int SECONDARY_CONTENT_TRACK_INDEX = 1;

    private NoPlayer noPlayer;
    private static long mainContentPositionInMillis = 0;
    private int currentTrackIndex = 0;

    TrackSwitcher(NoPlayer noPlayer) {
        this.noPlayer = noPlayer;
    }

    void switchTracks() {
        if (currentTrackIndex == MAIN_CONTENT_TRACK_INDEX) {
            currentTrackIndex = SECONDARY_CONTENT_TRACK_INDEX;
            mainContentPositionInMillis = noPlayer.playheadPositionInMillis();
            noPlayer.seekTo(SECONDARY_CONTENT_TRACK_INDEX, BEGINNING_POSITION_IN_MILLIS);
        } else {
            currentTrackIndex = MAIN_CONTENT_TRACK_INDEX;
            noPlayer.seekTo(MAIN_CONTENT_TRACK_INDEX, mainContentPositionInMillis);
        }
    }

}
