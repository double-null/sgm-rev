package k8;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import com.google.common.util.concurrent.g0;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: LoudnessCodecController.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<MediaCodec> f21259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f21260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LoudnessCodecController f21261c;

    /* JADX INFO: compiled from: LoudnessCodecController.java */
    class a implements LoudnessCodecController.OnLoudnessCodecUpdateListener {
        a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return c.this.f21260b.b(bundle);
        }
    }

    public c() {
        this(b.f21263a);
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f21261c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            x7.a.g(this.f21259a.add(mediaCodec));
        }
    }

    public void c() {
        this.f21259a.clear();
        LoudnessCodecController loudnessCodecController = this.f21261c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f21259a.remove(mediaCodec) || (loudnessCodecController = this.f21261c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i10) {
        LoudnessCodecController loudnessCodecController = this.f21261c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f21261c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, g0.a(), new a());
        this.f21261c = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = this.f21259a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    public c(b bVar) {
        this.f21259a = new HashSet<>();
        this.f21260b = bVar;
    }

    /* JADX INFO: compiled from: LoudnessCodecController.java */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21263a = new b() { // from class: k8.d
            @Override // k8.c.b
            public final Bundle b(Bundle bundle) {
                return c.b.c(bundle);
            }
        };

        Bundle b(Bundle bundle);

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Bundle c(Bundle bundle) {
            return bundle;
        }
    }
}
