package com.ollivanders.store.controllers

import com.ollivanders.store.models.WandRequest
import com.ollivanders.store.services.WandService
import spock.lang.Specification

/**
 * Created by nealcoleman on 2/2/18.
 */
class WandControllerSpec extends Specification{

    WandController wandController
    WandService wandService

    void setup(){
        wandService = Mock(WandService)


        wandController = new WandController(service: wandService)
    }

    void "create success"(){
        given:
        WandRequest mockRequest = Mock(WandRequest)

        when:
        wandController.create(mockRequest)

        then:
        true

    }
}
