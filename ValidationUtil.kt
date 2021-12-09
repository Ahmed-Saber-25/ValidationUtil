package com.example.validiation

import android.util.Patterns
import java.lang.StringBuilder
import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * @Author: Ahmed Saber
 * @Date: 12/9/2021
 * @Date: ahmedasga2593@gmail.com
 */
object ValidationUtil {

    fun validateUserName(
        userName: String,
        startCharacterRange: Int,
        endCharacterRange: Int,
        haveDotOrUnderScoreOrSpecialChar: Boolean,
        haveNumbers: Boolean,
        haveCapitalLetters: Boolean
    ): Boolean {
        var regexStringBuilder = getInputRegexString(
            haveCapitalLetters,
            haveDotOrUnderScoreOrSpecialChar,
            haveNumbers,
            startCharacterRange,
            endCharacterRange
        )
        var userNameRegex = Regex(regexStringBuilder)
        return userName.matches(userNameRegex)
    }

    fun validateUserPassword(
        userPassword: String,
        startCharacterRange: Int,
        endCharacterRange: Int,
        haveDotOrUnderScoreOrSpecialChar: Boolean,
        haveNumbers: Boolean,
        haveCapitalLetters: Boolean
    ): Boolean {
        var regexStringBuilder = getInputRegexString(
            haveCapitalLetters,
            haveDotOrUnderScoreOrSpecialChar,
            haveNumbers,
            startCharacterRange,
            endCharacterRange
        )
        var userPassRegex = Regex(regexStringBuilder)
        return userPassword.matches(userPassRegex)
    }

    fun getInputRegexString(
        haveCapitalLetters: Boolean,
        haveDotOrUnderScoreOrSpecialChar: Boolean,
        haveNumbers: Boolean,
        startCharacterRange: Int,
        endCharacterRange: Int
    ): String {
        var enableCapital = "!"
        var enableDotOrUnderScoreOrSpecialChar = "!"
        var enableNumbers = "!"
        if(haveCapitalLetters)
            enableCapital = "="
        if(haveDotOrUnderScoreOrSpecialChar)
            enableDotOrUnderScoreOrSpecialChar = "="
        if(haveNumbers)
            enableNumbers = "="
        return "^(?=.*[a-z])(?${enableCapital}.*[A-Z])(?${enableNumbers}.*\\d)(?${enableDotOrUnderScoreOrSpecialChar}.*[-+_!@#$%^&*.,?]){${startCharacterRange},${endCharacterRange}}.+$"
    }
    fun validateUserEmail(
        userEmail: String
    ): Boolean {
        val emailPattern = Patterns.EMAIL_ADDRESS
        return emailPattern.matcher(userEmail).matches()
    }
    fun validateKsaPhoneNumber(phoneNumber: String): Boolean {
        val ksaPhoneNumberRegex = Regex("^(009665|9665|\\+9665|05|5)(5|0|3|6|4|9|1|8|7)([0-9]{7})$")
        return phoneNumber.matches(ksaPhoneNumberRegex)
    }
    fun validateEgPhoneNumber(phoneNumber: String): Boolean {
        val egPhoneNumberRegex = Regex( "^01[0-2,5]{1}[0-9]{8}$")
        return phoneNumber.matches(egPhoneNumberRegex)
    }
    fun validateIpAddress(ipAddress:String):Boolean{
        var ipAddressRegex = Regex( "^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})(\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})){3}$")//simple one :: "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$"
        return ipAddress.matches(ipAddressRegex)
    }
    fun validateEgyptianNationalId(nationalId:String):Boolean{
        var nationalIdRegex = Regex( "^(2|3)[0-9][1-9][0-1][1-9][0-3][1-9](01|02|03|04|11|12|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|88).+$")
        return nationalId.matches(nationalIdRegex)
    }
    fun validateCvvNumber(cvvNumber:String):Boolean{
        var cvvNumberRegex = Regex( "^[0-9]{3,4}$")
        return cvvNumber.matches(cvvNumberRegex)
    }
    fun isVisa(creditCardNumber:String):Boolean{
        return getCreditCardType(creditCardNumber)==CreditCardType.VISA
    }
    fun isMaster(creditCardNumber:String):Boolean{
        return getCreditCardType(creditCardNumber)==CreditCardType.MASTER
    }
    fun isAmex(creditCardNumber:String):Boolean{
        return getCreditCardType(creditCardNumber)==CreditCardType.AMEX
    }
    fun getCreditCardType(creditCardNumber:String):CreditCardType{
        val visaRegex = Regex("^4[0-9]{12}(?:[0-9]{3})?\$")
        val masterRegex = Regex("^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14})\$")
        val amexRegex = Regex("^3[47][0-9]{13}\$")
        return  when{
            creditCardNumber.matches(visaRegex) -> CreditCardType.VISA
            creditCardNumber.matches(masterRegex) -> CreditCardType.MASTER
            creditCardNumber.matches(amexRegex) -> CreditCardType.AMEX
            else ->CreditCardType.NOT_VALID
        }
    }

