package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import g4.f;
import g4.s;
import g4.t;
import i4.d;
import i4.i;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class DateTypeAdapter extends s<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f12350b = new t() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // g4.t
        public <T> s<T> a(f fVar, l4.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<DateFormat> f12351a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f12351a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.e()) {
            arrayList.add(i.c(2, 2));
        }
    }

    private synchronized Date e(String str) {
        Iterator<DateFormat> it = this.f12351a.iterator();
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

    @Override // g4.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(m4.a aVar) throws IOException {
        if (aVar.L() != m4.b.NULL) {
            return e(aVar.J());
        }
        aVar.H();
        return null;
    }

    @Override // g4.s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized void d(m4.c cVar, Date date) throws IOException {
        try {
            if (date == null) {
                cVar.u();
            } else {
                cVar.K(this.f12351a.get(0).format(date));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
