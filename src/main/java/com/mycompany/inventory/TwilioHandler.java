/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioHandler {

    // Twilio credentials
    public static final String ACCOUNT_SID = "AC6406a12c0905a3dbd1f724badd929f93";
    public static final String AUTH_TOKEN = "15d4ff444738a5f649a87bec1aa2c282";
    public static final String TWILIO_PHONE_NUMBER = "+12486362256";

    public static void sendMessage(String messageBody) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        // Replace with your own phone number
        String toPhoneNumber = "+8801782116973";

        Message message = Message.creator(new PhoneNumber(toPhoneNumber), new PhoneNumber(TWILIO_PHONE_NUMBER), messageBody).create();

        System.out.println("Message sent successfully with SID: " + message.getSid());
    }
}