    fun isKsaCitizen(id: String):Boolean{
        return getKsaNationalIdType(id)==IdType.SAUDI
    }
    fun isKsaResident(id: String):Boolean{
        return getKsaNationalIdType(id)==IdType.RESIDENT
    }

    fun getKsaNationalIdType(id: String): IdType {
        val trimId = id.trim { it <= ' ' }
        if (!trimId.matches("[0-9]+".toRegex())) {
            return IdType.NOT_VALID
        }
        if (trimId.length != 10) {
            return IdType.NOT_VALID
        }
        val type = Integer.parseInt(trimId.substring(0, 1))
        if (type != 2 && type != 1) {
            return IdType.NOT_VALID
        }
        var sum = 0
        for (i in 0..9) {
            sum += if (i % 2 == 0) {
                val zfOdd = "%02d".format(Integer.parseInt(trimId.substring(i, i + 1)) * 2)
                Integer.parseInt(zfOdd.substring(0, 1)) + Integer.parseInt(zfOdd.substring(1, 2))
            } else {
                Integer.parseInt(trimId.substring(i, i + 1))
            }
        }
        return if (sum % 10 != 0) IdType.NOT_VALID else IdType.from(type)
    }

    enum class IdType(val value: Int) {
        SAUDI(1), RESIDENT(2), NOT_VALID(-1);

        companion object {
            fun from(findValue: Int): IdType = IdType.values().first { it.value == findValue }
        }
    }
    enum class CreditCardType(val value: Int) {
        VISA(1), MASTER(2), AMEX(3),NOT_VALID(-1);

        companion object {
            fun from(findValue: Int): CreditCardType = CreditCardType.values().first { it.value == findValue }
        }
    }
}
fun main(){
    println(ValidationUtil.validateKsaPhoneNumber("+966544949955"))
    println(ValidationUtil.validateEgPhoneNumber("01520713678"))
    println(ValidationUtil.validateIpAddress("192.168.1.1"))
    println(ValidationUtil.validateEgyptianNationalId("293050232190031"))
    println(ValidationUtil.validateCvvNumber("531"))
    println(ValidationUtil.isVisa("4111111111111111"))
    println(ValidationUtil.isMaster("5105105105105100"))
    println(ValidationUtil.isAmex("371449635398431"))
    println(ValidationUtil.getKsaNationalIdType("1635788548"))
    println(ValidationUtil.getKsaNationalIdType("2827927043"))
    println(ValidationUtil.getKsaNationalIdType("293050232190031"))
    println(ValidationUtil.isKsaCitizen("1635788548"))
    println(ValidationUtil.isKsaResident("2827927043"))
    println(ValidationUtil.isKsaResident("293050232190031"))
}
