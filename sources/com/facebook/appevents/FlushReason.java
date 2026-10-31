package com.facebook.appevents;

/* JADX INFO: compiled from: FlushReason.kt */
/* JADX INFO: loaded from: classes.dex */
public enum FlushReason {
    EXPLICIT,
    TIMER,
    SESSION_CHANGE,
    PERSISTED_EVENTS,
    EVENT_THRESHOLD,
    EAGER_FLUSHING_EVENT
}
