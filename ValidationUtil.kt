package com.asgatech.asgainputs.utils


import android.util.Patterns
import java.util.regex.Pattern

/**
 * @Author: Ahmed Saber
 * @Date: 12/9/2021
 * @Date: ahmedasga2593@gmail.com
 */
object ValidationUtil {
    /**@usage:  validate entered username based on passed parameters.
     * @param userName A String containing the username
     * @param minLength An Integer value to determine username minimum length
     * @param maxLength An Integer value to determine username maximum length
     * @param hasDotMandatory A Boolean value to determine if username has at least one dot or not
     * @param hasDotOptional A Boolean value to determine if username may  have one dot  or more or not
     * @param hasUnderScoreOptional A Boolean value to determine if username may  have one underscore  or more or not
     * @param hasUnderScoreMandatory A Boolean value to determine if username has at least one underscore or not
     * @param hasSpecialCharacterMandatory A Boolean value to determine if username has at least special character from these [-+!@#$%^&*,?] or not
     * @param hasSpecialCharacterOptional A Boolean value to determine if username may  have special character from these [-+!@#$%^&*,?] or more or not
     * @param haveNumbersMandatory A Boolean value to determine if username has at least one number in range 0-9 or not
     * @param haveNumbersOptional A Boolean value to determine if username may  have one number in range 0-9 or or more or not
     * @param hasCapitalLettersMandatory A Boolean value to determine if username has at least one capital letter or not
     * @param hasCapitalLettersOptional A Boolean value to determine if username may  have  one capital letter or more or not
     * @return A Boolean value that is determined on given parameters
     */
    fun isValidUserName(
        userName: String,
        minLength: Int,
        maxLength: Int,
        hasDot:Int = RegexAdditionType.NON.value,
        hasUnderScore:Int = RegexAdditionType.NON.value,
        hasSpecialCharacter:Int = RegexAdditionType.NON.value,
        hasNumbers:Int = RegexAdditionType.NON.value,
        hasCapitalLetters:Int = RegexAdditionType.NON.value
    ): Boolean {
        return isValidInput(
            userName,
            minLength,
            maxLength,
            hasDot,
            hasUnderScore,
            hasSpecialCharacter,
            hasNumbers,
            hasCapitalLetters
        )
    }

    /**@usage: validate entered user password based on passed parameters.
     * @param userPassword A String containing the user's name
     * @param minLength An Integer value to determine user password minimum length
     * @param maxLength An Integer value to determine user password  maximum length
     * @param hasDotMandatory A Boolean value to determine if user password  has at least one dot or not
     * @param hasDotOptional A Boolean value to determine if user password  may  have one dot  or more or not
     * @param hasUnderScoreOptional A Boolean value to determine if user password  may  have one underscore  or more or not
     * @param hasUnderScoreMandatory A Boolean value to determine if user password  has at least one underscore or not
     * @param hasSpecialCharacterMandatory A Boolean value to determine if user password  has at least special character from these [-+!@#$%^&*,?] or not
     * @param hasSpecialCharacterOptional A Boolean value to determine if user password  may  have special character from these [-+!@#$%^&*,?] or more or not
     * @param haveNumbersMandatory A Boolean value to determine if user password  has at least one number in range 0-9 or not
     * @param haveNumbersOptional A Boolean value to determine if user password  may  have one number in range 0-9 or or more or not
     * @param hasCapitalLettersMandatory A Boolean value to determine if user password  has at least one capital letter or not
     * @param hasCapitalLettersOptional A Boolean value to determine if user password  may  have  one capital letter or more or not
     * @return A Boolean value that is determined on given parameters
     */
    fun isValidUserPassword(
        userPassword: String,
        minLength: Int,
        maxLength: Int,
        hasDot: Int = RegexAdditionType.NON.value,
        hasUnderScore:Int = RegexAdditionType.NON.value,
        hasSpecialCharacter:Int = RegexAdditionType.NON.value,
        hasNumbers:Int = RegexAdditionType.NON.value,
        hasCapitalLetters:Int = RegexAdditionType.NON.value
    ): Boolean {
        return isValidInput(
            userPassword,
            minLength,
            maxLength,
            hasDot,
            hasUnderScore,
            hasSpecialCharacter,
            hasNumbers,
            hasCapitalLetters
        )
    }

