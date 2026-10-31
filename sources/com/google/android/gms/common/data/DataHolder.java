package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zad();
    private static final Builder zak = new zab(new String[0], null);
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    int zae;
    private final String[] zaf;
    private final CursorWindow[] zag;
    private final int zah;
    private final Bundle zai;
    private boolean zaj;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        /* synthetic */ Builder(String[] strArr, String str, byte[] bArr) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int i10) {
            return new DataHolder(this, i10, (Bundle) null, (byte[]) (0 == true ? 1 : 0));
        }

        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap map = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        public Builder zaa(HashMap map) {
            Asserts.checkNotNull(map);
            this.zab.add(map);
            return this;
        }

        final /* synthetic */ String[] zab() {
            return this.zaa;
        }

        final /* synthetic */ ArrayList zac() {
            return this.zab;
        }

        public DataHolder build(int i10, Bundle bundle) {
            return new DataHolder(this, i10, bundle, -1, (byte[]) null);
        }
    }

    /* synthetic */ DataHolder(Builder builder, int i10, Bundle bundle, byte[] bArr) {
        this(builder, i10, (Bundle) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    public static DataHolder empty(int i10) {
        return new DataHolder(zak, i10, (Bundle) null);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01d6 A[LOOP:2: B:71:0x01d4->B:72:0x01d6, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.CursorWindow] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.database.CursorWindow] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    private static CursorWindow[] zae(Builder builder, int i10) {
        ?? r10;
        boolean z10;
        int size;
        ?? r11;
        ArrayList arrayList;
        String str;
        String str2;
        int i11;
        boolean z11;
        String str3;
        String str4;
        boolean zPutDouble;
        CursorWindow cursorWindow;
        String str5 = ")";
        String str6 = "Allocating additional cursor window for large data set (row ";
        boolean z12 = false;
        if (builder.zab().length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayListZac = builder.zac();
        int size2 = arrayListZac.size();
        CursorWindow cursorWindow2 = new CursorWindow(false);
        ?? arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow2);
        cursorWindow2.setNumColumns(builder.zab().length);
        int i12 = 0;
        boolean z13 = false;
        while (i12 < size2) {
            try {
                r10 = cursorWindow2;
                boolean zAllocRow = r10.allocRow();
                ?? r12 = r10;
                if (!zAllocRow) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 61);
                    sb2.append(str6);
                    sb2.append(i12);
                    sb2.append(str5);
                    Log.d("DataHolder", sb2.toString());
                    cursorWindow = new CursorWindow(z12);
                    cursorWindow.setStartPosition(i12);
                    cursorWindow.setNumColumns(builder.zab().length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        r12 = cursorWindow;
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                r12 = cursorWindow;
                Map map = (Map) arrayListZac.get(i12);
                boolean zPutString = true;
                ?? r13 = z12;
                while (true) {
                    try {
                        if (r13 < builder.zab().length) {
                            if (zPutString) {
                                String str7 = builder.zab()[r13];
                                ArrayList arrayList3 = arrayListZac;
                                Object obj = map.get(str7);
                                if (obj == null) {
                                    zPutString = r12.putNull(i12, r13);
                                    str3 = str5;
                                } else {
                                    str3 = str5;
                                    if (obj instanceof String) {
                                        zPutString = r12.putString((String) obj, i12, r13);
                                    } else {
                                        if (obj instanceof Long) {
                                            str4 = str6;
                                            zPutDouble = r12.putLong(((Long) obj).longValue(), i12, r13);
                                        } else {
                                            str4 = str6;
                                            if (obj instanceof Integer) {
                                                zPutDouble = r12.putLong(((Integer) obj).intValue(), i12, r13);
                                            } else if (obj instanceof Boolean) {
                                                zPutDouble = r12.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i12, r13);
                                            } else if (obj instanceof byte[]) {
                                                zPutDouble = r12.putBlob((byte[]) obj, i12, r13);
                                            } else if (obj instanceof Double) {
                                                zPutDouble = r12.putDouble(((Double) obj).doubleValue(), i12, r13);
                                            } else {
                                                if (!(obj instanceof Float)) {
                                                    String string = obj.toString();
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str7).length() + 32 + string.length());
                                                    sb3.append("Unsupported object for column ");
                                                    sb3.append(str7);
                                                    sb3.append(": ");
                                                    sb3.append(string);
                                                    throw new IllegalArgumentException(sb3.toString());
                                                }
                                                zPutDouble = r12.putDouble(((Float) obj).floatValue(), i12, r13);
                                            }
                                        }
                                        zPutString = zPutDouble;
                                    }
                                    arrayListZac = arrayList3;
                                    str5 = str3;
                                    str6 = str4;
                                    r13++;
                                }
                                str4 = str6;
                                arrayListZac = arrayList3;
                                str5 = str3;
                                str6 = str4;
                                r13++;
                            } else {
                                arrayList = arrayListZac;
                                str = str5;
                                str2 = str6;
                            }
                            size = arrayList2.size();
                            for (r11 = z10; r11 < size; r11++) {
                                ((CursorWindow) arrayList2.get(r11)).close();
                            }
                            throw e;
                        }
                        arrayList = arrayListZac;
                        str = str5;
                        str2 = str6;
                        if (zPutString) {
                            i11 = 1;
                            z11 = false;
                            z13 = false;
                        }
                        i12 += i11;
                        z12 = z11;
                        arrayListZac = arrayList;
                        str5 = str;
                        str6 = str2;
                        r10 = r12;
                        if (z13) {
                            z10 = false;
                            throw new zac("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                        }
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i12).length() + 63);
                        sb4.append("Couldn't populate window data for row ");
                        sb4.append(i12);
                        sb4.append(" - allocating new window.");
                        Log.d("DataHolder", sb4.toString());
                        r12.freeLastRow();
                        z10 = false;
                        z11 = false;
                        try {
                            CursorWindow cursorWindow3 = new CursorWindow(false);
                            cursorWindow3.setStartPosition(i12);
                            cursorWindow3.setNumColumns(builder.zab().length);
                            arrayList2.add(cursorWindow3);
                            i12--;
                            r12 = cursorWindow3;
                            i11 = 1;
                            z13 = true;
                            i12 += i11;
                            z12 = z11;
                            arrayListZac = arrayList;
                            str5 = str;
                            str6 = str2;
                            r10 = r12;
                        } catch (RuntimeException e10) {
                            e = e10;
                        }
                        e = e10;
                    } catch (RuntimeException e11) {
                        e = e11;
                        z10 = false;
                    }
                    size = arrayList2.size();
                    while (r11 < size) {
                        ((CursorWindow) arrayList2.get(r11)).close();
                    }
                    throw e;
                }
            } catch (RuntimeException e12) {
                e = e12;
                z10 = z12;
            }
        }
        r10 = cursorWindow2;
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    private final void zaf(String str, int i10) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i10 < 0 || i10 >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i10, this.zad);
        }
    }

    public void acquireReference() {
        synchronized (this) {
            int i10 = this.zae;
            if (i10 <= 0) {
                throw new IllegalStateException("Attempt to acquire reference to an already-closed DataHolder");
            }
            this.zae = i10 + 1;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        releaseReference();
    }

    public DataHolder copy() {
        DataHolder dataHolder;
        synchronized (this) {
            if (isClosed()) {
                throw new IllegalStateException("Cannot copy a closed DataHolder");
            }
            CursorWindow[] cursorWindowArr = this.zag;
            CursorWindow[] cursorWindowArr2 = (CursorWindow[]) Arrays.copyOf(cursorWindowArr, cursorWindowArr.length);
            for (int i10 = 0; i10 < cursorWindowArr2.length; i10++) {
                try {
                    cursorWindowArr2[i10].acquireReference();
                } catch (RuntimeException e10) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        cursorWindowArr2[i11].releaseReference();
                    }
                    if (e10 instanceof IllegalStateException) {
                        throw new IllegalStateException("Closed CursorWindow encountered during DataHolder copy", e10);
                    }
                    throw e10;
                }
            }
            dataHolder = new DataHolder(this.zaf, cursorWindowArr2, this.zah, this.zai);
        }
        return dataHolder;
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.zaj && this.zag.length > 0 && !isClosed()) {
                synchronized (this) {
                    if (this.zae > 1) {
                        this.zae = 1;
                    }
                    releaseReference();
                }
                String string = toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 178);
                sb2.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb2.append(string);
                sb2.append(")");
                Log.e("DataBuffer", sb2.toString());
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public boolean getBoolean(String str, int i10, int i11) {
        zaf(str, i10);
        return Long.valueOf(this.zag[i11].getLong(i10, this.zab.getInt(str))).longValue() == 1;
    }

    public byte[] getByteArray(String str, int i10, int i11) {
        zaf(str, i10);
        return this.zag[i11].getBlob(i10, this.zab.getInt(str));
    }

    public int getCount() {
        return this.zad;
    }

    public int getInteger(String str, int i10, int i11) {
        zaf(str, i10);
        return this.zag[i11].getInt(i10, this.zab.getInt(str));
    }

    public long getLong(String str, int i10, int i11) {
        zaf(str, i10);
        return this.zag[i11].getLong(i10, this.zab.getInt(str));
    }

    public Bundle getMetadata() {
        return this.zai;
    }

    public int getStatusCode() {
        return this.zah;
    }

    public String getString(String str, int i10, int i11) {
        zaf(str, i10);
        return this.zag[i11].getString(i10, this.zab.getInt(str));
    }

    public int getWindowIndex(int i10) {
        int length;
        int i11 = 0;
        Preconditions.checkState(i10 >= 0 && i10 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i11 >= length) {
                break;
            }
            if (i10 < iArr[i11]) {
                i11--;
                break;
            }
            i11++;
        }
        return i11 == length ? i11 - 1 : i11;
    }

    public boolean hasColumn(String str) {
        return this.zab.containsKey(str);
    }

    public boolean hasNull(String str, int i10, int i11) {
        zaf(str, i10);
        return this.zag[i11].isNull(i10, this.zab.getInt(str));
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.zae <= 0;
        }
        return z10;
    }

    public void releaseReference() {
        synchronized (this) {
            int i10 = this.zae - 1;
            this.zae = i10;
            if (i10 == 0) {
                for (CursorWindow cursorWindow : this.zag) {
                    cursorWindow.releaseReference();
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String[] strArr = this.zaf;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zag, i10, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i10 & 1) != 0) {
            releaseReference();
        }
    }

    public final void zaa() {
        this.zab = new Bundle();
        int i10 = 0;
        while (true) {
            String[] strArr = this.zaf;
            if (i10 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i10], i10);
            i10++;
        }
        CursorWindow[] cursorWindowArr = this.zag;
        this.zac = new int[cursorWindowArr.length];
        int numRows = 0;
        for (int i11 = 0; i11 < cursorWindowArr.length; i11++) {
            this.zac[i11] = numRows;
            numRows += cursorWindowArr[i11].getNumRows() - (numRows - cursorWindowArr[i11].getStartPosition());
        }
        this.zad = numRows;
    }

    public final float zab(String str, int i10, int i11) {
        zaf(str, i10);
        return this.zag[i11].getFloat(i10, this.zab.getInt(str));
    }

    public final double zac(String str, int i10, int i11) {
        zaf(str, i10);
        return this.zag[i11].getDouble(i10, this.zab.getInt(str));
    }

    public final void zad(String str, int i10, int i11, CharArrayBuffer charArrayBuffer) {
        zaf(str, i10);
        this.zag[i11].copyStringToBuffer(i10, this.zab.getInt(str), charArrayBuffer);
    }

    DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.zae = 1;
        this.zaj = true;
        this.zaa = i10;
        this.zaf = strArr;
        this.zag = cursorWindowArr;
        this.zah = i11;
        this.zai = bundle;
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i10, Bundle bundle) {
        this.zae = 1;
        this.zaj = true;
        this.zaa = 1;
        this.zaf = (String[]) Preconditions.checkNotNull(strArr);
        this.zag = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zah = i10;
        this.zai = bundle;
        zaa();
    }

    public DataHolder(Cursor cursor, int i10, Bundle bundle) {
        int startPosition;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count && cursorWrapper.moveToPosition(startPosition)) {
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    cursorWrapper.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            this(columnNames, (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]), i10, bundle);
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    private DataHolder(Builder builder, int i10, Bundle bundle) {
        this(builder.zab(), zae(builder, -1), i10, (Bundle) null);
    }

    /* synthetic */ DataHolder(Builder builder, int i10, Bundle bundle, int i11, byte[] bArr) {
        this(builder.zab(), zae(builder, -1), i10, bundle);
    }
}
