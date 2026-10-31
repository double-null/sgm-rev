package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.EncryptedTopic;
import java.util.ArrayList;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: GetTopicsResponseHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f3029a = new e();

    private e() {
    }

    public final d a(b.b response) {
        t.f(response, "response");
        ArrayList arrayList = new ArrayList();
        for (b.c cVar : response.a()) {
            arrayList.add(new f(cVar.b(), cVar.a(), cVar.c()));
        }
        return new d(arrayList);
    }

    public final d b(b.b response) {
        t.f(response, "response");
        ArrayList arrayList = new ArrayList();
        for (b.c cVar : response.a()) {
            arrayList.add(new f(cVar.b(), cVar.a(), cVar.c()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (EncryptedTopic encryptedTopic : response.getEncryptedTopics()) {
            byte[] encryptedTopic2 = encryptedTopic.getEncryptedTopic();
            t.e(encryptedTopic2, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopic.getKeyIdentifier();
            t.e(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopic.getEncapsulatedKey();
            t.e(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new a(encryptedTopic2, keyIdentifier, encapsulatedKey));
        }
        return new d(arrayList, arrayList2);
    }
}
