package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            int i10 = this.zab;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 35);
            sb2.append("Cannot advance the iterator beyond ");
            sb2.append(i10);
            throw new NoSuchElementException(sb2.toString());
        }
        int i11 = this.zab + 1;
        this.zab = i11;
        if (i11 == 0) {
            Object objCheckNotNull = Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = objCheckNotNull;
            if (!(objCheckNotNull instanceof DataBufferRef)) {
                String strValueOf = String.valueOf(objCheckNotNull.getClass());
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 44);
                sb3.append("DataBuffer reference of type ");
                sb3.append(strValueOf);
                sb3.append(" is not movable");
                throw new IllegalStateException(sb3.toString());
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
