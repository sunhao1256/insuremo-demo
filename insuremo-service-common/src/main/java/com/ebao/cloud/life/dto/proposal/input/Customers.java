/**
  * Copyright 2023 json.cn
  */
package com.ebao.cloud.life.dto.proposal.input;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Auto-generated: 2023-03-16 10:4:27
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@JsonNaming(PropertyNamingStrategy.class)
public class Customers {

    private int partySerialId;
    private int partyType;
    private Person person;
    private PartyContact partyContact;
    private Address address;
    public void setPartySerialId(int partySerialId) {
         this.partySerialId = partySerialId;
     }
     public int getPartySerialId() {
         return partySerialId;
     }

    public void setPartyType(int partyType) {
         this.partyType = partyType;
     }
     public int getPartyType() {
         return partyType;
     }

    public void setPerson(Person person) {
         this.person = person;
     }
     public Person getPerson() {
         return person;
     }

    public void setPartyContact(PartyContact partyContact) {
         this.partyContact = partyContact;
     }
     public PartyContact getPartyContact() {
         return partyContact;
     }

    public void setAddress(Address address) {
         this.address = address;
     }
     public Address getAddress() {
         return address;
     }

}
