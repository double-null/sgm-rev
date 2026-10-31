package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.time.Instant;
import java.util.Date;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.q;
import wc.w;

/* JADX INFO: compiled from: Timestamp.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp createFromParcel(Parcel source) {
            t.f(source, "source");
            return new Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp[] newArray(int i10) {
            return new Timestamp[i10];
        }
    };

    /* JADX INFO: compiled from: Timestamp.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final q<Long, Integer> toPreciseTime(Date date) {
            long j10 = 1000;
            long time = date.getTime() / j10;
            int time2 = (int) ((date.getTime() % j10) * ((long) 1000000));
            return time2 < 0 ? w.a(Long.valueOf(time - 1), Integer.valueOf(time2 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) : w.a(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long j10, int i10) {
            if (!(i10 >= 0 && i10 < 1000000000)) {
                throw new IllegalArgumentException(("Timestamp nanoseconds out of range: " + i10).toString());
            }
            if (-62135596800L <= j10 && j10 < 253402300800L) {
                return;
            }
            throw new IllegalArgumentException(("Timestamp seconds out of range: " + j10).toString());
        }

        public final Timestamp now() {
            return new Timestamp(new Date());
        }
    }

    public Timestamp(long j10, int i10) {
        Companion.validateRange(j10, i10);
        this.seconds = j10;
        this.nanoseconds = i10;
    }

    public static final Timestamp now() {
        return Companion.now();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0);
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j10 = this.seconds;
        return (((((int) j10) * 37 * 37) + ((int) (j10 >> 32))) * 37) + this.nanoseconds;
    }

    public final Date toDate() {
        return new Date((this.seconds * ((long) 1000)) + ((long) (this.nanoseconds / 1000000)));
    }

    public final Instant toInstant() {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        t.e(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.seconds + ", nanoseconds=" + this.nanoseconds + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        t.f(dest, "dest");
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(Timestamp other) {
        t.f(other, "other");
        return yc.b.b(this, other, new a0() { // from class: com.google.firebase.Timestamp.compareTo.1
            @Override // kotlin.jvm.internal.a0, pd.j
            public Object get(Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new a0() { // from class: com.google.firebase.Timestamp.compareTo.2
            @Override // kotlin.jvm.internal.a0, pd.j
            public Object get(Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        });
    }

    public Timestamp(Date date) {
        t.f(date, "date");
        Companion companion = Companion;
        q preciseTime = companion.toPreciseTime(date);
        long jLongValue = ((Number) preciseTime.b()).longValue();
        int iIntValue = ((Number) preciseTime.c()).intValue();
        companion.validateRange(jLongValue, iIntValue);
        this.seconds = jLongValue;
        this.nanoseconds = iIntValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Timestamp(Instant time) {
        this(time.getEpochSecond(), time.getNano());
        t.f(time, "time");
    }
}
