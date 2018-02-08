package com.ollivanders.store.controllers

import com.ollivanders.store.models.WandModel
import com.ollivanders.store.models.WandRequest
import com.ollivanders.store.services.WandServiceImpl
import com.ollivanders.store.util.RequestMapper
import spock.lang.Specification

/**
 * Created by nealcoleman on 2/2/18.
 */
class WandControllerSpec extends Specification{

    WandController wandController
    WandServiceImpl mockService
    RequestMapper mockMapper

    void setup(){
        mockService = Mock(WandServiceImpl)
        mockMapper = Mock(RequestMapper)

        wandController = new WandController(
                service: mockService,
                mapper:  mockMapper
        )
    }

    void "create success"(){
        given:
        WandRequest input = Mock(WandRequest)
        WandModel mockWand = Mock(WandModel)

        when:
        wandController.create(input)

        then:
        1 * mockMapper.toWand(input) >> mockWand
        1 * mockService.create(mockWand)
    }
}
