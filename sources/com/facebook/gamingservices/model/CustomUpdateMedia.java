package com.facebook.gamingservices.model;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: CustomUpdateContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CustomUpdateMedia {
    private final CustomUpdateMediaInfo gif;
    private final CustomUpdateMediaInfo video;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomUpdateMedia() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CustomUpdateMedia copy$default(CustomUpdateMedia customUpdateMedia, CustomUpdateMediaInfo customUpdateMediaInfo, CustomUpdateMediaInfo customUpdateMediaInfo2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            customUpdateMediaInfo = customUpdateMedia.gif;
        }
        if ((i10 & 2) != 0) {
            customUpdateMediaInfo2 = customUpdateMedia.video;
        }
        return customUpdateMedia.copy(customUpdateMediaInfo, customUpdateMediaInfo2);
    }

    public final CustomUpdateMediaInfo component1() {
        return this.gif;
    }

    public final CustomUpdateMediaInfo component2() {
        return this.video;
    }

    public final CustomUpdateMedia copy(CustomUpdateMediaInfo customUpdateMediaInfo, CustomUpdateMediaInfo customUpdateMediaInfo2) {
        return new CustomUpdateMedia(customUpdateMediaInfo, customUpdateMediaInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomUpdateMedia)) {
            return false;
        }
        CustomUpdateMedia customUpdateMedia = (CustomUpdateMedia) obj;
        return t.a(this.gif, customUpdateMedia.gif) && t.a(this.video, customUpdateMedia.video);
    }

    public final CustomUpdateMediaInfo getGif() {
        return this.gif;
    }

    public final CustomUpdateMediaInfo getVideo() {
        return this.video;
    }

    public int hashCode() {
        CustomUpdateMediaInfo customUpdateMediaInfo = this.gif;
        int iHashCode = (customUpdateMediaInfo == null ? 0 : customUpdateMediaInfo.hashCode()) * 31;
        CustomUpdateMediaInfo customUpdateMediaInfo2 = this.video;
        return iHashCode + (customUpdateMediaInfo2 != null ? customUpdateMediaInfo2.hashCode() : 0);
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        CustomUpdateMediaInfo customUpdateMediaInfo = this.gif;
        if (customUpdateMediaInfo != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", customUpdateMediaInfo.getUrl());
            jSONObject.put("gif", jSONObject2);
        }
        CustomUpdateMediaInfo customUpdateMediaInfo2 = this.video;
        if (customUpdateMediaInfo2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", customUpdateMediaInfo2.getUrl());
            jSONObject.put("video", jSONObject3);
        }
        return jSONObject;
    }

    public String toString() {
        return "CustomUpdateMedia(gif=" + this.gif + ", video=" + this.video + ')';
    }

    public CustomUpdateMedia(CustomUpdateMediaInfo customUpdateMediaInfo, CustomUpdateMediaInfo customUpdateMediaInfo2) {
        this.gif = customUpdateMediaInfo;
        this.video = customUpdateMediaInfo2;
    }

    public /* synthetic */ CustomUpdateMedia(CustomUpdateMediaInfo customUpdateMediaInfo, CustomUpdateMediaInfo customUpdateMediaInfo2, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : customUpdateMediaInfo, (i10 & 2) != 0 ? null : customUpdateMediaInfo2);
    }
}
