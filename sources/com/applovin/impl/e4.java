package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f6411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f6413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f6414e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Deque f6415f = new ArrayDeque();

    public e4(com.applovin.impl.sdk.l lVar) {
        this.f6410a = (String) lVar.a(z4.A4);
        this.f6411b = lVar.c(z4.B4);
        this.f6412c = ((Integer) lVar.a(z4.C4)).intValue();
    }

    public Long a() {
        return this.f6413d;
    }

    public Deque b() {
        return this.f6415f;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || this.f6412c <= 0) {
            return;
        }
        Map map = (Map) this.f6414e.remove(str);
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("cc_ms", Long.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty(list)) {
                Iterator it = list.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                map2.put((String) entry.getKey(), Long.valueOf(jLongValue / ((long) list.size())));
            }
        }
        if (this.f6415f.size() == this.f6412c) {
            this.f6415f.pollLast();
        }
        this.f6415f.addFirst(map2);
    }

    public void b(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty(this.f6411b) && this.f6412c > 0) {
            for (String str3 : this.f6411b) {
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    a(j10, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.f6410a) && str.endsWith(this.f6410a)) {
            this.f6413d = Long.valueOf(j10);
        }
    }

    private void a(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f6414e.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f6414e.put(str2, map);
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j10));
    }
}
