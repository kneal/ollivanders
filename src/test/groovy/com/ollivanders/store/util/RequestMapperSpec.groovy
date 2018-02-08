package com.ollivanders.store.util

import com.ollivanders.store.models.WandRequest
import spock.lang.Specification

/**
 * Created by nealcoleman on 2/8/18.
 */
class RequestMapperSpec extends Specification{

    RequestMapper mapper

    void setup(){
        mapper = new RequestMapper()
    }

    void "toWand"(){
        given:
        WandRequest request = new WandRequest(
                length: 5,
                core: "dragon heart",
                material: "oak"
        )

        when:
        def result = mapper.toWand(request)

        then:
        request.length == result.length
        request.core == request.core
        request.material == request.material
    }
}