    /**@usage: validate entered input String based on passed parameters.
     * @param inputString A String to validate based on values of given parameters
     * @param minLength An Integer value to determine input string minimum length
     * @param maxLength An Integer value to determine input string maximum length
     * @param hasDotMandatory A Boolean value to determine if input string has at least one dot or not
     * @param hasDotOptional A Boolean value to determine if input string may  have one dot  or more or not
     * @param hasUnderScoreOptional A Boolean value to determine if input string may  have one underscore  or more or not
     * @param hasUnderScoreMandatory A Boolean value to determine if input string has at least one underscore or not
     * @param hasSpecialCharacterMandatory A Boolean value to determine if input string has at least special character from these [-+!@#$%^&*,?] or not
     * @param hasSpecialCharacterOptional A Boolean value to determine if input string may  have special character from these [-+!@#$%^&*,?] or more or not
     * @param haveNumbersMandatory A Boolean value to determine if input string  has at least one number in range 0-9 or not
     * @param haveNumbersOptional A Boolean value to determine if input string may  have one number in range 0-9 or or more or not
     * @param hasCapitalLettersMandatory A Boolean value to determine if input string  has at least one capital letter or not
     * @param hasCapitalLettersOptional A Boolean value to determine if input string may  have  one capital letter or more or not
     * @return A Boolean value that is determined on given parameters
     */
    private fun isValidInput(
        inputString: String,
        minLength: Int,
        maxLength: Int,
        hasDot:Int = RegexAdditionType.NON.value,
        hasUnderScore:Int = RegexAdditionType.NON.value,
        hasSpecialCharacter:Int = RegexAdditionType.NON.value,
        hasNumbers:Int = RegexAdditionType.NON.value,
        hasCapitalLetters:Int = RegexAdditionType.NON.value
    ): Boolean {
        var regexStringBuilder = getInputRegexString(
            minLength,
            maxLength,
            hasDot,
            hasUnderScore,
            hasSpecialCharacter,
            hasNumbers,
            hasCapitalLetters
        )
     //   println(regexStringBuilder)
        var validationRegex = Regex(regexStringBuilder)
        return inputString.matches(validationRegex)
    }

