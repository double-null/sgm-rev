package com.google.android.play.integrity.internal;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class as extends ao implements Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient ar f11388a;

    as() {
    }

    public static as h() {
        return au.f11391a;
    }

    @Override // com.google.android.play.integrity.internal.ao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: d */
    public abstract av iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof as) {
            ((as) obj).i();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final ar f() {
        ar arVar = this.f11388a;
        if (arVar != null) {
            return arVar;
        }
        ar arVarG = g();
        this.f11388a = arVarG;
        return arVarG;
    }

    ar g() {
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    boolean i() {
        throw null;
    }
}
