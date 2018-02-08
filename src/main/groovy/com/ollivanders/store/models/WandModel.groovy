package com.ollivanders.store.models

import lombok.Getter
import lombok.Setter


/**
 * Domain model used for operating on wand objects
 * Created by nealcoleman on 2/7/18.
 */
@Getter
@Setter
class WandModel {

    long id

    long length

    String material

    String core
}