    /**@usage: build required regex based on passed parameters.
     * @param minLength An Integer value to determine regex minimum length
     * @param maxLength An Integer value to determine regexmaximum length
     * @param hasDotMandatory A Boolean value to determine if regex has at least one dot or not
     * @param hasDotOptional A Boolean value to determine if regex may  have one dot  or more or not
     * @param hasUnderScoreOptional A Boolean value to determine if regex may  have one underscore  or more or not
     * @param hasUnderScoreMandatory A Boolean value to determine if regex has at least one underscore or not
     * @param hasSpecialCharacterMandatory A Boolean value to determine if regex  has at least special character from these [-+!@#$%^&*,?] or not
     * @param hasSpecialCharacterOptional A Boolean value to determine if  regex may  have special character from these [-+!@#$%^&*,?] or more or not
     * @param haveNumbersMandatory A Boolean value to determine if regex  has at least one number in range 0-9 or not
     * @param haveNumbersOptional A Boolean value to determine if regex  may  have one number in range 0-9 or or more or not
     * @param hasCapitalLettersMandatory A Boolean value to determine if regex   has at least one capital letter or not
     * @param hasCapitalLettersOptional A Boolean value to determine if regex  may  have  one capital letter or more or not
     * @return A String generated based on given parameters
     */
    private fun getInputRegexString(
        minLength: Int,
        maxLength: Int,
        hasDot:Int = RegexAdditionType.NON.value,
        hasUnderScore:Int = RegexAdditionType.NON.value,
        hasSpecialCharacter:Int = RegexAdditionType.NON.value,
        hasNumbers:Int = RegexAdditionType.NON.value,
        hasCapitalLetters:Int = RegexAdditionType.NON.value
    ): String {
        var enableCapitalMandatory = "?!"
        var enableCapitalOptional = ""
        when(hasCapitalLetters){
            RegexAdditionType.OPTIONAL.value ->{
                enableCapitalMandatory = ""
                enableCapitalOptional = "*?"
            }
            RegexAdditionType.MANDATORY.value ->{
                enableCapitalMandatory = "?="
                enableCapitalOptional = ""
            }
            RegexAdditionType.NON.value ->{
                enableCapitalMandatory = "?!"
                enableCapitalOptional = ""
            }
        }
        var enableDotMandatory = "?!"
        var enableDotOptional=""
        when(hasDot){
            RegexAdditionType.OPTIONAL .value->{
                enableDotMandatory = ""
                enableDotOptional = "*?"
            }
            RegexAdditionType.MANDATORY.value ->{
                enableDotMandatory = "?="
                enableDotOptional = ""
            }
            RegexAdditionType.NON.value ->{
                enableDotMandatory = "?!"
                enableDotOptional = ""
            }
        }
        var enableUnderScoreMandatory = "?!"
        var enableUnderScoreOptional=""
        when(hasUnderScore){
            RegexAdditionType.OPTIONAL.value ->{
                enableUnderScoreMandatory = ""
                enableUnderScoreOptional = "*?"
            }
            RegexAdditionType.MANDATORY.value ->{
                enableUnderScoreMandatory = "?="
                enableUnderScoreOptional = ""
            }
            RegexAdditionType.NON.value ->{
                enableUnderScoreMandatory = "?!"
                enableUnderScoreOptional = ""
            }
        }
        var enableSpecialCharMandatory = "?!"
        var enableSpecialCharOptional = ""
        when(hasSpecialCharacter){
            RegexAdditionType.OPTIONAL.value ->{
                enableSpecialCharMandatory = ""
                enableSpecialCharOptional = "*?"
            }
            RegexAdditionType.MANDATORY.value ->{
                enableSpecialCharMandatory = "?="
                enableSpecialCharOptional = ""
            }
            RegexAdditionType.NON .value->{
                enableSpecialCharMandatory = "?!"
                enableSpecialCharOptional = ""
            }
        }
        var enableNumbersMandatory = "?!"
        var enableNumbersOptional = ""
        when(hasNumbers){
            RegexAdditionType.OPTIONAL.value ->{
                enableNumbersMandatory = ""
                enableNumbersOptional = "*?"
            }
            RegexAdditionType.MANDATORY.value ->{
                enableNumbersMandatory = "?="
                enableNumbersOptional = ""
            }
            RegexAdditionType.NON.value ->{
                enableNumbersMandatory = "?!"
                enableNumbersOptional = ""
            }
        }
        return "^(?=.*[a-z])(${enableCapitalMandatory}.*[A-Z]${enableCapitalOptional})(${enableNumbersMandatory}.*\\d${enableNumbersOptional})" +
                "(${enableDotMandatory}.*[.]${enableDotOptional})(${enableUnderScoreMandatory}.*[_]${enableUnderScoreOptional})(${enableSpecialCharMandatory}.*[-+!@#\$%^&*,?]${enableSpecialCharOptional}).{${minLength},${maxLength}}$"
    }

