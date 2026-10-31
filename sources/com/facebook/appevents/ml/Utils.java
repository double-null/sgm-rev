package com.facebook.appevents.ml;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.m;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;
import rd.d;
import rd.o;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Utils {
    private static final String DIR_NAME = "facebook_ml/";
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public static final File getMlDir() {
        if (CrashShieldHandler.isObjectCrashing(Utils.class)) {
            return null;
        }
        try {
            File file = new File(FacebookSdk.getApplicationContext().getFilesDir(), DIR_NAME);
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Utils.class);
            return null;
        }
    }

    public static final Map<String, MTensor> parseModelWeights(File file) {
        int i10;
        if (CrashShieldHandler.isObjectCrashing(Utils.class)) {
            return null;
        }
        try {
            t.f(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int iAvailable = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (iAvailable < 4) {
                    return null;
                }
                int i11 = 0;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i12 = byteBufferWrap.getInt();
                int i13 = i12 + 4;
                if (iAvailable < i13) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i12, d.f24999b));
                JSONArray jSONArrayNames = jSONObject.names();
                int length = jSONArrayNames.length();
                String[] strArr = new String[length];
                for (int i14 = 0; i14 < length; i14++) {
                    strArr[i14] = jSONArrayNames.getString(i14);
                }
                m.o(strArr);
                HashMap map = new HashMap();
                int i15 = 0;
                while (i15 < length) {
                    String str = strArr[i15];
                    if (str == null) {
                        i10 = i11;
                    } else {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i16 = 1;
                        while (i11 < length2) {
                            int i17 = jSONArray.getInt(i11);
                            iArr[i11] = i17;
                            i16 *= i17;
                            i11++;
                        }
                        int i18 = i16 * 4;
                        int i19 = i13 + i18;
                        if (i19 > iAvailable) {
                            return null;
                        }
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i13, i18);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        MTensor mTensor = new MTensor(iArr);
                        i10 = 0;
                        byteBufferWrap2.asFloatBuffer().get(mTensor.getData(), 0, i16);
                        map.put(str, mTensor);
                        i13 = i19;
                    }
                    i15++;
                    i11 = i10;
                }
                return map;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Utils.class);
            return null;
        }
    }

    public final String normalizeString(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            t.f(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = t.g(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            String strJoin = TextUtils.join(" ", (String[]) new o("\\s+").g(str.subSequence(i10, length + 1).toString(), 0).toArray(new String[0]));
            t.e(strJoin, "join(\" \", strArray)");
            return strJoin;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final int[] vectorize(String texts, int i10) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            t.f(texts, "texts");
            int[] iArr = new int[i10];
            String strNormalizeString = normalizeString(texts);
            Charset charsetForName = Charset.forName(Constants.ENCODING);
            t.e(charsetForName, "forName(\"UTF-8\")");
            byte[] bytes = strNormalizeString.getBytes(charsetForName);
            t.e(bytes, "this as java.lang.String).getBytes(charset)");
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 < bytes.length) {
                    iArr[i11] = bytes[i11] & 255;
                } else {
                    iArr[i11] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
