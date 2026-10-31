package se;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: dates.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f25426a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f25427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final DateFormat[] f25428c;

    /* JADX INFO: compiled from: dates.kt */
    public static final class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(ne.d.f22996f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f25427b = strArr;
        f25428c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        t.f(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f25426a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f25427b;
        synchronized (strArr) {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                DateFormat[] dateFormatArr = f25428c;
                DateFormat simpleDateFormat = dateFormatArr[i10];
                if (simpleDateFormat == null) {
                    simpleDateFormat = new SimpleDateFormat(f25427b[i10], Locale.US);
                    simpleDateFormat.setTimeZone(ne.d.f22996f);
                    dateFormatArr[i10] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
                i10 = i11;
            }
            g0 g0Var = g0.f27756a;
            return null;
        }
    }

    public static final String b(Date date) {
        t.f(date, "<this>");
        String str = f25426a.get().format(date);
        t.e(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