    /**@usage: validate entered user email based on email address pattern imported from android.util.Patterns package.
     * @param userEmail A String containing the user's email
     * @return A Boolean value that is determined based on used pattern
     */
    fun isValidUserEmail(
        userEmail: String
    ): Boolean {
        val EMAIL_ADDRESS = Pattern.compile(
            "[a-zA-Z0-9\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        )
        //Patterns.EMAIL_ADDRESS
        return EMAIL_ADDRESS.matcher(userEmail).matches()
    }

    /**@usage: validate entered Ksa phone number based on used regex.
     * @param phoneNumber A String containing the user's ksa phone number
     * @return A Boolean value that is determined based on used regex
     */
    fun isValidKsaPhoneNumber(phoneNumber: String): Boolean {
        val ksaPhoneNumberRegex = Regex("^(009665|9665|\\+9665|05|5)(5|0|3|6|4|9|1|8|7)([0-9]{7})$")
        return phoneNumber.matches(ksaPhoneNumberRegex)
    }

    /**@usage: validate entered Eg phone number based on used regex.
     * @param phoneNumber A String containing the user's Eg phone number
     * @return A Boolean value that is determined based on used regex
     */
    fun isValidEgPhoneNumber(phoneNumber: String): Boolean {
        val egPhoneNumberRegex = Regex("^01[0-2,5]{1}[0-9]{8}$")
        return phoneNumber.matches(egPhoneNumberRegex)
    }

    /**@usage: validate entered ip address based on used regex.
     * @param ipAddress A String containing the ip address
     * @return A Boolean value that is determined based on used regex
     */
    fun isValidIpAddress(ipAddress: String): Boolean {
        var ipAddressRegex =
            Regex("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$")
        return ipAddress.matches(ipAddressRegex)
    }

    /**@usage: validate entered Eg nationalId based on used regex.
     * @param nationalId A String containing the Eg nationalId
     * @return A Boolean value that is determined based on used regex
     */
    fun isValidEgyptianNationalId(nationalId: String): Boolean {
        var nationalIdRegex =
            Regex("^(2|3)[0-9][1-9][0-1][1-9][0-3][1-9](01|02|03|04|11|12|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|88)\\d{5}$")
        return nationalId.matches(nationalIdRegex)
    }

    /**@usage: validate entered cvv number of credit card based on used regex.
     * @param cvvNumber A String containing the cvv number
     * @return A Boolean value that is determined based on used regex
     */
    fun isValidCvvNumber(cvvNumber: String): Boolean {
        var cvvNumberRegex = Regex("^[0-9]{3,4}$")
        return cvvNumber.matches(cvvNumberRegex)
    }

    /**@usage: validate entered credit Card Number is visa or not .
     * @param creditCardNumber A String containing the credit Card number
     * @return A Boolean value that is determined valid or not
     */
    fun isVisa(creditCardNumber: String): Boolean {
        return getCreditCardType(creditCardNumber) == CreditCardType.VISA
    }

    /**@usage: validate entered credit Card Number is master or not .
     * @param creditCardNumber A String containing the credit Card Number
     * @return A Boolean value that is determined valid or not
     */
    fun isMaster(creditCardNumber: String): Boolean {
        return getCreditCardType(creditCardNumber) == CreditCardType.MASTER
    }

    /**@usage: validate entered credit Card Number is american express or not .
     * @param creditCardNumber A String containing the credit Card Number
     * @return A Boolean value that is determined valid or not
     */
    fun isAmex(creditCardNumber: String): Boolean {
        return getCreditCardType(creditCardNumber) == CreditCardType.AMEX
    }

    /**@usage: determine entered credit Card Number is visa or master or american express or not valid .
     * @param creditCardNumber A String containing the credit Card Number
     * @return A CreditCardType [VISA,MASTER,AMEX,NOT_VALID]
     */
    fun getCreditCardType(creditCardNumber: String): CreditCardType {
        val visaRegex = Regex("^4\\d{3}(| |-)(?:\\d{4}\\1){2}\\d{4}\$")
        val masterRegex = Regex("^5[1-5]\\d{2}(| |-)(?:\\d{4}\\1){2}\\d{4}\$")
        val amexRegex = Regex("^3[47]\\d{1,2}(| |-)\\d{6}\\1\\d{6}\$")
        return when {
            creditCardNumber.matches(visaRegex) -> CreditCardType.VISA
            creditCardNumber.matches(masterRegex) -> CreditCardType.MASTER
            creditCardNumber.matches(amexRegex) -> CreditCardType.AMEX
            else -> CreditCardType.NOT_VALID
        }
    }

    /**@usage: validate entered identity number is saudi citizen or not .
     * @param id A String containing the citizen identity number
     * @return A Boolean value that is determined valid or not
     */
    fun isKsaCitizen(id: String): Boolean {
        return getKsaNationalIdType(id) == IdType.SAUDI
    }

    /**@usage: validate entered identity number is resident citizen or not .
     * @param id A String containing the citizen identity number
     * @return A Boolean value that is determined valid or not
     */
    fun isKsaResident(id: String): Boolean {
        return getKsaNationalIdType(id) == IdType.RESIDENT
    }

    /**@usage: determine entered identity number is saudi or resident or not valid .
     * @param id A String containing the citizen identity number
     * @return A IdType [SAUDI,RESIDENT,NOT_VALID]
     */
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

    /**
     * @usage: this enum class identifies different types of identity number
     */
    enum class IdType(val value: Int) {
        SAUDI(1), RESIDENT(2), NOT_VALID(-1);

        companion object {
            fun from(findValue: Int): IdType = IdType.values().first { it.value == findValue }
        }
    }
    /**
     * @usage: this enum class identifies different types of credit card
     */
    enum class CreditCardType(val value: Int) {
        VISA(1), MASTER(2), AMEX(3), NOT_VALID(-1);

        companion object {
            fun from(findValue: Int): CreditCardType =
                CreditCardType.values().first { it.value == findValue }
        }
    }
    /**
     * @usage: this enum class identifies different types of regex
     */
    enum class RegexAdditionType(val value: Int) {
        MANDATORY(1), OPTIONAL(2), NON(-1);

        companion object {
            fun from(findValue: Int): RegexAdditionType =
                RegexAdditionType.values().first { it.value == findValue }
        }
    }
    }
