package p4;

import com.adjust.sdk.Constants;
import com.android.billingclient.gp.VRfCTjjLv;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: CharacterSetECI.java */
/* JADX INFO: loaded from: classes4.dex */
public enum c {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    f23443i(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, VRfCTjjLv.SDPKJdEk, "UnicodeBig"),
    UTF8(26, Constants.ENCODING),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");

    private static final Map<Integer, c> D = new HashMap();
    private static final Map<String, c> E = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f23461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f23462b;

    c(int i10) {
        this(new int[]{i10}, new String[0]);
    }

    public static c b(String str) {
        return E.get(str);
    }

    public int c() {
        return this.f23461a[0];
    }

    static {
        for (c cVar : values()) {
            for (int i10 : cVar.f23461a) {
                D.put(Integer.valueOf(i10), cVar);
            }
            E.put(cVar.name(), cVar);
            for (String str : cVar.f23462b) {
                E.put(str, cVar);
            }
        }
    }

    c(int i10, String... strArr) {
        this.f23461a = new int[]{i10};
        this.f23462b = strArr;
    }

    c(int[] iArr, String... strArr) {
        this.f23461a = iArr;
        this.f23462b = strArr;
    }
}
