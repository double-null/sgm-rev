package s9;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CueEncoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public byte[] a(List<w7.a> list, long j10) {
        ArrayList<Bundle> arrayListB = x7.g.b(list, new com.google.common.base.g() { // from class: s9.c
            @Override // com.google.common.base.g
            public final Object apply(Object obj) {
                return ((w7.a) obj).d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListB);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
