package com.vaydox.nolo.core.exception

sealed class Failure {
    object NetworkConnection : Failure()
    object ServerError : Failure()

}
