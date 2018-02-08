package com.ollivanders.store.util

import com.ollivanders.store.models.WandModel
import com.ollivanders.store.models.WandRequest
import org.springframework.stereotype.Component

/**
 * Maps requests to domain objects
 * Created by nealcoleman on 2/8/18.
 */
@Component
class RequestMapper {

    /** toWand takes in a JSON request and maps it to WandModel objects
     *
     * @param request
     * @return
     */
    WandModel toWand(WandRequest request){
        new WandModel(
                length: request.length,
                core: request.core,
                material: request.material
        )
    }
}
