package com.marianhello.bgloc.provider;

import com.marianhello.bgloc.PluginError;
import com.marianhello.bgloc.data.BackgroundActivity;
import com.marianhello.bgloc.data.BackgroundLocation;

public interface ProviderDelegate {
    void onLocation(BackgroundLocation location);
    void onStationary(BackgroundLocation location);
    void onActivity(BackgroundActivity activity);
    void onError(PluginError error);
}
