package com.soujunior.domain.repository

import com.soujunior.domain.entities.auth.ApiResponseCode
import com.soujunior.domain.entities.auth.AwaitingCodeModel
import com.soujunior.domain.entities.auth.ForgotPasswordModel
import com.soujunior.domain.entities.auth.LoginModel
import com.soujunior.domain.entities.auth.PasswordModel
import com.soujunior.domain.entities.auth.RegisterModel

interface AuthRepository {
    suspend fun register(form : RegisterModel) : ApiResponseCode
    suspend fun login (form: LoginModel) : ApiResponseCode
    suspend fun awaitingCode (form: AwaitingCodeModel) : ApiResponseCode
    suspend fun forgotPassword (form: ForgotPasswordModel) : ApiResponseCode
    suspend fun changePassword (password: PasswordModel) : ApiResponseCode
}