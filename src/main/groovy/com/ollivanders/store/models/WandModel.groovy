package com.ollivanders.store.models

import lombok.AllArgsConstructor
import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.Setter
import lombok.ToString


/**
 * Domain model used for operating on wand objects
 * Created by nealcoleman on 2/7/18.
 */
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(includeFieldNames = true)
class WandModel {

    long id

    long length

    String material

    String core
}
