package com.asgatech.asgainputs.utils

import org.junit.Test

import org.junit.Assert.*

/**
 * @Author: Ahmed Saber
 * @Date: 12/13/2021
 * @Date: ahmedasga2593@gmail.com
 */
class ValidationUtilTest {

    @Test
    fun isValidUserName_return_true_when_username_has_valid_length() {
  assertTrue( ValidationUtil.isValidUserName("ahmed", 5, 7))
    }
    @Test
    fun isValidUserName_return_false_when_username_has_invalid_length() {
        assertFalse( ValidationUtil.isValidUserName("ahmedsaber", 5, 7))
    }
    @Test
    fun isValidUserName_return_true_when_username_has_dot_as_mandatory() {
        assertTrue( ValidationUtil.isValidUserName("ahmed.", 5, 7, hasDot = ValidationUtil.RegexAdditionType.MANDATORY.value))
    }
    @Test
    fun isValidUserName_return_true_when_username_has_dot_as_optional() {
        assertTrue( ValidationUtil.isValidUserName("ahmed", 5, 7,hasDot = ValidationUtil.RegexAdditionType.OPTIONAL.value))
    }
    @Test
    fun isValidUserName_return_false_when_username_has_no_dot() {
        assertFalse( ValidationUtil.isValidUserName("ahmed.", 5, 7, hasDot = ValidationUtil.RegexAdditionType.NON.value))
    }
    @Test
    fun isValidUserName_return_true_when_username_has_underscore_as_mandatory() {
        assertTrue( ValidationUtil.isValidUserName("ahmed_", 5, 7, hasUnderScore = ValidationUtil.RegexAdditionType.MANDATORY.value))
    }
    @Test
    fun isValidUserName_return_true_when_username_has_underscore_as_optional() {
        assertTrue( ValidationUtil.isValidUserName("ahmed", 5, 7, hasUnderScore = ValidationUtil.RegexAdditionType.OPTIONAL.value))
    }
    @Test
    fun isValidUserName_return_false_when_username_has_no_underscore() {
        assertFalse( ValidationUtil.isValidUserName("ahmed_", 5, 7, hasUnderScore = ValidationUtil.RegexAdditionType.NON.value))
    }
    @Test
    fun isValidUserName_return_true_when_username_has_special_character_as_mandatory() {
        assertTrue( ValidationUtil.isValidUserName("ahmed@", 5, 7, hasSpecialCharacter = ValidationUtil.RegexAdditionType.MANDATORY.value))
    }
    @Test
    fun isValidUserName_return_true_when_username_has_special_character_as_optional() {
        assertTrue( ValidationUtil.isValidUserName("ahmed", 5, 7, hasSpecialCharacter = ValidationUtil.RegexAdditionType.OPTIONAL.value))
    }
    @Test
    fun isValidUserName_return_false_when_username_has_no_special_character() {
        assertFalse( ValidationUtil.isValidUserName("ahmed@", 5, 7, hasSpecialCharacter = ValidationUtil.RegexAdditionType.NON.value))
    }
    @Test
    fun isValidUserName_return_true_when_username_has_number_as_mandatory() {
        assertTrue( ValidationUtil.isValidUserName("ahmed9", 5, 7,hasNumbers = ValidationUtil.RegexAdditionType.MANDATORY.value))
    }
    @Test
    fun isValidUserName_return_true_when_username_has_number_as_optional() {
        assertTrue( ValidationUtil.isValidUserName("ahmed", 5, 7, hasNumbers = ValidationUtil.RegexAdditionType.OPTIONAL.value))
    }
    @Test
    fun isValidUserName_return_false_when_username_has_no_number() {
        assertFalse( ValidationUtil.isValidUserName("ahmed5", 5, 7, hasNumbers = ValidationUtil.RegexAdditionType.NON.value))
    }
    @Test
    fun isValidUserName_return_true_when_username_has_capital_letters_as_mandatory() {
        assertTrue( ValidationUtil.isValidUserName("Ahmed", 5, 7, hasCapitalLetters = ValidationUtil.RegexAdditionType.MANDATORY.value))
    }
    @Test
    fun isValidUserName_return_true_when_username_has_capital_letters_as_optional() {
        assertTrue( ValidationUtil.isValidUserName("Ahmed", 5, 7, hasCapitalLetters = ValidationUtil.RegexAdditionType.OPTIONAL.value))
    }
    @Test
    fun isValidUserName_return_false_when_username_has_no_capital_letters() {
        assertFalse( ValidationUtil.isValidUserName("Ahmed", 5, 7, hasCapitalLetters = ValidationUtil.RegexAdditionType.NON.value))
    }
    @Test
    fun isValidUserName_return_true_when_username_has_all_optional_parameters_true() {
        assertTrue( ValidationUtil.isValidUserName("ah._@K", 5, 7, ValidationUtil.RegexAdditionType.OPTIONAL.value,
            ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value))
    }
    @Test
    fun isValidUserName_return_true_when_username_has_all_mandatory_parameters_true() {
        assertTrue( ValidationUtil.isValidUserName("ah9K._@", 5, 7, ValidationUtil.RegexAdditionType.MANDATORY.value,
            ValidationUtil.RegexAdditionType.MANDATORY.value,ValidationUtil.RegexAdditionType.MANDATORY.value,ValidationUtil.RegexAdditionType.MANDATORY.value,ValidationUtil.RegexAdditionType.MANDATORY.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_valid_length() {
        assertTrue( ValidationUtil.isValidUserPassword("ahmed", 5, 7))
    }
    @Test
    fun isValidUserPassword_return_false_when_user_password_has_invalid_length() {
        assertFalse( ValidationUtil.isValidUserPassword("ahmedsaber", 5, 7))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_dot_as_mandatory() {
        assertTrue( ValidationUtil.isValidUserPassword("ahmed.", 5, 7, hasDot = ValidationUtil.RegexAdditionType.MANDATORY.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_dot_as_optional() {
        assertTrue( ValidationUtil.isValidUserPassword("ahmed", 5, 7, hasDot = ValidationUtil.RegexAdditionType.OPTIONAL.value))
    }
    @Test
    fun isValidUserPassword_return_false_when_user_password_has_no_dot() {
        assertFalse( ValidationUtil.isValidUserPassword("ahmed.", 5, 7, hasDot = ValidationUtil.RegexAdditionType.NON.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_underscore_as_mandatory() {
        assertTrue( ValidationUtil.isValidUserPassword("ahmed_", 5, 7, hasUnderScore = ValidationUtil.RegexAdditionType.MANDATORY.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_underscore_as_optional() {
        assertTrue( ValidationUtil.isValidUserPassword("ahmed", 5, 7, hasUnderScore = ValidationUtil.RegexAdditionType.OPTIONAL.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_no_underscore() {
        assertTrue( ValidationUtil.isValidUserPassword("ahmed", 5, 7, hasUnderScore = ValidationUtil.RegexAdditionType.NON.value ))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_special_character_as_mandatory() {
        assertTrue( ValidationUtil.isValidUserPassword("ahmed@", 5, 7, hasSpecialCharacter = ValidationUtil.RegexAdditionType.MANDATORY.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_special_character_as_optional() {
        assertTrue( ValidationUtil.isValidUserPassword("ahmed", 5, 7, hasSpecialCharacter = ValidationUtil.RegexAdditionType.OPTIONAL.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_no_special_character() {
        assertTrue( ValidationUtil.isValidUserPassword("ahmed", 5, 7, hasSpecialCharacter = ValidationUtil.RegexAdditionType.NON.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_number_as_mandatory() {
        assertTrue( ValidationUtil.isValidUserPassword("ahmed9", 5, 7, hasNumbers = ValidationUtil.RegexAdditionType.MANDATORY.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_number_as_optional() {
        assertTrue( ValidationUtil.isValidUserPassword("ahmed", 5, 7, hasNumbers = ValidationUtil.RegexAdditionType.OPTIONAL.value))
    }
    @Test
    fun iisValidUserPassword_return_false_when_user_password_has_no_number() {
        assertFalse( ValidationUtil.isValidUserPassword("ahmed9", 5, 7, hasNumbers = ValidationUtil.RegexAdditionType.NON.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_capital_letters_as_mandatory() {
        assertTrue( ValidationUtil.isValidUserPassword("Ahmed", 5, 7, hasCapitalLetters = ValidationUtil.RegexAdditionType.MANDATORY.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_capital_letters_as_optional() {
        assertTrue( ValidationUtil.isValidUserPassword("Ahmed", 5, 7, hasCapitalLetters = ValidationUtil.RegexAdditionType.OPTIONAL.value))
    }
    @Test
    fun isValidUserPassword_return_false_when_user_password_has_no_capital_letters() {
        assertFalse( ValidationUtil.isValidUserPassword("Ahmed", 5, 7, hasCapitalLetters = ValidationUtil.RegexAdditionType.NON.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_all_optional_parameters_true() {
        assertTrue( ValidationUtil.isValidUserPassword("ahmdK9._@", 5, 7, ValidationUtil.RegexAdditionType.OPTIONAL.value,
            ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value,ValidationUtil.RegexAdditionType.OPTIONAL.value))
    }
    @Test
    fun isValidUserPassword_return_true_when_user_password_has_all_mandatory_parameters_true() {
        assertTrue( ValidationUtil.isValidUserPassword("a9Kd._@", 5, 7, ValidationUtil.RegexAdditionType.MANDATORY.value,
            ValidationUtil.RegexAdditionType.MANDATORY.value,ValidationUtil.RegexAdditionType.MANDATORY.value,ValidationUtil.RegexAdditionType.MANDATORY.value,ValidationUtil.RegexAdditionType.MANDATORY.value))
    }
    @Test
    fun isValidUserEmail_return_true_when_email_is_valid(){
        assertTrue(ValidationUtil.isValidUserEmail("ahmed8@test5.com"))
        assertTrue(ValidationUtil.isValidUserEmail("saberahmed690@gmail.com"))
    }
    @Test
    fun isValidUserEmail_return_false_when_email_prefix_is_not_valid(){
        assertFalse(ValidationUtil.isValidUserEmail("Ahmed  @test.com"))
        assertFalse(ValidationUtil.isValidUserEmail("abc..def@mail.com"))
        assertFalse(ValidationUtil.isValidUserEmail("abc__def@mail.com"))
        assertFalse(ValidationUtil.isValidUserEmail("abc##def@mail.com"))
        assertFalse(ValidationUtil.isValidUserEmail(".abc@mail.com"))
        assertFalse(ValidationUtil.isValidUserEmail("-abc@mail.com"))
        assertFalse(ValidationUtil.isValidUserEmail("_abc@mail.com"))
        assertFalse(ValidationUtil.isValidUserEmail("+abc#def@mail.com"))
    }
    @Test
    fun isValidUserEmail_return_false_when_email_domain_is_not_valid(){
        assertFalse(ValidationUtil.isValidUserEmail("abc.def@mail.c"))
        assertFalse(ValidationUtil.isValidUserEmail("abc.def@mail#archive.com"))
        assertFalse(ValidationUtil.isValidUserEmail("abc.def@mail"))
        assertFalse(ValidationUtil.isValidUserEmail("abc.def@mail..com"))
        assertFalse(ValidationUtil.isValidUserEmail("abc##def@mail.CAS"))
    }
    @Test
    fun isValidKsaPhoneNumber_return_true_when_phone_number_is_valid(){
        assertTrue(ValidationUtil.isValidKsaPhoneNumber("+966544949955"))
        assertTrue(ValidationUtil.isValidKsaPhoneNumber("00966503649156"))
        assertTrue(ValidationUtil.isValidKsaPhoneNumber("966544949955"))
        assertTrue(ValidationUtil.isValidKsaPhoneNumber("0554494995"))
        assertTrue(ValidationUtil.isValidKsaPhoneNumber("554494699"))
    }
    @Test
    fun isValidKsaPhoneNumber_return_false_when_phone_number_is_not_valid(){
        assertFalse(ValidationUtil.isValidKsaPhoneNumber("96654649499555"))
        assertFalse(ValidationUtil.isValidKsaPhoneNumber("54649499555"))
        assertFalse(ValidationUtil.isValidKsaPhoneNumber("52649499555"))
    }
    @Test
    fun iisValidEgPhoneNumber_return_true_when_phone_number_is_valid(){
        assertTrue(ValidationUtil.isValidEgPhoneNumber("01020713678"))
        assertTrue(ValidationUtil.isValidEgPhoneNumber("01117509705"))
        assertTrue(ValidationUtil.isValidEgPhoneNumber("01514752174"))
    }
    @Test
    fun isValidEgPhoneNumber_return_false_when_phone_number_is_not_valid(){
        assertFalse(ValidationUtil.isValidEgPhoneNumber("102078945547"))
        assertFalse(ValidationUtil.isValidEgPhoneNumber("016888745417"))
        assertFalse(ValidationUtil.isValidEgPhoneNumber("0158885417"))
        assertFalse(ValidationUtil.isValidEgPhoneNumber("1158885417"))
    }
    @Test
    fun isValidIpAddress_return_true_when_ip_address_is_valid(){
        assertTrue(ValidationUtil.isValidIpAddress("192.168.1.1"))
        assertTrue(ValidationUtil.isValidIpAddress("255.255.1.1"))
        assertTrue(ValidationUtil.isValidIpAddress("255.255.111.35"))
        assertTrue(ValidationUtil.isValidIpAddress("255.255.11.135"))
    }
    @Test
    fun isValidIpAddress_return_false_when_ip_address_is_not_valid(){
        assertFalse(ValidationUtil.isValidIpAddress("192.168.256.1"))
        assertFalse(ValidationUtil.isValidIpAddress("203.260.113.255"))
        assertFalse(ValidationUtil.isValidIpAddress("30.168.1.255.1"))
        assertFalse(ValidationUtil.isValidIpAddress(" 192.168.1.256"))
        assertFalse(ValidationUtil.isValidIpAddress(" -1.2.3.4"))
        assertFalse(ValidationUtil.isValidIpAddress(" 1.1.1.1."))
        assertFalse(ValidationUtil.isValidIpAddress("127.1"))
        assertFalse(ValidationUtil.isValidIpAddress("3...3"))
    }
    @Test
    fun isValidEgyptianNationalId_return_true_when_egyptian_national_id_is_valid(){
        assertTrue(ValidationUtil.isValidEgyptianNationalId("29305021900041"))
        assertTrue(ValidationUtil.isValidEgyptianNationalId("28805021900031"))
        assertTrue(ValidationUtil.isValidEgyptianNationalId("29305024040031"))
        assertTrue(ValidationUtil.isValidEgyptianNationalId("29304021900031"))
    }
    @Test
    fun isValidEgyptianNationalId_return_false_when_egyptian_national_id_is_valid(){
        assertFalse(ValidationUtil.isValidEgyptianNationalId("293050219000315"))
        assertFalse(ValidationUtil.isValidEgyptianNationalId("29006141400948"))
        assertFalse(ValidationUtil.isValidEgyptianNationalId("29300141400948"))
        assertFalse(ValidationUtil.isValidEgyptianNationalId("29310021900031"))
        assertFalse(ValidationUtil.isValidEgyptianNationalId("29305102000031"))
    }
    @Test
    fun isValidCvvNumber_return_true_when_cvv_number_is_valid(){
        assertTrue(ValidationUtil.isValidCvvNumber("123"))
        assertTrue(ValidationUtil.isValidCvvNumber("1234"))
    }
    @Test
    fun isValidCvvNumber_return_false_when_cvv_number_is_not_valid(){
        assertFalse(ValidationUtil.isValidCvvNumber("99995"))
    }
    @Test
    fun isVisa_return_true_when_credit_number_is_valid(){
        assertTrue(ValidationUtil.isVisa("4111111111111111"))
        assertTrue(ValidationUtil.isVisa("4000 0000 0000 0000"))
        assertTrue(ValidationUtil.isVisa("4000-0000-0000-0000"))
    }
    @Test
    fun isVisa_return_false_when_credit_number_is_not_valid(){
        assertFalse(ValidationUtil.isVisa("293050219000315"))
        assertFalse(ValidationUtil.isVisa("4000-0000 00000000"))
    }
    @Test
    fun isMaster_return_true_when_credit_number_is_valid(){
        assertTrue(ValidationUtil.isMaster("5105105105105100"))
        assertTrue(ValidationUtil.isMaster("5100 0000 0000 0000"))
        assertTrue(ValidationUtil.isMaster("5200-0000-0000-0000"))
        assertTrue(ValidationUtil.isMaster("5300000000000000"))
    }
    @Test
    fun isMaster_return_false_when_credit_number_is_not_valid(){
        assertFalse(ValidationUtil.isMaster("4111111111111111"))
        assertFalse(ValidationUtil.isMaster("4000 0000 0000 0000"))
        assertFalse(ValidationUtil.isMaster("5000 0000-0000-0000"))
    }
    @Test
    fun isAmex_return_true_when_credit_number_is_valid(){
        assertTrue(ValidationUtil.isAmex("371449635398431"))
        assertTrue(ValidationUtil.isAmex("374245455400126"))
        assertTrue(ValidationUtil.isAmex("340 000000 000000"))
        assertTrue(ValidationUtil.isAmex("370-000000-000000"))
    }
    @Test
    fun isAmex_return_false_when_credit_number_is_not_valid(){
        assertFalse(ValidationUtil.isAmex("4111111111111111"))
        assertFalse(ValidationUtil.isAmex("3882822463100055"))
        assertFalse(ValidationUtil.isAmex("357282246310005"))
        assertFalse(ValidationUtil.isAmex("330-000000-000000"))
    }
    @Test
    fun getCreditCardType_return_VISA_when_credit_number_is_valid(){
        assertEquals(ValidationUtil.CreditCardType.VISA,ValidationUtil.getCreditCardType("4111111111111111"))
    }
    @Test
    fun getCreditCardType_return_MASTER_when_credit_number_is_valid(){
        assertEquals(ValidationUtil.CreditCardType.MASTER,ValidationUtil.getCreditCardType("5105105105105100"))
    }
    @Test
    fun getCreditCardType_return_AMEX_when_credit_number_is_valid(){
        assertEquals(ValidationUtil.CreditCardType.AMEX,ValidationUtil.getCreditCardType("371449635398431"))
    }
    @Test
    fun getCreditCardType_return_NOT_VALID_when_credit_number_is_not_valid(){
        assertEquals(ValidationUtil.CreditCardType.NOT_VALID,ValidationUtil.getCreditCardType("1635788548"))
    }
    @Test
    fun getKsaNationalIdType_return_SAUDI_when_national_id_number_is_valid(){
        assertEquals(ValidationUtil.IdType.SAUDI,ValidationUtil.getKsaNationalIdType("1635788548"))
    }
    @Test
    fun getKsaNationalIdType_return_RESIDENT_when_national_id_number_is_valid(){
        assertEquals(ValidationUtil.IdType.RESIDENT,ValidationUtil.getKsaNationalIdType("2827927043"))
    }
    @Test
    fun getKsaNationalIdType_return_NOT_VALID_when_national_id_number_is_not_valid(){
        assertEquals(ValidationUtil.IdType.NOT_VALID,ValidationUtil.getKsaNationalIdType("293050232190031"))
    }
}
