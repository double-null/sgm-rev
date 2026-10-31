package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SessionInfo.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SessionInfo {
    public static final Companion Companion = new Companion(null);
    private static final String INTERRUPTION_COUNT_KEY = "com.facebook.appevents.SessionInfo.interruptionCount";
    private static final String LAST_SESSION_INFO_END_KEY = "com.facebook.appevents.SessionInfo.sessionEndTime";
    private static final String LAST_SESSION_INFO_START_KEY = "com.facebook.appevents.SessionInfo.sessionStartTime";
    private static final String SESSION_ID_KEY = "com.facebook.appevents.SessionInfo.sessionId";
    private Long diskRestoreTime;
    private int interruptionCount;
    private UUID sessionId;
    private Long sessionLastEventTime;
    private final Long sessionStartTime;
    private SourceApplicationInfo sourceApplicationInfo;

    /* JADX INFO: compiled from: SessionInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final void clearSavedSessionFromDisk() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
            editorEdit.remove(SessionInfo.LAST_SESSION_INFO_START_KEY);
            editorEdit.remove(SessionInfo.LAST_SESSION_INFO_END_KEY);
            editorEdit.remove(SessionInfo.INTERRUPTION_COUNT_KEY);
            editorEdit.remove(SessionInfo.SESSION_ID_KEY);
            editorEdit.apply();
            SourceApplicationInfo.Companion.clearSavedSourceApplicationInfoFromDisk();
        }

        public final SessionInfo getStoredSessionInfo() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
            long j10 = defaultSharedPreferences.getLong(SessionInfo.LAST_SESSION_INFO_START_KEY, 0L);
            long j11 = defaultSharedPreferences.getLong(SessionInfo.LAST_SESSION_INFO_END_KEY, 0L);
            String string = defaultSharedPreferences.getString(SessionInfo.SESSION_ID_KEY, null);
            if (j10 == 0 || j11 == 0 || string == null) {
                return null;
            }
            SessionInfo sessionInfo = new SessionInfo(Long.valueOf(j10), Long.valueOf(j11), null, 4, null);
            sessionInfo.interruptionCount = defaultSharedPreferences.getInt(SessionInfo.INTERRUPTION_COUNT_KEY, 0);
            sessionInfo.setSourceApplicationInfo(SourceApplicationInfo.Companion.getStoredSourceApplicatioInfo());
            sessionInfo.setDiskRestoreTime(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            t.e(uuidFromString, "fromString(sessionIDStr)");
            sessionInfo.setSessionId(uuidFromString);
            return sessionInfo;
        }
    }

    public SessionInfo(Long l10, Long l11) {
        this(l10, l11, null, 4, null);
    }

    public static final void clearSavedSessionFromDisk() {
        Companion.clearSavedSessionFromDisk();
    }

    public static final SessionInfo getStoredSessionInfo() {
        return Companion.getStoredSessionInfo();
    }

    public final Long getDiskRestoreTime() {
        Long l10 = this.diskRestoreTime;
        if (l10 == null) {
            return 0L;
        }
        return l10;
    }

    public final int getInterruptionCount() {
        return this.interruptionCount;
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final Long getSessionLastEventTime() {
        return this.sessionLastEventTime;
    }

    public final long getSessionLength() {
        Long l10;
        if (this.sessionStartTime == null || (l10 = this.sessionLastEventTime) == null) {
            return 0L;
        }
        if (l10 != null) {
            return l10.longValue() - this.sessionStartTime.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final Long getSessionStartTime() {
        return this.sessionStartTime;
    }

    public final SourceApplicationInfo getSourceApplicationInfo() {
        return this.sourceApplicationInfo;
    }

    public final void incrementInterruptionCount() {
        this.interruptionCount++;
    }

    public final void setDiskRestoreTime(Long l10) {
        this.diskRestoreTime = l10;
    }

    public final void setSessionId(UUID uuid) {
        t.f(uuid, "<set-?>");
        this.sessionId = uuid;
    }

    public final void setSessionLastEventTime(Long l10) {
        this.sessionLastEventTime = l10;
    }

    public final void setSourceApplicationInfo(SourceApplicationInfo sourceApplicationInfo) {
        this.sourceApplicationInfo = sourceApplicationInfo;
    }

    public final void writeSessionToDisk() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
        Long l10 = this.sessionStartTime;
        editorEdit.putLong(LAST_SESSION_INFO_START_KEY, l10 != null ? l10.longValue() : 0L);
        Long l11 = this.sessionLastEventTime;
        editorEdit.putLong(LAST_SESSION_INFO_END_KEY, l11 != null ? l11.longValue() : 0L);
        editorEdit.putInt(INTERRUPTION_COUNT_KEY, this.interruptionCount);
        editorEdit.putString(SESSION_ID_KEY, this.sessionId.toString());
        editorEdit.apply();
        SourceApplicationInfo sourceApplicationInfo = this.sourceApplicationInfo;
        if (sourceApplicationInfo == null || sourceApplicationInfo == null) {
            return;
        }
        sourceApplicationInfo.writeSourceApplicationInfoToDisk();
    }

    public SessionInfo(Long l10, Long l11, UUID sessionId) {
        t.f(sessionId, "sessionId");
        this.sessionStartTime = l10;
        this.sessionLastEventTime = l11;
        this.sessionId = sessionId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SessionInfo(Long l10, Long l11, UUID uuid, int i10, k kVar) {
        if ((i10 & 4) != 0) {
            uuid = UUID.randomUUID();
            t.e(uuid, "randomUUID()");
        }
        this(l10, l11, uuid);
    }
}
