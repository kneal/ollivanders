package com.ollivanders.store.controllers

import com.ollivanders.store.models.WandRequest
import com.ollivanders.store.services.WandService
import com.ollivanders.store.services.WandServiceImpl
import com.ollivanders.store.util.RequestMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

/**
 * Controller specifies endpoints for CRUD on wand objects
 * Created by nealcoleman on 2/2/18.
 */
@RestController
@RequestMapping('/ollivanders/v1')
class WandController {

    @Autowired
    WandServiceImpl service

    @Autowired
    RequestMapper mapper

    @RequestMapping(value = "/wand", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    void create(WandRequest request){
        def wand = mapper.toWand(request)
        service.create(wand)
    }

}
