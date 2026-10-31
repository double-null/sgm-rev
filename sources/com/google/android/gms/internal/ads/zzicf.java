package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.facebook.internal.ServerProtocol;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzicf implements Closeable, Flushable {
    private static final Pattern zza = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] zzb = new String[128];
    private static final String[] zzc;
    private final Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private final zzibe zzg;
    private final String zzh;
    private String zzi;
    private final boolean zzj;
    private zzibl zzk;
    private String zzl;

    public zzicf(Writer writer) {
        boolean z10 = false;
        zzm(6);
        this.zzk = zzibl.LEGACY_STRICT;
        Objects.requireNonNull(writer, "out == null");
        this.zzd = writer;
        zzibe zzibeVar = zzibe.zza;
        Objects.requireNonNull(zzibeVar);
        this.zzg = zzibeVar;
        this.zzi = ",";
        if (zzibeVar.zzc()) {
            this.zzh = ": ";
            if (zzibeVar.zza().isEmpty()) {
                this.zzi = ", ";
            }
        } else {
            this.zzh = ":";
        }
        if (zzibeVar.zza().isEmpty() && zzibeVar.zzb().isEmpty()) {
            z10 = true;
        }
        this.zzj = z10;
    }

    private final zzicf zzk(int i10, char c10) throws IOException {
        zzs();
        zzm(i10);
        this.zzd.write(c10);
        return this;
    }

    private final zzicf zzl(int i10, int i11, char c10) throws IOException {
        int iZzn = zzn();
        if (iZzn != i11 && iZzn != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.zzl;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.zzf--;
        if (iZzn == i11) {
            zzr();
        }
        this.zzd.write(c10);
        return this;
    }

    private final void zzm(int i10) {
        int i11 = this.zzf;
        int[] iArr = this.zze;
        if (i11 == iArr.length) {
            this.zze = Arrays.copyOf(iArr, i11 + i11);
        }
        int[] iArr2 = this.zze;
        int i12 = this.zzf;
        this.zzf = i12 + 1;
        iArr2[i12] = i10;
    }

    private final int zzn() {
        int i10 = this.zzf;
        if (i10 != 0) {
            return this.zze[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void zzo(int i10) {
        this.zze[this.zzf - 1] = i10;
    }

    private final void zzp() throws IOException {
        if (this.zzl != null) {
            int iZzn = zzn();
            if (iZzn == 5) {
                this.zzd.write(this.zzi);
            } else if (iZzn != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzr();
            zzo(4);
            zzq(this.zzl);
            this.zzl = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    private final void zzq(String str) throws IOException {
        String str2;
        Writer writer = this.zzd;
        String[] strArr = zzb;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i11 < i10) {
                        writer.write(str, i11, i10 - i11);
                    }
                    writer.write(str2);
                    i11 = i12;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i10) {
                    writer.write(str, i11, i10 - i11);
                }
                writer.write(str2);
                i11 = i12;
            }
            i10 = i12;
        }
        if (i11 < length) {
            writer.write(str, i11, length - i11);
        }
        writer.write(34);
    }

    private final void zzr() throws IOException {
        if (this.zzj) {
            return;
        }
        Writer writer = this.zzd;
        zzibe zzibeVar = this.zzg;
        writer.write(zzibeVar.zza());
        int i10 = this.zzf;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(zzibeVar.zzb());
        }
    }

    private final void zzs() throws IOException {
        int iZzn = zzn();
        if (iZzn == 1) {
            zzo(2);
            zzr();
            return;
        }
        if (iZzn == 2) {
            this.zzd.append((CharSequence) this.zzi);
            zzr();
        } else {
            if (iZzn == 4) {
                this.zzd.append((CharSequence) this.zzh);
                zzo(5);
                return;
            }
            if (iZzn != 6) {
                if (iZzn != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.zzk != zzibl.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            zzo(7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzd.close();
        int i10 = this.zzf;
        if (i10 > 1 || (i10 == 1 && this.zze[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public final void zza(zzibl zziblVar) {
        Objects.requireNonNull(zziblVar);
        this.zzk = zziblVar;
    }

    public final zzicf zzb() throws IOException {
        zzp();
        zzk(1, '[');
        return this;
    }

    public final zzicf zzc() throws IOException {
        zzl(1, 2, ']');
        return this;
    }

    public final zzicf zzd() throws IOException {
        zzp();
        zzk(3, '{');
        return this;
    }

    public final zzicf zze() throws IOException {
        zzl(3, 5, '}');
        return this;
    }

    public final zzicf zzf(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.zzl != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iZzn = zzn();
        if (iZzn != 3 && iZzn != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.zzl = str;
        return this;
    }

    public final zzicf zzg(String str) throws IOException {
        if (str == null) {
            zzj();
            return this;
        }
        zzp();
        zzs();
        zzq(str);
        return this;
    }

    public final zzicf zzh(boolean z10) throws IOException {
        zzp();
        zzs();
        this.zzd.write(true != z10 ? "false" : ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        return this;
    }

    public final zzicf zzi(Number number) throws IOException {
        if (number == null) {
            zzj();
            return this;
        }
        zzp();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.zzk != zzibl.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !zza.matcher(string).matches()) {
                String strValueOf = String.valueOf(cls);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47 + string.length());
                sb2.append("String created by ");
                sb2.append(strValueOf);
                sb2.append(" is not a valid JSON number: ");
                sb2.append(string);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        zzs();
        this.zzd.append((CharSequence) string);
        return this;
    }

    public final zzicf zzj() throws IOException {
        if (this.zzl != null) {
            zzp();
        }
        zzs();
        this.zzd.write("null");
        return this;
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            zzb[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = edUJlCZxhVnO.JtihCwrZLqHg;
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }
}
