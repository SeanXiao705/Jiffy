package com.jiffydelivery.jiffy.Entity.Request.ContactRequst;

import com.jiffydelivery.jiffy.Entity.FrontModelEntities.Contact;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class SetDefaultAddressRequest {
    public String UID;
    public String ContactID;
}
