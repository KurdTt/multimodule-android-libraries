package com.pk.example.multimodule.other_feature

import com.pk.example.multimodule.common.Feature

class OtherFeature : Feature {
    override fun getName(): String {
        return "Other feature"
    }

    override fun getOrder(): Int {
        return 2
    }
}