package com.opaxlabs.kurdshopping.interfaces


interface CallInterface {
    fun onItemClick(
        callType: String? = null,
        phone: String? = null,
        phonePrefix: String? = null,
        addID: String? = null,
        sellerID: String? = null,
        contactTypeWhatsapp: String? = null,
        contactTypeViber: String? = null,
        templateMessage: String? = null
    )

}