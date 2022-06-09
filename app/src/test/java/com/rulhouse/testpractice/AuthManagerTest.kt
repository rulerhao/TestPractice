package com.rulhouse.testpractice

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class AuthManagerTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun normalSituation() {
        val authManager = AuthManager()
        val result = authManager.validLogin("123456", "12345678")
        Assert.assertEquals(true, result)
    }

    @Test
    fun invalidEmptyAccount() {
        val authManager = AuthManager()
        val result = authManager.validLogin("", "12345678")
        Assert.assertEquals(false, result)
    }

    @Test
    fun invalidEmptyPassword() {
        val authManager = AuthManager()
        val result = authManager.validLogin("123456", "")
        Assert.assertEquals(false, result)
    }

}