package com.pk.example.multimodule.feature

import com.pk.example.multimodule.common.Feature

class ConcreteFeature : Feature {
    override fun getName(): String {
        return "Concrete feature"
    }

    override fun getOrder(): Int {
        return 1
    }
}