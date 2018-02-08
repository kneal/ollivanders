package com.ollivanders.store.controllers

import com.ollivanders.store.models.WandRequest
import com.ollivanders.store.services.WandService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController

/**
 * Controller specifies endpoints for CRUD on wand objects
 * Created by nealcoleman on 2/2/18.
 */
@RestController
class WandController {

    @Autowired
    WandService service

    void create(WandRequest request){

    }

}
