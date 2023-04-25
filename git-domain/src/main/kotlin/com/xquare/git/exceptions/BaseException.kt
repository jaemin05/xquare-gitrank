package com.xquare.git.exceptions

abstract class BaseException(
    override val statusCode: Int,
    override val errorMessage: String
): RuntimeException(), ExceptionAttribute {
    override fun fillInStackTrace(): Throwable = this
}