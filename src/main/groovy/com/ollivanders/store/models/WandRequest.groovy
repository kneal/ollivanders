package com.ollivanders.store.models

import lombok.AllArgsConstructor
import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.Setter
import lombok.ToString

/**
 * Wand request specifies body that needs to be send in POST/PUT calls
 * Created by nealcoleman on 2/7/18.
 */
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(includeFieldNames = true)
class WandRequest {

    long length

    String material

    String core
}
