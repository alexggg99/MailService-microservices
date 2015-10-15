package com.alexggg99.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alexggg99 on 11.08.15.
 */

//@Entity
//@Table(name = "EMAILS")
//@NamedQueries({
//        @NamedQuery(name = Email.GETEMAILBYNICKNAME , query = "select m from Email m")
//})
public class Email implements Serializable{

    public static final String GETEMAILBYNICKNAME = "Email.GetEmailByNickname";

    public Email() {
    }

    public Email(long id, Person personFrom, Person personTo, String message, String subject, Date sendDate, Priority priority) {
        this.id = id;
        this.personFrom = personFrom;
        this.personTo = personTo;
        this.message = message;
        this.subject = subject;
        this.sendDate = sendDate;
        this.priority = priority;
    }

    //    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "ID")
    @JsonProperty(value = "id")
    private long id;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "PERSON_FROM_ID")
    @JsonProperty(value = "person_from")
    private Person personFrom;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "PERSON_TO_ID")
    @JsonProperty(value = "person_to")
    private Person personTo;

//    @Column(name = "MESSAGE")
    @JsonProperty(value = "message")
    private String message;

//    @Column(name = "SUBJECT")
    @JsonProperty(value = "subject")
    private String subject;

//    @Column(name = "SEND_DATE")
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonProperty(value = "send_date")
    private Date sendDate;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "PRIORITY_ID")
    @JsonProperty(value = "priority")
    private Priority priority;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPersonFrom() {
        return personFrom;
    }

    public void setPersonFrom(Person personFrom) {
        this.personFrom = personFrom;
    }

    public Person getPersonTo() {
        return personTo;
    }

    public void setPersonTo(Person personTo) {
        this.personTo = personTo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }


}
