package g4;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: DefaultDateTypeAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
final class a extends s<Date> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<? extends Date> f15319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f15320b;

    a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f15320b = arrayList;
        this.f15319a = g(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private Date e(String str) {
        synchronized (this.f15320b) {
            Iterator<DateFormat> it = this.f15320b.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return j4.a.c(str, new ParsePosition(0));
            } catch (ParseException e10) {
                throw new JsonSyntaxException(str, e10);
            }
        }
    }

    private static Class<? extends Date> g(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    @Override // g4.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(m4.a aVar) throws IOException {
        if (aVar.L() == m4.b.NULL) {
            aVar.H();
            return null;
        }
        Date dateE = e(aVar.J());
        Class<? extends Date> cls = this.f15319a;
        if (cls == Date.class) {
            return dateE;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(dateE.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(dateE.getTime());
        }
        throw new AssertionError();
    }

    @Override // g4.s
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(m4.c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.u();
            return;
        }
        synchronized (this.f15320b) {
            cVar.K(this.f15320b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f15320b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public a(Class<? extends Date> cls, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f15320b = arrayList;
        this.f15319a = g(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (i4.d.e()) {
            arrayList.add(i4.i.c(i10, i11));
        }
    }
}
