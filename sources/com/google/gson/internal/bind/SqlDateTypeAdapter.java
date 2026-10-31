package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import g4.f;
import g4.s;
import g4.t;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class SqlDateTypeAdapter extends s<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f12379b = new t() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // g4.t
        public <T> s<T> a(f fVar, l4.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f12380a = new SimpleDateFormat("MMM d, yyyy");

    @Override // g4.s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Date b(m4.a aVar) throws IOException {
        if (aVar.L() == m4.b.NULL) {
            aVar.H();
            return null;
        }
        try {
            return new Date(this.f12380a.parse(aVar.J()).getTime());
        } catch (ParseException e10) {
            throw new JsonSyntaxException(e10);
        }
    }

    @Override // g4.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void d(m4.c cVar, Date date) throws IOException {
        cVar.K(date == null ? null : this.f12380a.format((java.util.Date) date));
    }
}
