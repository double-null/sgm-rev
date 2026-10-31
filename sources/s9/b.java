package s9;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: compiled from: CueDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public e a(long j10, byte[] bArr, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i10, i11);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new e(x7.g.a(new com.google.common.base.g() { // from class: s9.a
            @Override // com.google.common.base.g
            public final Object apply(Object obj) {
                return w7.a.b((Bundle) obj);
            }
        }, (ArrayList) x7.a.e(bundle.getParcelableArrayList("c"))), j10, bundle.getLong("d"));
    }
}
