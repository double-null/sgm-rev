package gc;

import java.util.TimeZone;

/* JADX INFO: compiled from: SystemTimeManagerInstance.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements b {
    @Override // gc.b
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // gc.b
    public String getTimeZoneId() {
        return TimeZone.getDefault().getID();
    }
}
