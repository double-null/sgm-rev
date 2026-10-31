package io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Publisher {
    private final List<String> categories;
    private final String domain;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f16483id;
    private final String name;

    public static final class Builder {
        private List<String> categories;
        private String domain;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private String f16484id;
        private String name;

        public Builder addCategories(List<String> list) {
            if (io.bidmachine.core.h.C(list)) {
                return this;
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                addCategory(it.next());
            }
            return this;
        }

        public Builder addCategory(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (this.categories == null) {
                this.categories = new ArrayList();
            }
            this.categories.add(str);
            return this;
        }

        public Publisher build() {
            return new Publisher(this.f16484id, this.name, this.domain, this.categories);
        }

        public Builder setDomain(String str) {
            this.domain = str;
            return this;
        }

        public Builder setId(String str) {
            this.f16484id = str;
            return this;
        }

        public Builder setName(String str) {
            this.name = str;
            return this;
        }
    }

    void build(Context.App.Builder builder) {
        Context.App.Publisher.Builder builderNewBuilder = Context.App.Publisher.newBuilder();
        String str = this.f16483id;
        if (str != null) {
            builderNewBuilder.setId(str);
        }
        String str2 = this.name;
        if (str2 != null) {
            builderNewBuilder.setName(str2);
        }
        String str3 = this.domain;
        if (str3 != null) {
            builderNewBuilder.setDomain(str3);
        }
        List<String> list = this.categories;
        if (list != null) {
            builderNewBuilder.addAllCat(list);
        }
        builder.setPub(builderNewBuilder.build());
    }

    private Publisher(String str, String str2, String str3, List<String> list) {
        this.f16483id = str;
        this.name = str2;
        this.domain = str3;
        this.categories = list;
    }
}
