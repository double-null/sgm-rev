package io.bidmachine.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.c1;
import com.google.common.collect.u;
import com.google.common.collect.v;
import com.google.common.collect.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import u7.q;
import x7.l0;

/* JADX INFO: compiled from: AudioCapabilities.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f18206c = new a(u.I(e.f18211d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u<Integer> f18207d = u.N(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final v<Integer, Integer> f18208e = new v.a().g(5, 6).g(17, 6).g(7, 6).g(30, 10).g(18, 6).g(6, 8).g(8, 8).g(14, 8).d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<e> f18209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18210b;

    /* JADX INFO: compiled from: AudioCapabilities.java */
    private static final class b {
        private static w<Integer> a() {
            w.a aVarJ = new w.a().j(8, 7);
            int i10 = l0.f28136a;
            if (i10 >= 31) {
                aVarJ.j(26, 27);
            }
            if (i10 >= 33) {
                aVarJ.a(30);
            }
            return aVarJ.m();
        }

        public static boolean b(AudioManager audioManager, io.bidmachine.media3.exoplayer.audio.c cVar) {
            AudioDeviceInfo[] devices = cVar == null ? ((AudioManager) x7.a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{cVar.f18230a};
            w<Integer> wVarA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (wVarA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: AudioCapabilities.java */
    private static final class c {
        public static u<Integer> a(u7.c cVar) {
            u.a aVarV = u.v();
            c1<Integer> it = a.f18208e.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (l0.f28136a >= l0.K(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), cVar.a().f25996a)) {
                    aVarV.a(Integer.valueOf(iIntValue));
                }
            }
            aVarV.a(2);
            return aVarV.m();
        }

        public static int b(int i10, int i11, u7.c cVar) {
            for (int i12 = 10; i12 > 0; i12--) {
                int iM = l0.M(i12);
                if (iM != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(iM).build(), cVar.a().f25996a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: AudioCapabilities.java */
    private static final class d {
        public static a a(AudioManager audioManager, u7.c cVar) {
            return new a(a.c(audioManager.getDirectProfilesForAttributes(cVar.a().f25996a)));
        }

        public static io.bidmachine.media3.exoplayer.audio.c b(AudioManager audioManager, u7.c cVar) {
            try {
                List<AudioDeviceInfo> audioDevicesForAttributes = ((AudioManager) x7.a.e(audioManager)).getAudioDevicesForAttributes(cVar.a().f25996a);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new io.bidmachine.media3.exoplayer.audio.c(audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u<e> c(List<AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(com.google.common.primitives.f.c(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile audioProfile = list.get(i10);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (l0.G0(format) || f18208e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) x7.a.e((Set) map.get(Integer.valueOf(format)))).addAll(com.google.common.primitives.f.c(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(com.google.common.primitives.f.c(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        u.a aVarV = u.v();
        for (Map.Entry entry : map.entrySet()) {
            aVarV.a(new e(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return aVarV.m();
    }

    private static u<e> d(int[] iArr, int i10) {
        u.a aVarV = u.v();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            aVarV.a(new e(i11, i10));
        }
        return aVarV.m();
    }

    static a e(Context context, Intent intent, u7.c cVar, io.bidmachine.media3.exoplayer.audio.c cVar2) {
        AudioManager audioManagerC = v7.d.c(context);
        if (cVar2 == null) {
            cVar2 = l0.f28136a >= 33 ? d.b(audioManagerC, cVar) : null;
        }
        int i10 = l0.f28136a;
        if (i10 >= 33 && (l0.K0(context) || l0.D0(context))) {
            return d.a(audioManagerC, cVar);
        }
        if (i10 >= 23 && b.b(audioManagerC, cVar2)) {
            return f18206c;
        }
        w.a aVar = new w.a();
        aVar.a(2);
        if (i10 >= 29 && (l0.K0(context) || l0.D0(context))) {
            aVar.k(c.a(cVar));
            return new a(d(com.google.common.primitives.f.m(aVar.m()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z10 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.k(f18207d);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new a(d(com.google.common.primitives.f.m(aVar.m()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.k(com.google.common.primitives.f.c(intArrayExtra));
        }
        return new a(d(com.google.common.primitives.f.m(aVar.m()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    static a f(Context context, u7.c cVar, io.bidmachine.media3.exoplayer.audio.c cVar2) {
        return e(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), cVar, cVar2);
    }

    private static int g(int i10) {
        int i11 = l0.f28136a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(Build.DEVICE) && i10 == 1) {
            i10 = 2;
        }
        return l0.M(i10);
    }

    static Uri i() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l0.t(this.f18209a, aVar.f18209a) && this.f18210b == aVar.f18210b;
    }

    public Pair<Integer, Integer> h(q qVar, u7.c cVar) {
        int iF = u7.w.f((String) x7.a.e(qVar.f26252o), qVar.f26248k);
        if (!f18208e.containsKey(Integer.valueOf(iF))) {
            return null;
        }
        if (iF == 18 && !k(18)) {
            iF = 6;
        } else if ((iF == 8 && !k(8)) || (iF == 30 && !k(30))) {
            iF = 7;
        }
        if (!k(iF)) {
            return null;
        }
        e eVar = (e) x7.a.e(this.f18209a.get(iF));
        int iB = qVar.E;
        if (iB == -1 || iF == 18) {
            int i10 = qVar.F;
            if (i10 == -1) {
                i10 = 48000;
            }
            iB = eVar.b(i10, cVar);
        } else if (!qVar.f26252o.equals("audio/vnd.dts.uhd;profile=p2") || l0.f28136a >= 33) {
            if (!eVar.c(iB)) {
                return null;
            }
        } else if (iB > 10) {
            return null;
        }
        int iG = g(iB);
        if (iG == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(iG));
    }

    public int hashCode() {
        return this.f18210b + (l0.u(this.f18209a) * 31);
    }

    public boolean j(q qVar, u7.c cVar) {
        return h(qVar, cVar) != null;
    }

    public boolean k(int i10) {
        return l0.r(this.f18209a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f18210b + ", audioProfiles=" + this.f18209a + "]";
    }

    private a(List<e> list) {
        this.f18209a = new SparseArray<>();
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            this.f18209a.put(eVar.f18212a, eVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f18209a.size(); i11++) {
            iMax = Math.max(iMax, this.f18209a.valueAt(i11).f18213b);
        }
        this.f18210b = iMax;
    }

    /* JADX INFO: compiled from: AudioCapabilities.java */
    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f18211d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w<Integer> f18214c;

        static {
            f18211d = l0.f28136a >= 33 ? new e(2, a(10)) : new e(2, 10);
        }

        public e(int i10, Set<Integer> set) {
            this.f18212a = i10;
            w<Integer> wVarX = w.x(set);
            this.f18214c = wVarX;
            c1<Integer> it = wVarX.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.f18213b = iMax;
        }

        private static w<Integer> a(int i10) {
            w.a aVar = new w.a();
            for (int i11 = 1; i11 <= i10; i11++) {
                aVar.a(Integer.valueOf(l0.M(i11)));
            }
            return aVar.m();
        }

        public int b(int i10, u7.c cVar) {
            if (this.f18214c != null) {
                return this.f18213b;
            }
            return l0.f28136a >= 29 ? c.b(this.f18212a, i10, cVar) : ((Integer) x7.a.e(a.f18208e.getOrDefault(Integer.valueOf(this.f18212a), 0))).intValue();
        }

        public boolean c(int i10) {
            if (this.f18214c == null) {
                return i10 <= this.f18213b;
            }
            int iM = l0.M(i10);
            if (iM == 0) {
                return false;
            }
            return this.f18214c.contains(Integer.valueOf(iM));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f18212a == eVar.f18212a && this.f18213b == eVar.f18213b && Objects.equals(this.f18214c, eVar.f18214c);
        }

        public int hashCode() {
            int i10 = ((this.f18212a * 31) + this.f18213b) * 31;
            w<Integer> wVar = this.f18214c;
            return i10 + (wVar == null ? 0 : wVar.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f18212a + ", maxChannelCount=" + this.f18213b + ", channelMasks=" + this.f18214c + "]";
        }

        public e(int i10, int i11) {
            this.f18212a = i10;
            this.f18213b = i11;
            this.f18214c = null;
        }
    }
}
