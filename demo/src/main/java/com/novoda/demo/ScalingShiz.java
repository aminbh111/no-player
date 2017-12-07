package com.novoda.demo;

import android.view.View;

class ScalingShiz {

    private final View scaleInButton;
    private final View scaleOutButton;
    private final View playerView;

    private boolean scaled;

    ScalingShiz(View scaleInButton, View scaleOutButton, View playerView) {
        this.scaleInButton = scaleInButton;
        this.scaleOutButton = scaleOutButton;
        this.playerView = playerView;
    }

    void bindScaleButtonsToScaleActions() {
        playerView.setPivotX(0);
        playerView.setPivotY(0);

        scaleInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scaled) {
                    return;
                }
                scaleIn();
                scaled = true;
            }
        });

        scaleOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!scaled) {
                    return;
                }
                scaleOut();
                scaled = false;
            }
        });
    }

    private void scaleIn() {
        playerView.animate().scaleX(0.5f).scaleY(0.5f).start();
    }

    private void scaleOut() {
        playerView.animate().scaleX(1).scaleY(1).start();
    }
}
