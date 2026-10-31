package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1686a = (IconCompat) versionedParcel.v(remoteActionCompat.f1686a, 1);
        remoteActionCompat.f1687b = versionedParcel.l(remoteActionCompat.f1687b, 2);
        remoteActionCompat.f1688c = versionedParcel.l(remoteActionCompat.f1688c, 3);
        remoteActionCompat.f1689d = (PendingIntent) versionedParcel.r(remoteActionCompat.f1689d, 4);
        remoteActionCompat.f1690e = versionedParcel.h(remoteActionCompat.f1690e, 5);
        remoteActionCompat.f1691f = versionedParcel.h(remoteActionCompat.f1691f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f1686a, 1);
        versionedParcel.D(remoteActionCompat.f1687b, 2);
        versionedParcel.D(remoteActionCompat.f1688c, 3);
        versionedParcel.H(remoteActionCompat.f1689d, 4);
        versionedParcel.z(remoteActionCompat.f1690e, 5);
        versionedParcel.z(remoteActionCompat.f1691f, 6);
    }
}
