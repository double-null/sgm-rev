package ib;

import android.graphics.Bitmap;
import android.view.View;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes5.dex */
public interface f {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f16231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f16232b;

        public a(Object obj, Bitmap bitmap) {
            this.f16231a = obj;
            this.f16232b = bitmap;
        }

        public final Bitmap a() {
            return this.f16232b;
        }

        public final Object b() {
            return this.f16231a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.a(this.f16231a, aVar.f16231a) && t.a(this.f16232b, aVar.f16232b);
        }

        public int hashCode() {
            Object obj = this.f16231a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Bitmap bitmap = this.f16232b;
            return iHashCode + (bitmap != null ? bitmap.hashCode() : 0);
        }

        public String toString() {
            return ljglrLUdGZhMhQ.VfTWoT + this.f16231a + ", bitmapToRecycle=" + this.f16232b + ')';
        }

        public /* synthetic */ a(Object obj, Bitmap bitmap, int i10, kotlin.jvm.internal.k kVar) {
            this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : bitmap);
        }
    }

    Object a(zc.j jVar, View view, zc.f fVar);
}
