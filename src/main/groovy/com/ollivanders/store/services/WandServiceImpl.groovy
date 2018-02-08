package com.ollivanders.store.services

import com.ollivanders.store.models.WandModel
import groovy.util.logging.Slf4j
import org.springframework.stereotype.Component

/**
 * Contains business logic for operating on wand objects
 * Created by nealcoleman on 2/2/18.
 */
@Component
@Slf4j
class WandServiceImpl implements WandService {

    void create(WandModel model) {
        log.info("Creating new wand: ${model.toString()}")
    }
}
